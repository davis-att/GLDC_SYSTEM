/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import util.MyUtil;
/**
 *
 * @author NMI16991
 */
@ManagedBean
@Named(value = "appBean")
@ApplicationScoped

public class appBean implements Serializable{

    /**
     * Creates a new instance of appBean
     */
    public appBean() {
    }
    
    public String getBaseUrl(){
         return MyUtil.baseUrl();
    }
}

