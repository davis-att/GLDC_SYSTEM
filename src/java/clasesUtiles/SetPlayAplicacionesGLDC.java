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
public class SetPlayAplicacionesGLDC implements Serializable{
    String aplicacion;
    
    public SetPlayAplicacionesGLDC(String aplicacion){
        this.aplicacion=aplicacion;
        
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

  
    
    
    
}
