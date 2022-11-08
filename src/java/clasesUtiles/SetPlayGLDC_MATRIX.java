/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NMI16991
 */
public class SetPlayGLDC_MATRIX implements Serializable {

    
    String SUBSCRIPTION_ID, USER_ID, ACTIVATION_DATE, MSISDN_INPUT, MSISDN_INITIAL, CHANGE_TIME_MSISDN, ACT_IMSI, IMEI,
           ACT_ICCID, ACT_CUSTOMER_NAME, ACT_CUSTOMER_RFC, ACT_CUSTOMER_ADDRESS, ACT_CONTACT_NAME, ACT_CONTACT_PHONE, CHG_TIME_INFORMATION, CHG_CUSTOMER_NAME, CHG_CUSTOMER_RFC,
           CHG_CUSTOMER_ADDRESS, CHG_CONTACT_NAME, CHG_PHONE_CONTACT, OFFER_ID, OFFER_NAME, CHANGESTATUS_DATE, STATUS_BEFORE, DSTATUS_BEFORE,STATUS_AFTER, DSTATUS_AFTER,STATUS_REPORT,
           CHANGE_REASON, IMSI_CHANGE,SIM_CHANGE,CHANGESIM_DATE,MODALITY;

     public SetPlayGLDC_MATRIX(
              String SUBSCRIBER_ID, String SUBSCRIPTION_ID, String USER_ID, String ACTIVATION_DATE, String MSISDN_INPUT, String MSISDN_INITIAL, String NEW_MDN, String OLD_MDN, String CHANGE_TIME_MSISDN, String ACT_IMSI , String IMEI,
              String ACT_ICCID, String ACT_CUSTOMER_NAME, String ACT_CUSTOMER_RFC, String ACT_CUSTOMER_ADDRESS, String ACT_CONTACT_NAME, String ACT_CONTACT_PHONE, String CHG_TIME_INFORMATION, String CHG_CUSTOMER_NAME, String CHG_CUSTOMER_RFC,
              String CHG_CUSTOMER_ADDRESS, String CHG_CONTACT_NAME, String CHG_PHONE_CONTACT, String OFFER_ID, String OFFER_NAME, String CHANGESTATUS_DATE, String STATUS_BEFORE, String DSTATUS_BEFORE, String STATUS_AFTER, String DSTATUS_AFTER,
              String STATUS_REPORT, String CHANGE_REASON, String IMSI_CHANGE, String SIM_CHANGE, String CHANGESIM_DATE, String MODALITY
    )
     {
        this.SUBSCRIBER_ID = SUBSCRIBER_ID;
        this.SUBSCRIPTION_ID = SUBSCRIPTION_ID;
        this.USER_ID = USER_ID;
        this.ACTIVATION_DATE = ACTIVATION_DATE;
        this.MSISDN_INPUT = MSISDN_INPUT;
        this.MSISDN_INITIAL = MSISDN_INITIAL;
        this.NEW_MDN = NEW_MDN;
        this.OLD_MDN = OLD_MDN;
        this.CHANGE_TIME_MSISDN = CHANGE_TIME_MSISDN;
        this.ACT_IMSI = ACT_IMSI;
        
        this.IMEI = IMEI;
        this.ACT_ICCID = ACT_ICCID;
        this.ACT_CUSTOMER_NAME = ACT_CUSTOMER_NAME;
        this.ACT_CUSTOMER_RFC = ACT_CUSTOMER_RFC;
        this.ACT_CUSTOMER_ADDRESS = ACT_CUSTOMER_ADDRESS;
        this.ACT_CONTACT_NAME = ACT_CONTACT_NAME;
        this.ACT_CONTACT_PHONE = ACT_CONTACT_PHONE;
        this.CHG_TIME_INFORMATION = CHG_TIME_INFORMATION;
        this.CHG_CUSTOMER_NAME = CHG_CUSTOMER_NAME;
        this.CHG_CUSTOMER_RFC = CHG_CUSTOMER_RFC;
        
        this.CHG_CUSTOMER_ADDRESS = CHG_CUSTOMER_ADDRESS;
        this.CHG_CONTACT_NAME = CHG_CONTACT_NAME;
        this.CHG_PHONE_CONTACT = CHG_PHONE_CONTACT;
        this.OFFER_ID = OFFER_ID;
        this.OFFER_NAME = OFFER_NAME;
        this.CHANGESTATUS_DATE = CHANGESTATUS_DATE; 
        this.STATUS_BEFORE = STATUS_BEFORE;
        this.DSTATUS_BEFORE = DSTATUS_BEFORE;
        this.STATUS_AFTER = STATUS_AFTER;
        this.DSTATUS_AFTER = DSTATUS_AFTER;
        
        this.STATUS_REPORT = STATUS_REPORT;
        this.CHANGE_REASON = CHANGE_REASON;
        this.IMSI_CHANGE = IMSI_CHANGE;
        this.SIM_CHANGE = SIM_CHANGE;
        this.CHANGESIM_DATE = CHANGESIM_DATE;
        this.MODALITY = MODALITY;
        
        
    } 

    
    String SUBSCRIBER_ID, ACCOUNT, ID_CHANGEDN, CHANGEDN_DATE, NEW_MDN, OLD_MDN, REASON, EVENT_TIME, PROCESS_DATE;
    
