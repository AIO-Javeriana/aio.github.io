/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beliefs;

/**
 *
 * @author rmunoz
 */
public class ProblemSolvingStrategy {
    
    //rango [0,1]
    private float conocimiento_general_estrategia;
    private float conocimiento_accion_transformar;
    private float conocimiento_accion_reducir;

    public ProblemSolvingStrategy() {
    }

    public ProblemSolvingStrategy(float conocimiento_general_estrategia, float conocimiento_accion_transformar, float conocimiento_accion_reducir) {
        this.conocimiento_general_estrategia = conocimiento_general_estrategia;
        this.conocimiento_accion_transformar = conocimiento_accion_transformar;
        this.conocimiento_accion_reducir = conocimiento_accion_reducir;
    }

    public float getConocimiento_general_estrategia() {
        return conocimiento_general_estrategia;
    }

    public void setConocimiento_general_estrategia(float conocimiento_general_estrategia) {
        this.conocimiento_general_estrategia = conocimiento_general_estrategia;
    }

    public float getConocimiento_accion_transformar() {
        return conocimiento_accion_transformar;
    }

    public void setConocimiento_accion_transformar(float conocimiento_accion_transformar) {
        this.conocimiento_accion_transformar = conocimiento_accion_transformar;
    }

    public float getConocimiento_accion_reducir() {
        return conocimiento_accion_reducir;
    }

    public void setConocimiento_accion_reducir(float conocimiento_accion_reducir) {
        this.conocimiento_accion_reducir = conocimiento_accion_reducir;
    }
    
    public void StateComparator()
    {
    }
    
    public float Students_Transformimg_Skill()
    {
        float value=0;
        return value;
    }
    
    public float Students_Reducing_Skill()
    {
        float value=0;
        return value;
    }
    
    public float General_Knowldege_MeansEnd_Analysis()
    {
        float value=0;
        return value;
    }
    
    
}
