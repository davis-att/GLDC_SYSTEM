/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import Queue.SP_Queue_Usuarios;
import clasesUtiles.SetPlayQueue_programacion;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;
import javax.faces.view.ViewScoped;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

@ManagedBean
@ViewScoped
@Named(value = "queue_progra")

public class GLDC_Queue_Programacion implements Serializable{


    String msisdn;
    List<SetPlayQueue_programacion> Progralist= new ArrayList<>(); ; 
    List<SetPlayQueue_programacion> filterProgralist= new ArrayList<>();

    private Date fechainicial = null;
    private Date fechafinal = null;
    private String vpanel="false";
    private String idprogel="";
    private String usuario="Todos";
    private String abilidialog="false";
    private String imagen="/resources/images/gldc/GLDC.png";
    private Date d_fechaini;
    private Date d_fechafin;
    private Date dc_fechaini;
    private Date dc_fechafin;
    private Boolean programulti=false;
    private List<String> lusuariosmp= new ArrayList();
    
    
    
    
    List<SP_Queue_Usuarios> usuarios= new ArrayList<>();
    private SP_Queue_Usuarios selectedUsuario;
    private List<String> lusuarios = new ArrayList<>();
    
    private ScheduleModel eventModel;
    private ScheduleModel lazyEventModel;
    private ScheduleEvent event = new DefaultScheduleEvent();
    
    
    
