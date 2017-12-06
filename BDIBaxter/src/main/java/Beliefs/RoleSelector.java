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
public class RoleSelector {
    
    //rango [-1,1]
    private float control;
    private float aceptacion;

    public RoleSelector() {
    }

    public RoleSelector(float control, float aceptacion) {
        this.control = control;
        this.aceptacion = aceptacion;
    }

    public float getControl() {
        return control;
    }

    public void setControl(float control) {
        this.control = control;
    }

    public float getAceptacion() {
        return aceptacion;
    }

    public void setAceptacion(float aceptacion) {
        this.aceptacion = aceptacion;
    }
    
    
    
}
