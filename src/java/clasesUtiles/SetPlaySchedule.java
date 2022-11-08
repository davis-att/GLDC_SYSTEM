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
public class SetPlaySchedule implements Serializable{
    String JOBNAME,CLASS,TRIGGER,SCHEDULE,GROUP;
    
    public SetPlaySchedule(String JOBNAME, String CLASS, String TRIGGER,String SCHEDULE, String GROUP){
        this.JOBNAME=JOBNAME;
        this.CLASS=CLASS;
        this.TRIGGER=TRIGGER;
        this.SCHEDULE=SCHEDULE;                
        this.GROUP=GROUP;                
    }

    public void setJOBNAME(String JOBNAME) {
        this.JOBNAME = JOBNAME;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public void setTRIGGER(String TRIGGER) {
        this.TRIGGER = TRIGGER;
    }

    public void setSCHEDULE(String SCHEDULE) {
        this.SCHEDULE = SCHEDULE;
    }

    public void setGROUP(String GROUP) {
        this.GROUP = GROUP;
    }

    public String getJOBNAME() {
        return JOBNAME;
    }

    public String getCLASS() {
        return CLASS;
    }

    public String getTRIGGER() {
        return TRIGGER;
    }

    public String getSCHEDULE() {
        return SCHEDULE;
    }

    public String getGROUP() {
        return GROUP;
    }

    
    
}
