/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author rmunoz
 */
public class BlockMovement {
    
    private Posicion posición;
    private double velocidad;
    private double aceleracion;
    private long tiempoEnMovimiento;
    private ArrayList<Image> caras;     //1..* cuando no tiene nada es "Poker Face"
    private float modo;                 //SelfConfident o Hesitate
    private String etiquetas;           //evaluacionPositiva
                                        //evaluacionNegativa 
                                        //hipotesis
                                        //duda (?)

    public BlockMovement() {
    }

    public BlockMovement(Posicion posición, double velocidad, double aceleracion, long tiempoEnMovimiento, ArrayList<Image> caras, float modo, String etiquetas) {
        this.posición = posición;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.tiempoEnMovimiento = tiempoEnMovimiento;
        this.caras = caras;
        this.modo = modo;
        this.etiquetas = etiquetas;
    }

    public Posicion getPosición() {
        return posición;
    }

    public void setPosición(Posicion posición) {
        this.posición = posición;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public long getTiempoEnMovimiento() {
        return tiempoEnMovimiento;
    }

    public void setTiempoEnMovimiento(long tiempoEnMovimiento) {
        this.tiempoEnMovimiento = tiempoEnMovimiento;
    }

    public ArrayList<Image> getCaras() {
        return caras;
    }

    public void setCaras(ArrayList<Image> caras) {
        this.caras = caras;
    }

    public float getModo() {
        return modo;
    }

    public void setModo(float modo) {
        this.modo = modo;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }
    
   public Posicion BlockPosition()
   {
       return getPosición();
   }
    
   public float control()
   {
       float value=0; /*[0,1]*/
       return value;
   }
    
   public float EmotionalState()
   {
       float value=0; /*[-1,1]*/
       return value;
   }
   
}
