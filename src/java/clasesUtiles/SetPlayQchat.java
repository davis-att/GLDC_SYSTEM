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
public class SetPlayQchat implements Serializable{
    
    private  String core;
    private  String dcore;
    private  String rules;
    private  String drules;

    
    public SetPlayQchat(String core, String dcore) {
        this.core = core;   
        this.dcore = dcore;
    }
    
    public SetPlayQchat(String core, String rules, String dcore, String drules) {
        this.core = core;
        this.rules = rules;
        this.dcore = dcore;
        this.drules = drules;
    }



    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

  

    public String getDcore() {
        return dcore;
    }

    public void setDcore(String dcore) {
        this.dcore = dcore;
    }

    public String getDrules() {
        return drules;
    }

    public void setDrules(String drules) {
        this.drules = drules;
    }


    
    
}
