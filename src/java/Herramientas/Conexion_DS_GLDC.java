/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author NMF03240
 */
public class Conexion_DS_GLDC implements Serializable{
    private final String url="jdbc:oracle:thin:@";
    private String user, passwd, host;
    public Connection con;
    public ResultSet rs;
    public PreparedStatement prepStat = null;
    public PreparedStatement prepStatInsert = null;
    public Statement insert = null;
    private Statement query=null;
    private String datos[] = new String [2];  
    
    private DataSource ds;
    
    
public Conexion_DS_GLDC( String opc) throws NamingException, SQLException {
    
    
     Context context=new InitialContext();
     ds=(DataSource) context.lookup(opc);
    
      if(ds==null)
	   throw new SQLException("Can't get data source");
		
                //get database connection
      con = ds.getConnection();
      if(con==null)
            throw new SQLException("Can't get database connection");

        /*
        LectPass datos = new LectPass();
        try {
            datos.LectPass(opc);   
        } catch (IOException ex) {
            Logger.getLogger(Conexion_DS_GLDC.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.host=url+datos.url; 
            this.user=datos.usr; 
            this.passwd=datos.pass;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_DS_GLDC.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=DriverManager.getConnection(this.host,this.user,this.passwd);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_DS_GLDC.class.getName()).log(Level.SEVERE, null, ex);
        }
            //System.out.println("Conexion establecida");
        try {           
            query=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_DS_GLDC.class.getName()).log(Level.SEVERE, null, ex);
        }
        */

}      




public ResultSet ejecutarQuery(String query) throws SQLException{
    try {
       
         prepStat = con.prepareStatement(query);
         rs=prepStat.executeQuery();
        // System.out.println("\n Consulta Exitosa");
         return rs;
        }
    catch (SQLException ex) {
         System.out.println("Error en ejecutar Query" + ex);
         throw ex; // rethrowing the exception 
        }
    //return rs;
}

public void update (String query) throws SQLException{
       try {              
                //System.out.println("Desde adentro" + query);
                insert.executeUpdate(query);
           }
       catch (SQLException ex){
           System.out.println("No se pudo realizar el insert" + ex);
           throw ex; // rethrowing the exception 
       }
   }



public Connection getCon(){
    return con;
}

}
