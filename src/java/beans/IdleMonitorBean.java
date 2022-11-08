/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author NMI16991
 */
@ViewScoped
@Named(value = "idleBean")
public class IdleMonitorBean implements Serializable{
    
public void welcomeListener() {
	    FacesContext.getCurrentInstance().addMessage(
		null,
		new FacesMessage(FacesMessage.SEVERITY_WARN, "Welcome Back",
			"Continue your works."));

	}

	public void logoutListener() {
	    FacesContext.getCurrentInstance().addMessage(
		null,
		new FacesMessage(FacesMessage.SEVERITY_WARN,
			"You Have Logged Out!",
			"Thank you for using abc Online Financial Services"));

		// invalidate session, and redirect to other pages
	}
        
    public void onIdle() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, 
                                        "No activity.", "What are you doing over there?"));
        System.out.println("Entra al bean");
    }        
}
