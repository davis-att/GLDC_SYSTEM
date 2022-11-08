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
public class SetPlay implements Serializable{
    String MISS="",ELEMENT_NETWORK="",FECHA="",SECUENCIA="",COUNTRY,C_CODE,TARIFA;
    
    public SetPlay(String MISS, String ELMENT_NETWORK, String FECHA,String SECUENCIA){
        this.MISS=MISS;
        this.ELEMENT_NETWORK=ELMENT_NETWORK;
        this.FECHA=FECHA;
        this.SECUENCIA=SECUENCIA;                
    }
    
    
    public SetPlay(String COUNTRY, String C_CODE, String TARIFA){
        this.COUNTRY=COUNTRY;
        this.C_CODE=C_CODE;
        this.TARIFA=TARIFA;                     
    }
    
    public SetPlay(String COUNTRY, String C_CODE){
        this.COUNTRY=COUNTRY;
        this.C_CODE=C_CODE;
    }

    public String getMISS() {
        return MISS;
    }

    public String getELEMENT_NETWORK() {
        return ELEMENT_NETWORK;
    }

    public String getFECHA() {
        return FECHA;
    }

    public String getSECUENCIA() {
        return SECUENCIA;
    }

    public void setMISS(String MISS) {
        this.MISS = MISS;
    }

    public void setELEMENT_NETWORK(String ELEMENT_NETWORK) {
        this.ELEMENT_NETWORK = ELEMENT_NETWORK;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public void setSECUENCIA(String SECUENCIA) {
        this.SECUENCIA = SECUENCIA;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public String getC_CODE() {
        return C_CODE;
    }

    public String getTARIFA() {
        return TARIFA;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public void setC_CODE(String C_CODE) {
        this.C_CODE = C_CODE;
    }

    public void setTARIFA(String TARIFA) {
        this.TARIFA = TARIFA;
    }
    
    
}
