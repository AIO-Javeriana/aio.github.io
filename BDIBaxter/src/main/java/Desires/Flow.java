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
public class Flow {
    
    private float scaffolding_reto;
    private float scaffolding_habilidad;
    private float scaffolding_emocion;
    private ArrayList<Challenge> array_challenge;
    private ArrayList<Emotion> array_emotion;

    public Flow() {
    }

    public Flow(float scaffolding_reto, float scaffolding_habilidad, float scaffolding_emocion) {
        this.scaffolding_reto = scaffolding_reto;
        this.scaffolding_habilidad = scaffolding_habilidad;
        this.scaffolding_emocion = scaffolding_emocion;
    }

    public float getScaffolding_reto() {
        return scaffolding_reto;
    }

    public void setScaffolding_reto(float scaffolding_reto) {
        this.scaffolding_reto = scaffolding_reto;
    }

    public float getScaffolding_habilidad() {
        return scaffolding_habilidad;
    }

    public void setScaffolding_habilidad(float scaffolding_habilidad) {
        this.scaffolding_habilidad = scaffolding_habilidad;
    }

    public float getScaffolding_emocion() {
        return scaffolding_emocion;
    }

    public void setScaffolding_emocion(float scaffolding_emocion) {
        this.scaffolding_emocion = scaffolding_emocion;
    }

    public ArrayList<Challenge> getArray_challenge() {
        return array_challenge;
    }

    public void setArray_challenge(ArrayList<Challenge> array_challenge) {
        this.array_challenge = array_challenge;
    }

    public ArrayList<Emotion> getArray_emotion() {
        return array_emotion;
    }

    public void setArray_emotion(ArrayList<Emotion> array_emotion) {
        this.array_emotion = array_emotion;
    }

    
    
}

class Challenge
{
    private float Magnitude, Direction, Sense;

    public Challenge() {
    }

    public Challenge(float Magnitude, float Direction, float Sense) {
        this.Magnitude = Magnitude;
        this.Direction = Direction;
        this.Sense = Sense;
    }

    public float getMagnitude() {
        return Magnitude;
    }

    public void setMagnitude(float Magnitude) {
        this.Magnitude = Magnitude;
    }

    public float getDirection() {
        return Direction;
    }

    public void setDirection(float Direction) {
        this.Direction = Direction;
    }

    public float getSense() {
        return Sense;
    }

    public void setSense(float Sense) {
        this.Sense = Sense;
    }
    
}

class Emotion
{
    private float Magnitude, Direction, Sense;

    public Emotion() {
    }

    public Emotion(float Magnitude, float Direction, float Sense) {
        this.Magnitude = Magnitude;
        this.Direction = Direction;
        this.Sense = Sense;
    }
    
    public float getMagnitude() {
        return Magnitude;
    }

    public void setMagnitude(float Magnitude) {
        this.Magnitude = Magnitude;
    }

    public float getDirection() {
        return Direction;
    }

    public void setDirection(float Direction) {
        this.Direction = Direction;
    }

    public float getSense() {
        return Sense;
    }

    public void setSense(float Sense) {
        this.Sense = Sense;
    }
}
