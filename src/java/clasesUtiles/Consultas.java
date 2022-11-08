/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI16991
 */
public class Consultas implements Serializable{

    public Consultas() {
        
    }
    
    
    public String QueryLogin(String usuario){
        String query ="select usuario, pass,url, nombre_usuario, email, no_empleado, puesto,fecha_cumple,foto,cuenta from PW_USUARIO\n" +
                      "where usuario='"+usuario+"'";
        return query;
    }
        
    public String QueryRevConsecServ(String servicio){
        String query ="select id_miss,element_network,d_date,out_miss  from pw_seq_resfinal\n" +
                      "where service='"+servicio+"'";
        return query;
    }
    
}
