/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desires;

import java.util.ArrayList;

/**
 *
 * @author rmunoz
 */
public class Pregunton {
    
    private String respuesta_conocimiento_estado_inicial;
    private String respuesta_conocimiento_estado_final;
    private String respuesta_conocimiento_reglas;
    private String respuesta_conocimiento_operadores;
    private String respuesta_conocimiento_accion_transformar;
    private String respuesta_conocimiento_accion_reducir;
    private String respuesta_conocimiento_accion_aplicar;
    private ArrayList<String> ProblemsKnowledge;
    private ArrayList<String> StrategysKnowledge;

    public Pregunton() {
    }

    public Pregunton(String respuesta_conocimiento_estado_inicial, String respuesta_conocimiento_estado_final, String respuesta_conocimiento_reglas, String respuesta_conocimiento_operadores, String respuesta_conocimiento_accion_transformar, String respuesta_conocimiento_accion_reducir, String respuesta_conocimiento_accion_aplicar) {
        this.respuesta_conocimiento_estado_inicial = respuesta_conocimiento_estado_inicial;
        this.respuesta_conocimiento_estado_final = respuesta_conocimiento_estado_final;
        this.respuesta_conocimiento_reglas = respuesta_conocimiento_reglas;
        this.respuesta_conocimiento_operadores = respuesta_conocimiento_operadores;
        this.respuesta_conocimiento_accion_transformar = respuesta_conocimiento_accion_transformar;
        this.respuesta_conocimiento_accion_reducir = respuesta_conocimiento_accion_reducir;
        this.respuesta_conocimiento_accion_aplicar = respuesta_conocimiento_accion_aplicar;
    }

    public String getRespuesta_conocimiento_estado_inicial() {
        return respuesta_conocimiento_estado_inicial;
    }

    public void setRespuesta_conocimiento_estado_inicial(String respuesta_conocimiento_estado_inicial) {
        this.respuesta_conocimiento_estado_inicial = respuesta_conocimiento_estado_inicial;
    }

    public String getRespuesta_conocimiento_estado_final() {
        return respuesta_conocimiento_estado_final;
    }

    public void setRespuesta_conocimiento_estado_final(String respuesta_conocimiento_estado_final) {
        this.respuesta_conocimiento_estado_final = respuesta_conocimiento_estado_final;
    }

    public String getRespuesta_conocimiento_reglas() {
        return respuesta_conocimiento_reglas;
    }

    public void setRespuesta_conocimiento_reglas(String respuesta_conocimiento_reglas) {
        this.respuesta_conocimiento_reglas = respuesta_conocimiento_reglas;
    }

    public String getRespuesta_conocimiento_operadores() {
        return respuesta_conocimiento_operadores;
    }

    public void setRespuesta_conocimiento_operadores(String respuesta_conocimiento_operadores) {
        this.respuesta_conocimiento_operadores = respuesta_conocimiento_operadores;
    }

    public String getRespuesta_conocimiento_accion_transformar() {
        return respuesta_conocimiento_accion_transformar;
    }

    public void setRespuesta_conocimiento_accion_transformar(String respuesta_conocimiento_accion_transformar) {
        this.respuesta_conocimiento_accion_transformar = respuesta_conocimiento_accion_transformar;
    }

    public String getRespuesta_conocimiento_accion_reducir() {
        return respuesta_conocimiento_accion_reducir;
    }

    public void setRespuesta_conocimiento_accion_reducir(String respuesta_conocimiento_accion_reducir) {
        this.respuesta_conocimiento_accion_reducir = respuesta_conocimiento_accion_reducir;
    }

    public String getRespuesta_conocimiento_accion_aplicar() {
        return respuesta_conocimiento_accion_aplicar;
    }

    public void setRespuesta_conocimiento_accion_aplicar(String respuesta_conocimiento_accion_aplicar) {
        this.respuesta_conocimiento_accion_aplicar = respuesta_conocimiento_accion_aplicar;
    }

    public void questionSelector(ArrayList<String> arregloProblem_arregloStrategy)
    {
   
    }

    public ArrayList<String> getProblemsKnowledge() {
        return ProblemsKnowledge;
    }

    public void setProblemsKnowledge(ArrayList<String> ProblemsKnowledge) {
        this.ProblemsKnowledge = ProblemsKnowledge;
    }

    public ArrayList<String> getStrategysKnowledge() {
        return StrategysKnowledge;
    }

    public void setStrategysKnowledge(ArrayList<String> StrategysKnowledge) {
        this.StrategysKnowledge = StrategysKnowledge;
    }
    
    
}
