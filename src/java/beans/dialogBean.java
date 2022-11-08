/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
//import org.primefaces.context.RequestContext;
import org.primefaces.PrimeFaces;


@ManagedBean 
@Named(value = "dialogBean")
@ApplicationScoped


public class dialogBean implements Serializable{
    
    public void verOpciones() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpciones",options,null); 
        //System.out.println("Por que no sale, carajo");
    }  
    
    public void verOpcionesTEL() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpcionesTEL",options,null); 
    }
    
    public void verOpcionesDAP() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpcionesDAP",options,null); 
    }
    
    public void verOpcionesQCHAT() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpcionesQCHAT",options,null); 
    }
    
    public void verOpcionesGGCN() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpcionesGGCN",options,null); 
    }
    
    public void verOpcionesSGCN() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpcionesSGCN",options,null); 
    }
    
    public void verOpcionesLTE() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("verOpcionesLTE",options,null); 
    }
    
    
    public void descargas() {  
        Map<String,Object> options = new HashMap<>();  
        options.put("modal", true);  
        options.put("draggable", true);  
        options.put("resizable", true);  
        options.put("contentHeight", 500);
        options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("descargas",options,null); 
        //System.out.println("abriendo descargas");
    }

    public void opcionesConteoConsecutivos() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("opcionesConteoConsecutivos", options, null);
        //System.out.println("D:");
    }
    
    public void opcionesConteoConsecutivosTEL() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("opcionesConteoConsecutivosTEL", options, null);
        //System.out.println("D:");
    }
    
    public void opcionesConteoConsecutivosDAP_QCHAT() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("opcionesConteoConsecutivosDAP_QCHAT", options, null);
        //System.out.println("D:");
    }
    
    public void opcionesConteoConsecutivosDATOS() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("opcionesConteoConsecutivosDATOS", options, null);
        //System.out.println("D:");
    }

    public void distribucionVAS() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("distribucionVAS", options, null);
        //System.out.println("D:");
    }
    
    public void distribucionTEL() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("distribucionTEL", options, null);
        //System.out.println("D:");
    }
    
    public void distribucionDAP_QCHAT() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("distribucionDAP_QCHAT", options, null);
        //System.out.println("D:");
    }
    
    public void distribucionDATOS() {
        Map<String, Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", true);
        options.put("resizable", true);
        options.put("contentHeight", 300);
        //options.put("contentWidth", 800);
        PrimeFaces.current().dialog().openDynamic("distribucionDATOS", options, null);
        //System.out.println("D:");
    }
    
    public void cerrarOpciones(){
        PrimeFaces.current().dialog().closeDynamic(this);
    }
}
