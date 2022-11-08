/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import clasesUtiles.*;
import java.io.Serializable;

/**
 *
 * @author NMI16991
 */
public class SP_Queue_Usuarios implements Serializable{
    String usuario, imagen, attid;
    
    public SP_Queue_Usuarios(String usuario, String imagen, String attid){
        this.usuario=usuario;
        this.imagen= imagen;
        this.attid= attid;
        
    }

    public SP_Queue_Usuarios() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAttid() {
        return attid;
    }

    public void setAttid(String attid) {
        this.attid = attid;
    }


    
    
    
}
