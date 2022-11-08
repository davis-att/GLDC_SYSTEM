/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author NMI11915
 */
@ManagedBean
@Named(value = "activarMenus")
@ViewScoped

public class ActivarMenus  implements Serializable{

    boolean respuestaDAP=true;
    boolean respuestaDATOS=true;
    boolean respuestaTELEFONIA=true;
    boolean respuestaVAS=true;
    
    String Usuario;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    

    public boolean isRespuestaDAP() {
        return respuestaDAP;
    }

    public void setRespuestaDAP(boolean respuestaDAP) {
        this.respuestaDAP = respuestaDAP;
    }

    public boolean isRespuestaDATOS() {
        return respuestaDATOS;
    }

    public void setRespuestaDATOS(boolean respuestaDATOS) {
        this.respuestaDATOS = respuestaDATOS;
    }

    public boolean isRespuestaTELEFONIA() {
        return respuestaTELEFONIA;
    }

    public void setRespuestaTELEFONIA(boolean respuestaTELEFONIA) {
        this.respuestaTELEFONIA = respuestaTELEFONIA;
    }

    public boolean isRespuestaVAS() {
        return respuestaVAS;
    }

    public void setRespuestaVAS(boolean respuestaVAS) {
        this.respuestaVAS = respuestaVAS;
    }
    
    
    
    
    
    
    
    public  ActivarMenus() {
            
           //FacesContext fc = FacesContext.getCurrentInstance();
           //Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
    
          
            
            System.out.println("Usuario:"+Usuario);
            System.out.println("Entre a este método de Activar Menú");
            System.out.println("Entre a este método de Activar Menú");
            
    }
    
    
    
    
  
    
    
}
