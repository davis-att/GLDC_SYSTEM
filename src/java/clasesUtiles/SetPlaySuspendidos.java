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
public class SetPlaySuspendidos implements Serializable {

    String fecha_total, cofetel_total, celdas_total, troncales_total, cic_total,
            normalizacion_total, wcc_total, sc_total, cofetel_ex, celdas_ex,
            troncales_ex, cic_ex, normalizacion_ex, wcc_ex, sc_ex, tabla;

    public SetPlaySuspendidos(
            String fecha_total, String cofetel_total, String celdas_total, String troncales_total,
            String cic_total, String normalizacion_total, String wcc_total, String sc_total, 
            String cofetel_ex, String celdas_ex, String troncales_ex, String cic_ex, String normalizacion_ex,
            String wcc_ex, String sc_ex, String tabla
    ) {
        this.fecha_total = fecha_total;
        this.cofetel_total = cofetel_total;
        this.celdas_total = celdas_total;
        this.troncales_total = troncales_total;
        this.cic_total = cic_total;
        this.normalizacion_total = normalizacion_total;
        this.wcc_total = wcc_total;
        this.sc_total = sc_total;
        this.cofetel_ex = cofetel_ex;
        this.celdas_ex = celdas_ex;
        this.troncales_ex = troncales_ex;
        this.cic_ex = cic_ex;
        this.normalizacion_ex = normalizacion_ex;
        this.wcc_ex = wcc_ex;
        this.sc_ex = sc_ex;
        this.tabla = tabla;
    }

    public String getFecha_total() {
        return fecha_total;
    }

    public void setFecha_total(String fecha_total) {
        this.fecha_total = fecha_total;
    }

    public String getCofetel_total() {
        return cofetel_total;
    }

    public void setCofetel_total(String cofetel_total) {
        this.cofetel_total = cofetel_total;
    }

    public String getCeldas_total() {
        return celdas_total;
    }

    public void setCeldas_total(String celdas_total) {
        this.celdas_total = celdas_total;
    }

    public String getTroncales_total() {
        return troncales_total;
    }

    public void setTroncales_total(String troncales_total) {
        this.troncales_total = troncales_total;
    }

    public String getCic_total() {
        return cic_total;
    }

    public void setCic_total(String cic_total) {
        this.cic_total = cic_total;
    }

    public String getNormalizacion_total() {
        return normalizacion_total;
    }

    public void setNormalizacion_total(String normalizacion_total) {
        this.normalizacion_total = normalizacion_total;
    }

    public String getWcc_total() {
        return wcc_total;
    }

    public void setWcc_total(String wcc_total) {
        this.wcc_total = wcc_total;
    }

    public String getSc_total() {
        return sc_total;
    }

    public void setSc_total(String sc_total) {
        this.sc_total = sc_total;
    }


    public String getCofetel_ex() {
        return cofetel_ex;
    }

    public void setCofetel_ex(String cofetel_ex) {
        this.cofetel_ex = cofetel_ex;
    }

    public String getCeldas_ex() {
        return celdas_ex;
    }

    public void setCeldas_ex(String celdas_ex) {
        this.celdas_ex = celdas_ex;
    }

    public String getTroncales_ex() {
        return troncales_ex;
    }

    public void setTroncales_ex(String troncales_ex) {
        this.troncales_ex = troncales_ex;
    }

    public String getCic_ex() {
        return cic_ex;
    }

    public void setCic_ex(String cic_ex) {
        this.cic_ex = cic_ex;
    }

    public String getNormalizacion_ex() {
        return normalizacion_ex;
    }

    public void setNormalizacion_ex(String normalizacion_ex) {
        this.normalizacion_ex = normalizacion_ex;
    }

    public String getWcc_ex() {
        return wcc_ex;
    }

    public void setWcc_ex(String wcc_ex) {
        this.wcc_ex = wcc_ex;
    }

    public String getSc_ex() {
        return sc_ex;
    }

    public void setSc_ex(String sc_ex) {
        this.sc_ex = sc_ex;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    
    
    
}
