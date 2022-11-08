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
public class SetPlayGLDC_Token implements Serializable{

     String ID_TOKEN, TIPO_IDENTIFICADOR, NO_OFICIO, ID_USUARIO, TIPO_SOLICITUD, ID_PRIORIDAD, MEDIO_RECEPCION, FECHA_REGISTRO, COLOR;
     
     String  NOMBRE_PRIORIDAD;

    public SetPlayGLDC_Token(String ID_TOKEN, String TIPO_IDENTIFICADOR, String NO_OFICIO, String ID_USUARIO, String TIPO_SOLICITUD, String ID_PRIORIDAD, String MEDIO_RECEPCION, String FECHA_REGISTRO, String COLOR )
    {
           this.ID_TOKEN = ID_TOKEN;
           this.TIPO_IDENTIFICADOR = TIPO_IDENTIFICADOR;
           this.NO_OFICIO = NO_OFICIO;
           this.ID_USUARIO = ID_USUARIO;
           this.TIPO_SOLICITUD = TIPO_SOLICITUD;
           this.ID_PRIORIDAD = ID_PRIORIDAD;
           this.MEDIO_RECEPCION = MEDIO_RECEPCION;
           this.FECHA_REGISTRO = FECHA_REGISTRO;
            this.COLOR = COLOR;        
    }
    
    public SetPlayGLDC_Token( String NOMBRE_PRIORIDAD)
    {
         
           this.NOMBRE_PRIORIDAD = NOMBRE_PRIORIDAD;
           
    }

    public SetPlayGLDC_Token() {

    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    

    public String getNOMBRE_PRIORIDAD() {
        return NOMBRE_PRIORIDAD;
    }

    public void setNOMBRE_PRIORIDAD(String NOMBRE_PRIORIDAD) {
        this.NOMBRE_PRIORIDAD = NOMBRE_PRIORIDAD;
    }
    
    
    

    public String getID_TOKEN() {
        return ID_TOKEN;
    }

    public void setID_TOKEN(String ID_TOKEN) {
        this.ID_TOKEN = ID_TOKEN;
    }

    
    public String getTIPO_IDENTIFICADOR() {
        return TIPO_IDENTIFICADOR;
    }

    public void setTIPO_IDENTIFICADOR(String TIPO_IDENTIFICADOR) {
        this.TIPO_IDENTIFICADOR = TIPO_IDENTIFICADOR;
    }

    
    public String getNO_OFICIO() {
        return NO_OFICIO;
    }

    public void setNO_OFICIO(String NO_OFICIO) {
        this.NO_OFICIO = NO_OFICIO;
    }

    public String getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(String ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getTIPO_SOLICITUD() {
        return TIPO_SOLICITUD;
    }

    public void setTIPO_SOLICITUD(String TIPO_SOLICITUD) {
        this.TIPO_SOLICITUD = TIPO_SOLICITUD;
    }

    public String getID_PRIORIDAD() {
        return ID_PRIORIDAD;
    }

    public void setID_PRIORIDAD(String ID_PRIORIDAD) {
        this.ID_PRIORIDAD = ID_PRIORIDAD;
    }

    public String getMEDIO_RECEPCION() {
        return MEDIO_RECEPCION;
    }

    public void setMEDIO_RECEPCION(String MEDIO_RECEPCION) {
        this.MEDIO_RECEPCION = MEDIO_RECEPCION;
    }

    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    
}
