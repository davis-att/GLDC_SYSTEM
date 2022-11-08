/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI12906
 */
public class SetPlayVAS implements Serializable{
    
    private  String operador;
    private  String doperador;

    
    public SetPlayVAS(String operador, String doperador) {
        this.operador = operador;   
        this.doperador = doperador;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getDoperador() {
        return doperador;
    }

    public void setDoperador(String doperador) {
        this.doperador = doperador;
    }


    
    
}
