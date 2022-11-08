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
public class SetPlayCatalogosToken implements Serializable{
    String Tipos;
    
    public SetPlayCatalogosToken(String Tipos){
        this.Tipos=Tipos;
        
    }

    public String getTipos() {
        return Tipos;
    }

    public void setTipos(String Tipos) {
        this.Tipos = Tipos;
    }
    
}
