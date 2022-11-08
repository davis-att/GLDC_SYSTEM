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
public class SetPlayQueue_bancotrab implements Serializable{

          
     int id_queue ;
     String id_token, ticket_number, estatus, fecha_asignacion, fecha_estatus, fecha_cierre, prioridad, codigoc, codigop, usuario;     
     String uimagen, conectado, color;
     
     
     public SetPlayQueue_bancotrab(String uimagen, String conectado, String color)
     {
          this.uimagen = uimagen;
            this.conectado = conectado;
            this.color = color;
     }
             
     
    public SetPlayQueue_bancotrab(
                int id_queue,
                String id_token,  
                String ticket_number,
                String estatus,
                String fecha_asignacion,
                String fecha_estatus,
                String fecha_cierre ,
                String  prioridad, String codigoc, String codigop )
    {
            this.id_queue = id_queue;
            this.id_token = id_token;
            this.ticket_number = ticket_number;
            this.estatus = estatus;
            this.fecha_asignacion = fecha_asignacion;
            this.fecha_estatus = fecha_estatus;
            this.fecha_cierre = fecha_cierre;
            this.prioridad = prioridad;
            this.codigoc = codigoc;
            this.codigop = codigop;

    }
    
      public SetPlayQueue_bancotrab(
                int id_queue,
                String id_token,  
                String ticket_number,
                String estatus,
                String fecha_asignacion,
                String fecha_estatus,
                String fecha_cierre ,
                String  prioridad, String codigoc, String codigop, String usuario )
    {
            this.id_queue = id_queue;
            this.id_token = id_token;
            this.ticket_number = ticket_number;
            this.estatus = estatus;
            this.fecha_asignacion = fecha_asignacion;
            this.fecha_estatus = fecha_estatus;
            this.fecha_cierre = fecha_cierre;
            this.prioridad = prioridad;
            this.codigoc = codigoc;
            this.codigop = codigop;
            this.usuario = usuario;

    }
      
      

      public SetPlayQueue_bancotrab() {
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
      
      
    public int getId_queue() {
        return id_queue;
    }

    public void setId_queue(int id_queue) {
        this.id_queue = id_queue;
    }

   

    public String getId_token() {
        return id_token;
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }

    public String getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(String ticket_number) {
        this.ticket_number = ticket_number;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public String getFecha_estatus() {
        return fecha_estatus;
    }

    public void setFecha_estatus(String fecha_estatus) {
        this.fecha_estatus = fecha_estatus;
    }

    public String getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(String fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getCodigoc() {
        return codigoc;
    }

    public void setCodigoc(String codigoc) {
        this.codigoc = codigoc;
    }

    public String getCodigop() {
        return codigop;
    }

    public void setCodigop(String codigop) {
        this.codigop = codigop;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConectado() {
        return conectado;
    }

    public void setConectado(String conectado) {
        this.conectado = conectado;
    }

    public String getUimagen() {
        return uimagen;
    }

    public void setUimagen(String uimagen) {
        this.uimagen = uimagen;
    }

  
    
    
}
