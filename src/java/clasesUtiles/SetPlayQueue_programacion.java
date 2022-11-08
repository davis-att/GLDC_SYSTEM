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
public class SetPlayQueue_programacion implements Serializable{
    
     int id_prog;
     String id_usuario, fecha_inicial, fecha_final, fecha_incialc, fecha_finalc;
                                  
    public SetPlayQueue_programacion(int id_prog, String id_usuario, String fecha_inicial, String fecha_final, String fecha_incialc, String fecha_finalc)
    {
            this.id_prog = id_prog;
            this.id_usuario = id_usuario;
            this.fecha_inicial = fecha_inicial;
            this.fecha_final = fecha_final;
            this.fecha_incialc = fecha_incialc;
            this.fecha_finalc = fecha_finalc;
      


    }

    public int getId_prog() {
        return id_prog;
    }

    public void setId_prog(int id_prog) {
        this.id_prog = id_prog;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }



    public String getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(String fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getFecha_incialc() {
        return fecha_incialc;
    }

    public void setFecha_incialc(String fecha_incialc) {
        this.fecha_incialc = fecha_incialc;
    }

    public String getFecha_finalc() {
        return fecha_finalc;
    }

    public void setFecha_finalc(String fecha_finalc) {
        this.fecha_finalc = fecha_finalc;
    }

 
    
    
}
