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
public class SetPlayBitacoraTabla implements Serializable{
    
     String SERVICE, 
            ID_EVENT, 
            ID_TYPEB, 
            D_DATE_INI, 
            INCIDENT, 
            RESPONSIBLE, 
            TRACK_AREA, 
            ID_TICKET, 
            DUR_AFFECT, 
            MEASURE_IMPACT, 
            JUSTIFICATION, 
            STATUS, 
            D_DATE_END;
                                  
    public SetPlayBitacoraTabla(String SERVICE, String ID_EVENT, String ID_TYPEB, String D_DATE_INI, String INCIDENT, String RESPONSIBLE, String TRACK_AREA, String ID_TICKET, String DUR_AFFECT, String MEASURE_IMPACT, String JUSTIFICATION, String STATUS, String D_DATE_END)
    {
            this.SERVICE = SERVICE;
            this.ID_EVENT = ID_EVENT;
            this.ID_TYPEB = ID_TYPEB;
            this.D_DATE_INI = D_DATE_INI;
            this.INCIDENT = INCIDENT;
            this.RESPONSIBLE = RESPONSIBLE;
            this.TRACK_AREA = TRACK_AREA;
            this.ID_TICKET = ID_TICKET;
            this.DUR_AFFECT = DUR_AFFECT;
            this.MEASURE_IMPACT = MEASURE_IMPACT;
            this.JUSTIFICATION = JUSTIFICATION;            
            this.STATUS = STATUS;
            this.D_DATE_END = D_DATE_END;
    }

    public SetPlayBitacoraTabla() {
        
    }

    public String getSERVICE() {
        return SERVICE;
    }

    public void setSERVICE(String SERVICE) {
        this.SERVICE = SERVICE;
    }

    public String getID_EVENT() {
        return ID_EVENT;
    }

    public void setID_EVENT(String ID_EVENT) {
        this.ID_EVENT = ID_EVENT;
    }

    public String getID_TYPEB() {
        return ID_TYPEB;
    }

    public void setID_TYPEB(String ID_TYPEB) {
        this.ID_TYPEB = ID_TYPEB;
    }

    public String getD_DATE_INI() {
        return D_DATE_INI;
    }

    public void setD_DATE_INI(String D_DATE_INI) {
        this.D_DATE_INI = D_DATE_INI;
    }

    public String getINCIDENT() {
        return INCIDENT;
    }

    public void setINCIDENT(String INCIDENT) {
        this.INCIDENT = INCIDENT;
    }

    public String getRESPONSIBLE() {
        return RESPONSIBLE;
    }

    public void setRESPONSIBLE(String RESPONSIBLE) {
        this.RESPONSIBLE = RESPONSIBLE;
    }

    public String getTRACK_AREA() {
        return TRACK_AREA;
    }

    public void setTRACK_AREA(String TRACK_AREA) {
        this.TRACK_AREA = TRACK_AREA;
    }

    public String getID_TICKET() {
        return ID_TICKET;
    }

    public void setID_TICKET(String ID_TICKET) {
        this.ID_TICKET = ID_TICKET;
    }

    public String getDUR_AFFECT() {
        return DUR_AFFECT;
    }

    public void setDUR_AFFECT(String DUR_AFFECT) {
        this.DUR_AFFECT = DUR_AFFECT;
    }

    public String getMEASURE_IMPACT() {
        return MEASURE_IMPACT;
    }

    public void setMEASURE_IMPACT(String MEASURE_IMPACT) {
        this.MEASURE_IMPACT = MEASURE_IMPACT;
    }

    public String getJUSTIFICATION() {
        return JUSTIFICATION;
    }

    public void setJUSTIFICATION(String JUSTIFICATION) {
        this.JUSTIFICATION = JUSTIFICATION;
    }  

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getD_DATE_END() {
        return D_DATE_END;
    }

    public void setD_DATE_END(String D_DATE_END) {
        this.D_DATE_END = D_DATE_END;
    }

   
    
    
}
