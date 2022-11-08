/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import clasesUtiles.Consultas;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Named;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.servlet.http.HttpSession;
//import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import util.MyUtil;
import org.primefaces.PrimeFaces;
/**
 *
 * @author NMI16991
 */

@ManagedBean
@Named(value = "loginBean")
@SessionScoped

public class loginBean implements Serializable {

    private Date fecha;
    
    private String username;	
    private String password;
    private String nombre;
    private String email;
    private String noEmpleado;
    private String puesto;
    private String cumpleanios;
    private String fotos;
    private String cuenta;
    
    
    private int usuarios;
     private int activos;
      private int tickets;
       private int cerrados;
        private int procesos;
         private int logins;
          private int intentos;
    private String emailPass;
    private String usernamePass;
    private String username1;
    private String passwordActual;
    
    
     private String lostPasss;
    boolean passActual =true;
    boolean pass1Desac =true;
    boolean pass2Desac =true;
    boolean botonDesactivado=true;
    
    
    boolean botonDesac=false;        
    boolean campoUsername=false;
    boolean campoEmail=false;
    
    
    boolean respuestaDAP=false;
    boolean respuestaDATOS=false;
    boolean respuestaTELEFONIA=false;
    boolean respuestaVAS=false;
    boolean respuestaROAMING=false;
    
    
    private String usuarioNombre;  

    private String destination="C:\\PROGRA\\SYSTEMA\\GLDC_SYSTEM\\web\\views\\FOTOS\\";
           
    private String template="";
    
    
    boolean activaPanelAccesos=false;
    
    
    
    boolean activaAccesoDap=true;            
    boolean activaAccesoDatos=true;            
    boolean activaAccesoTelefonia=true;            
    boolean activaAccesoVas=true;            
    boolean activaAccesoRoaming=true;    
    
             

