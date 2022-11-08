/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI16991
 */
public class SetPlayOperadores implements Serializable{
    String operadores;
    String idoper;
    String imagen;
    
    public SetPlayOperadores(String operadores, String idoper, String imagen){
        this.operadores=operadores;
        this.idoper=idoper;
        this.imagen=imagen;
        
    }

    public SetPlayOperadores() {
    }

    public String getOperadores() {
        return operadores;
    }

    public void setOperadores(String operadores) {
        this.operadores = operadores;
    }

    public String getIdoper() {
        return idoper;
    }

    public void setIdoper(String idoper) {
        this.idoper = idoper;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    
    
}
