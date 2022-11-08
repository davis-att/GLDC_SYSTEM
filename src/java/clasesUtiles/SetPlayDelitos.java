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
public class SetPlayDelitos implements Serializable{
    String delitos;
    
    public SetPlayDelitos(String delitos){
        this.delitos=delitos;
        
    }

    public String getDelitos() {
        return delitos;
    }

    public void setDelitos(String delitos) {
        this.delitos = delitos;
    }


    
    
}
