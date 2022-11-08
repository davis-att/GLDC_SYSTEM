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
public class SetPlayLI implements Serializable{

     String MSISDN,CONTRATO,CUENTA,SISTEMA,IMEI,SIM,MODELO,PLAN,FECHAACTIVACION,USOLINEA,EMPLEADO,VP,NOEMPLEADO,RESPONSABLE,STATUS,FECHACARGA;

    public SetPlayLI(String MSISDN, String CONTRATO,String CUENTA,String SISTEMA, String IMEI,String SIM, String MODELO,String PLAN,String FECHAACTIVACION,String USOLINEA,String EMPLEADO,String VP,String NOEMPLEADO,String RESPONSABLE,String STATUS,String FECHACARGA)
    {
            this.MSISDN = MSISDN;
            this.CONTRATO = CONTRATO;
            this.CUENTA = CUENTA;
            this.SISTEMA = SISTEMA;
            this.IMEI = IMEI;
            this.SIM = SIM;
            this.MODELO = MODELO;
            this.PLAN  = PLAN;
            this.FECHAACTIVACION = FECHAACTIVACION;
            this.USOLINEA = USOLINEA;
            this.EMPLEADO = EMPLEADO;
            this.VP = VP;
            this.NOEMPLEADO = NOEMPLEADO;
            this.RESPONSABLE = RESPONSABLE;
            this.STATUS = STATUS;
            this.FECHACARGA = FECHACARGA;

    }

    public SetPlayLI() {

    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getCONTRATO() {
        return CONTRATO;
    }

    public void setCONTRATO(String CONTRATO) {
        this.CONTRATO = CONTRATO;
    }

    public String getCUENTA() {
        return CUENTA;
    }

    public void setCUENTA(String CUENTA) {
        this.CUENTA = CUENTA;
    }

    public String getSISTEMA() {
        return SISTEMA;
    }

    public void setSISTEMA(String SISTEMA) {
        this.SISTEMA = SISTEMA;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public String getPLAN() {
        return PLAN;
    }

    public void setPLAN(String PLAN) {
        this.PLAN = PLAN;
    }

    public String getFECHAACTIVACION() {
        return FECHAACTIVACION;
    }

    public void setFECHAACTIVACION(String FECHAACTIVACION) {
        this.FECHAACTIVACION = FECHAACTIVACION;
    }

    public String getUSOLINEA() {
        return USOLINEA;
    }

    public void setUSOLINEA(String USOLINEA) {
        this.USOLINEA = USOLINEA;
    }

    public String getEMPLEADO() {
        return EMPLEADO;
    }

    public void setEMPLEADO(String EMPLEADO) {
        this.EMPLEADO = EMPLEADO;
    }

    public String getNOEMPLEADO() {
        return NOEMPLEADO;
    }

    public void setNOEMPLEADO(String NOEMPLEADO) {
        this.NOEMPLEADO = NOEMPLEADO;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getVP() {
        return VP;
    }

    public void setVP(String VP) {
        this.VP = VP;
    }

    public String getRESPONSABLE() {
        return RESPONSABLE;
    }

    public void setRESPONSABLE(String RESPONSABLE) {
        this.RESPONSABLE = RESPONSABLE;
    }

    public String getFECHACARGA() {
        return FECHACARGA;
    }

    public void setFECHACARGA(String FECHACARGA) {
        this.FECHACARGA = FECHACARGA;
    }


}