    public SetPlayGLDC_MATRIX(
        String SUBSCRIBER_ID, String ACCOUNT, String ID_CHANGEDN, String CHANGEDN_DATE, String NEW_MDN, String OLD_MDN, String REASON, 
            String EVENT_TIME, String PROCESS_DATE
    )
    {
        this.SUBSCRIBER_ID = SUBSCRIBER_ID;
        this.ACCOUNT = ACCOUNT;
        this.ID_CHANGEDN = ID_CHANGEDN;
        this.CHANGEDN_DATE = CHANGEDN_DATE;
        this.NEW_MDN = NEW_MDN;
        this.OLD_MDN = OLD_MDN;
        this.REASON = REASON;
        this.EVENT_TIME = EVENT_TIME;
        this.PROCESS_DATE = PROCESS_DATE;
     
               
    } 

    String ID_CHANGESIM, MDN, IMSI, SIM;
    
    public SetPlayGLDC_MATRIX(
        String ID_CHANGESIM, String SUBSCRIBER_ID, String ACCOUNT, String MDN, String IMSI, String SIM, String EVENT_TIME, String PROCESS_DATE
    )
    {
        this.ID_CHANGESIM = ID_CHANGESIM;
        this.SUBSCRIBER_ID = SUBSCRIBER_ID;
        this.ACCOUNT = ACCOUNT;        
        this.MDN = MDN;
        this.IMSI = IMSI;
        this.SIM = SIM;
        this.EVENT_TIME = EVENT_TIME;
        this.PROCESS_DATE = PROCESS_DATE;        
    } 

    public String getCHANGESTATUS_DATE() {
        return CHANGESTATUS_DATE;
    }

    public void setCHANGESTATUS_DATE(String CHANGESTATUS_DATE) {
        this.CHANGESTATUS_DATE = CHANGESTATUS_DATE;
    }

    public String getSTATUS_BEFORE() {
        return STATUS_BEFORE;
    }

    public void setSTATUS_BEFORE(String STATUS_BEFORE) {
        this.STATUS_BEFORE = STATUS_BEFORE;
    }

    public String getDSTATUS_BEFORE() {
        return DSTATUS_BEFORE;
    }

    public void setDSTATUS_BEFORE(String DSTATUS_BEFORE) {
        this.DSTATUS_BEFORE = DSTATUS_BEFORE;
    }

    public String getSTATUS_AFTER() {
        return STATUS_AFTER;
    }

    public void setSTATUS_AFTER(String STATUS_AFTER) {
        this.STATUS_AFTER = STATUS_AFTER;
    }

    public String getDSTATUS_AFTER() {
        return DSTATUS_AFTER;
    }

    public void setDSTATUS_AFTER(String DSTATUS_AFTER) {
        this.DSTATUS_AFTER = DSTATUS_AFTER;
    }

    public String getSTATUS_REPORT() {
        return STATUS_REPORT;
    }

    public void setSTATUS_REPORT(String STATUS_REPORT) {
        this.STATUS_REPORT = STATUS_REPORT;
    }

    public String getCHANGE_REASON() {
        return CHANGE_REASON;
    }

