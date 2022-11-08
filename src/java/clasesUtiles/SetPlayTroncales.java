/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI12906
 */
public class SetPlayTroncales implements Serializable{
    
    private  String operador;
    private  String doperador;
    private  String  id_core;
    private  String  id_desc;
    private  String  id_ixc;
    private  String  id_ptn;
    private  String  troncales;
    private  String  tron_cant;
    private  String  tron_cant2;
    
    public SetPlayTroncales(String operador, String doperador) {
        this.operador = operador;   
        this.doperador = doperador;
    }
    
    public SetPlayTroncales(String troncales, String tron_cant, String tron_cant2 ) {
        this.troncales = troncales;   
        this.tron_cant = tron_cant;
        this.tron_cant2 = tron_cant2;
    }
    
   public SetPlayTroncales(String id_core, String id_desc, String id_ixc, String id_ptn) {
        this.id_core = id_core;   
        this.id_desc = id_desc; 
        this.id_ixc =  id_ixc; 
        this.id_ptn =  id_ptn; 
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getDoperador() {
        return doperador;
    }

    public void setDoperador(String doperador) {
        this.doperador = doperador;
    }

    public String getId_core() {
        return id_core;
    }

    public void setId_core(String id_core) {
        this.id_core = id_core;
    }

    public String getId_desc() {
        return id_desc;
    }

    public void setId_desc(String id_desc) {
        this.id_desc = id_desc;
    }

    public String getId_ixc() {
        return id_ixc;
    }

    public void setId_ixc(String id_ixc) {
        this.id_ixc = id_ixc;
    }

    public String getId_ptn() {
        return id_ptn;
    }

    public void setId_ptn(String id_ptn) {
        this.id_ptn = id_ptn;
    }

    public String getTroncales() {
        return troncales;
    }

    public void setTroncales(String troncales) {
        this.troncales = troncales;
    }

    public String getTron_cant() {
        return tron_cant;
    }

    public void setTron_cant(String tron_cant) {
        this.tron_cant = tron_cant;
    }

    public String getTron_cant2() {
        return tron_cant2;
    }

    public void setTron_cant2(String tron_cant2) {
        this.tron_cant2 = tron_cant2;
    }


    
    
}
