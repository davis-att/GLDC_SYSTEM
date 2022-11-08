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
public class SetPlayRepoRoaming implements Serializable{
    
    private String rpkey;
    private String drpkey;
    
   public SetPlayRepoRoaming(String drpkey) {
        this.drpkey = drpkey;
        
    }

    public SetPlayRepoRoaming(String rpkey, String drpkey) {
        this.rpkey =   rpkey;
        this.drpkey = drpkey;
        
    }

    public String getRpkey() {
        return rpkey;
    }

    public void setRpkey(String rpkey) {
        this.rpkey = rpkey;
    }

    public String getDrpkey() {
        return drpkey;
    }

    public void setDrpkey(String drpkey) {
        this.drpkey = drpkey;
    }
   
    


      
}
