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
public class SetPlayConciliaciones implements Serializable{
    
    private  String id;
    private  String archivo;
    private  String totalreg;
    private  String conciliados;
    private  String no_conciliados;
    private  String porc_conciliados;
    private  String porc_noconciliados;
    private  String escenario;
    private  String porc_esc;
    private  String porc_dup;
    
    public SetPlayConciliaciones(String id, String archivo, String totalreg, String conciliados, 
                                String no_conciliados,  String porc_conciliados,  String porc_noconciliados) {
        this.id = id;   
        this.archivo = archivo;
        this.totalreg = totalreg;
        this.conciliados = conciliados;
        this.no_conciliados = no_conciliados;
        this.porc_conciliados = porc_conciliados;
        this.porc_noconciliados = porc_noconciliados;
    }
    
    public SetPlayConciliaciones(String escenario, String totalreg, String porc_esc) {
        this.escenario = escenario;   
        this.totalreg = totalreg;
        this.porc_esc = porc_esc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getTotalreg() {
        return totalreg;
    }

    public void setTotalreg(String totalreg) {
        this.totalreg = totalreg;
    }

    public String getConciliados() {
        return conciliados;
    }

    public void setConciliados(String conciliados) {
        this.conciliados = conciliados;
    }

    public String getNo_conciliados() {
        return no_conciliados;
    }

    public void setNo_conciliados(String no_conciliados) {
        this.no_conciliados = no_conciliados;
    }

    public String getPorc_conciliados() {
        return porc_conciliados;
    }

    public void setPorc_conciliados(String porc_conciliados) {
        this.porc_conciliados = porc_conciliados;
    }

    public String getPorc_noconciliados() {
        return porc_noconciliados;
    }

    public void setPorc_noconciliados(String porc_noconciliados) {
        this.porc_noconciliados = porc_noconciliados;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getPorc_esc() {
        return porc_esc;
    }

    public void setPorc_esc(String porc_esc) {
        this.porc_esc = porc_esc;
    }

    public String getPorc_dup() {
        return porc_dup;
    }

    public void setPorc_dup(String porc_dup) {
        this.porc_dup = porc_dup;
    }
    
    
    
}
