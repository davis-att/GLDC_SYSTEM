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
public class SetPlayTipoSolicitud implements Serializable{
    String tipo_solicitud;
    
    public SetPlayTipoSolicitud(String tipo_solicitud){
        this.tipo_solicitud=tipo_solicitud;
        
    }

    public SetPlayTipoSolicitud() {
    }

    public String getTipo_solicitud() {
        return tipo_solicitud;
    }

    public void setTipo_solicitud(String tipo_solicitud) {
        this.tipo_solicitud = tipo_solicitud;
    }

   
    
    
}
