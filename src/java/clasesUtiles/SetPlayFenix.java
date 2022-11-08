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
public class SetPlayFenix implements Serializable{

     String CRITERIOB, TICKET_NUMBER, CASO;

    public SetPlayFenix(String CRITERIOB, String TICKET_NUMBER, String CASO)
    {
            this.CRITERIOB = CRITERIOB;
            this.TICKET_NUMBER = TICKET_NUMBER;
            this.CASO = CASO;
     //       this.VALOR = VALOR;
          
    }

    public SetPlayFenix() {

    }

    public String getCRITERIOB() {
        return CRITERIOB;
    }

    public void setCRITERIOB(String CRITERIOB) {
        this.CRITERIOB = CRITERIOB;
    }
/*
    public String getVALOR() {
        return VALOR;
    }

    public void setVALOR(String VALOR) {
        this.VALOR = VALOR;
    }
*/
    public String getTICKET_NUMBER() {
        return TICKET_NUMBER;
    }

    public void setTICKET_NUMBER(String TICKET_NUMBER) {
        this.TICKET_NUMBER = TICKET_NUMBER;
    }

    public String getCASO() {
        return CASO;
    }

    public void setCASO(String CASO) {
        this.CASO = CASO;
    }

    
    
    
}
