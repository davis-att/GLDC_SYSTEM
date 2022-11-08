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
public class SetPlayGLDC_Checklist implements Serializable{

     String TICKET_NUMBER, FECHA_REVISION, ID_REVISOR, NOMBRE;

    public SetPlayGLDC_Checklist(String TICKET_NUMBER, String FECHA_REVISION, String ID_REVISOR, String NOMBRE)
    {
           this.TICKET_NUMBER = TICKET_NUMBER;
           this.FECHA_REVISION = FECHA_REVISION;
           this.ID_REVISOR = ID_REVISOR;
           this.NOMBRE = NOMBRE;
          
    }

    public SetPlayGLDC_Checklist() {

    }

    public String getTICKET_NUMBER() {
        return TICKET_NUMBER;
    }

    public void setTICKET_NUMBER(String TICKET_NUMBER) {
        this.TICKET_NUMBER = TICKET_NUMBER;
    }

    public String getFECHA_REVISION() {
        return FECHA_REVISION;
    }

    public void setFECHA_REVISION(String FECHA_REVISION) {
        this.FECHA_REVISION = FECHA_REVISION;
    }

    public String getID_REVISOR() {
        return ID_REVISOR;
    }

    public void setID_REVISOR(String ID_REVISOR) {
        this.ID_REVISOR = ID_REVISOR;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

   
    
    
    
}
