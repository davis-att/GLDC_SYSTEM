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
public class SetPlayUsuarios implements Serializable{
    String usuarios;
    
    public SetPlayUsuarios(String usuarios){
        this.usuarios=usuarios;
        
    }

    public SetPlayUsuarios() {
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    
    
    
}
