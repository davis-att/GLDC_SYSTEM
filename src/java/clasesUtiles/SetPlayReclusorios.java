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
public class SetPlayReclusorios implements Serializable{
    String NOMBRE, MUNICIPIO, LATITUD, LONGITUD;
    
    public SetPlayReclusorios(String NOMBRE, String MUNICIPIO, String LATITUD, String LONGITUD){
        this.NOMBRE=NOMBRE;
        this.MUNICIPIO=MUNICIPIO;
        this.LATITUD=LATITUD;
        this.LONGITUD=LONGITUD;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getMUNICIPIO() {
        return MUNICIPIO;
    }

    public void setMUNICIPIO(String MUNICIPIO) {
        this.MUNICIPIO = MUNICIPIO;
    }

    public String getLATITUD() {
        return LATITUD;
    }

    public void setLATITUD(String LATITUD) {
        this.LATITUD = LATITUD;
    }

    public String getLONGITUD() {
        return LONGITUD;
    }

    public void setLONGITUD(String LONGITUD) {
        this.LONGITUD = LONGITUD;
    }

   
   
    
}
