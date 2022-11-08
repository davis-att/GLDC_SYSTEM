/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 *
 * @author NMI16991
 */
public class MyUtil implements Serializable{
    
    public static String baseUrl()
    {
        return "http://TD134927LDG3861:8080/GLDC_SYSTEM/";     
    }
    
    public static String loginAdmUrl()
    {
        return "/GLDC_SYSTEM/faces/";
    }
    
    public static String loginUserUrl()
    {
        return "http://TD134927LDG3861:8080/Plata_Control/";
    }
}
