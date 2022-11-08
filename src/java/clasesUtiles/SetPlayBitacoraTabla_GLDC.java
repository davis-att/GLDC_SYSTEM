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
public class SetPlayBitacoraTabla_GLDC implements Serializable{
    
     String NOMBRE_OFICIO, 
             ID_EVENT,
             ID_TYPEB,
             FECHA_INICIO,
             FECHA_FIN,
             ID_TICKET,
             ID_CASO,
             TIPO_SOLICITUD, 
             PARAMETRO_BUSQUEDA,
             DESCRIPCION,
             USUARIO, 
             DOCUMENTATION,
             ESTATUS,
             FECHA_APERTURA,
             FECHA_CIERRE;
    String CLASIFICACION;
    String PRIORIDAD_911;
    String TIPOFALLA_911;
    String INC_REMEDY_911;
    String ENTIDAD_GOB_911;
    String ESTADO_911;
    String MUNICIPIO_911;
    String SERV_AFEC_911;
    String USUARIO_BO_911;
    String ASIGANDOA;
    String DIASASIGNADO;
    
                                  
    public SetPlayBitacoraTabla_GLDC(String NOMBRE_OFICIO,String  ID_EVENT,String  ID_TYPEB,String  FECHA_INICIO,String  FECHA_FIN,String  ID_TICKET,String  ID_CASO,String  TIPO_SOLICITUD,String  PARAMETRO_BUSQUEDA,String  DESCRIPCION,
            String  USUARIO,String  DOCUMENTATION,String  ESTATUS,String  FECHA_APERTURA,String  FECHA_CIERRE,String DIASASIGNADO, String ASIGANDOA )
    {
            this.NOMBRE_OFICIO = NOMBRE_OFICIO;
            this.ID_EVENT = ID_EVENT;
            this.ID_TYPEB = ID_TYPEB;
            this.FECHA_INICIO = FECHA_INICIO;
            this.FECHA_FIN = FECHA_FIN;
            this.ID_TICKET = ID_TICKET;
            this.ID_CASO = ID_CASO;
            this.TIPO_SOLICITUD  = TIPO_SOLICITUD;
            this.PARAMETRO_BUSQUEDA = PARAMETRO_BUSQUEDA;
            this.DESCRIPCION = DESCRIPCION;
            this.USUARIO = USUARIO;            
            this.DOCUMENTATION = DOCUMENTATION;
            this.ESTATUS = ESTATUS;
            this.FECHA_APERTURA = FECHA_APERTURA;
            this.FECHA_CIERRE = FECHA_CIERRE;
            this.DIASASIGNADO = DIASASIGNADO;
            this.ASIGANDOA = ASIGANDOA;
            
    }
    
       //19 911
   public SetPlayBitacoraTabla_GLDC (String ID_EVENT,  String NOMBRE_OFICIO, String FECHA_INICIO, String FECHA_FIN,
            String DESCRIPCION, String USUARIO, String DOCUMENTATION, String ESTATUS,  String FECHA_APERTURA, String FECHA_CIERRE,
            String CLASIFICACION, String PRIORIDAD_911, String TIPOFALLA_911, String INC_REMEDY_911, String ENTIDAD_GOB_911, String ESTADO_911, String MUNICIPIO_911, String SERV_AFEC_911, String USUARIO_BO_911       
    ) {
      
        this.ID_EVENT = ID_EVENT;
        this.NOMBRE_OFICIO = NOMBRE_OFICIO;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FIN = FECHA_FIN;
        this.DESCRIPCION = DESCRIPCION;
        this.USUARIO = USUARIO;
        this.DOCUMENTATION = DOCUMENTATION;
        this.ESTATUS = ESTATUS;
        this.CLASIFICACION= CLASIFICACION;
        this.FECHA_APERTURA = FECHA_APERTURA;
        this.FECHA_CIERRE = FECHA_CIERRE;
        this.PRIORIDAD_911= PRIORIDAD_911;
        this.TIPOFALLA_911= TIPOFALLA_911;
        this.INC_REMEDY_911= INC_REMEDY_911;
        this.ENTIDAD_GOB_911= ENTIDAD_GOB_911;
        this.ESTADO_911= ESTADO_911;
        this.MUNICIPIO_911= MUNICIPIO_911;
        this.SERV_AFEC_911= SERV_AFEC_911;
        this.USUARIO_BO_911= USUARIO_BO_911;


    }
   

    public SetPlayBitacoraTabla_GLDC() {
        
    }

    public String getNOMBRE_OFICIO() {
        return NOMBRE_OFICIO;
    }

    public void setNOMBRE_OFICIO(String NOMBRE_OFICIO) {
        this.NOMBRE_OFICIO = NOMBRE_OFICIO;
    }

    public String getID_EVENT() {
        return ID_EVENT;
    }

    public void setID_EVENT(String ID_EVENT) {
        this.ID_EVENT = ID_EVENT;
    }

