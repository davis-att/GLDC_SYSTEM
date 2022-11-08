/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author mgalicia
 */
public class SetPlayDirectorioGLDC implements Serializable{
     String NOMBRE_USUARIO, PUESTO, EMAIL, FECHA_CUMPLE, CORREOPERSONAL, TELEMPRESA, TELMOVIL, JEFE_INMEDIATO,FOTO;
    
    public SetPlayDirectorioGLDC(String NOMBRE_USUARIO, String PUESTO, String EMAIL, String FECHA_CUMPLE, String CORREOPERSONAL, String TELEMPRESA, String TELMOVIL, String JEFE_INMEDIATO,String FOTO
){        
        this.NOMBRE_USUARIO=NOMBRE_USUARIO;
        this.PUESTO=PUESTO;
        this.EMAIL=EMAIL;
        this.FECHA_CUMPLE=FECHA_CUMPLE;
        this.CORREOPERSONAL=CORREOPERSONAL;
        this.TELEMPRESA=TELEMPRESA;
        this.TELMOVIL=TELMOVIL;
        this.JEFE_INMEDIATO=JEFE_INMEDIATO;
        this.FOTO=FOTO;
    }

    public String getNOMBRE_USUARIO() {
        return NOMBRE_USUARIO;
    }

    public void setNOMBRE_USUARIO(String NOMBRE_USUARIO) {
        this.NOMBRE_USUARIO = NOMBRE_USUARIO;
    }

    public String getPUESTO() {
        return PUESTO;
    }

    public void setPUESTO(String PUESTO) {
        this.PUESTO = PUESTO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getFECHA_CUMPLE() {
        return FECHA_CUMPLE;
    }

    public void setFECHA_CUMPLE(String FECHA_CUMPLE) {
        this.FECHA_CUMPLE = FECHA_CUMPLE;
    }

    public String getCORREOPERSONAL() {
        return CORREOPERSONAL;
    }

    public void setCORREOPERSONAL(String CORREOPERSONAL) {
        this.CORREOPERSONAL = CORREOPERSONAL;
    }

    public String getTELEMPRESA() {
        return TELEMPRESA;
    }

    public void setTELEMPRESA(String TELEMPRESA) {
        this.TELEMPRESA = TELEMPRESA;
    }

    public String getTELMOVIL() {
        return TELMOVIL;
    }

    public void setTELMOVIL(String TELMOVIL) {
        this.TELMOVIL = TELMOVIL;
    }

    public String getJEFE_INMEDIATO() {
        return JEFE_INMEDIATO;
    }

    public void setJEFE_INMEDIATO(String JEFE_INMEDIATO) {
        this.JEFE_INMEDIATO = JEFE_INMEDIATO;
    }

    public String getFOTO() {
        return FOTO;
    }

    public void setFOTO(String FOTO) {
        this.FOTO = FOTO;
    }
    
    
    

}