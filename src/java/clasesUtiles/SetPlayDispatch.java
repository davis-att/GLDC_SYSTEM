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
public class SetPlayDispatch implements Serializable{
    
    private  String core;
    private  String dcore;
    private  String hdist;
    private  String dhdist;

    
    public SetPlayDispatch(String core, String dcore) {
        this.core = core;   
        this.dcore = dcore;
    }
    
    public SetPlayDispatch(String core, String hdist, String dcore, String dhdist) {
        this.core = core;
        this.hdist = hdist;
        this.dcore = dcore;
        this.dhdist = dhdist;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getDcore() {
        return dcore;
    }

    public void setDcore(String dcore) {
        this.dcore = dcore;
    }

    public String getHdist() {
        return hdist;
    }

    public void setHdist(String hdist) {
        this.hdist = hdist;
    }

    public String getDhdist() {
        return dhdist;
    }

    public void setDhdist(String dhdist) {
        this.dhdist = dhdist;
    }



   

    
    
}
