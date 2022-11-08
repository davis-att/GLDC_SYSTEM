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
public class SetPlayCiudadesEvolution implements Serializable{
    
    private String CIUDAD;

    public SetPlayCiudadesEvolution(String CIUDAD) {
        this.CIUDAD = CIUDAD;
        
    }
   
    public SetPlayCiudadesEvolution(){
        
    }
    
    public String getCIUDAD() {
        return CIUDAD;
    }

    public void setCIUDAD(String CIUDAD) {
        this.CIUDAD = CIUDAD;
    }

      
}
