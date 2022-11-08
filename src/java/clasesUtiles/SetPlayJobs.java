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
public class SetPlayJobs implements Serializable{
    String ID_JOB, JOBNAME, JOBGROUP , HORAINICIO,HORAFIN,FINALSTATUS;
    String GROUP,CURRENTSTATUS,TOTAL;
    
    public SetPlayJobs(String ID_JOB, String JOBNAME, String JOBGROUP, String HORAINICIO, String HORAFIN,String FINALSTATUS, String CURRENTSTATUS){
        this.ID_JOB=ID_JOB;
        this.JOBNAME=JOBNAME;
        this.JOBGROUP=JOBGROUP;
        this.HORAINICIO=HORAINICIO;
        this.HORAFIN=HORAFIN;
        this.FINALSTATUS=FINALSTATUS;  
        this.CURRENTSTATUS=CURRENTSTATUS;  
    }
    
    public SetPlayJobs(String GROUP, String CURRENTSTATUS, String TOTAL){
        this.GROUP=GROUP;
        this.CURRENTSTATUS=CURRENTSTATUS;
        this.TOTAL=TOTAL;         
    }

    public String getJOBNAME() {
        return JOBNAME;
    }

    public String getHORAINICIO() {
        return HORAINICIO;
    }

    public String getHORAFIN() {
        return HORAFIN;
    }

    public String getFINALSTATUS() {
        return FINALSTATUS;
    }

    public void setJOBNAME(String JOBNAME) {
        this.JOBNAME = JOBNAME;
    }

    public void setHORAINICIO(String HORAINICIO) {
        this.HORAINICIO = HORAINICIO;
    }

    public void setHORAFIN(String HORAFIN) {
        this.HORAFIN = HORAFIN;
    }

    public void setFINALSTATUS(String FINALSTATUS) {
        this.FINALSTATUS = FINALSTATUS;
    }

    public String getGROUP() {
        return GROUP;
    }

    public void setGROUP(String GROUP) {
        this.GROUP = GROUP;
    }

    public String getCURRENTSTATUS() {
        return CURRENTSTATUS;
    }

    public void setCURRENTSTATUS(String CURRENTSTATUS) {
        this.CURRENTSTATUS = CURRENTSTATUS;
    }

    public String getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(String TOTAL) {
        this.TOTAL = TOTAL;
    }

    public String getID_JOB() {
        return ID_JOB;
    }

    public void setID_JOB(String ID_JOB) {
        this.ID_JOB = ID_JOB;
    }

    public String getJOBGROUP() {
        return JOBGROUP;
    }

    public void setJOBGROUP(String JOBGROUP) {
        this.JOBGROUP = JOBGROUP;
    }
    
    
}
