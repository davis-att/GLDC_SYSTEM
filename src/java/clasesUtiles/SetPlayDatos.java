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
public class SetPlayDatos implements Serializable{
    
    private  String core;
    private  String dcore;
    private  String apn;
    private  String dapn;
    private  String rgroup;
    private  String drgroup;
    
    public SetPlayDatos(String core, String dcore) {
        this.core = core;   
        this.dcore = dcore;
    }
    
    public SetPlayDatos(String core, String apn, String dcore, String dapn) {
        this.core = core;
        this.apn = apn;
        this.dcore = dcore;
        this.dapn = dapn;
    }

    public SetPlayDatos(String core, String apn, String rgroup, String dcore, String dapn, String drgroup) {
        this.core = core;
        this.apn = apn;
        this.rgroup = rgroup;
        this.dcore = dcore;
        this.dapn = dapn;
        this.drgroup = drgroup;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getRgroup() {
        return rgroup;
    }

    public void setRgroup(String rgroup) {
        this.rgroup = rgroup;
    }

    public String getDcore() {
        return dcore;
    }

    public void setDcore(String dcore) {
        this.dcore = dcore;
    }

    public String getDapn() {
        return dapn;
    }

    public void setDapn(String dapn) {
        this.dapn = dapn;
    }

    public String getDrgroup() {
        return drgroup;
    }

    public void setDrgroup(String drgroup) {
        this.drgroup = drgroup;
    }
    
    
    
}
