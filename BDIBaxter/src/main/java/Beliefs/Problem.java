/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beliefs;

import Sensors.Posicion;
import java.util.ArrayList;

/**
 *
 * @author rmunoz
 */
public class Problem {
    
    /*    Rango de variables: [0,1]    */
    private float conocimiento_estado_inicial;
    private float conocimiento_estado_final;
    private float conocimiento_reglas;
    private float conocimiento_operadores;
    private float conocimiento_general_problema;

    public Problem() {
    }

    public Problem(float conocimiento_estado_inicial, float conocimiento_estado_final, float conocimiento_reglas, float conocimiento_operadores, float conocimiento_general_problema) {
        this.conocimiento_estado_inicial = conocimiento_estado_inicial;
        this.conocimiento_estado_final = conocimiento_estado_final;
        this.conocimiento_reglas = conocimiento_reglas;
        this.conocimiento_operadores = conocimiento_operadores;
        this.conocimiento_general_problema = conocimiento_general_problema;
    }

    public float getConocimiento_estado_inicial() {
        return conocimiento_estado_inicial;
    }

    public void setConocimiento_estado_inicial(float conocimiento_estado_inicial) {
        this.conocimiento_estado_inicial = conocimiento_estado_inicial;
    }

    public float getConocimiento_estado_final() {
        return conocimiento_estado_final;
    }

    public void setConocimiento_estado_final(float conocimiento_estado_final) {
        this.conocimiento_estado_final = conocimiento_estado_final;
    }

    public float getConocimiento_reglas() {
        return conocimiento_reglas;
    }

    public void setConocimiento_reglas(float conocimiento_reglas) {
        this.conocimiento_reglas = conocimiento_reglas;
    }

    public float getConocimiento_operadores() {
        return conocimiento_operadores;
    }

    public void setConocimiento_operadores(float conocimiento_operadores) {
        this.conocimiento_operadores = conocimiento_operadores;
    }

    public float getConocimiento_general_problema() {
        return conocimiento_general_problema;
    }

    public void setConocimiento_general_problema(float conocimiento_general_problema) {
        this.conocimiento_general_problema = conocimiento_general_problema;
    }
    
    public ArrayList<Posicion> PositionHistory()
    {
        ArrayList<Posicion> value=null;
        return value;
    }
    
    public float Knowledge_Initial_State()
    {
        float value=0;
        return value;
    }
    
    public float Knowledge_Goal_State()
    {
        float value=0;
        return value;
    }
    
    public float Knowledge_Rules()
    {
        float value=0;
        return value;
    }
    
    public int Mistakes_Achivements()
    {
        int value=0;
        return value;
    }
    
    public float Problems_General_Knowledge()
    {
        float value=0;
        return value;
    }
}
