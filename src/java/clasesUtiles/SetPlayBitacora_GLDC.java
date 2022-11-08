/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NMI16991
 */
public class SetPlayBitacora_GLDC implements Serializable{

    String NOMBRE_OFICIO, ID_TYPEB, ID_EVENT, FECHA_INICIO;
    String FECHA_FIN, PARAMETRO_BUSQUEDA, ID_TICKET, DESCRIPCION,DESCRIPCION_per;
    String USUARIO, ID_CASO, DOCUMENTATION, ESTATUS, TIPO_SOLICITUD, FECHA_INICIO_Fin, EstEvidencia;
    String FECHA_APERTURA, FECHA_CIERRE;
    List myList = new ArrayList();
    int items;
    String dt_TIPO_SOLICITUD, dt_ID_EVENT, dt_USUARIO, dt_DESCRIPCION, dt_DOCUMENTATION, dt_FECHA, dt_ESTATUS;
    String tm_fechaini, tm_fechafin, tm_evento, tm_incidente, tm_responsable, tm_medida, tm_estatus, tm_area;
    String  CLASIFICACION;
    String  NOMBRE_EQUIPO;
    String  NO_SERIE_EQUIPO;
    String  MAC_ADDRESS;
    String  EQUIPO_EJECUTA;
    String  AFECTACION;
    String  DURACION_VENTANA;
    String  SISTEMA_AFECTADO;
    String  RFC;
    String PRIORIDAD_911;
    String TIPOFALLA_911;
    String INC_REMEDY_911;
    String ENTIDAD_GOB_911;
    String ESTADO_911;
    String MUNICIPIO_911;
    String SERV_AFEC_911;
    String USUARIO_BO_911;
    String LOCALIDAD;
    String DIAS;
    String ASIGNADOA;
    
    
    
    public SetPlayBitacora_GLDC(String NOMBRE_OFICIO, String ID_EVENT, String ID_TYPEB, String FECHA_INICIO, String FECHA_FIN,
            String ID_TICKET, String ID_CASO, String TIPO_SOLICITUD, String PARAMETRO_BUSQUEDA, String DESCRIPCION,
            String USUARIO, String DOCUMENTATION, String ESTATUS, List myList, int items, String EstEvidencia,
            String CLASIFICACION, String NOMBRE_EQUIPO, String NO_SERIE_EQUIPO, String MAC_ADDRESS, String EQUIPO_EJECUTA, String AFECTACION, String DURACION_VENTANA, String SISTEMA_AFECTADO, String RFC,
            String PRIORIDAD_911, String TIPOFALLA_911, String INC_REMEDY_911, String ENTIDAD_GOB_911, String ESTADO_911, String MUNICIPIO_911, String SERV_AFEC_911, String USUARIO_BO_911,String LOCALIDAD       
    ) {

        this.NOMBRE_OFICIO = NOMBRE_OFICIO;
        this.ID_TYPEB = ID_TYPEB;
        this.ID_EVENT = ID_EVENT;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FIN = FECHA_FIN;
        this.PARAMETRO_BUSQUEDA = PARAMETRO_BUSQUEDA;
        this.ID_TICKET = ID_TICKET;
        this.DESCRIPCION = DESCRIPCION;
        this.USUARIO = USUARIO;
        this.ID_CASO = ID_CASO;
        this.DOCUMENTATION = DOCUMENTATION;
        this.ESTATUS = ESTATUS;
        this.TIPO_SOLICITUD = TIPO_SOLICITUD;
        this.myList= myList;
        this.items= items;
        this.EstEvidencia= EstEvidencia;
        this.CLASIFICACION= CLASIFICACION;
        this.NOMBRE_EQUIPO= NOMBRE_EQUIPO;
        this.NO_SERIE_EQUIPO= NO_SERIE_EQUIPO;
        this.MAC_ADDRESS= MAC_ADDRESS;
        this.EQUIPO_EJECUTA= EQUIPO_EJECUTA;
        this.AFECTACION= AFECTACION;
        this.DURACION_VENTANA= DURACION_VENTANA;
        this.SISTEMA_AFECTADO= SISTEMA_AFECTADO;       
        this.PRIORIDAD_911= PRIORIDAD_911;
        this.TIPOFALLA_911= TIPOFALLA_911;
        this.INC_REMEDY_911= INC_REMEDY_911;
        this.ENTIDAD_GOB_911= ENTIDAD_GOB_911;
        this.ESTADO_911= ESTADO_911;
        this.MUNICIPIO_911= MUNICIPIO_911;
        this.SERV_AFEC_911= SERV_AFEC_911;
        this.USUARIO_BO_911= USUARIO_BO_911;
        this.LOCALIDAD= LOCALIDAD;
    }
    
    
    
