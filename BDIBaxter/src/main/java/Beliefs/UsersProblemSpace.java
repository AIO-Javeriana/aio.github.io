/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beliefs;

import Sensors.BlockMovement;
import java.util.ArrayList;

/**
 *
 * @author rmunoz
 */
public class UsersProblemSpace {
    
    private ArrayList<BlockMovement> estadoActual;

    public UsersProblemSpace() {
    }

    public UsersProblemSpace(ArrayList<BlockMovement> historialDeMovimientos) {
        this.estadoActual = historialDeMovimientos;
    }

    public ArrayList<BlockMovement> getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(ArrayList<BlockMovement> estadoActual) {
        this.estadoActual = estadoActual;
    }
    
    
    
    
}
