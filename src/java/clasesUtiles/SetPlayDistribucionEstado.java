/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI12906
 */
public class SetPlayDistribucionEstado implements Serializable{
    
    private  String estado;
    private  String unidad;
    private  String unidad2;
    private  String imagen;
    
     public SetPlayDistribucionEstado(String estado, String unidad) {
        this.estado = estado;  
        this.unidad = unidad;
  
    }
     
    public SetPlayDistribucionEstado(String estado, String unidad, String unidad2) {
        this.estado = estado;  
        this.unidad = unidad;
        this.unidad2 = unidad2;
  
    }

   public SetPlayDistribucionEstado(String estado, String unidad, String unidad2, String imagen) {
        this.estado = estado;  
        this.unidad = unidad;
        this.unidad2 = unidad2;
        this.imagen = imagen;
  
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad2() {
        return unidad2;
    }

    public void setUnidad2(String unidad2) {
        this.unidad2 = unidad2;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
     
     
     
    
}
