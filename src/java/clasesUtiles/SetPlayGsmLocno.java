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
public class SetPlayGsmLocno implements Serializable{
    
    private String CELL_ID,ASL,NIR,CIUDAD,ACGID_DAP,REGION,LATITUD,LONGITUD;

    public SetPlayGsmLocno(String CELL_ID, String ASL, String NIR, String CIUDAD, String ACGID_DAP, String REGION, String LATITUD, String LONGITUD) {
        this.CELL_ID = CELL_ID;
        this.ASL = ASL;
        this.NIR = NIR;
        this.CIUDAD = CIUDAD;
        this.ACGID_DAP = ACGID_DAP;
        this.REGION = REGION;
        this.LATITUD = LATITUD;
        this.LONGITUD = LONGITUD;
    }
    
    
    
    
    public SetPlayGsmLocno(){
        
    }

    public String getCELL_ID() {
        return CELL_ID;
    }

    public String getASL() {
        return ASL;
    }

    public String getNIR() {
        return NIR;
    }

    public String getCIUDAD() {
        return CIUDAD;
    }

    public String getACGID_DAP() {
        return ACGID_DAP;
    }

    public String getREGION() {
        return REGION;
    }

    public String getLATITUD() {
        return LATITUD;
    }

    public String getLONGITUD() {
        return LONGITUD;
    }

    public void setCELL_ID(String CELL_ID) {
        this.CELL_ID = CELL_ID;
    }

    public void setASL(String ASL) {
        this.ASL = ASL;
    }

    public void setNIR(String NIR) {
        this.NIR = NIR;
    }

    public void setCIUDAD(String CIUDAD) {
        this.CIUDAD = CIUDAD;
    }

    public void setACGID_DAP(String ACGID_DAP) {
        this.ACGID_DAP = ACGID_DAP;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION;
    }

    public void setLATITUD(String LATITUD) {
        this.LATITUD = LATITUD;
    }

    public void setLONGITUD(String LONGITUD) {
        this.LONGITUD = LONGITUD;
    }

    
    
}
