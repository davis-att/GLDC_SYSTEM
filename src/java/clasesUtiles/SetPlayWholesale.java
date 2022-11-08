/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author mgalicia
 */
public class SetPlayWholesale implements Serializable{
    String fecha;
    String minutos;
    String llamadas;
    
    
    public SetPlayWholesale(String fecha, String minutos, String llamadas){
        this.fecha=fecha;
        this.minutos=minutos;
        this.llamadas=llamadas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMinutos() {
        return minutos;
    }

    public String getLlamadas() {
        return llamadas;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public void setLlamadas(String llamadas) {
        this.llamadas = llamadas;
    }
         
}