    public String getID_TYPEB() {
        return ID_TYPEB;
    }

    public void setID_TYPEB(String ID_TYPEB) {
        this.ID_TYPEB = ID_TYPEB;
    }

    public String getFECHA_INICIO() {
        return FECHA_INICIO;
    }

    public void setFECHA_INICIO(String FECHA_INICIO) {
        this.FECHA_INICIO = FECHA_INICIO;
    }

    public String getFECHA_FIN() {
        return FECHA_FIN;
    }

    public void setFECHA_FIN(String FECHA_FIN) {
        this.FECHA_FIN = FECHA_FIN;
    }

    public String getID_TICKET() {
        return ID_TICKET;
    }

    public void setID_TICKET(String ID_TICKET) {
        this.ID_TICKET = ID_TICKET;
    }

    public String getID_CASO() {
        return ID_CASO;
    }

    public void setID_CASO(String ID_CASO) {
        this.ID_CASO = ID_CASO;
    }

    public String getTIPO_SOLICITUD() {
        return TIPO_SOLICITUD;
    }

    public void setTIPO_SOLICITUD(String TIPO_SOLICITUD) {
        this.TIPO_SOLICITUD = TIPO_SOLICITUD;
    }

    public String getPARAMETRO_BUSQUEDA() {
        return PARAMETRO_BUSQUEDA;
    }

    public void setPARAMETRO_BUSQUEDA(String PARAMETRO_BUSQUEDA) {
        this.PARAMETRO_BUSQUEDA = PARAMETRO_BUSQUEDA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getDOCUMENTATION() {
        return DOCUMENTATION;
    }

    public void setDOCUMENTATION(String DOCUMENTATION) {
        this.DOCUMENTATION = DOCUMENTATION;
    }

    public String getESTATUS() {
        return ESTATUS;
    }

    public void setESTATUS(String ESTATUS) {
        this.ESTATUS = ESTATUS;
    }

    public String getFECHA_APERTURA() {
        return FECHA_APERTURA;
    }

    public void setFECHA_APERTURA(String FECHA_APERTURA) {
        this.FECHA_APERTURA = FECHA_APERTURA;
    }

    public String getFECHA_CIERRE() {
        return FECHA_CIERRE;
    }

    public void setFECHA_CIERRE(String FECHA_CIERRE) {
        this.FECHA_CIERRE = FECHA_CIERRE;
    }

    public String getCLASIFICACION() {
        return CLASIFICACION;
    }

    public void setCLASIFICACION(String CLASIFICACION) {
        this.CLASIFICACION = CLASIFICACION;
    }

    public String getPRIORIDAD_911() {
        return PRIORIDAD_911;
    }

    public void setPRIORIDAD_911(String PRIORIDAD_911) {
        this.PRIORIDAD_911 = PRIORIDAD_911;
    }

    public String getTIPOFALLA_911() {
        return TIPOFALLA_911;
    }

    public void setTIPOFALLA_911(String TIPOFALLA_911) {
        this.TIPOFALLA_911 = TIPOFALLA_911;
    }

    public String getINC_REMEDY_911() {
        return INC_REMEDY_911;
    }

    public void setINC_REMEDY_911(String INC_REMEDY_911) {
        this.INC_REMEDY_911 = INC_REMEDY_911;
    }

    public String getENTIDAD_GOB_911() {
        return ENTIDAD_GOB_911;
    }

    public void setENTIDAD_GOB_911(String ENTIDAD_GOB_911) {
        this.ENTIDAD_GOB_911 = ENTIDAD_GOB_911;
    }

    public String getESTADO_911() {
        return ESTADO_911;
    }

    public void setESTADO_911(String ESTADO_911) {
        this.ESTADO_911 = ESTADO_911;
    }

    public String getMUNICIPIO_911() {
        return MUNICIPIO_911;
    }

    public void setMUNICIPIO_911(String MUNICIPIO_911) {
        this.MUNICIPIO_911 = MUNICIPIO_911;
    }

    public String getSERV_AFEC_911() {
        return SERV_AFEC_911;
    }

    public void setSERV_AFEC_911(String SERV_AFEC_911) {
        this.SERV_AFEC_911 = SERV_AFEC_911;
    }

    public String getUSUARIO_BO_911() {
        return USUARIO_BO_911;
    }

    public void setUSUARIO_BO_911(String USUARIO_BO_911) {
        this.USUARIO_BO_911 = USUARIO_BO_911;
    }

    public String getASIGANDOA() {
        return ASIGANDOA;
    }

    public void setASIGANDOA(String ASIGANDOA) {
        this.ASIGANDOA = ASIGANDOA;
    }

    public String getDIASASIGNADO() {
        return DIASASIGNADO;
    }

    public void setDIASASIGNADO(String DIASASIGNADO) {
        this.DIASASIGNADO = DIASASIGNADO;
    }

    
    
    
}
