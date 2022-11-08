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
public class SetPlaySIMTabla_GLDC implements Serializable{
    
     String ID_ORDEN, ORDER_UNIT_ID, ID_ESTATUS_ACCION, ESTATUS_ACCION, FECHA_CREACION_MOVIMIENTO, TIPO_VENTA, ID_SUSCRIPTOR, NUMERO_SERIE_SIM; 
                                  
    public SetPlaySIMTabla_GLDC(String ID_ORDEN,String ORDER_UNIT_ID,String ID_ESTATUS_ACCION,String ESTATUS_ACCION,String FECHA_CREACION_MOVIMIENTO,String TIPO_VENTA,
            String ID_SUSCRIPTOR, String NUMERO_SERIE_SIM )
    {
            this.ID_ORDEN = ID_ORDEN;
            this.ORDER_UNIT_ID = ORDER_UNIT_ID;
            this.ID_ESTATUS_ACCION = ID_ESTATUS_ACCION;
            this.ESTATUS_ACCION = ESTATUS_ACCION;
            this.FECHA_CREACION_MOVIMIENTO = FECHA_CREACION_MOVIMIENTO;
            this.TIPO_VENTA = TIPO_VENTA;
            this.ID_SUSCRIPTOR = ID_SUSCRIPTOR;
            this.NUMERO_SERIE_SIM = NUMERO_SERIE_SIM;


    }
    
    String ORDER_ACTION_ID, START_DATE, SUBSCRIBER_ID, PRIMARY_IDENTIFIER, CUSTOMER_ID, SIM, IMEI, DISTRIBUIDOR_DIRECCION, DISTRIBUIDOR_VENTAS;
    
       public SetPlaySIMTabla_GLDC(String ORDER_ACTION_ID,String START_DATE,String SUBSCRIBER_ID,String PRIMARY_IDENTIFIER,String CUSTOMER_ID,String SIM,
            String IMEI, String DISTRIBUIDOR_DIRECCION,String DISTRIBUIDOR_VENTAS )
    {
            this.ORDER_ACTION_ID = ORDER_ACTION_ID;
            this.START_DATE = START_DATE;
            this.SUBSCRIBER_ID = SUBSCRIBER_ID;
            this.PRIMARY_IDENTIFIER = PRIMARY_IDENTIFIER;
            this.CUSTOMER_ID = CUSTOMER_ID;
            this.SIM = SIM;
            this.IMEI = IMEI;
            this.DISTRIBUIDOR_DIRECCION = DISTRIBUIDOR_DIRECCION;
            this.DISTRIBUIDOR_VENTAS = DISTRIBUIDOR_VENTAS;


    }

        String EMPRESA, TIPO_PLAN, PTN_ACTUAL, FECHA_ACTIVACION, TIPO_VENTA_L, SIM_L, IMEI_L;
       
        public SetPlaySIMTabla_GLDC(String EMPRESA,String TIPO_PLAN,String PTN_ACTUAL,String FECHA_ACTIVACION,String TIPO_VENTA_L,String SIM_L,
            String IMEI_L )
    {
            this.EMPRESA = EMPRESA;
            this.TIPO_PLAN = TIPO_PLAN;
            this.PTN_ACTUAL = PTN_ACTUAL;
            this.FECHA_ACTIVACION = FECHA_ACTIVACION;
            this.TIPO_VENTA_L = TIPO_VENTA_L;
            this.SIM_L = SIM_L;
            this.IMEI_L = IMEI_L;
           
    }      

    public String getID_ORDEN() {
        return ID_ORDEN;
    }

    public void setID_ORDEN(String ID_ORDEN) {
        this.ID_ORDEN = ID_ORDEN;
    }

    public String getORDER_UNIT_ID() {
        return ORDER_UNIT_ID;
    }

    public void setORDER_UNIT_ID(String ORDER_UNIT_ID) {
        this.ORDER_UNIT_ID = ORDER_UNIT_ID;
    }

    public String getID_ESTATUS_ACCION() {
        return ID_ESTATUS_ACCION;
    }

    public void setID_ESTATUS_ACCION(String ID_ESTATUS_ACCION) {
        this.ID_ESTATUS_ACCION = ID_ESTATUS_ACCION;
    }

    public String getESTATUS_ACCION() {
        return ESTATUS_ACCION;
    }

