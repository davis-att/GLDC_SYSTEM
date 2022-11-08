/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NMI16991
 */
public class AuthorizationListener implements PhaseListener, Serializable{

    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext facesContext = event.getFacesContext();
        String currentPage = facesContext.getViewRoot().getViewId();
        boolean isLoginPage = (currentPage.lastIndexOf("login.xhtml") > -1);
        HttpSession session =(HttpSession) facesContext.getExternalContext().getSession(true);
        Object usuario = session.getAttribute("username");
        
        if(!isLoginPage && usuario == null){
            
             NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
             nh.handleNavigation(facesContext, null, "/login.xhtml");
            
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {        
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
    
}
