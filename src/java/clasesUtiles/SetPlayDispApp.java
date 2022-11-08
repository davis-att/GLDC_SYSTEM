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
public class SetPlayDispApp implements Serializable{
    String DESCRIPCION, A_O, MES, SLA;
    
    public SetPlayDispApp(String DESCRIPCION, String A_O, String MES, String SLA){
        this.DESCRIPCION=DESCRIPCION;
        this.A_O=A_O;
        this.MES=MES;
        this.SLA=SLA;
       
    }
    
     public SetPlayDispApp(String MES){
                this.MES=MES;
       
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getA_O() {
        return A_O;
    }

    public void setA_O(String A_O) {
        this.A_O = A_O;
    }

    public String getMES() {
        return MES;
    }

    public void setMES(String MES) {
        this.MES = MES;
    }

    public String getSLA() {
        return SLA;
    }

    public void setSLA(String SLA) {
        this.SLA = SLA;
    }

   
    
}
