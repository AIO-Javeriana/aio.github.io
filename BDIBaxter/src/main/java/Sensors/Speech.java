/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.util.ArrayList;

/**
 *
 * @author rmunoz
 */
public class Speech {
    
    private ArrayList<String> diccionario;
    private int cantidadDeFrasesUsuario;

    public Speech() {
    }

    public Speech(ArrayList<String> diccionario, int cantidadDeFrasesUsuario) {
        this.diccionario = diccionario;
        this.cantidadDeFrasesUsuario = cantidadDeFrasesUsuario;
    }

    public ArrayList<String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(ArrayList<String> diccionario) {
        this.diccionario = diccionario;
    }

    public int getCantidadDeFrasesUsuario() {
        return cantidadDeFrasesUsuario;
    }

    public void setCantidadDeFrasesUsuario(int cantidadDeFrasesUsuario) {
        this.cantidadDeFrasesUsuario = cantidadDeFrasesUsuario;
    }
    
}
