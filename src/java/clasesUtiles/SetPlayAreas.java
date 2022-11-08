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
public class SetPlayAreas implements Serializable{
    String areas;
    
    public SetPlayAreas(String areas){
        this.areas=areas;
        
    }

    public SetPlayAreas() {
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    
    
    
}
