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
public class SetPlayMSC implements Serializable{
    String msc;
    String desc;
    
    public SetPlayMSC(String msc, String desc){
        this.msc=msc;
        this.desc=desc;
        
    }

    public SetPlayMSC() {
    }

    public String getMSC() {
        return msc;
    }

    public void setMSC(String msc) {
        this.msc = msc;
    }

    public String getIddesc() {
        return desc;
    }

    public void setIddesc(String desc) {
        this.desc = desc;
    }

    
    
    
}
