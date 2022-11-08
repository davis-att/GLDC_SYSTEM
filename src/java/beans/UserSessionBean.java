/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;



//import org.primefaces.extensions.event.timeline.TimelineSelectEvent;
//import org.primefaces.extensions.model.timeline.TimelineEvent;
//import org.primefaces.extensions.model.timeline.TimelineModel;

/**
 *
 * @author NMI12906
 */
@ViewScoped
@Named(value = "userSessionBean")

public  class UserSessionBean implements Serializable {
 
  
public void timeout(String usuario) throws IOException {
    
    try {
        //   System.out.println("Entra");
        DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date sysdate = new Date();
        String query="MERGE INTO PW_LOGINS t1\n" +
                "USING\n" +
                "(\n" +
                "SELECT * FROM (SELECT usuario, max(FECHA_LOGIN) FECHA_LOGIN FROM PW_LOGINS\n" +
                "WHERE usuario = '"+usuario+"'\n" +
                "AND FECHA_LOGOUT IS NULL \n" +
                "GROUP BY usuario\n" +
                "ORDER BY FECHA_LOGIN DESC)\n" +
                ") t2\n" +
                "ON (t1.usuario = t2.usuario\n" +
                "AND t1.FECHA_LOGIN = t2.FECHA_LOGIN)\n" +
                "WHEN MATCHED THEN UPDATE SET\n" +
                "t1.FECHA_LOGOUT = '"+df.format(sysdate)+"' , t1.activo='NO'";
        
        Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
       // System.out.println("Hola mundo:"+query);
        conectar.ejecutarQuery(query);
        conectar.con.close();
        
        
        FacesContext.getCurrentInstance().getExternalContext()
                .invalidateSession();
        FacesContext.getCurrentInstance().getExternalContext()
                .redirect("../login.xhtml");
    } catch (SQLException ex) {
        Logger.getLogger(UserSessionBean.class.getName()).log(Level.SEVERE, null, ex);
    }

}


    
    
}