    public void setCHANGE_REASON(String CHANGE_REASON) {
        this.CHANGE_REASON = CHANGE_REASON;
    }

    public String getIMSI_CHANGE() {
        return IMSI_CHANGE;
    }

    public void setIMSI_CHANGE(String IMSI_CHANGE) {
        this.IMSI_CHANGE = IMSI_CHANGE;
    }

    public String getSIM_CHANGE() {
        return SIM_CHANGE;
    }

    public void setSIM_CHANGE(String SIM_CHANGE) {
        this.SIM_CHANGE = SIM_CHANGE;
    }

    public String getCHANGESIM_DATE() {
        return CHANGESIM_DATE;
    }

    public void setCHANGESIM_DATE(String CHANGESIM_DATE) {
        this.CHANGESIM_DATE = CHANGESIM_DATE;
    }

    public String getMODALITY() {
        return MODALITY;
    }

    public void setMODALITY(String MODALITY) {
        this.MODALITY = MODALITY;
    }

    
    
    public String getID_CHANGESIM() {
        return ID_CHANGESIM;
    }

    public void setID_CHANGESIM(String ID_CHANGESIM) {
        this.ID_CHANGESIM = ID_CHANGESIM;
    }

    public String getMDN() {
        return MDN;
    }

    public void setMDN(String MDN) {
        this.MDN = MDN;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    public String getCHG_CUSTOMER_ADDRESS() {
        return CHG_CUSTOMER_ADDRESS;
    }

    public void setCHG_CUSTOMER_ADDRESS(String CHG_CUSTOMER_ADDRESS) {
        this.CHG_CUSTOMER_ADDRESS = CHG_CUSTOMER_ADDRESS;
    }

    public String getCHG_CONTACT_NAME() {
        return CHG_CONTACT_NAME;
    }

    public void setCHG_CONTACT_NAME(String CHG_CONTACT_NAME) {
        this.CHG_CONTACT_NAME = CHG_CONTACT_NAME;
    }

    public String getCHG_PHONE_CONTACT() {
        return CHG_PHONE_CONTACT;
    }

    public void setCHG_PHONE_CONTACT(String CHG_PHONE_CONTACT) {
        this.CHG_PHONE_CONTACT = CHG_PHONE_CONTACT;
    }

    public String getOFFER_ID() {
        return OFFER_ID;
    }

    public void setOFFER_ID(String OFFER_ID) {
        this.OFFER_ID = OFFER_ID;
    }

    public String getOFFER_NAME() {
        return OFFER_NAME;
    }

    public void setOFFER_NAME(String OFFER_NAME) {
        this.OFFER_NAME = OFFER_NAME;
    }

    

    public String getSUBSCRIPTION_ID() {
        return SUBSCRIPTION_ID;
    }

    public void setSUBSCRIPTION_ID(String SUBSCRIPTION_ID) {
        this.SUBSCRIPTION_ID = SUBSCRIPTION_ID;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getACTIVATION_DATE() {
        return ACTIVATION_DATE;
    }

    public void setACTIVATION_DATE(String ACTIVATION_DATE) {
        this.ACTIVATION_DATE = ACTIVATION_DATE;
    }

    public String getMSISDN_INPUT() {
        return MSISDN_INPUT;
    }

    public void setMSISDN_INPUT(String MSISDN_INPUT) {
        this.MSISDN_INPUT = MSISDN_INPUT;
    }

    public String getMSISDN_INITIAL() {
        return MSISDN_INITIAL;
    }

    public void setMSISDN_INITIAL(String MSISDN_INITIAL) {
        this.MSISDN_INITIAL = MSISDN_INITIAL;
    }

    public String getCHANGE_TIME_MSISDN() {
        return CHANGE_TIME_MSISDN;
    }

    public void setCHANGE_TIME_MSISDN(String CHANGE_TIME_MSISDN) {
        this.CHANGE_TIME_MSISDN = CHANGE_TIME_MSISDN;
    }

    public String getACT_IMSI() {
        return ACT_IMSI;
    }

    public void setACT_IMSI(String ACT_IMSI) {
        this.ACT_IMSI = ACT_IMSI;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getACT_ICCID() {
        return ACT_ICCID;
    }

    public void setACT_ICCID(String ACT_ICCID) {
        this.ACT_ICCID = ACT_ICCID;
    }

    public String getACT_CUSTOMER_NAME() {
        return ACT_CUSTOMER_NAME;
    }

    public void setACT_CUSTOMER_NAME(String ACT_CUSTOMER_NAME) {
        this.ACT_CUSTOMER_NAME = ACT_CUSTOMER_NAME;
    }

    public String getACT_CUSTOMER_RFC() {
        return ACT_CUSTOMER_RFC;
    }

    public void setACT_CUSTOMER_RFC(String ACT_CUSTOMER_RFC) {
        this.ACT_CUSTOMER_RFC = ACT_CUSTOMER_RFC;
    }

    public String getACT_CUSTOMER_ADDRESS() {
        return ACT_CUSTOMER_ADDRESS;
    }

    public void setACT_CUSTOMER_ADDRESS(String ACT_CUSTOMER_ADDRESS) {
        this.ACT_CUSTOMER_ADDRESS = ACT_CUSTOMER_ADDRESS;
    }

    public String getACT_CONTACT_NAME() {
        return ACT_CONTACT_NAME;
    }

    public void setACT_CONTACT_NAME(String ACT_CONTACT_NAME) {
        this.ACT_CONTACT_NAME = ACT_CONTACT_NAME;
    }

    public String getACT_CONTACT_PHONE() {
        return ACT_CONTACT_PHONE;
    }

    public void setACT_CONTACT_PHONE(String ACT_CONTACT_PHONE) {
        this.ACT_CONTACT_PHONE = ACT_CONTACT_PHONE;
    }

    public String getCHG_TIME_INFORMATION() {
        return CHG_TIME_INFORMATION;
    }

    public void setCHG_TIME_INFORMATION(String CHG_TIME_INFORMATION) {
        this.CHG_TIME_INFORMATION = CHG_TIME_INFORMATION;
    }

    public String getCHG_CUSTOMER_NAME() {
        return CHG_CUSTOMER_NAME;
    }

    public void setCHG_CUSTOMER_NAME(String CHG_CUSTOMER_NAME) {
        this.CHG_CUSTOMER_NAME = CHG_CUSTOMER_NAME;
    }

    public String getCHG_CUSTOMER_RFC() {
        return CHG_CUSTOMER_RFC;
    }

    public void setCHG_CUSTOMER_RFC(String CHG_CUSTOMER_RFC) {
        this.CHG_CUSTOMER_RFC = CHG_CUSTOMER_RFC;
    }

    public String getSUBSCRIBER_ID() {
        return SUBSCRIBER_ID;
    }

    public void setSUBSCRIBER_ID(String SUBSCRIBER_ID) {
        this.SUBSCRIBER_ID = SUBSCRIBER_ID;
    }

    public String getACCOUNT() {
        return ACCOUNT;
    }

    public void setACCOUNT(String ACCOUNT) {
        this.ACCOUNT = ACCOUNT;
    }

    public String getID_CHANGEDN() {
        return ID_CHANGEDN;
    }

    public void setID_CHANGEDN(String ID_CHANGEDN) {
        this.ID_CHANGEDN = ID_CHANGEDN;
    }

    public String getCHANGEDN_DATE() {
        return CHANGEDN_DATE;
    }

    public void setCHANGEDN_DATE(String CHANGEDN_DATE) {
        this.CHANGEDN_DATE = CHANGEDN_DATE;
    }

    public String getNEW_MDN() {
        return NEW_MDN;
    }

    public void setNEW_MDN(String NEW_MDN) {
        this.NEW_MDN = NEW_MDN;
    }

    public String getOLD_MDN() {
        return OLD_MDN;
    }

    public void setOLD_MDN(String OLD_MDN) {
        this.OLD_MDN = OLD_MDN;
    }

    public String getREASON() {
        return REASON;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON;
    }

    public String getEVENT_TIME() {
        return EVENT_TIME;
    }

    public void setEVENT_TIME(String EVENT_TIME) {
        this.EVENT_TIME = EVENT_TIME;
    }

    public String getPROCESS_DATE() {
        return PROCESS_DATE;
    }

    public void setPROCESS_DATE(String PROCESS_DATE) {
        this.PROCESS_DATE = PROCESS_DATE;
    }
   
}
