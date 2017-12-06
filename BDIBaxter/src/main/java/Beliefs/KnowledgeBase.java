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
public class KnowledgeBase {
    
    private int reto;
    /*
    private unknownType estado_inicial_problema;
    private unknownType estado_final_problema;
    private unknownType regla_1_problema;
    private unknownType regla_2_problema;
    private unknownType regla_3_problema;
    private unknownType regla_4_problema;
    private unknownType operador_1_problema;
    private unknownType operador_2_problema;
    private unknownType operador_3_problema;
    private unknownType operador_4_problema;
    */

    public KnowledgeBase() {
    }

    public KnowledgeBase(int reto) {
        this.reto = reto;
    }

    public int getReto() {
        return reto;
    }

    public void setReto(int reto) {
        this.reto = reto;
    }
    
    
}
