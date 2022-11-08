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
public class SetPlayTopPlanes implements Serializable{
    
    private  String plan;
    private  String usuarios;
    private String servicio,dna,corte,servicioCorte,corteCorte;
    private int eventos,eventosCorte;
    private String megas;

    
    public SetPlayTopPlanes(String servicioCorte, String corteCorte,int eventosCorte) {
        this.servicioCorte = servicioCorte;   
        this.corteCorte = corteCorte;
        this.eventosCorte =  eventosCorte;
    }
    
    public SetPlayTopPlanes(String plan, String usuarios) {
        this.plan = plan;   
        this.usuarios = usuarios;
    }
    
    public SetPlayTopPlanes(String servicio, String dna, String plan, String corte,int eventos) {
        this.servicio = servicio;   
        this.dna = dna;
        this.plan = plan;
        this.corte = corte;
        this.eventos =eventos;
    }
    
     public SetPlayTopPlanes(String servicio, String dna, String plan, String corte,String megas) {
        this.servicio = servicio;   
        this.dna = dna;
        this.plan = plan;
        this.corte = corte;
        this.megas =megas;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public void setEventos(int eventos) {
        this.eventos = eventos;
    }

    
    public String getServicio() {
        return servicio;
    }

    public String getDna() {
        return dna;
    }

    public String getCorte() {
        return corte;
    }

    public int getEventos() {
        return eventos;
    }

    public String getMegas() {
        return megas;
    }

    public void setMegas(String megas) {
        this.megas = megas;
    }

    
    
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getServicioCorte() {
        return servicioCorte;
    }

    public String getCorteCorte() {
        return corteCorte;
    }

    public int getEventosCorte() {
        return eventosCorte;
    }

    public void setServicioCorte(String servicioCorte) {
        this.servicioCorte = servicioCorte;
    }

    public void setCorteCorte(String corteCorte) {
        this.corteCorte = corteCorte;
    }

    public void setEventosCorte(int eventosCorte) {
        this.eventosCorte = eventosCorte;
    }


    
    
}
