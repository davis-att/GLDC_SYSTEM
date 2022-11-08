
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.Serializable;
import javax.inject.Named;
//import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author NMI11915
 */
@ManagedBean
@Named(value = "templateBean")
@ViewScoped

public class templatesBean  implements Serializable{

    public String template="./templateGatWebTool.xhtml";

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    
    
    
    /**
     * 
     * 
     * Creates a new instance of templatesBean
     */
    public templatesBean() {
        template="./templateGatWebTool.xhtml";
        System.out.println(template);
    }
    
}
