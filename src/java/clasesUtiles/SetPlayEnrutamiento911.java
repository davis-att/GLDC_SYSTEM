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
public class SetPlayEnrutamiento911 implements Serializable{
    int id;
    String grupo , estado, municipio;
    
    public SetPlayEnrutamiento911(String estado){      
        this.estado=estado;        
    }
    
    public SetPlayEnrutamiento911(String estado,String municipio){      
        this.estado=estado;   
        this.municipio=municipio; 
    }  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    
    
    
}
