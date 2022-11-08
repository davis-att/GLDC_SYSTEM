/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author mgalicia
 */
public class SetPlayAuto_suspendido implements Serializable{
     String TICKET_NUMBER,CASO, TIPO, FEC_CREACIONCASO, FECPP,  MSISDN,   FECHA_ULTIMO_ESTATUS,  ESTATUS,  PLAN,  CODIGO, REACTIVADO, USERID; 
    
    public SetPlayAuto_suspendido(String TICKET_NUMBER, String CASO, String TIPO,  String FEC_CREACIONCASO, String FECPP, String MSISDN, String FECHA_ULTIMO_ESTATUS, String ESTATUS, String PLAN, String CODIGO, String REACTIVADO,String USERID){
        
        this.TICKET_NUMBER=TICKET_NUMBER;
        this.CASO=CASO;
        this.TIPO=TIPO;
        this.FEC_CREACIONCASO=FEC_CREACIONCASO;
        this.FECPP=FECPP;
        this.MSISDN=MSISDN;
        this.FECHA_ULTIMO_ESTATUS=FECHA_ULTIMO_ESTATUS;
        this.ESTATUS=ESTATUS;
        this.PLAN=PLAN;
        this.CODIGO=CODIGO;
        this.REACTIVADO=REACTIVADO;
        this.USERID=USERID;
    }

    public String getTICKET_NUMBER() {
        return TICKET_NUMBER;
    }

    public void setTICKET_NUMBER(String TICKET_NUMBER) {
        this.TICKET_NUMBER = TICKET_NUMBER;
    }

    public String getCASO() {
        return CASO;
    }

    public void setCASO(String CASO) {
        this.CASO = CASO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getFEC_CREACIONCASO() {
        return FEC_CREACIONCASO;
    }

    public void setFEC_CREACIONCASO(String FEC_CREACIONCASO) {
        this.FEC_CREACIONCASO = FEC_CREACIONCASO;
    }

    public String getFECPP() {
        return FECPP;
    }

    public void setFECPP(String FECPP) {
        this.FECPP = FECPP;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getFECHA_ULTIMO_ESTATUS() {
        return FECHA_ULTIMO_ESTATUS;
    }

    public void setFECHA_ULTIMO_ESTATUS(String FECHA_ULTIMO_ESTATUS) {
        this.FECHA_ULTIMO_ESTATUS = FECHA_ULTIMO_ESTATUS;
    }

    public String getESTATUS() {
        return ESTATUS;
    }

    public void setESTATUS(String ESTATUS) {
        this.ESTATUS = ESTATUS;
    }

    public String getPLAN() {
        return PLAN;
    }

    public void setPLAN(String PLAN) {
        this.PLAN = PLAN;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getREACTIVADO() {
        return REACTIVADO;
    }

    public void setREACTIVADO(String REACTIVADO) {
        this.REACTIVADO = REACTIVADO;
    }

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

  

    
    
    
}
