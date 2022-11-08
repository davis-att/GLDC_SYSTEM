/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;


@ManagedBean
@ApplicationScoped
@Named(value = "mensajesBean")

public class MensajesBean implements Serializable{

    /**
     * Creates a new instance of MensajesBean
     */
    public MensajesBean() {
    }
    
    public void infoConsec(ActionEvent actionEvent) {  
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Reporte:", "Listo, puedes consultarlo!"));  
    }  
}
