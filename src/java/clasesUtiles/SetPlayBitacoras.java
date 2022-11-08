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
public class SetPlayBitacoras implements Serializable{
    String bitacoras;
    
    public SetPlayBitacoras(String bitacoras){
        this.bitacoras=bitacoras;
        
    }

    public SetPlayBitacoras() {
    }

    public String getBitacoras() {
        return bitacoras;
    }

    public void setBitacoras(String bitacoras) {
        this.bitacoras = bitacoras;
    }

    
    
    
}
