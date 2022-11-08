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
public class SetPlayPaises implements Serializable{
    String paises;
    
    public SetPlayPaises(String paises){
        this.paises=paises;
        
    }

    public SetPlayPaises() {
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    
    
    
}
