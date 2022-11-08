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
public class SetPlayBitacora implements Serializable{

    String Servicio, Bitacora, Id, Fecha_Evento;
    String Incidente, Dur_Afect, Responsable, MImpacto,MImpacto_per;
    String Justificacion, Area, Documentacion, Estatus, Ticket, Fecha_Evento_Fin, EstEvidencia;
    List myList = new ArrayList();
    int items;
    String dt_service, dt_idevent, dt_iduser, dt_comment, dt_document, dt_date, dt_estatus;
    String tm_fechaini, tm_fechafin, tm_evento, tm_incidente, tm_responsable, tm_medida, tm_estatus, tm_area;

    public SetPlayBitacora(String Servicio, String Id, String Bitacora, String Fecha_Evento, String Incidente,
            String Responsable, String Area, String Ticket, String Dur_Afect, String MImpacto,
            String Justificacion, String Documentacion, String Estatus, String Fecha_Evento_Fin,String MImpacto_per, List myList, int items, String EstEvidencia
    ) {

        this.Servicio = Servicio;
        this.Bitacora = Bitacora;
        this.Id = Id;
        this.Fecha_Evento = Fecha_Evento;
        this.Incidente = Incidente;
        this.Dur_Afect = Dur_Afect;
        this.Responsable = Responsable;
        this.MImpacto = MImpacto;
        this.Justificacion = Justificacion;
        this.Area = Area;
        this.Documentacion = Documentacion;
        this.Estatus = Estatus;
        this.Ticket = Ticket;
        this.Fecha_Evento_Fin = Fecha_Evento_Fin;
        this.MImpacto_per = MImpacto_per;
        this.myList= myList;
        this.items= items;
        this.EstEvidencia= EstEvidencia;

    }
    
      public SetPlayBitacora(String Servicio, String Id, String Bitacora, String Fecha_Evento, String Incidente,
            String Responsable, String Area, String Ticket, String Dur_Afect, String MImpacto,
            String Justificacion, String Documentacion, String Estatus, String Fecha_Evento_Fin
    ) {

        this.Servicio = Servicio;
        this.Bitacora = Bitacora;
        this.Id = Id;
        this.Fecha_Evento = Fecha_Evento;
        this.Incidente = Incidente;
        this.Dur_Afect = Dur_Afect;
        this.Responsable = Responsable;
        this.MImpacto = MImpacto;
        this.Justificacion = Justificacion;
        this.Area = Area;
        this.Documentacion = Documentacion;
        this.Estatus = Estatus;
        this.Ticket = Ticket;
        this.Fecha_Evento_Fin = Fecha_Evento_Fin;
        this.myList= myList;
        this.items= items;
        this.EstEvidencia= EstEvidencia;

    }  
    
    
    public SetPlayBitacora(String dt_service, String dt_idevent,
            String dt_iduser, String dt_comment,
            String dt_document, String dt_date, String dt_estatus)
    {
        this.dt_service = dt_service;
        this.dt_idevent = dt_idevent;
        this.dt_iduser = dt_iduser;
        this.dt_comment = dt_comment;
        this.dt_document = dt_document;
        this.dt_date = dt_date;
        this.dt_estatus = dt_estatus;
    }
    
   public SetPlayBitacora( String tm_fechaini,
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

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getBitacora() {
        return Bitacora;
    }

    public void setBitacora(String Bitacora) {
        this.Bitacora = Bitacora;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFecha_Evento() {
        return Fecha_Evento;
    }

    public void setFecha_Evento(String Fecha_Evento) {
        this.Fecha_Evento = Fecha_Evento;
    }

    public String getIncidente() {
        return Incidente;
    }

    public void setIncidente(String Incidente) {
        this.Incidente = Incidente;
    }

    public String getDur_Afect() {
        return Dur_Afect;
    }

    public void setDur_Afect(String Dur_Afect) {
        this.Dur_Afect = Dur_Afect;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getMImpacto() {
        return MImpacto;
    }

    public void setMImpacto(String MImpacto) {
        this.MImpacto = MImpacto;
    }
    
    
    public String getMImpacto_per() {
        return MImpacto_per;
    }

    public void setMImpacto_per(String MImpacto_per) {
        this.MImpacto_per = MImpacto_per;
    }


    public String getJustificacion() {
        return Justificacion;
    }

    public void setJustificacion(String Justificacion) {
        this.Justificacion = Justificacion;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getDocumentacion() {
        return Documentacion;
    }

    public void setDocumentacion(String Documentacion) {
        this.Documentacion = Documentacion;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    public String getFecha_Evento_Fin() {
        return Fecha_Evento_Fin;
    }

    public void setFecha_Evento_Fin(String Fecha_Evento_Fin) {
        this.Fecha_Evento_Fin = Fecha_Evento_Fin;
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

    public String getDt_service() {
        return dt_service;
    }

    public void setDt_service(String dt_service) {
        this.dt_service = dt_service;
    }

    public String getDt_idevent() {
        return dt_idevent;
    }

    public void setDt_idevent(String dt_idevent) {
        this.dt_idevent = dt_idevent;
    }

    public String getDt_iduser() {
        return dt_iduser;
    }

    public void setDt_iduser(String dt_iduser) {
        this.dt_iduser = dt_iduser;
    }

    public String getDt_comment() {
        return dt_comment;
    }

    public void setDt_comment(String dt_comment) {
        this.dt_comment = dt_comment;
    }

    public String getDt_document() {
        return dt_document;
    }

    public void setDt_document(String dt_document) {
        this.dt_document = dt_document;
    }

    public String getDt_date() {
        return dt_date;
    }

    public void setDt_date(String dt_date) {
        this.dt_date = dt_date;
    }

    public String getDt_estatus() {
        return dt_estatus;
    }

    public void setDt_estatus(String dt_estatus) {
        this.dt_estatus = dt_estatus;
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
    


    
    
    

}
