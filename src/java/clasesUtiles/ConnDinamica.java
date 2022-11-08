/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class ConnDinamica implements Serializable{


    private String url="jdbc:oracle:thin:@";
    private String user, passwd, host;
    private Connection con;
    private ResultSet rs;
    private PreparedStatement prepStat = null;
    private Statement query=null;


    public ConnDinamica(String Host, String user, String passwd){

        this.host=url+Host;
        this.user=user;
        this.passwd=passwd;

          try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
       
          con=DriverManager.getConnection(this.host,this.user,this.passwd);
          //System.out.println("*****Conectado con:"+host+"/"+user);
          query=con.createStatement();
        }
        catch(Exception ex){
        //System.out.println(ex);
        

        }


    }

    public ConnDinamica(int tns){


        switch(tns){

            case 1:
                this.host=url+"10.103.11.5:1526:REVE.WORLD";
                this.user="DATA_P";
                this.passwd="mexico_12";
            break;
            default:
                break;

        }
          try{
          Class.forName("oracle.jdbc.driver.OracleDriver");

          con=DriverManager.getConnection(this.host,this.user,this.passwd);
          //System.out.println("*****Conectado con:"+url+host);
        }
        catch(Exception ex){
        //System.out.println(ex+"No se puedo conectar con"+host);

        }


    }


  public Connection getConnection(){
    return con;

  }

  public PreparedStatement  getStatement(String query){

      try{
          
      prepStat=con.prepareStatement(query);

      }catch(SQLException e){
      e.printStackTrace();
      }

      return prepStat;

  }

  public ResultSet getResultSet(String query)throws SQLException{      
        
        prepStat=con.prepareStatement(query);
       
            rs=prepStat.executeQuery();
         
        return rs;

  }

  public void insertar(String query)throws SQLException{

        prepStat=con.prepareStatement(query);
        con.commit();
        //System.out.println("Insercion completada");


  }

 public ResultSet makeconsult(String consulta){

    try{

         rs=query.executeQuery(consulta);

        }
        catch(Exception ex){
        //System.out.println(ex);
         }
  return rs;
  }


/*
    public static void main(String args[])throws SQLException{

       ConnDinamica con=new ConnDinamica("10.103.11.5:1526:REVE","bscs_tst","Ra_270409");
        ResultSet res;

        res=con.getResultSet("SELECT index_name, table_name  FROM all_indexes WHERE index_name = 'VALID_IDX'");

        int x=0;
          while(res.next()){
              System.out.println("entre");
            System.out.println(res.getString(1));
             }



    }*/


}
