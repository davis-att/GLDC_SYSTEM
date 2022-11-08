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
public class SetPlayMonMercado implements Serializable{
    String mercado;
    String hora;
    String minutos;
    String llamadas;
    String latitud;
    String longitud;
    String tfecha;
    String tdia;
    String tlimsup;
    String tliminf;
    String thora;
    
    public SetPlayMonMercado (String mercado, String hora, String minutos, String llamadas, String latitud, String longitud){
     // System.out.println("Entra setplay1");
        this.mercado=mercado;
        this.hora=hora;
        this.minutos=minutos;
        this.llamadas=llamadas;
        this.latitud=latitud;
        this.longitud=longitud;
        //System.out.println("Sale setplay");
    }
    
    public  SetPlayMonMercado (String tfecha, String tdia, String tliminf, String tlimsup){
      //  System.out.println("Entra setplay2");
        this.tfecha=tfecha;
        this.tdia=tdia;
        this.tlimsup=tlimsup;
        this.tliminf=tliminf;
        //System.out.println("Sale setplay");
    }
    
   public  SetPlayMonMercado (String thora, String tdia, String tliminf, String tlimsup, String mercado){
      //  System.out.println("Entra setplay2");
        this.thora=thora;
        this.tdia=tdia;
        this.tlimsup=tlimsup;
        this.tliminf=tliminf;
        this.mercado=mercado;
        //System.out.println("Sale setplay");
    }
    


    public SetPlayMonMercado () {
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(String llamadas) {
        this.llamadas = llamadas;
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

    public String getTfecha() {
        return tfecha;
    }

    public void setTfecha(String tfecha) {
        this.tfecha = tfecha;
    }

    public String getTdia() {
        return tdia;
    }

    public void setTdia(String tdia) {
        this.tdia = tdia;
    }

    public String getTlimsup() {
        return tlimsup;
    }

    public void setTlimsup(String tlimsup) {
        this.tlimsup = tlimsup;
    }

    public String getTliminf() {
        return tliminf;
    }

    public void setTliminf(String tliminf) {
        this.tliminf = tliminf;
    }

    public String getThora() {
        return thora;
    }

    public void setThora(String thora) {
        this.thora = thora;
    }

    
    
    
    
}