    private List<String> images;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }

    public int getActivos() {
        return activos;
    }

    public void setActivos(int activos) {
        this.activos = activos;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getCerrados() {
        return cerrados;
    }

    public void setCerrados(int cerrados) {
        this.cerrados = cerrados;
    }

    public int getProcesos() {
        return procesos;
    }

    public void setProcesos(int procesos) {
        this.procesos = procesos;
    }

    public int getLogins() {
        return logins;
    }

    public void setLogins(int logins) {
        this.logins = logins;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    
    public boolean isActivaAccesoDap() {
        return activaAccesoDap;
    }

    public void setActivaAccesoDap(boolean activaAccesoDap) {
        this.activaAccesoDap = activaAccesoDap;
    }

    public boolean isActivaAccesoDatos() {
        return activaAccesoDatos;
    }

    public void setActivaAccesoDatos(boolean activaAccesoDatos) {
        this.activaAccesoDatos = activaAccesoDatos;
    }

    public boolean isActivaAccesoTelefonia() {
        return activaAccesoTelefonia;
    }

    public void setActivaAccesoTelefonia(boolean activaAccesoTelefonia) {
        this.activaAccesoTelefonia = activaAccesoTelefonia;
    }

    public boolean isActivaAccesoVas() {
        return activaAccesoVas;
    }

    public void setActivaAccesoVas(boolean activaAccesoVas) {
        this.activaAccesoVas = activaAccesoVas;
    }

    public boolean isActivaAccesoRoaming() {
        return activaAccesoRoaming;
    }

    public void setActivaAccesoRoaming(boolean activaAccesoRoaming) {
        this.activaAccesoRoaming = activaAccesoRoaming;
    }
    
    
    

    public boolean isActivaPanelAccesos() {
        return activaPanelAccesos;
    }

    public void setActivaPanelAccesos(boolean activaPanelAccesos) {
        this.activaPanelAccesos = activaPanelAccesos;
    }
    
    
    
    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public boolean isBotonDesac() {
        return botonDesac;
    }

    public void setBotonDesac(boolean botonDesac) {
        this.botonDesac = botonDesac;
    }

    
    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public String getEmailPass() {
        return emailPass;
    }

    public void setEmailPass(String emailPass) {
        this.emailPass = emailPass;
    }

    public String getUsernamePass() {
        return usernamePass;
    }

    public void setUsernamePass(String usernamePass) {
        this.usernamePass = usernamePass;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getPasswordActual() {
        return passwordActual;
    }

    public void setPasswordActual(String passwordActual) {
        this.passwordActual = passwordActual;
    }

    public String getLostPasss() {
        return lostPasss;
    }

    public void setLostPasss(String lostPasss) {
        this.lostPasss = lostPasss;
    }

    public boolean isPassActual() {
        return passActual;
    }

    public void setPassActual(boolean passActual) {
        this.passActual = passActual;
    }

    public boolean isPass1Desac() {
        return pass1Desac;
    }

    public void setPass1Desac(boolean pass1Desac) {
        this.pass1Desac = pass1Desac;
    }

    public boolean isPass2Desac() {
        return pass2Desac;
    }

    public void setPass2Desac(boolean pass2Desac) {
        this.pass2Desac = pass2Desac;
    }

    public boolean isBotonDesactivado() {
        return botonDesactivado;
    }

    public void setBotonDesactivado(boolean botonDesactivado) {
        this.botonDesactivado = botonDesactivado;
    }

    public boolean isCampoUsername() {
        return campoUsername;
    }

    public void setCampoUsername(boolean campoUsername) {
        this.campoUsername = campoUsername;
    }

    public boolean isCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(boolean campoEmail) {
        this.campoEmail = campoEmail;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

 
    
    
    
    
    
    
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
    
    

    public boolean isRespuestaDAP() {
        return respuestaDAP;
    }

    public void setRespuestaDAP(boolean respuestaDAP) {
        this.respuestaDAP = respuestaDAP;
    }

    public boolean isRespuestaDATOS() {
        return respuestaDATOS;
    }

    public void setRespuestaDATOS(boolean respuestaDATOS) {
        this.respuestaDATOS = respuestaDATOS;
    }

    public boolean isRespuestaTELEFONIA() {
        return respuestaTELEFONIA;
    }

    public void setRespuestaTELEFONIA(boolean respuestaTELEFONIA) {
        this.respuestaTELEFONIA = respuestaTELEFONIA;
    }

    public boolean isRespuestaVAS() {
        return respuestaVAS;
    }

    public void setRespuestaVAS(boolean respuestaVAS) {
        this.respuestaVAS = respuestaVAS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRespuestaROAMING() {
        return respuestaROAMING;
    }

    public void setRespuestaROAMING(boolean respuestaROAMING) {
        this.respuestaROAMING = respuestaROAMING;
    }
    
    
    
    
    @PostConstruct
    public void loginBean() {
        
        images = new ArrayList<String>();
        for (int i = 1; i <= 7; i++) {
            images.add("attt_" + i + ".jpg");
        }
    }

    
    public String getUsername() {
        return username;
	}
    
    public void setUsername(String username) {
		this.username = username;
	}

    public String getPassword() {
		return password;
	}
    
    public void setPassword(String password) {
		this.password = password;
	}
    



    public void login(ActionEvent actionEvent) throws NamingException, SQLException {
        //RequestContext context = RequestContext.getCurrentInstance();
        
        PrimeFaces context = PrimeFaces.current();
        FacesMessage msg = null;
	boolean loggedIn = false;
        DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        
        ResultSet rSet;
        String user = "",pass = "", ruta ="",url="";
        Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
        //Herramientas.Conexion_DS_GLDC conectar = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
        //Coneccion conectar = new Coneccion(2); --- LGBM
        Consultas consuLogin = new Consultas();
        
        
        
        
        rSet=conectar.ejecutarQuery(consuLogin.QueryLogin(username));
        
        try {       
            while(rSet.next())
            {
            user= rSet.getString("USUARIO");
            pass=rSet.getString("PASS");
            url=rSet.getString("URL");
            nombre=rSet.getString("NOMBRE_USUARIO");
            email=rSet.getString("EMAIL");
            noEmpleado=rSet.getString("NO_EMPLEADO");
            puesto=rSet.getString("PUESTO");
            cumpleanios=rSet.getString("FECHA_CUMPLE");
            fotos=rSet.getString("FOTO");
            cuenta =rSet.getString("CUENTA");
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
       }
        
         
        
        if ("DESBLOQUEADO".equals(cuenta))
            
        {
            
        if(username != null  && username.equals(user) && password != null  && password.equals(pass)) {
                
		loggedIn = true;
                intentos = 1;
                System.out.println("intento " + intentos);
                
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username",nombre);
                                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("userid",username);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", nombre);
                       
                ruta= MyUtil.loginAdmUrl()+url;
                System.out.println("ruta: " + ruta+ "ctx"+FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath());
                
                
                ResultSet rPermisos=conectar.ejecutarQuery("select dapq,datos,telefonia,vas,roaming from PW_USUARIO where usuario='"+username+"'");
                
                System.out.println("select dapq,datos,telefonia,vas,roaming from PW_USUARIO where usuario='"+username+"'");
               
                try {                
                    while (rPermisos.next())
                    {
                        if(rPermisos.getString(1).equals("1")){
                            //System.out.println("vale 1");
                            respuestaDAP=true;    
                            activaAccesoDap=false;
                        }
                       
                        if(rPermisos.getString(2).equals("1")){
                            //System.out.println("vale 1");
                            respuestaDATOS=true;                            
                            activaAccesoDatos=false;
                        }
                        
                        if(rPermisos.getString(3).equals("1")){
                            //System.out.println("vale 1");
                            respuestaTELEFONIA=true;                            
                            activaAccesoTelefonia=false;
                        }
                        
                        if(rPermisos.getString(4).equals("1")){
                            //System.out.println("vale 1");
                            respuestaVAS=true;
                            activaAccesoVas=false;
                        }
                       
                        if (rPermisos.getString(5).equals("1")) {
                            //System.out.println("vale 1");
                            respuestaROAMING = true;
                            activaAccesoRoaming=false;
                        }
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
                }
               
                
                //Para determinar cual es el template que estara usando si es de gat o algun externo
                Date fecha1 = new Date ();               
                fecha=fecha1;
                System.out.println("Usuario logueado:"+username+". Conectado a las:"+fecha1.toString());
                
                //DGH 10/12/2021
                System.out.println("INSERT INTO PW_LOGINS VALUES ('"+username+"', '"+df.format(fecha1)+"', NULL, 'SI')");
                conectar.ejecutarQuery("INSERT INTO PW_LOGINS VALUES ('"+username+"', '"+df.format(fecha1)+"', NULL, 'SI')");
                
                        
                String query="select alcance, roll from PW_USUARIO where usuario='"+username+"'";        
               
                System.out.println(query);
                rPermisos=conectar.ejecutarQuery(query);
                try {
                while (rPermisos.next())
                {
                    
                            if(rPermisos.getString(1).equals("INTERNO") && rPermisos.getString(2).equals("1") ){
                                  System.out.println("Soy Internossssss");
                        template="./templateGatWebTool.xhtml";
                        System.out.println("Soy Interno");
                      //  System.out.println("template:"+template);
                        activaPanelAccesos=true;
                    }
                     if(rPermisos.getString(1).equals("INTERNO") && rPermisos.getString(2).equals("2") ){
                        template="./templateADMINQ.xhtml";
                        System.out.println("Soy administradorQ");
                      //  System.out.println("template:"+template);
                        activaPanelAccesos=true;
                    }
                       if(rPermisos.getString(1).equals("INTERNO") && rPermisos.getString(2).equals("3") ){
                        template="./templateAbogadoQ.xhtml";
                      //  System.out.println("Soy Interno");
                      //  System.out.println("template:"+template);
                        activaPanelAccesos=true;
                    }
                    
                    if(rPermisos.getString(1).equals("EXTERNO")){
                        template="./templateGatWebToolExternos.xhtml";
                    //    System.out.println("Soy Externo");
                    //    System.out.println("template:"+template);
                        activaPanelAccesos=false;
                    }
                    
                    if(rPermisos.getString(1).equals("RH")){
                        template="./templateGatWebToolRH.xhtml";
                    //    System.out.println("Soy Externo");
                    //    System.out.println("template:"+template);
                        activaPanelAccesos=false;
                    }
                    
                     if(rPermisos.getString(1).equals("ADMIN")){
                        template="./templateGatWebToolADMIN.xhtml";
                        System.out.println("Soy ADMINISTRADOR");
                    //    System.out.println("template:"+template);
                        activaPanelAccesos=false;
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             //System.out.println("template:"+template);
            
             //System.out.println("template:"+template);
                
        }
        
        else {
		loggedIn = false;
		msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Los datos no son correctos, por favor verificalos.");
               ruta= MyUtil.baseUrl();
               
                Date fechaini = new Date ();               
                fecha=fechaini;
                intentos = intentos+1;
        
            System.out.println("intento " + intentos);
	}
        
        if (intentos == 4)
        {
             String QueryBloqueo ="UPDATE PW_USUARIO SET CUENTA = 'BLOQUEADO'\n" +
                "WHERE USUARIO = '"+username+"'";
               System.out.println(QueryBloqueo);
                conectar.ejecutarQuery(QueryBloqueo);
        }
        
    } 
        
    else
        {
            loggedIn = false;
		msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "La cuenta esta bloqueda. Contactar al equipo de Soporte");
               ruta= MyUtil.baseUrl();
        
           
        }
        
        FacesContext.getCurrentInstance().addMessage(null, msg);
	context.ajax().addCallbackParam("loggedIn", loggedIn);
        context.ajax().addCallbackParam("ruta", ruta);
        
        //DGH
        
          ResultSet ParamD=conectar.ejecutarQuery(" WITH QRESUMEN AS (\n" +
                    " SELECT COUNT(DISTINCT usr.USUARIO) USUARIOS, COUNT(DISTINCT usl.usuario) ACTIVOS, COUNT(DISTINCT ID_EVENT) TICKETS  FROM DG3861.PW_USUARIO USR\n" +
                    " 		LEFT JOIN DG3861.PW_LOGINS USL\n" +
                    " 		  ON usr.usuario=USL.usuario\n" +
                    " 		  AND USL.ACTIVO = 'SI'		\n" +
                    " 		     LEFT JOIN DG3861.PW_BITACORA BIT\n" +
                    " 		    ON usr.usuario=BIT.usuario)\n" +
                    " SELECT \n" +
                    "   usuarios, activos, tickets, \n" +
                    "   (SELECT count(1) FROM DG3861.PW_BITACORA WHERE ESTATUS='Cerrado') cerrados,\n" +
                    "   (SELECT count(1) FROM dg3861.PW_SCHEDULE_GLDC ) procesos,\n" +
                    "   (SELECT count(1) FROM dg3861.PW_LOGINS ) logins\n" +
                    " FROM QRESUMEN\n" +
                    "  GROUP BY usuarios, activos, tickets");
        
        
         while (ParamD.next())
                {
                      usuarios = ParamD.getInt(1);
                      activos = ParamD.getInt(2);
                      tickets = ParamD.getInt(3);
                      cerrados = ParamD.getInt(4);
                      procesos = ParamD.getInt(5);
                      logins = ParamD.getInt(6);
                          
                }
        
        
        ParamD.close();
        
 
        
        try {
            conectar.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void logOut(){
        try {
            Date fecha1 = new Date ();  
            DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            
            System.out.println("UPDATE PW_LOGINS SET FECHA_LOGOUT= '"+df.format(fecha1)+"', activo='NO' WHERE USUARIO ='"+username+"' AND FECHA_LOGIN='"+df.format(fecha)+"'");
            
            Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
            conectar.ejecutarQuery("UPDATE PW_LOGINS  SET FECHA_LOGOUT= '"+df.format(fecha1)+"', activo='NO' WHERE USUARIO ='"+username+"' AND FECHA_LOGIN='"+df.format(fecha)+"'");
            conectar.con.close();
            
            String ruta = MyUtil.baseUrl();
           // RequestContext contex =RequestContext.getCurrentInstance();
           PrimeFaces context = PrimeFaces.current();
            
            
            
            FacesContext facesContex = FacesContext.getCurrentInstance();
            
            HttpSession session = (HttpSession) facesContex.getExternalContext().getSession(false);
            session.invalidate();
            
            System.out.println("de salida: "+ ruta);
            //contex.addCallbackParam("LoggetOut", true);
            //contex.addCallbackParam("ruta", ruta);
            
             context.ajax().addCallbackParam("LoggetOut",true);             
             context.ajax().addCallbackParam("ruta",ruta);
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
       public void LostPass(ActionEvent actionEvent) throws SQLException, MessagingException, NamingException, URISyntaxException, Exception {
         
        FacesContext context = FacesContext.getCurrentInstance();
        //context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_FATAL, "El correo electronico no es correcto", "hola mundo 1"));
        
        String email=null;
        String user=null;
        
        boolean emailOk=false;
        boolean userOk=false;
        
        int contador=0;
        
        Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
       // Herramientas.Conexion_DS_GLDC conectar = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
        
        ResultSet rSet=conectar.ejecutarQuery("SELECT USUARIO,EMAIL FROM PW_USUARIO WHERE USUARIO='"+usernamePass+"'");
        
        //System.out.println("contador:"+contador);
        
        while(rSet.next()){
            user=rSet.getString("USUARIO");       
            email=rSet.getString("EMAIL");                 
           contador++;
        }
        
        if (contador==0){
            user="";
            email="";
        }
     
        if(email.equals(emailPass)){
            //System.out.println("Email igual");  
            emailOk=true;
        }else{
            //System.out.println("Email diferente");        
            context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_FATAL, "El correo electronico no es correcto", "hola mundo 1"));
        }
        
        if(user.equals(usernamePass)){
            //System.out.println("Email igual");        
            userOk=true;
        }else{
            //System.out.println("user diferente");        
            context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_FATAL, "El usuario no es correcto", "hola mundo 1"));
        }
        
        
        if (emailOk==true && userOk==true){
              ArrayList para= new ArrayList();
              ArrayList paraCc= new ArrayList();
              
              String cadena = getCadenaAlfanumAleatoria (8);
              
              
              context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_INFO, "En breve recibiras un correo electronico con tu nuevo Password", "hola mundo 1"));

              
              Herramientas.Conexion conn = new Herramientas.Conexion("DG3861_DGLDCSTG");
              //Herramientas.Conexion_DS_GLDC conn = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
              conn.ejecutarQuery("update PW_USUARIO set pass='"+cadena+"' where usuario='"+usernamePass+"'");
              conn.con.commit();
              conn.con.close();
              
                        //mail.setPriority("X-Priority", "1");
                        
                         java.util.Date date = new java.util.Date();
                         java.text.SimpleDateFormat dt1 = new java.text.SimpleDateFormat("yyyy-MM-dd");
                         String Receptores = usernamePass+"@att.com";

                        String titulo = "****** GLDC SYSTEM ---- CAMBIO DE PASSWORD*****";
                        String cuerpo = "  <pre align='left'>&nbsp;    </pre> "
                                + "<font face='trebuchet ms, Verdana, Helvetica, century gothic' size='2'>"
                                + "<p>Buen día:</p>  "
                                + "<p>Tu contraseña se ha restablecido:"
                                + "<p>"+cadena+""
                                + "<p>Será tu responsabilidad cambiarla en tu siguiente inicio de sesión"
                                + " </p>"                              
                                + " </p>Cualquier duda por revisalo con:"                                                     
                                + " </p>David Gonzalez, ext:2003 </p>"                              
                                + " <p>&nbsp;</p>";
                        
                       // ewsmail mails = new ewsmail(Receptores, cuerpo, titulo);
                        
                                
                        System.out.println("cadena aleatorio"+cadena);
                        campoUsername=true;
                        campoEmail=true;
                        botonDesac=true;
                        
        }

        conectar.con.close();
        
       
        
       
     }
      
          public void RecuperaPass(ActionEvent actionEvent) throws SQLException, NamingException{
        //String otro =  request.getParameter("variable1");
        
        final int MAX=8;     
// Specifying the number of uppercase letters in password
             final int MIN_Uppercase=1;
             // Specifying the minimum lowercase letters in password
             final int MIN_Lowercase=1;
             // Specifying the number of digits in a password
             final int NUM_Digits=1;
             // Specify the minimum number of special case letters
             final int Special=1;
             // Count number of uppercase letters in a password
             int uppercaseCounter=0;
             // Counter lowercase letters in a password
             int lowercaseCounter=0;
             // Count digits in a password
             int digitCounter=0;
             // count special case letters in a password
             int specialCounter=0;
             
         
        Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
        //Herramientas.Conexion_DS_GLDC conectar = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
        ResultSet rSet=conectar.ejecutarQuery("SELECT PASS FROM PW_USUARIO WHERE USUARIO='"+username+"'");
         
        FacesContext context = FacesContext.getCurrentInstance();
        
        String passTmp=null;
        while(rSet.next()){
            passTmp=rSet.getString("PASS");
        }
             
            
        if(!passTmp.equals(passwordActual)){
            
            context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Tu contraseña actual no coincide", ""));
        
        }else{
            
            Scanner input = new Scanner(lostPasss);
            String passw2 = input.nextLine();
            System.out.println(lostPasss);
        
         for (int i=0; i < passw2.length(); i++ ) {
                    char c = passw2.charAt(i);
                    if(Character.isUpperCase(c)) 
                          uppercaseCounter++;
                    else if(Character.isLowerCase(c)) 
                          lowercaseCounter++;
                    else if(Character.isDigit(c)) 
                          digitCounter++;     
                     if(c>=33&&c<=46||c==64){
                      specialCounter++;
                  }
                    
             }
         
        //  System.out.println("May"+uppercaseCounter);
        //  System.out.println("Min"+lowercaseCounter);
        //  System.out.println("Numero"+digitCounter);
        //  System.out.println("Especial"+specialCounter);
            
             if (passw2.length() >= MAX && uppercaseCounter >= MIN_Uppercase 
&& lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special) { 
                    System.out.println("Valid Password");
             
             
            System.out.println("username: "+username);
            System.out.println("lostPass: "+lostPasss);
            System.out.println("pasTmp: "+passTmp);
            System.out.println("lostPass: "+lostPasss);
           
            //Herramientas.Conexion_DS_GLDC conn = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
            Herramientas.Conexion conn = new Herramientas.Conexion("DG3861_DGLDCSTG");
            conn.ejecutarQuery("update pw_usuario set pass='"+lostPasss+"' where usuario='"+username+"'");
            conn.con.commit();
            conn.con.close();
     
            context.addMessage ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO, "Tu password fué cambiado con éxito", "")); 
            
             }
             else {
                  System.out.println("Su contraseña no contiene lo siguiente: ");
   context.addMessage ("idspecified", new FacesMessage(FacesMessage.SEVERITY_WARN, "Info", "Su contraseña no contiene lo siguiente:")); 
 
                    if(lostPasss.length() < MAX){
                         // System.out.println(" Al menos 8 carácteres");
                          context.addMessage ("idspecified", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Al menos 8 carácteres"));
                    }
                    if (lowercaseCounter < MIN_Lowercase) {
                          //System.out.println("Letras minúsculas mínimas");
                          context.addMessage ("idspecified", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Al menos 1 letra minúscula"));
                    }
                    if (uppercaseCounter < MIN_Uppercase) {
                          //System.out.println("Letras mayúsculas mínimas");
                          context.addMessage ("idspecified", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Al menos 1 letra mayúsculas"));
                    }
                    if(digitCounter < NUM_Digits) {
                          //System.out.println("Número mínimo de dígitos numéricos");
                          context.addMessage ("idspecified", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Al menos 1 dígito numérico"));
                    }
                    if(specialCounter < Special){
                        //System.out.println("La contraseña debe contener al menos 1 carácter especial");
                        context.addMessage ("idspecified", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "La contraseña debe contener al menos 1 carácter especial"));
                    }
                    
                    
                    
             }
            
        }
            
        

        
        //context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_INFO, "Tu password fué cambiado con éxito", ""));
       
        passActual =true;
        pass1Desac = true;
        pass2Desac = true;
        botonDesactivado = true;
       
       
     }
    
    public void MostrarCampos (ActionEvent actionEvent){
        
        System.out.println("Entre al metodo de mostar campos");
        passActual=false;
        pass1Desac = false;
        pass2Desac = false;
        botonDesactivado = false;
    
    }
    
     
     public void upload(FileUploadEvent event) throws SQLException, IOException, NamingException {  

       FacesContext context = FacesContext.getCurrentInstance();    
        // Do what you want with the file
        //copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
         
        
        context.addMessage("MensajitoB", new FacesMessage(FacesMessage.SEVERITY_INFO, "Tu imagen fué cambiada con éxito y lo veras reflejado en tu próximo inicio de sesión", ""));

    }  
     
     
     public void muestracontacto(String user){
         System.out.println("entrra"+user);
         
         
     }

    public void copyFile(String fileName, InputStream in) throws SQLException, NamingException {
           try {
                Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY) ;
                int minuto = calendario.get(Calendar.MINUTE);
                int segundo = calendario.get(Calendar.SECOND);
                
                //System.out.println("hora:"+hora);
                //System.out.println("minuto:"+minuto);
                //System.out.println("segundo:"+segundo);
                
                
             
                // write the inputStream to a FileOutputStream
                OutputStream out = new FileOutputStream(new File(destination + username + "_" +Integer.toString(hora)+ Integer.toString(minuto) + Integer.toString(segundo)+ ".jpg"));
             
                int read = 0;
                byte[] bytes = new byte[1024];
             
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
             
                 //System.out.println("usuario:"+username);
                 Herramientas.Conexion conn = new Herramientas.Conexion("DG3861_DGLDCSTG");
                 //Herramientas.Conexion_DS_GLDC conn = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
                
                 conn.ejecutarQuery("update PW_USUARIO set foto='"+username+ "_" +Integer.toString(hora)+ Integer.toString(minuto) + Integer.toString(segundo)+"'\n" +
                                           "where usuario='"+username+"'");
          
                 //System.out.println("hice el insert");
                conn.con.commit();
                
                conn.con.close();
                
                
                in.close();
                out.flush();
                out.close();
             
                System.out.println("File_name:"+fileName);
                
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }

     
    
    String getCadenaAlfanumAleatoria(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        cadenaAleatoria= cadenaAleatoria+"&";
        return cadenaAleatoria;
    }
    
}
