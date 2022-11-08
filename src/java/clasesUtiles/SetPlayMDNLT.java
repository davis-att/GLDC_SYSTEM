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
public class SetPlayMDNLT implements Serializable {

    String AGREEMENT_NO, EFFECTIVE_DATE, EXPIRATION_DATE, MSISDN, IMSI, UFMI, EMSISDN, ACCESSORYNUMBER, EIMSI, VIN, ER;

    public SetPlayMDNLT(
              String AGREEMENT_NO, String EFFECTIVE_DATE, String EXPIRATION_DATE, String MSISDN, String IMSI, String UFMI,String EMSISDN, String ACCESSORYNUMBER,String EIMSI, String VIN , String ER               
    ) {
        this.AGREEMENT_NO = AGREEMENT_NO;
        this.EFFECTIVE_DATE = EFFECTIVE_DATE;
        this.EXPIRATION_DATE = EXPIRATION_DATE;
        this.MSISDN = MSISDN;
        this.IMSI = IMSI;
        this.UFMI = UFMI;
        this.EMSISDN = EMSISDN;
        this.ACCESSORYNUMBER = ACCESSORYNUMBER;
        this.EIMSI = EIMSI;
        this.VIN = VIN;
        this.ER = ER;
    }
    
    String CUENTA_PRE, CUENTA_POS, CUSTOMER_ID, SUBSCRIBER_NO, DN, INIT_ACT_DATE, DATEUESTADO , SUB_STATUS, SUB_STATUS_DATE, NOMBRE_CLIENTE, DIRECCION, MODALITY, ACTIVATION_DATE, RFC, CUSTTP_DESC;
    
    public SetPlayMDNLT(
        String CUENTA_PRE, String CUENTA_POS, String CUSTOMER_ID, String SUBSCRIBER_NO, String DN, String INIT_ACT_DATE, String DATEUESTADO, String SUB_STATUS, String SUB_STATUS_DATE, String NOMBRE_CLIENTE, String DIRECCION, String MODALITY, String ACTIVATION_DATE, String RFC, String CUSTTP_DESC
    )
    {
        this.CUENTA_PRE = CUENTA_PRE;
        this.CUENTA_POS = CUENTA_POS;
        this.CUSTOMER_ID = CUSTOMER_ID;
        this.SUBSCRIBER_NO = SUBSCRIBER_NO;
        this.DN = DN;
        this.INIT_ACT_DATE = INIT_ACT_DATE;
        this.DATEUESTADO = DATEUESTADO;
        this.SUB_STATUS = SUB_STATUS;
        this.SUB_STATUS_DATE = SUB_STATUS_DATE;
        this.NOMBRE_CLIENTE = NOMBRE_CLIENTE;
        this.DIRECCION = DIRECCION;
        this.MODALITY = MODALITY;
        this.ACTIVATION_DATE = ACTIVATION_DATE;
        this.RFC = RFC;
        this.CUSTTP_DESC = CUSTTP_DESC;
    }      
    
    
    

    public String getAGREEMENT_NO() {
        return AGREEMENT_NO;
    }

    public void setAGREEMENT_NO(String AGREEMENT_NO) {
        this.AGREEMENT_NO = AGREEMENT_NO;
    }

    public String getEFFECTIVE_DATE() {
        return EFFECTIVE_DATE;
    }

    public void setEFFECTIVE_DATE(String EFFECTIVE_DATE) {
        this.EFFECTIVE_DATE = EFFECTIVE_DATE;
    }

    public String getEXPIRATION_DATE() {
        return EXPIRATION_DATE;
    }

    public void setEXPIRATION_DATE(String EXPIRATION_DATE) {
        this.EXPIRATION_DATE = EXPIRATION_DATE;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }

    public String getUFMI() {
        return UFMI;
    }

    public void setUFMI(String UFMI) {
        this.UFMI = UFMI;
    }

    public String getEMSISDN() {
        return EMSISDN;
    }

    public void setEMSISDN(String EMSISDN) {
        this.EMSISDN = EMSISDN;
    }

    public String getACCESSORYNUMBER() {
        return ACCESSORYNUMBER;
    }

    public void setACCESSORYNUMBER(String ACCESSORYNUMBER) {
        this.ACCESSORYNUMBER = ACCESSORYNUMBER;
    }

    public String getEIMSI() {
        return EIMSI;
    }

    public void setEIMSI(String EIMSI) {
        this.EIMSI = EIMSI;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getCUENTA_PRE() {
        return CUENTA_PRE;
    }

    public void setCUENTA_PRE(String CUENTA_PRE) {
        this.CUENTA_PRE = CUENTA_PRE;
    }

    public String getCUENTA_POS() {
        return CUENTA_POS;
    }

    public void setCUENTA_POS(String CUENTA_POS) {
        this.CUENTA_POS = CUENTA_POS;
    }

    public String getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public String getSUBSCRIBER_NO() {
        return SUBSCRIBER_NO;
    }

    public void setSUBSCRIBER_NO(String SUBSCRIBER_NO) {
        this.SUBSCRIBER_NO = SUBSCRIBER_NO;
    }

    public String getDN() {
        return DN;
    }

    public void setDN(String DN) {
        this.DN = DN;
    }

    public String getINIT_ACT_DATE() {
        return INIT_ACT_DATE;
    }

    public void setINIT_ACT_DATE(String INIT_ACT_DATE) {
        this.INIT_ACT_DATE = INIT_ACT_DATE;
    }

    public String getDATEUESTADO() {
        return DATEUESTADO;
    }

    public void setDATEUESTADO(String DATEUESTADO) {
        this.DATEUESTADO = DATEUESTADO;
    }

    public String getSUB_STATUS() {
        return SUB_STATUS;
    }

    public void setSUB_STATUS(String SUB_STATUS) {
        this.SUB_STATUS = SUB_STATUS;
    }

    public String getSUB_STATUS_DATE() {
        return SUB_STATUS_DATE;
    }

    public void setSUB_STATUS_DATE(String SUB_STATUS_DATE) {
        this.SUB_STATUS_DATE = SUB_STATUS_DATE;
    }

    public String getNOMBRE_CLIENTE() {
        return NOMBRE_CLIENTE;
    }

    public void setNOMBRE_CLIENTE(String NOMBRE_CLIENTE) {
        this.NOMBRE_CLIENTE = NOMBRE_CLIENTE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getMODALITY() {
        return MODALITY;
    }

    public void setMODALITY(String MODALITY) {
        this.MODALITY = MODALITY;
    }

    public String getACTIVATION_DATE() {
        return ACTIVATION_DATE;
    }

    public void setACTIVATION_DATE(String ACTIVATION_DATE) {
        this.ACTIVATION_DATE = ACTIVATION_DATE;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCUSTTP_DESC() {
        return CUSTTP_DESC;
    }

    public void setCUSTTP_DESC(String CUSTTP_DESC) {
        this.CUSTTP_DESC = CUSTTP_DESC;
    }

    public String getER() {
        return ER;
    }

    public void setER(String ER) {
        this.ER = ER;
    }

    

    
    
    
}
