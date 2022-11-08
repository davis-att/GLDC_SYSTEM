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
public class SetPlayRoamingMundi implements Serializable{
    
    private  String pais;
    private  String capital;
    private  String latitud;
    private  String longitud;
    private  String imagen;
    private String fecha;
    private String traficoa;
    private String traficob;
    private String usuarios;
    private String rpkey;

    public SetPlayRoamingMundi(String pais, String rpkey) {
        this.pais = pais;  
        this.rpkey = rpkey;
  
    }
    
    public SetPlayRoamingMundi(String pais, String capital, String latitud, String longitud, String imagen) {
        this.pais = pais;   
        this.capital = capital;
        this.latitud = latitud;   
        this.longitud = longitud;
        this.imagen = imagen;   
    }
    
     public SetPlayRoamingMundi(String fecha, String traficoa, String traficob, String usuarios) {
        this.fecha =   fecha;
        this.traficoa = traficoa;
        this.traficob = traficob;
        this.usuarios = usuarios;        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTraficoa() {
        return traficoa;
    }

    public void setTraficoa(String traficoa) {
        this.traficoa = traficoa;
    }

    public String getTraficob() {
        return traficob;
    }

    public void setTraficob(String traficob) {
        this.traficob = traficob;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getRpkey() {
        return rpkey;
    }

    public void setRpkey(String rpkey) {
        this.rpkey = rpkey;
    }
    


  

   

    
    
}
