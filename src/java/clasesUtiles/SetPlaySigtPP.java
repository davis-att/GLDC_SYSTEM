/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NMI16991
 */
public class SetPlaySigtPP implements Serializable {

    String  fecha, servicio, archivo, total_sigt, total_sigtpp; 
    int diff,sinplan;

    public SetPlaySigtPP(
            String fecha, String servicio, String archivo, String total_sigt, String total_sigtpp, int diff, int sinplan            
    ) {
        this.fecha = fecha;
        this.servicio = servicio;
        this.archivo = archivo;
        this.total_sigt = total_sigt;
        this.total_sigtpp = total_sigtpp;
        this.diff = diff;
        this.sinplan = sinplan;
       
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getTotal_sigt() {
        return total_sigt;
    }

    public void setTotal_sigt(String total_sigt) {
        this.total_sigt = total_sigt;
    }

    public String getTotal_sigtpp() {
        return total_sigtpp;
    }

    public void setTotal_sigtpp(String total_sigtpp) {
        this.total_sigtpp = total_sigtpp;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public int getSinplan() {
        return sinplan;
    }

    public void setSinplan(int sinplan) {
        this.sinplan = sinplan;
    }

    




    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

      
}
