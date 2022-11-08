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
public class SetPlayLR implements Serializable{
    
     String VALOR, VALOR2, RESPUESTA, PROVEEDOR, TIPO, SECUENCIA, DESCRIPCION, ORIGEN, CREACION, USUARIOCREO, REFERENCIA1, REFERENCIA2, NUMERORES;
                                  
    public SetPlayLR(String VALOR, String VALOR2,String RESPUESTA,String PROVEEDOR, String TIPO,String SECUENCIA, String DESCRIPCION,String ORIGEN,String CREACION,String USUARIOCREO,String REFERENCIA1,String REFERENCIA2,String NUMERORES)
    {
            this.VALOR = VALOR;
            this.VALOR2 = VALOR2;
            this.RESPUESTA = RESPUESTA;
            this.PROVEEDOR = PROVEEDOR;
            this.TIPO = TIPO;
            this.SECUENCIA = SECUENCIA;
            this.DESCRIPCION = DESCRIPCION;
            this.ORIGEN  = ORIGEN;
            this.CREACION = CREACION;
            this.USUARIOCREO = USUARIOCREO;
            this.REFERENCIA1 = REFERENCIA1;            
            this.REFERENCIA2 = REFERENCIA2;
            this.NUMERORES = NUMERORES;

    }

    public SetPlayLR() {
        
    }

    public String getVALOR() {
        return VALOR;
    }

    public void setVALOR(String VALOR) {
        this.VALOR = VALOR;
    }

    public String getVALOR2() {
        return VALOR2;
    }

    public void setVALOR2(String VALOR2) {
        this.VALOR2 = VALOR2;
    }

    public String getRESPUESTA() {
        return RESPUESTA;
    }

    public void setRESPUESTA(String RESPUESTA) {
        this.RESPUESTA = RESPUESTA;
    }

    public String getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(String PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getSECUENCIA() {
        return SECUENCIA;
    }

    public void setSECUENCIA(String SECUENCIA) {
        this.SECUENCIA = SECUENCIA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getORIGEN() {
        return ORIGEN;
    }

    public void setORIGEN(String ORIGEN) {
        this.ORIGEN = ORIGEN;
    }

    public String getCREACION() {
        return CREACION;
    }

    public void setCREACION(String CREACION) {
        this.CREACION = CREACION;
    }

    public String getUSUARIOCREO() {
        return USUARIOCREO;
    }

    public void setUSUARIOCREO(String USUARIOCREO) {
        this.USUARIOCREO = USUARIOCREO;
    }

    public String getREFERENCIA1() {
        return REFERENCIA1;
    }

    public void setREFERENCIA1(String REFERENCIA1) {
        this.REFERENCIA1 = REFERENCIA1;
    }

    public String getREFERENCIA2() {
        return REFERENCIA2;
    }

    public void setREFERENCIA2(String REFERENCIA2) {
        this.REFERENCIA2 = REFERENCIA2;
    }

    public String getNUMERORES() {
        return NUMERORES;
    }

    public void setNUMERORES(String NUMERORES) {
        this.NUMERORES = NUMERORES;
    }

  
    
    
    
}