    //----13
      public SetPlayBitacora_GLDC(String NOMBRE_OFICIO, String ID_EVENT, String ID_TYPEB, String FECHA_INICIO, String FECHA_FIN,
            String ID_TICKET, String ID_CASO, String TIPO_SOLICITUD, String PARAMETRO_BUSQUEDA, String DESCRIPCION,
            String USUARIO, String DOCUMENTATION, String ESTATUS, String FECHA_APERTURA, String FECHA_CIERRE,
            String CLASIFICACION, String NOMBRE_EQUIPO, String NO_SERIE_EQUIPO, String MAC_ADDRESS, String EQUIPO_EJECUTA, String AFECTACION, String DURACION_VENTANA, String SISTEMA_AFECTADO, String RFC,
              String PRIORIDAD_911, String TIPOFALLA_911, String INC_REMEDY_911, String ENTIDAD_GOB_911, String ESTADO_911, String MUNICIPIO_911, String SERV_AFEC_911, String USUARIO_BO_911, String DIAS, String ASIGNADOA       
    ) {

        this.NOMBRE_OFICIO = NOMBRE_OFICIO;
        this.ID_TYPEB = ID_TYPEB;
        this.ID_EVENT = ID_EVENT;
        this.FECHA_INICIO = FECHA_INICIO;
        this.FECHA_FIN = FECHA_FIN;
        this.PARAMETRO_BUSQUEDA = PARAMETRO_BUSQUEDA;
        this.ID_TICKET = ID_TICKET;
        this.DESCRIPCION = DESCRIPCION;
        this.USUARIO = USUARIO;
        this.ID_CASO = ID_CASO;
        this.DOCUMENTATION = DOCUMENTATION;
        this.ESTATUS = ESTATUS;
        this.TIPO_SOLICITUD = TIPO_SOLICITUD;
        this.FECHA_APERTURA = FECHA_APERTURA;
        this.FECHA_CIERRE = FECHA_CIERRE;
        this.CLASIFICACION= CLASIFICACION;
        this.NOMBRE_EQUIPO= NOMBRE_EQUIPO;
        this.NO_SERIE_EQUIPO= NO_SERIE_EQUIPO;
        this.MAC_ADDRESS= MAC_ADDRESS;
        this.EQUIPO_EJECUTA= EQUIPO_EJECUTA;
        this.AFECTACION= AFECTACION;
        this.DURACION_VENTANA= DURACION_VENTANA;
        this.SISTEMA_AFECTADO= SISTEMA_AFECTADO;
        this.RFC= RFC;
        this.PRIORIDAD_911= PRIORIDAD_911;
        this.TIPOFALLA_911= TIPOFALLA_911;
        this.INC_REMEDY_911= INC_REMEDY_911;
        this.ENTIDAD_GOB_911= ENTIDAD_GOB_911;
        this.ESTADO_911= ESTADO_911;
        this.MUNICIPIO_911= MUNICIPIO_911;
        this.SERV_AFEC_911= SERV_AFEC_911;
        this.USUARIO_BO_911= USUARIO_BO_911;
        this.DIAS= DIAS;
        this.ASIGNADOA= ASIGNADOA;

    }  
    
   //-----7 
    public SetPlayBitacora_GLDC(String dt_TIPO_SOLICITUD, String dt_ID_EVENT,
            String dt_USUARIO, String dt_DESCRIPCION,
            String dt_DOCUMENTATION, String dt_FECHA, String dt_ESTATUS)
    {
        this.dt_TIPO_SOLICITUD = dt_TIPO_SOLICITUD;
        this.dt_ID_EVENT = dt_ID_EVENT;
        this.dt_USUARIO = dt_USUARIO;
        this.dt_DESCRIPCION = dt_DESCRIPCION;
        this.dt_DOCUMENTATION = dt_DOCUMENTATION;
        this.dt_FECHA = dt_FECHA;
        this.dt_ESTATUS = dt_ESTATUS;
    }
    
