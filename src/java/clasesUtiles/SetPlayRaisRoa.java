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
public class SetPlayRaisRoa implements Serializable{
    
    String COUNTRY, 
            PRIORITY, 
            ROAMING_PARTNER, 
            AGREEMENT_TYPE, 
            STATUS_OUTBOUND, 
            STATUS_INBOUND, 
            VOICE_OUTBOUND_DATE, 
            VOICE_INBOUND_DATE, 
            GPRS_OUTBOUND, 
            GPRS_INBOUND, 
            RP_KEY, 
            MCC_MNC, 
            COMFONE_CODE, 
            REGION, 
            RATE_BAND, 
            RATE_BAND_GPRS;
                                  
    public SetPlayRaisRoa(String COUNTRY, String PRIORITY, String ROAMING_PARTNER, String AGREEMENT_TYPE, String STATUS_OUTBOUND, String STATUS_INBOUND, 
                          String VOICE_OUTBOUND_DATE, String VOICE_INBOUND_DATE, String GPRS_OUTBOUND, String GPRS_INBOUND, String RP_KEY, String MCC_MNC, 
                          String COMFONE_CODE, String REGION, String RATE_BAND, String RATE_BAND_GPRS)
    {
        this.COUNTRY= COUNTRY;
        this.PRIORITY=PRIORITY;
        this.ROAMING_PARTNER= ROAMING_PARTNER;
        this.AGREEMENT_TYPE=AGREEMENT_TYPE;
        this.STATUS_OUTBOUND= STATUS_OUTBOUND;
        this.STATUS_INBOUND=STATUS_INBOUND;
        this.VOICE_OUTBOUND_DATE= VOICE_OUTBOUND_DATE;
        this.VOICE_INBOUND_DATE=VOICE_INBOUND_DATE;
        this.GPRS_OUTBOUND= GPRS_OUTBOUND;
        this.GPRS_INBOUND= GPRS_INBOUND;
        this.RP_KEY= RP_KEY;
        this.MCC_MNC= MCC_MNC;
        this.COMFONE_CODE=COMFONE_CODE;
        this.REGION= REGION;
        this.RATE_BAND= RATE_BAND;
        this.RATE_BAND_GPRS=RATE_BAND_GPRS;
    }

    public SetPlayRaisRoa() {
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(String PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getROAMING_PARTNER() {
        return ROAMING_PARTNER;
    }

    public void setROAMING_PARTNER(String ROAMING_PARTNER) {
        this.ROAMING_PARTNER = ROAMING_PARTNER;
    }

    public String getAGREEMENT_TYPE() {
        return AGREEMENT_TYPE;
    }

    public void setAGREEMENT_TYPE(String AGREEMENT_TYPE) {
        this.AGREEMENT_TYPE = AGREEMENT_TYPE;
    }

    public String getSTATUS_OUTBOUND() {
        return STATUS_OUTBOUND;
    }

    public void setSTATUS_OUTBOUND(String STATUS_OUTBOUND) {
        this.STATUS_OUTBOUND = STATUS_OUTBOUND;
    }

    public String getSTATUS_INBOUND() {
        return STATUS_INBOUND;
    }

    public void setSTATUS_INBOUND(String STATUS_INBOUND) {
        this.STATUS_INBOUND = STATUS_INBOUND;
    }

    public String getVOICE_OUTBOUND_DATE() {
        return VOICE_OUTBOUND_DATE;
    }

    public void setVOICE_OUTBOUND_DATE(String VOICE_OUTBOUND_DATE) {
        this.VOICE_OUTBOUND_DATE = VOICE_OUTBOUND_DATE;
    }

    public String getVOICE_INBOUND_DATE() {
        return VOICE_INBOUND_DATE;
    }

    public void setVOICE_INBOUND_DATE(String VOICE_INBOUND_DATE) {
        this.VOICE_INBOUND_DATE = VOICE_INBOUND_DATE;
    }

    public String getGPRS_OUTBOUND() {
        return GPRS_OUTBOUND;
    }

    public void setGPRS_OUTBOUND(String GPRS_OUTBOUND) {
        this.GPRS_OUTBOUND = GPRS_OUTBOUND;
    }

    public String getGPRS_INBOUND() {
        return GPRS_INBOUND;
    }

    public void setGPRS_INBOUND(String GPRS_INBOUND) {
        this.GPRS_INBOUND = GPRS_INBOUND;
    }

    public String getRP_KEY() {
        return RP_KEY;
    }

    public void setRP_KEY(String RP_KEY) {
        this.RP_KEY = RP_KEY;
    }

    public String getMCC_MNC() {
        return MCC_MNC;
    }

    public void setMCC_MNC(String MCC_MNC) {
        this.MCC_MNC = MCC_MNC;
    }

    public String getCOMFONE_CODE() {
        return COMFONE_CODE;
    }

    public void setCOMFONE_CODE(String COMFONE_CODE) {
        this.COMFONE_CODE = COMFONE_CODE;
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION;
    }

    public String getRATE_BAND() {
        return RATE_BAND;
    }

    public void setRATE_BAND(String RATE_BAND) {
        this.RATE_BAND = RATE_BAND;
    }

    public String getRATE_BAND_GPRS() {
        return RATE_BAND_GPRS;
    }

    public void setRATE_BAND_GPRS(String RATE_BAND_GPRS) {
        this.RATE_BAND_GPRS = RATE_BAND_GPRS;
    }
    
    
    
}