    @PostConstruct 
    public void GLDC_Queue_Programacion() {
        try {

            ResultSet rSet;
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
            DateFormat formatt = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");
          

            Progralist.clear();
            filterProgralist.clear();
            eventModel = new DefaultScheduleModel();

           
            String query="SELECT a.ID_PROG||'.'||a.id_usuario||'.'||b.nombre nombre, a.ID_USUARIO, a.FECHA_INICIAL, a.FECHA_FINAL, \n" +
                    "		a.HORA_COMIDA_INICIO, a.HORA_COMIDA_FIN, a.ID_PROG, b.nombre nombre  \n" +
                    "	FROM dg3861.PW_QUEUE_PROGRAMACION a\n" +
                    "	LEFT JOIN dg3861.PW_QUEUE_USUARIO  b\n" +
                    "		ON a.ID_USUARIO = b.ID_USUARIO\n" +
                    "WHERE a.FECHA_REGISTRO > SYSDATE -31		\n" +
                    "ORDER BY ID_PROG DESC";

      
            Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");           
            rSet = conectar.ejecutarQuery(query);
            
            
            
            
            while (rSet.next()) {
                //System.out.println("hola mundo:"+rSet.getString(1));                                
              
                 SetPlayQueue_programacion datos = new SetPlayQueue_programacion(
                        rSet.getInt(7),rSet.getString(8), rSet.getString(3), rSet.getString(4), rSet.getString(5),rSet.getString(6));
                Progralist.add(datos);
                filterProgralist.add(datos);
                
                
               agregaevento(rSet.getString(1), rSet.getString(3),rSet.getString(4), "normal");
               agregaevento(rSet.getString(1), rSet.getString(5),rSet.getString(6), "comida");
                 
              //  eventModel.addEvent(new DefaultScheduleEvent(rSet.getString(1), formatter.parse(rSet.getString(3)), formatter.parse(rSet.getString(4)), "normal"));
              //  eventModel.addEvent(new DefaultScheduleEvent(rSet.getString(1), formatter.parse(rSet.getString(5)), formatter.parse(rSet.getString(6)),"comida"));

            }
            
            query="SELECT id_usuario||'.'||nombre nombre, imagen,usuario FROM dg3861.pw_queue_usuario WHERE id_rol IN ('1','2','3','4')";
            rSet = conectar.ejecutarQuery(query);
            lusuarios.clear();
             while (rSet.next()) {
              //System.out.println("hola mundo:"+rSet.getString(1));
                  SP_Queue_Usuarios datos = new SP_Queue_Usuarios(rSet.getString(1),rSet.getString(2),rSet.getString(3));
                                                                       
                usuarios.add(datos);
                lusuarios.add(rSet.getString(1));

            }
            
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se mostraran 31 dias de información."));
            
            conectar.con.close();
            
           // GLDC_BitacoraViewBean ejemplo = new GLDC_BitacoraViewBean();
           // ejemplo.CargaBitacora();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_Programacion.class.getName()).log(Level.SEVERE, null, ex);
              FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, new FacesMessage("Error en BD",  ""+ex+" ") );
           
           
        }
        
        
        
    }
    
    
     public void agregaevento(String titulo, String sfij, String sffj, String noc ) {
            
        try {
            Date fini, ffin;
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateFormat formatt = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");
            fini=formatter.parse(sfij);
            ffin=formatter.parse(sffj);
            LocalDateTime idt = LocalDateTime.ofInstant(fini.toInstant(), ZoneId.systemDefault());
            LocalDateTime fdt = LocalDateTime.ofInstant(ffin.toInstant(), ZoneId.systemDefault());
            eventModel.addEvent(DefaultScheduleEvent.builder()
                    .title(titulo)
                    .startDate(idt)
                    .endDate(fdt).description(noc).build());
          
        } catch (ParseException ex) {
            Logger.getLogger(GLDC_Queue_Programacion.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    

     public void actualizaschedule() {
           
         try{
         ResultSet rSet;
           Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
           DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
           
           
            
              String query="SELECT a.ID_PROG||'.'||a.id_usuario||'.'||b.nombre nombre, a.ID_USUARIO, a.FECHA_INICIAL, a.FECHA_FINAL, \n" +
                "		a.HORA_COMIDA_INICIO, a.HORA_COMIDA_FIN, a.ID_PROG, b.nombre nombre  \n" +
                "	FROM dg3861.PW_QUEUE_PROGRAMACION a\n" +
                "	LEFT JOIN dg3861.PW_QUEUE_USUARIO  b\n" +
                "		ON a.ID_USUARIO = b.ID_USUARIO\n" +
                "ORDER BY ID_PROG DESC";
            
             rSet = con.ejecutarQuery(query);
            
            Progralist.clear();
            filterProgralist.clear();
            eventModel = new DefaultScheduleModel();
            
            
            while (rSet.next()) {
                //System.out.println("Actualiza schedule:"+rSet.getString(1));                                
              
                 SetPlayQueue_programacion datos2 = new SetPlayQueue_programacion(
                        rSet.getInt(7),rSet.getString(8), rSet.getString(3), rSet.getString(4), rSet.getString(5),rSet.getString(6));
                Progralist.add(datos2);
                filterProgralist.add(datos2);
                
                 agregaevento(rSet.getString(1), rSet.getString(3),rSet.getString(4), "normal");
                 agregaevento(rSet.getString(1), rSet.getString(5),rSet.getString(6), "comida");
                
                //eventModel.addEvent(new DefaultScheduleEvent(rSet.getString(1), formatter.parse(rSet.getString(3)), formatter.parse(rSet.getString(4)),"normal"));
                //eventModel.addEvent(new DefaultScheduleEvent(rSet.getString(1), formatter.parse(rSet.getString(5)), formatter.parse(rSet.getString(6)),"comida"));

            }
            
               con.con.close();
               
               
      
     }  catch (SQLException ex) {
            System.out.println("Error al actualizar schedule:"+ex);
            FacesMessage msg = new FacesMessage("Error al actualizar schedule:"+ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
     }
        
        
        
    
    public void onRowEdit(RowEditEvent event) {
        boolean band = true; 
         try {
            
            //System.out.println(event.getObject());
            SetPlayQueue_programacion datos = (SetPlayQueue_programacion) event.getObject();
           // System.out.println(datos.getId_prog()+" "+datos.getFecha_final());
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
            
            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

             String update  =   "UPDATE dg3861.PW_QUEUE_PROGRAMACION\n" +
                "SET \n" +
                "ID_USUARIO= (SELECT id_usuario FROM dg3861.PW_QUEUE_USUARIO WHERE NOMBRE = '"+datos.getId_usuario()+"' )\n" +
                ",FECHA_INICIAL=TIMESTAMP'"+datos.getFecha_inicial()+"'\n" +
                ",FECHA_FINAL=TIMESTAMP'"+datos.getFecha_final()+"' \n" +
                ",HORA_COMIDA_INICIO=TIMESTAMP'"+datos.getFecha_incialc()+"' \n" +
                ",HORA_COMIDA_FIN=TIMESTAMP'"+datos.getFecha_finalc()+"'\n" +
                "WHERE ID_PROG = "+datos.getId_prog()+"";  
                
           
            //System.out.println(update);
            
            rSet = con.ejecutarQuery(update);
            
            
               con.con.close();
            
             actualizaschedule();  
               
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));
         
        } catch (SQLException ex) {
            System.out.println("Error al actualizar:"+ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:"+ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            band = false; 
        } 
         if(band){
             FacesMessage msg = new FacesMessage("Actualización Exitosa");
             FacesContext.getCurrentInstance().addMessage(null, msg);
         }
        
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("No se realiza ningun cambio");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    
    public void valueChanged(ValueChangeEvent event) {
        try {
           // System.out.print("Nombre:"+usuario);
            
            if(!usuario.equals("Todos")){
                abilidialog="true";
            }
            else {
                abilidialog="false";
            }
            
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
            ResultSet rSet;
           
            String query="SELECT id_usuario, imagen FROM DG3861.pw_queue_usuario where id_usuario||'.'||nombre='"+usuario+"' ";
            
           // System.out.print("Nombre:"+query);
            Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");           
            rSet = conectar.ejecutarQuery(query);
            
                     
            while (rSet.next()) {
                
                imagen="/resources/images/gldc/"+rSet.getString(2);
                
            }
            
            
            
            Progralist.clear();
            filterProgralist.clear();
            eventModel.clear();
            eventModel = new DefaultScheduleModel();

            if(usuario.equals("Todos")){
                 query="SELECT a.ID_PROG||'.'||a.id_usuario||'.'||b.nombre nombre, a.ID_USUARIO, a.FECHA_INICIAL, a.FECHA_FINAL, \n" +
                "		a.HORA_COMIDA_INICIO, a.HORA_COMIDA_FIN, a.ID_PROG, b.nombre nombre  \n" +
                "	FROM dg3861.PW_QUEUE_PROGRAMACION a\n" +
                "	LEFT JOIN dg3861.PW_QUEUE_USUARIO  b\n" +
                "		ON a.ID_USUARIO = b.ID_USUARIO \n"
                         + "WHERE a.FECHA_REGISTRO > SYSDATE -31 " +
                "ORDER BY ID_PROG DESC";
                 imagen="/resources/images/gldc/GLDC.png";
            } else{
                  query="SELECT a.ID_PROG||'.'||a.id_usuario||'.'||b.nombre nombre, a.ID_USUARIO, a.FECHA_INICIAL, a.FECHA_FINAL, \n" +
                "		a.HORA_COMIDA_INICIO, a.HORA_COMIDA_FIN, a.ID_PROG, b.nombre nombre  \n" +
                "	FROM dg3861.PW_QUEUE_PROGRAMACION a\n" +
                "	LEFT JOIN dg3861.PW_QUEUE_USUARIO  b\n" +
                "		ON a.ID_USUARIO = b.ID_USUARIO\n"
                          + "WHERE a.FECHA_REGISTRO > SYSDATE -31 " +
                "AND a.id_usuario = "+usuario.substring( 0, usuario.indexOf("."))+"		\n" +
                "ORDER BY ID_PROG DESC";
            }
            

      
     
            Progralist.clear();
            
            rSet = conectar.ejecutarQuery(query);
            
           // System.out.println(query);
            
            while (rSet.next()) {
              
              
                 SetPlayQueue_programacion datos = new SetPlayQueue_programacion(
                        rSet.getInt(7),rSet.getString(8), rSet.getString(3), rSet.getString(4), rSet.getString(5),rSet.getString(6));
                Progralist.add(datos);
                filterProgralist.add(datos);
                
                
                
               // eventModel.addEvent(new DefaultScheduleEvent(rSet.getString(1), formatter.parse(rSet.getString(3)), formatter.parse(rSet.getString(4))));
               // eventModel.addEvent(new DefaultScheduleEvent(rSet.getString(1), formatter.parse(rSet.getString(5)), formatter.parse(rSet.getString(6))));
               
               agregaevento(rSet.getString(1), rSet.getString(3),rSet.getString(4), "normal");
               agregaevento(rSet.getString(1), rSet.getString(5),rSet.getString(6), "comida");

            }
            
            
            conectar.con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_Programacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
        //Metodos control de calendario.
    public void addEvent(ActionEvent actionEvent) {
        boolean band = false;
        Format sF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        try {
           // System.out.println("addEvent"+dc_fechaini+programulti);
           // System.out.println("addEvent"+dc_fechafin);
           // System.out.println("usuario"+usuario);
            
            //String pattern = "yyyy/MM/dd HH:mm:ss";
            DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            
            
            if( !(d_fechaini == null) )
            {
            band = true;    
            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            
          // System.out.println("usuario:"+usuario+" "+d_fechaini+" "+d_fechafin+" "+dc_fechaini+" "+dc_fechafin);
            
            String insert  =   " INSERT INTO DG3861.PW_QUEUE_PROGRAMACION(id_usuario,fecha_inicial, fecha_final,hora_comida_inicio,hora_comida_fin,  fecha_registro  )  \n" +
            "		VALUES ("+usuario.substring( 0, usuario.indexOf("."))+",TIMESTAMP'"+dF.format(d_fechaini)+"',TIMESTAMP'"+dF.format(d_fechafin)+"',TIMESTAMP'"+dF.format(dc_fechaini)+"',TIMESTAMP'"+dF.format(dc_fechafin)+"', sysdate)";  
                
           
           // System.out.println(insert);
            
            rSet = con.ejecutarQuery(insert);
            
            if (programulti)
                {
                    
                     for(int i=0; i < lusuariosmp.size(); i++)
                {                    
                    // System.out.println(lusuariosmp.get(i));
                      if (!usuario.equals(lusuariosmp.get(i)))
                         // System.out.println("inserta: "+lusuariosmp.get(i));
                          
                      insert  =   " INSERT INTO DG3861.PW_QUEUE_PROGRAMACION(id_usuario,fecha_inicial, fecha_final,hora_comida_inicio,hora_comida_fin,  fecha_registro  )  \n" +
                      "		VALUES ("+lusuariosmp.get(i).substring( 0, lusuariosmp.get(i).indexOf("."))+",TIMESTAMP'"+dF.format(d_fechaini)+"',TIMESTAMP'"+dF.format(d_fechafin)+"',TIMESTAMP'"+dF.format(dc_fechaini)+"',TIMESTAMP'"+dF.format(dc_fechafin)+"', sysdate)";  
          
                      rSet = con.ejecutarQuery(insert);  
                      
                       //eventModel.addEvent(new DefaultScheduleEvent(lusuariosmp.get(i), d_fechaini, d_fechafin, "normal"));           
                       //eventModel.addEvent(new DefaultScheduleEvent(lusuariosmp.get(i), dc_fechaini, dc_fechafin, "comida"));
                       
                        agregaevento(lusuariosmp.get(i), sF.format(d_fechaini),sF.format(d_fechafin), "normal");
                        agregaevento(lusuariosmp.get(i), sF.format(dc_fechaini),sF.format(dc_fechafin), "comida");
                      
                }
                    
                }
            
            
            
            
            con.con.close();
            }
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));
         
        } catch (SQLException ex) {
            System.out.println("Error al insertar:"+ex);
            FacesMessage msg = new FacesMessage("Error al insertar:"+ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            band=false;
        }
      
        if(band){
             //  eventModel.addEvent(new DefaultScheduleEvent(usuario, d_fechaini, d_fechafin, "normal"));           
             //  eventModel.addEvent(new DefaultScheduleEvent(usuario, dc_fechaini, dc_fechafin, "comida"));
             
             agregaevento(usuario, sF.format(d_fechaini),sF.format(d_fechafin), "normal");
             agregaevento(usuario, sF.format(dc_fechaini),sF.format(dc_fechafin), "comida");
             
               usuario="Todos";
               d_fechaini=null;
               d_fechafin=null;
               dc_fechaini=null;
               dc_fechafin=null;
               programulti=false;
               lusuariosmp.clear();
               
               FacesMessage msg = new FacesMessage("Programación Exitosa!!!!!");
               FacesContext.getCurrentInstance().addMessage(null, msg);
               actualizaschedule();
        }
        
        
    }

    
    public void deleteEvent(ActionEvent actionEvent) {
        boolean band = true;
        try {
                       
            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            
           
            String delete  =   " DELETE DG3861.PW_QUEUE_PROGRAMACION WHERE ID_PROG="+idprogel+"";          
            //System.out.println(delete);
            
            rSet = con.ejecutarQuery(delete);
            
              
            con.con.close();
            
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));
         
        } catch (SQLException ex) {
            System.out.println("Error al elimiar registro:"+ex);
            FacesMessage msg = new FacesMessage("Error al elimiar registro:"+ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            band=false;
        }
      
        if(band){

               FacesMessage msg = new FacesMessage("El registro "+idprogel+" se borro ok!!!!!");
               FacesContext.getCurrentInstance().addMessage(null, msg);
               actualizaschedule();
        }
        
        
    }    
    
    
    public void onEventSelect(SelectEvent selectEvent){
         //   System.out.println("onEventSelect");

        System.out.println("onEventSelect:" + event.getId());
        System.out.println("onEventSelect:" + event.getTitle());
        

      

    }

    public void onDateSelect(SelectEvent selectEvent) {
          System.out.println("onDateSelect");
        

    }

    public void onEventMove(ScheduleEntryMoveEvent event){

       // System.out.println("Move");
        //System.out.println("onEventMove:" + event.getScheduleEvent().getId());
        //System.out.println("onEventMove:" + event.getScheduleEvent().getTitle());
        
       

        
        

    }

        public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow header = sheet.getRow(0);
        wb.setSheetName(0, "QueueP1");
                
         
        HSSFCellStyle cellStyle = wb.createCellStyle();  

        Font font = wb.createFont();
        Font headerFont = wb.createFont();
        headerFont.setColor(IndexedColors.WHITE.index);
        
        CellStyle headerCellStyle = sheet.getWorkbook().createCellStyle();
        
         headerCellStyle.setFillForegroundColor(IndexedColors.GREY_50_PERCENT.index);
  // and solid fill pattern produces solid grey cell fill
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
         headerCellStyle.setFont(headerFont);
        
        
       // cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);
       // cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        cellStyle.setFont(font);
         
        for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
            
            //if (i == 0) 
            
            
            HSSFCell cell = header.getCell(i);
             
            cell.setCellStyle(headerCellStyle);
        }
    }
    
    
    public void onEventResize(ScheduleEntryResizeEvent event){
       // System.out.println("Rezise");
       /*
         System.out.println("onEventMove:" + event.get);
          System.out.println("onEventMove:" + event.getScheduleEvent().getTitle());
     */
    }
    
    
    
    
        public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public List<SetPlayQueue_programacion> getProgralist() {
        return Progralist;
    }

    public void setProgralist(List<SetPlayQueue_programacion> Progralist) {
        this.Progralist = Progralist;
    }

    public List<SetPlayQueue_programacion> getFilterProgralist() {
        return filterProgralist;
    }

    public void setFilterProgralist(List<SetPlayQueue_programacion> filterProgralist) {
        this.filterProgralist = filterProgralist;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

  
    
   

 

    public Date getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(Date fechainicial) {
        this.fechainicial = fechainicial;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getVpanel() {
        return vpanel;
    }

    public void setVpanel(String vpanel) {
        this.vpanel = vpanel;
    }

  

    public List<SP_Queue_Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<SP_Queue_Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public SP_Queue_Usuarios getSelectedUsuario() {
        return selectedUsuario;
    }

    public void setSelectedUsuario(SP_Queue_Usuarios selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<String> getLusuarios() {
        return lusuarios;
    }

    public void setLusuarios(List<String> lusuarios) {
        this.lusuarios = lusuarios;
    }

    public Date getD_fechaini() {
        return d_fechaini;
    }

    public void setD_fechaini(Date d_fechaini) {
        this.d_fechaini = d_fechaini;
    }

    public Date getD_fechafin() {
        return d_fechafin;
    }

    public void setD_fechafin(Date d_fechafin) {
        this.d_fechafin = d_fechafin;
    }

    public Date getDc_fechaini() {
        return dc_fechaini;
    }

    public void setDc_fechaini(Date dc_fechaini) {
        this.dc_fechaini = dc_fechaini;
    }

    public Date getDc_fechafin() {
        return dc_fechafin;
    }

    public void setDc_fechafin(Date dc_fechafin) {
        this.dc_fechafin = dc_fechafin;
    }

   

    public ScheduleModel getEventModel() {
        return eventModel;
    }

    public void setEventModel(ScheduleModel eventModel) {
        this.eventModel = eventModel;
    }

    public ScheduleModel getLazyEventModel() {
        return lazyEventModel;
    }

    public void setLazyEventModel(ScheduleModel lazyEventModel) {
        this.lazyEventModel = lazyEventModel;
    }

    public ScheduleEvent getEvent() {
        return event;
    }

    public void setEvent(ScheduleEvent event) {
        this.event = event;
    }

    public Boolean getProgramulti() {
        return programulti;
    }

    public void setProgramulti(Boolean programulti) {
        this.programulti = programulti;
    }

    public List<String> getLusuariosmp() {
        return lusuariosmp;
    }

    public void setLusuariosmp(List<String> lusuariosmp) {
        this.lusuariosmp = lusuariosmp;
    }

    public String getIdprogel() {
        return idprogel;
    }

    public void setIdprogel(String idprogel) {
        this.idprogel = idprogel;
    }

    public String getAbilidialog() {
        return abilidialog;
    }

    public void setAbilidialog(String abilidialog) {
        this.abilidialog = abilidialog;
    }

    
    
  
    
}