    public void setESTATUS_ACCION(String ESTATUS_ACCION) {
        this.ESTATUS_ACCION = ESTATUS_ACCION;
    }

    public String getFECHA_CREACION_MOVIMIENTO() {
        return FECHA_CREACION_MOVIMIENTO;
    }

    public void setFECHA_CREACION_MOVIMIENTO(String FECHA_CREACION_MOVIMIENTO) {
        this.FECHA_CREACION_MOVIMIENTO = FECHA_CREACION_MOVIMIENTO;
    }

    public String getTIPO_VENTA() {
        return TIPO_VENTA;
    }

    public void setTIPO_VENTA(String TIPO_VENTA) {
        this.TIPO_VENTA = TIPO_VENTA;
    }

    public String getID_SUSCRIPTOR() {
        return ID_SUSCRIPTOR;
    }

    public void setID_SUSCRIPTOR(String ID_SUSCRIPTOR) {
        this.ID_SUSCRIPTOR = ID_SUSCRIPTOR;
    }

    public String getNUMERO_SERIE_SIM() {
        return NUMERO_SERIE_SIM;
    }

    public void setNUMERO_SERIE_SIM(String NUMERO_SERIE_SIM) {
        this.NUMERO_SERIE_SIM = NUMERO_SERIE_SIM;
    }

    public String getORDER_ACTION_ID() {
        return ORDER_ACTION_ID;
    }

    public void setORDER_ACTION_ID(String ORDER_ACTION_ID) {
        this.ORDER_ACTION_ID = ORDER_ACTION_ID;
    }

    public String getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(String START_DATE) {
        this.START_DATE = START_DATE;
    }

    public String getSUBSCRIBER_ID() {
        return SUBSCRIBER_ID;
    }

    public void setSUBSCRIBER_ID(String SUBSCRIBER_ID) {
        this.SUBSCRIBER_ID = SUBSCRIBER_ID;
    }

    public String getPRIMARY_IDENTIFIER() {
        return PRIMARY_IDENTIFIER;
    }

    public void setPRIMARY_IDENTIFIER(String PRIMARY_IDENTIFIER) {
        this.PRIMARY_IDENTIFIER = PRIMARY_IDENTIFIER;
    }

    public String getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getDISTRIBUIDOR_DIRECCION() {
        return DISTRIBUIDOR_DIRECCION;
    }

    public void setDISTRIBUIDOR_DIRECCION(String DISTRIBUIDOR_DIRECCION) {
        this.DISTRIBUIDOR_DIRECCION = DISTRIBUIDOR_DIRECCION;
    }

    public String getDISTRIBUIDOR_VENTAS() {
        return DISTRIBUIDOR_VENTAS;
    }

    public void setDISTRIBUIDOR_VENTAS(String DISTRIBUIDOR_VENTAS) {
        this.DISTRIBUIDOR_VENTAS = DISTRIBUIDOR_VENTAS;
    }

    public String getEMPRESA() {
        return EMPRESA;
    }

    public void setEMPRESA(String EMPRESA) {
        this.EMPRESA = EMPRESA;
    }

    public String getTIPO_PLAN() {
        return TIPO_PLAN;
    }

    public void setTIPO_PLAN(String TIPO_PLAN) {
        this.TIPO_PLAN = TIPO_PLAN;
    }

    public String getPTN_ACTUAL() {
        return PTN_ACTUAL;
    }

    public void setPTN_ACTUAL(String PTN_ACTUAL) {
        this.PTN_ACTUAL = PTN_ACTUAL;
    }

    public String getFECHA_ACTIVACION() {
        return FECHA_ACTIVACION;
    }

    public void setFECHA_ACTIVACION(String FECHA_ACTIVACION) {
        this.FECHA_ACTIVACION = FECHA_ACTIVACION;
    }

    public String getTIPO_VENTA_L() {
        return TIPO_VENTA_L;
    }

    public void setTIPO_VENTA_L(String TIPO_VENTA_L) {
        this.TIPO_VENTA_L = TIPO_VENTA_L;
    }

    public String getSIM_L() {
        return SIM_L;
    }

    public void setSIM_L(String SIM_L) {
        this.SIM_L = SIM_L;
    }

    public String getIMEI_L() {
        return IMEI_L;
    }

    public void setIMEI_L(String IMEI_L) {
        this.IMEI_L = IMEI_L;
    }
       


   

    
    
    
}