   public SetPlayBitacora_GLDC( String tm_fechaini,
            String tm_fechafin, String tm_evento,
            String tm_incidente, String tm_responsable, String tm_medida, String tm_estatus, String tm_area)
    {
        this.tm_fechaini = tm_fechaini;
        this.tm_fechafin = tm_fechafin;
        this.tm_evento = tm_evento;
        this.tm_incidente = tm_incidente;
        this.tm_responsable = tm_responsable;
        this.tm_medida = tm_medida;
        this.tm_estatus = tm_estatus;
        this.tm_area = tm_area;
    }

   //19 911
   public SetPlayBitacora_GLDC(String ID_EVENT,  String NOMBRE_OFICIO, String FECHA_INICIO, String FECHA_FIN,
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
   
   
    //19 911
   public SetPlayBitacora_GLDC(String ID_EVENT,  String NOMBRE_OFICIO, String FECHA_INICIO, String FECHA_FIN,
            String DESCRIPCION, String USUARIO, String DOCUMENTATION, String ESTATUS,  String FECHA_APERTURA, String FECHA_CIERRE,
            String CLASIFICACION, String PRIORIDAD_911, String TIPOFALLA_911, String INC_REMEDY_911, String ENTIDAD_GOB_911, String ESTADO_911, String MUNICIPIO_911, String SERV_AFEC_911, String USUARIO_BO_911,
            List myList, int items, String EstEvidencia
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
        this.myList= myList;
        this.items= items;
        this.EstEvidencia= EstEvidencia;


    }  
   
   
   
   
   
    public String getNOMBRE_OFICIO() {
        return NOMBRE_OFICIO;
    }

    public void setNOMBRE_OFICIO(String NOMBRE_OFICIO) {
        this.NOMBRE_OFICIO = NOMBRE_OFICIO;
    }

    public String getID_TYPEB() {
        return ID_TYPEB;
    }

    public void setID_TYPEB(String ID_TYPEB) {
        this.ID_TYPEB = ID_TYPEB;
    }

    public String getID_EVENT() {
        return ID_EVENT;
    }

    public void setID_EVENT(String ID_EVENT) {
        this.ID_EVENT = ID_EVENT;
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

    public String getPARAMETRO_BUSQUEDA() {
        return PARAMETRO_BUSQUEDA;
    }

    public void setPARAMETRO_BUSQUEDA(String PARAMETRO_BUSQUEDA) {
        this.PARAMETRO_BUSQUEDA = PARAMETRO_BUSQUEDA;
    }

    public String getID_TICKET() {
        return ID_TICKET;
    }

    public void setID_TICKET(String ID_TICKET) {
        this.ID_TICKET = ID_TICKET;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getDESCRIPCION_per() {
        return DESCRIPCION_per;
    }

    public void setDESCRIPCION_per(String DESCRIPCION_per) {
        this.DESCRIPCION_per = DESCRIPCION_per;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getID_CASO() {
        return ID_CASO;
    }

    public void setID_CASO(String ID_CASO) {
        this.ID_CASO = ID_CASO;
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

    public String getTIPO_SOLICITUD() {
        return TIPO_SOLICITUD;
    }

    public void setTIPO_SOLICITUD(String TIPO_SOLICITUD) {
        this.TIPO_SOLICITUD = TIPO_SOLICITUD;
    }

    public String getFECHA_INICIO_Fin() {
        return FECHA_INICIO_Fin;
    }

    public void setFECHA_INICIO_Fin(String FECHA_INICIO_Fin) {
        this.FECHA_INICIO_Fin = FECHA_INICIO_Fin;
    }

    public String getEstEvidencia() {
        return EstEvidencia;
    }

    public void setEstEvidencia(String EstEvidencia) {
        this.EstEvidencia = EstEvidencia;
    }

    public List getMyList() {
        return myList;
    }

    public void setMyList(List myList) {
        this.myList = myList;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public String getDt_TIPO_SOLICITUD() {
        return dt_TIPO_SOLICITUD;
    }

    public void setDt_TIPO_SOLICITUD(String dt_TIPO_SOLICITUD) {
        this.dt_TIPO_SOLICITUD = dt_TIPO_SOLICITUD;
    }

    public String getDt_ID_EVENT() {
        return dt_ID_EVENT;
    }

    public void setDt_ID_EVENT(String dt_ID_EVENT) {
        this.dt_ID_EVENT = dt_ID_EVENT;
    }

    public String getDt_USUARIO() {
        return dt_USUARIO;
    }

    public void setDt_USUARIO(String dt_USUARIO) {
        this.dt_USUARIO = dt_USUARIO;
    }

    public String getDt_DESCRIPCION() {
        return dt_DESCRIPCION;
    }

    public void setDt_DESCRIPCION(String dt_DESCRIPCION) {
        this.dt_DESCRIPCION = dt_DESCRIPCION;
    }

    public String getDt_DOCUMENTATION() {
        return dt_DOCUMENTATION;
    }

    public void setDt_DOCUMENTATION(String dt_DOCUMENTATION) {
        this.dt_DOCUMENTATION = dt_DOCUMENTATION;
    }

    public String getDt_FECHA() {
        return dt_FECHA;
    }

    public void setDt_FECHA(String dt_FECHA) {
        this.dt_FECHA = dt_FECHA;
    }

    public String getDt_ESTATUS() {
        return dt_ESTATUS;
    }

    public void setDt_ESTATUS(String dt_ESTATUS) {
        this.dt_ESTATUS = dt_ESTATUS;
    }

    public String getTm_fechaini() {
        return tm_fechaini;
    }

    public void setTm_fechaini(String tm_fechaini) {
        this.tm_fechaini = tm_fechaini;
    }

    public String getTm_fechafin() {
        return tm_fechafin;
    }

    public void setTm_fechafin(String tm_fechafin) {
        this.tm_fechafin = tm_fechafin;
    }

    public String getTm_evento() {
        return tm_evento;
    }

    public void setTm_evento(String tm_evento) {
        this.tm_evento = tm_evento;
    }

    public String getTm_incidente() {
        return tm_incidente;
    }

    public void setTm_incidente(String tm_incidente) {
        this.tm_incidente = tm_incidente;
    }

    public String getTm_responsable() {
        return tm_responsable;
    }

    public void setTm_responsable(String tm_responsable) {
        this.tm_responsable = tm_responsable;
    }

    public String getTm_medida() {
        return tm_medida;
    }

    public void setTm_medida(String tm_medida) {
        this.tm_medida = tm_medida;
    }

    public String getTm_estatus() {
        return tm_estatus;
    }

    public void setTm_estatus(String tm_estatus) {
        this.tm_estatus = tm_estatus;
    }

    public String getTm_area() {
        return tm_area;
    }

    public void setTm_area(String tm_area) {
        this.tm_area = tm_area;
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

    public String getNOMBRE_EQUIPO() {
        return NOMBRE_EQUIPO;
    }

    public void setNOMBRE_EQUIPO(String NOMBRE_EQUIPO) {
        this.NOMBRE_EQUIPO = NOMBRE_EQUIPO;
    }

    public String getNO_SERIE_EQUIPO() {
        return NO_SERIE_EQUIPO;
    }

    public void setNO_SERIE_EQUIPO(String NO_SERIE_EQUIPO) {
        this.NO_SERIE_EQUIPO = NO_SERIE_EQUIPO;
    }

    public String getMAC_ADDRESS() {
        return MAC_ADDRESS;
    }

    public void setMAC_ADDRESS(String MAC_ADDRESS) {
        this.MAC_ADDRESS = MAC_ADDRESS;
    }

    public String getEQUIPO_EJECUTA() {
        return EQUIPO_EJECUTA;
    }

    public void setEQUIPO_EJECUTA(String EQUIPO_EJECUTA) {
        this.EQUIPO_EJECUTA = EQUIPO_EJECUTA;
    }

    public String getAFECTACION() {
        return AFECTACION;
    }

    public void setAFECTACION(String AFECTACION) {
        this.AFECTACION = AFECTACION;
    }

    public String getDURACION_VENTANA() {
        return DURACION_VENTANA;
    }

    public void setDURACION_VENTANA(String DURACION_VENTANA) {
        this.DURACION_VENTANA = DURACION_VENTANA;
    }

    public String getSISTEMA_AFECTADO() {
        return SISTEMA_AFECTADO;
    }

    public void setSISTEMA_AFECTADO(String SISTEMA_AFECTADO) {
        this.SISTEMA_AFECTADO = SISTEMA_AFECTADO;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
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

    public String getLOCALIDAD() {
        return LOCALIDAD;
    }

    public void setLOCALIDAD(String LOCALIDAD) {
        this.LOCALIDAD = LOCALIDAD;
    }

    public String getDIAS() {
        return DIAS;
    }

    public void setDIAS(String DIAS) {
        this.DIAS = DIAS;
    }

    public String getASIGNADOA() {
        return ASIGNADOA;
    }

    public void setASIGNADOA(String ASIGNADOA) {
        this.ASIGNADOA = ASIGNADOA;
    }
 
   

}
