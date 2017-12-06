/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

/**
 *
 * @author rmunoz
 */
public class EmotionalTone {
    
    //rango de valores:[-1,1]
    private float ansiedad;
    private float preocupacion;
    private float comodidad;
    private float optimismo;
    private float aburrimiento;
    private float indiferencia;
    private float interes;
    private float curiosidad;

    public EmotionalTone() {
    }

    public EmotionalTone(float ansiedad, float preocupacion, float comodidad, float optimismo, float aburrimiento, float indiferencia, float interes, float curiosidad) {
        this.ansiedad = ansiedad;
        this.preocupacion = preocupacion;
        this.comodidad = comodidad;
        this.optimismo = optimismo;
        this.aburrimiento = aburrimiento;
        this.indiferencia = indiferencia;
        this.interes = interes;
        this.curiosidad = curiosidad;
    }

    public float getAnsiedad() {
        return ansiedad;
    }

    public void setAnsiedad(float ansiedad) {
        this.ansiedad = ansiedad;
    }

    public float getPreocupacion() {
        return preocupacion;
    }

    public void setPreocupacion(float preocupacion) {
        this.preocupacion = preocupacion;
    }

    public float getComodidad() {
        return comodidad;
    }

    public void setComodidad(float comodidad) {
        this.comodidad = comodidad;
    }

    public float getOptimismo() {
        return optimismo;
    }

    public void setOptimismo(float optimismo) {
        this.optimismo = optimismo;
    }

    public float getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(float aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public float getIndiferencia() {
        return indiferencia;
    }

    public void setIndiferencia(float indiferencia) {
        this.indiferencia = indiferencia;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getCuriosidad() {
        return curiosidad;
    }

    public void setCuriosidad(float curiosidad) {
        this.curiosidad = curiosidad;
    }
    
    
}
