/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desires;

import Sensors.Posicion;

/**
 *
 * @author rmunoz
 */
public class RobotEmotion {
    
    private float velocidad;
    private Posicion pantalla;

    public RobotEmotion() {
    }

    public RobotEmotion(float velocidad, Posicion pantalla) {
        this.velocidad = velocidad;
        this.pantalla = pantalla;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public Posicion getPantalla() {
        return pantalla;
    }

    public void setPantalla(Posicion pantalla) {
        this.pantalla = pantalla;
    }
    
}
