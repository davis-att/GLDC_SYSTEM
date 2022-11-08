/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.Serializable;
import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@ManagedBean
@RequestScoped
@Named(value = "galeriaBean")

public class GaleriaBean implements Serializable{  
  
    private List<String> images;  
  
   @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=8;i++) {  
            images.add("galeria" + i + ".jpg");  
        }  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  

}  