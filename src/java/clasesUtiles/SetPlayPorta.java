/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI11915
 */
public class SetPlayPorta implements Serializable{

     String PORT_ID,MDN,FECHA_PORTADO,ESTATUS_ID,DESCRIPCION,TIPO_SOLICITUD_ID,
             SOLICITUD_DESC,FECHA_CREACION,IDO_DONADOR,OPERADOR1, IDO_RECEPTOR,OPERADOR2,ASSIGNEEIDA,TIPO_PORTA,FUENTE;

    public SetPlayPorta(String PORT_ID, String MDN, String FECHA_PORTADO, String ESTATUS_ID,String DESCRIPCION, String TIPO_SOLICITUD_ID,
            String SOLICITUD_DESC, String FECHA_CREACION,String IDO_DONADOR, String OPERADOR1, String IDO_RECEPTOR, String OPERADOR2, String ASSIGNEEIDA, String TIPO_PORTA,String FUENTE)
    {
            this.PORT_ID = PORT_ID;
            this.MDN = MDN;
            this.FECHA_PORTADO = FECHA_PORTADO;
            this.ESTATUS_ID = ESTATUS_ID;
            this.DESCRIPCION = DESCRIPCION;
            this.TIPO_SOLICITUD_ID = TIPO_SOLICITUD_ID;
            this.SOLICITUD_DESC  = SOLICITUD_DESC;
            this.FECHA_CREACION = FECHA_CREACION;
            this.IDO_DONADOR = IDO_DONADOR;
            this.OPERADOR1 = OPERADOR1;
            this.IDO_RECEPTOR = IDO_RECEPTOR;
            this.OPERADOR2 = OPERADOR2;
            this.ASSIGNEEIDA = ASSIGNEEIDA;
            this.TIPO_PORTA = TIPO_PORTA;
            this.FUENTE = FUENTE;
            

    }

    public SetPlayPorta() {

    }

    public String getPORT_ID() {
        return PORT_ID;
    }

    public void setPORT_ID(String PORT_ID) {
        this.PORT_ID = PORT_ID;
    }

    public String getMDN() {
        return MDN;
    }

    public void setMDN(String MDN) {
        this.MDN = MDN;
    }

    public String getFECHA_PORTADO() {
        return FECHA_PORTADO;
    }

    public void setFECHA_PORTADO(String FECHA_PORTADO) {
        this.FECHA_PORTADO = FECHA_PORTADO;
    }

 

    public String getESTATUS_ID() {
        return ESTATUS_ID;
    }

    public void setESTATUS_ID(String ESTATUS_ID) {
        this.ESTATUS_ID = ESTATUS_ID;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getTIPO_SOLICITUD_ID() {
        return TIPO_SOLICITUD_ID;
    }

    public void setTIPO_SOLICITUD_ID(String TIPO_SOLICITUD_ID) {
        this.TIPO_SOLICITUD_ID = TIPO_SOLICITUD_ID;
    }

    public String getSOLICITUD_DESC() {
        return SOLICITUD_DESC;
    }

    public void setSOLICITUD_DESC(String SOLICITUD_DESC) {
        this.SOLICITUD_DESC = SOLICITUD_DESC;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(String FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getIDO_DONADOR() {
        return IDO_DONADOR;
    }

    public void setIDO_DONADOR(String IDO_DONADOR) {
        this.IDO_DONADOR = IDO_DONADOR;
    }

    public String getIDO_RECEPTOR() {
        return IDO_RECEPTOR;
    }

    public void setIDO_RECEPTOR(String IDO_RECEPTOR) {
        this.IDO_RECEPTOR = IDO_RECEPTOR;
    }

    public String getASSIGNEEIDA() {
        return ASSIGNEEIDA;
    }

    public void setASSIGNEEIDA(String ASSIGNEEIDA) {
        this.ASSIGNEEIDA = ASSIGNEEIDA;
    }

    public String getTIPO_PORTA() {
        return TIPO_PORTA;
    }

    public void setTIPO_PORTA(String TIPO_PORTA) {
        this.TIPO_PORTA = TIPO_PORTA;
    }

    public String getFUENTE() {
        return FUENTE;
    }

    public void setFUENTE(String FUENTE) {
        this.FUENTE = FUENTE;
    }

    public String getOPERADOR1() {
        return OPERADOR1;
    }

    public void setOPERADOR1(String OPERADOR1) {
        this.OPERADOR1 = OPERADOR1;
    }

    public String getOPERADOR2() {
        return OPERADOR2;
    }

    public void setOPERADOR2(String OPERADOR2) {
        this.OPERADOR2 = OPERADOR2;
    }

   
    
    
}
