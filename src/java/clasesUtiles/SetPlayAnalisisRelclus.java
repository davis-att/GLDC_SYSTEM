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
public class SetPlayAnalisisRelclus implements Serializable{
    String EPT_LATITUD, EPT_LONGITUD, ATT_SITE_NAME, NOMBRE_R, R_LATITUD, R_LONGITUD, imsi,estacerca;
    int LLAMADAS;
    double DISTANCIA;
    
    
    
    public SetPlayAnalisisRelclus(String EPT_LATITUD, String EPT_LONGITUD, String ATT_SITE_NAME , int LLAMADAS){
        this.EPT_LATITUD=EPT_LATITUD;
        this.EPT_LONGITUD=EPT_LONGITUD;
        this.ATT_SITE_NAME=ATT_SITE_NAME;
        this.LLAMADAS=LLAMADAS;
    }
    
      public SetPlayAnalisisRelclus(String imsi,String EPT_LATITUD, String EPT_LONGITUD, String ATT_SITE_NAME , int LLAMADAS,String NOMBRE_R, String R_LATITUD,String R_LONGITUD,double DISTANCIA, String estacerca){
        this.imsi=imsi;
        this.EPT_LATITUD=EPT_LATITUD;
        this.EPT_LONGITUD=EPT_LONGITUD;
        this.ATT_SITE_NAME=ATT_SITE_NAME;
        this.LLAMADAS=LLAMADAS;
        this.NOMBRE_R=NOMBRE_R;
        this.R_LATITUD=R_LATITUD;
        this.R_LONGITUD=R_LONGITUD;
        this.DISTANCIA=DISTANCIA;
        this.estacerca=estacerca;
    }

    public String getEPT_LATITUD() {
        return EPT_LATITUD;
    }

    public void setEPT_LATITUD(String EPT_LATITUD) {
        this.EPT_LATITUD = EPT_LATITUD;
    }

    public String getEPT_LONGITUD() {
        return EPT_LONGITUD;
    }

    public void setEPT_LONGITUD(String EPT_LONGITUD) {
        this.EPT_LONGITUD = EPT_LONGITUD;
    }

    public String getATT_SITE_NAME() {
        return ATT_SITE_NAME;
    }

    public void setATT_SITE_NAME(String ATT_SITE_NAME) {
        this.ATT_SITE_NAME = ATT_SITE_NAME;
    }

    public int getLLAMADAS() {
        return LLAMADAS;
    }

    public void setLLAMADAS(int LLAMADAS) {
        this.LLAMADAS = LLAMADAS;
    }

    public String getNOMBRE_R() {
        return NOMBRE_R;
    }

    public void setNOMBRE_R(String NOMBRE_R) {
        this.NOMBRE_R = NOMBRE_R;
    }

    public String getR_LATITUD() {
        return R_LATITUD;
    }

    public void setR_LATITUD(String R_LATITUD) {
        this.R_LATITUD = R_LATITUD;
    }

    public String getR_LONGITUD() {
        return R_LONGITUD;
    }

    public void setR_LONGITUD(String R_LONGITUD) {
        this.R_LONGITUD = R_LONGITUD;
    }

    public double getDISTANCIA() {
        return DISTANCIA;
    }

    public void setDISTANCIA(double DISTANCIA) {
        this.DISTANCIA = DISTANCIA;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getEstacerca() {
        return estacerca;
    }

    public void setEstacerca(String estacerca) {
        this.estacerca = estacerca;
    }

    
    
    
}
