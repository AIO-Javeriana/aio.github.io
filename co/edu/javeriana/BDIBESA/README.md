# BDIBESA

BDIBESA is a rational agent platform that implements the BDI (belief-desire-intention) architecture and it was developed by the Pontificia Universidad Javeriana in the Java programming language . It consists of a BDI layer implemented on top of RationalBesa.

### Dependencies and Requeriments

BDIBESA has minimum requisites JDK 8 or later and uses a number of projects to work properly:

* [BESA](https://github.com/AIO-Javeriana/repository-gradle/tree/master/co/edu/javeriana/BESA) - Base project to create agents
* [RationalBesa](https://github.com/AIO-Javeriana/repository-gradle/tree/master/co/edu/javeriana/RationalBESA) - Agents with beliefs and roles

## Quickstart

For making a BDI agent need:

#### Create a task
The tasks have three states (WAITING_FOR_EXECUTION, IN_EXECUTION and FINALIZED) for this when you create your task should extend the Task, this class requires implements four functions: executeTask, interruptTask, cancelTask and checkFinish. An example is the next:
```java
public class MyFirstTask extends Task {
    private boolean executed;
    public MyFirstTask() {
        this.executed=false;
    }
    @Override
    public void executeTask(Believes blvs) {
        this.executed=false;
        System.out.println( "Executing Task .." );
        this.executed=true;
    }
    @Override
    public void interruptTask(Believes blvs) {
        System.out.println("BreathingTask => interruptTask");
    }
    @Override
    public void cancelTask(Believes blvs) {
        System.out.println("BreathingTask => cancelTask");
    }
    public boolean isExecuted() {
        if(this.executed && this.taskState == STATE.WAITING_FOR_EXECUTION){
            this.executed=false;
        }
        return executed;
    }
    @Override
    public boolean checkFinish(Believes blvs) {
        return  isExecuted();
    }
}
```
#### Create a Goal
The goals are in six categorites and priorizates in this orden:
  1. SURVIVAL: The vital goals for keep living in the world, i.e. in the case a robot when battery level is critical
  2. DUTY: The goals associated with rules of the world or the problem context, i.e. if the agent is a football player then it must respect the game rules
  3. OPORTUNITY: The goals oriented with the general goal i.e. in the case of a player football must kick the ball.
  4. REQUIREMENT: These goals are for the cases where is requiring something for makes an opportunity goal.
  5. NEED: These goals are for the cases where is needing some skills for makes an opportunity goal.
  6. ATTENTION_CYCLE:This goal is of lower priority, its function when no higher level goal is activated, ie this goal is to do something like "breathe" while its other goals change.

The goals have four phases for being selected as intention and they are evaluated in this order:  evaluateViability, detectGoal, evaluatePlausibility and evaluateContribution. An example is the next:
```java
public class MyFirstGoal extends GoalBDI {
  public MyFirstGoal( long id,RationalRole role, String description, GoalBDITypes type ) {
        super( id, role, description, type );
    }
   @Override
    public double evaluateViability( Believes believes ) {
        return 1.0;
    }
    @Override
    public double detectGoal( Believes believes ) {
        return 1.0;
     }
    @Override
    public double evaluatePlausibility( Believes believes ) {
        return 1.0;
    }
    @Override
    public double evaluateContribution( StateBDI stateBDI ) {
        return 1.0;
    }
    @Override
    public boolean predictResultUnlegality( StateBDI agentStatus )  {
        return true;
    }
    @Override
    public boolean goalSucceeded (Believes blvs) {
        return false;
    }
}
```
#### Create Beliefs of the agent
For the creation of Beliefs, it needs to understand that the Beliefs are an attribute of the agent's state. Thus, an example is the next:
```java
public class AgentBelieves implements Believes {
    public AgentBelieves() {
    }
    @Override
    public boolean update(InfoData infoData) {
        System.out.println("Believes are updating...");
        return true;
    }
}
```

#### Create the agent
For the proper operation of the agent is needing to send an event to InformationFlowGuard for the activation DBI decision machine. Thus, in this example, we go to use a PeriodicGuardBESA that simulate the periodic update of the world:

```java

public class MyPeriodicGuard extends PeriodicGuardBESA {
    @Override
    public void funcPeriodicExecGuard(EventBESA ebesa) {
        try {
            AgHandlerBESA handlerByAlias = AdmBESA.getInstance().getHandlerByAlias(agent.getAlias());
            EventBESA event = new EventBESA(InformationFlowGuard.class.getName(),null);
            handlerByAlias.sendEvent(event);
        } catch (ExceptionBESA ex) {
            Logger.getLogger(PlayerPeriodicGuard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

... 

public class MyAgent extends AgentBDI{
    public MyAgent(String alias) throws KernellAgentExceptionBESA, ExceptionBESA {
        super(alias, new AgentBelieves(), setupGoals(),setupStruct(new StructBESA()));
    }
    public MyAgent(String alias,StructBESA structBESA) throws KernellAgentExceptionBESA, ExceptionBESA {
        super(alias, new AgentBelieves(), setupGoals(),setupStruct(structBESA));
    }
    
    private static StructBESA setupStruct(StructBESA structBESA) throws ExceptionBESA {
        structBESA.addBehavior("MyPeriodicGuard");
        structBESA.bindGuard("MyPeriodicGuard", MyPeriodicGuard.class);
        return structBESA;
    }
    
    public void begin() throws ExceptionBESA{
        this.start();
        this.startTimers();
    }
    
    @Override
    public void start() {
        super.start();
        /* Note: if this agent is not connected with the simulator or any other 
                external system for sensing external signs then it is necessary to 
                uncomment the next line 
        */
        startMyPeriodicGuard();
    }

    public Believes getBelieves(){
        return ((RationalState)this.getState()).getBelieves();
    }
    
    private void startPlayerPeriodicGuard() {

        try {
            PeriodicDataBESA data = new PeriodicDataBESA(PERIODIC_TIME, DELAY_TIME, PeriodicGuardBESA.START_PERIODIC_CALL);
            EventBESA startPeriodicEv = new EventBESA(MyPeriodicGuard.class.getName(), data);
            AgHandlerBESA ah = AdmBESA.getInstance().getHandlerByAlias(this.getAlias());
            ah.sendEvent(startPeriodicEv);
        } catch (ExceptionBESA ex) {
            Logger.getLogger(PlayerAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void setupAgentBDI() {
        //--------------------------------------------------------------------//
        //                          SETUP AGENT
        //--------------------------------------------------------------------//
    }
    
    public static void sendEvent(String alias,String guardName,InfoData data){
        try {
            EventBESA event = new EventBESA(guardName, data);
            AdmBESA.getInstance().getHandlerByAlias(alias).sendEvent(event);
        } catch (Exception ex) {
            ReportBESA.error("Error con el handler del agente " + alias);
        }
    }
    @Override
    public void shutdownAgentBDI() {
         System.out.println("Shutting down PLAYER agent");
    }
    
    static private List<GoalBDI> setupGoals(){
        List<GoalBDI> goals = new ArrayList<>();
        //--------------------------------------------------------------------//
        //                          ATTENTION CYCLE GOALS
        //--------------------------------------------------------------------//
        MyFirstTask myFirstTask = new MyFirstTask();
        Plan myFirstPlan = new Plan();
        breathingPlan.addTask(myFirstTask);
        MyFirstGoal myFirstGoal = new MyFirstGoal( 1, 
                                    new RationalRole( "MyFirstRole",myFirstPlan),
                                    "Breathing", GoalBDITypes.ATTENTION_CYCLE );
        goals.add(myFirstGoal);
        return goals;
    }
    
    
}
```
