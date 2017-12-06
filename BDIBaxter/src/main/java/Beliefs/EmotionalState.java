/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beliefs;

import java.util.ArrayList;

/**
 *
 * @author rmunoz
 */
public class EmotionalState {
    
    //rango [-1,1]
    private float estado_emocional;
    private ArrayList <Float> LE;
    private ArrayList <Float> BE;

    public EmotionalState() {
    }

    public EmotionalState(float estado_emocional) {
        this.estado_emocional = estado_emocional;
    }

    public float getEstado_emocional() {
        return estado_emocional;
    }

    public void setEstado_emocional(float estado_emocional) {
        this.estado_emocional = estado_emocional;
    }
    
    
    
}
