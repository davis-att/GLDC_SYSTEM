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
public class SetPlayCatalogosIndicador implements Serializable{
    String Indicador;
    
    public SetPlayCatalogosIndicador(String Indicador){
        this.Indicador=Indicador;
        
    }

    public String getIndicador() {
        return Indicador;
    }

    public void setIndicador(String Indicador) {
        this.Indicador = Indicador;
    }

    
    
}
