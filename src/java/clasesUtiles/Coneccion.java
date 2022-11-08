/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NMI16991
 */
public class Coneccion implements Serializable{
        
    public String user="MEDIACION", passwd="mediacion", host="jdbc:oracle:thin:@10.103.19.22:1912:RAREVE";
    public Connection con;
    public ResultSet rs;
    public PreparedStatement prepStat = null;
   

    public Coneccion(int opcion) {  
        switch(opcion){
            case 1:
                user="MEDIACION"; passwd="mediacion"; host="jdbc:oracle:thin:@10.103.19.22:1912:RAREVE";
            break;
                
            case 2:
                //user="DATA_P"; passwd="mexico_12"; host="jdbc:oracle:thin:@10.103.11.5:1526:REVE";
                  user="DG3861"; passwd="C4MB14M3"; host="jdbc:oracle:thin:@TD123457WRG131R.mx.att.com:1521:GLDC";
            break;    
                
            case 3:
                user="NMI11915"; passwd="SamuelWilson#456"; host="jdbc:oracle:thin:@10.103.129.24:1521:EMED";
            break;   
        }
                   
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=DriverManager.getConnection(this.host,this.user,this.passwd);
        } catch (SQLException ex) {
            Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
        }
            //System.out.println("Conexion establecida");            
    }
    
    
    public ResultSet ejecutarQuery(String query){
    try {
         prepStat = con.prepareStatement(query);
         rs=prepStat.executeQuery();
         //System.out.println("\n Consulta Exitosa");
         return rs;
        }
    catch (SQLException ex) {
         //System.out.println("Error en ejecutar Query" + ex);
        }
        return null;
    }
    
}
