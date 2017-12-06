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
public class FusionMultimodal {
    
    private String educativa; /*Valores posibles:   Tedio
                                                    Aburrimiento
                                                    Indiferencia
                                                    Interes
                                                    Curiosidad
                                                    Fascinacion
                                                    Ansiedad
                                                    Preocupacion
                                                    Incomodidad
                                                    Comodidad
                                                    Optimismo
                                                    Confianza*/
    private String básica;  /*Valores Posibles:     Alegria
                                                    Tristeza
                                                    Ira
                                                    Sorpresa
                                                    Miedo
                                                    Desagrado*/

    public FusionMultimodal() {
    }

    public FusionMultimodal(String educativa, String básica) {
        this.educativa = educativa;
        this.básica = básica;
    }

    public String getEducativa() {
        return educativa;
    }

    public void setEducativa(String educativa) {
        this.educativa = educativa;
    }

    public String getBásica() {
        return básica;
    }

    public void setBásica(String básica) {
        this.básica = básica;
    }
    
    
}
