
package Herramientas;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NMI12906
 */
import java.io.*;
import java.util.StringTokenizer;
 
public class LectPass extends Thread implements Serializable{
    
public String pass;
public String url;
public String usr;
    
     
 public void LectPass(String user) throws IOException{
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
   
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\PROGRA\\TNSNAMES\\pass.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr); 
         String linea="";    
         boolean flag=true;
         while((linea=br.readLine())!=null && flag) 
         {   
             //System.out.println(linea);
             StringTokenizer tokens=new StringTokenizer(linea, "/");
             while(tokens.hasMoreTokens())
             {
                  if (user.equals(tokens.nextToken()))
                  {
                        usr=tokens.nextToken(); 
                        pass=tokens.nextToken(); 
                        url=tokens.nextToken();
                        flag=false;
                       
                        //System.out.println("USR:"+usr);
                        //System.out.println("PASS:"+pass);
                        //System.out.println("URL:"+url);
                               
                  }                
             }
         }
        // System.out.println(pass);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      //return pass;
   }
}