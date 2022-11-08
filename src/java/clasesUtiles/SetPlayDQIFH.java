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
public class SetPlayDQIFH implements Serializable{
    String TICKET, CASO, MSISDN, USUARIO , FECHA,CALIFICACION,FINALSTATUS, ACTA;
    
    public SetPlayDQIFH(String TICKET, String CASO, String MSISDN, String USUARIO, String FECHA, String CALIFICACION,String FINALSTATUS,String ACTA){
        this.TICKET=TICKET;
        this.CASO=CASO;
        this.MSISDN=MSISDN;
        this.USUARIO=USUARIO;
        this.FECHA=FECHA;
        this.CALIFICACION=CALIFICACION;
        this.FINALSTATUS=FINALSTATUS;
        this.ACTA=ACTA;
    }

    public String getTICKET() {
        return TICKET;
    }

    public void setTICKET(String TICKET) {
        this.TICKET = TICKET;
    }

    public String getCASO() {
        return CASO;
    }

    public void setCASO(String CASO) {
        this.CASO = CASO;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getCALIFICACION() {
        return CALIFICACION;
    }

    public void setCALIFICACION(String CALIFICACION) {
        this.CALIFICACION = CALIFICACION;
    }

    public String getFINALSTATUS() {
        return FINALSTATUS;
    }

    public void setFINALSTATUS(String FINALSTATUS) {
        this.FINALSTATUS = FINALSTATUS;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getACTA() {
        return ACTA;
    }

    public void setACTA(String ACTA) {
        this.ACTA = ACTA;
    }
    
   
    
}
