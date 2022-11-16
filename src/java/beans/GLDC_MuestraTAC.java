/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;



import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
@Named(value = "gldctactabla")

public class GLDC_MuestraTAC implements Serializable{

    private Date fechainicial = null;
    private Date fechafinal = null;
    private String vpanel="false";
    private String tacin="";
    private String nombrearchivo="Reporte_EM";

    String TAC,MARKETING_NAME,MANUFACTURER,BANDS,ALLOCATION_DATE,BRAND_NAME,MODEL_NAME,OPERATING_SYSTEM,BLUETOOTH,WLAN,DEVICE_TYPE,OEM ;
    
    
    
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

    public String getNombrearchivo() {
        return nombrearchivo;
    }

    public void setNombrearchivo(String nombrearchivo) {
        this.nombrearchivo = nombrearchivo;
    }

    public String getTacin() {
        return tacin;
    }

    public void setTacin(String tacin) {
        this.tacin = tacin;
    }

    public String getTAC() {
        return TAC;
    }

    public void setTAC(String TAC) {
        this.TAC = TAC;
    }

    public String getMARKETING_NAME() {
        return MARKETING_NAME;
    }

    public void setMARKETING_NAME(String MARKETING_NAME) {
        this.MARKETING_NAME = MARKETING_NAME;
    }

    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    public void setMANUFACTURER(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;
    }

    public String getBANDS() {
        return BANDS;
    }

    public void setBANDS(String BANDS) {
        this.BANDS = BANDS;
    }

    public String getALLOCATION_DATE() {
        return ALLOCATION_DATE;
    }

    public void setALLOCATION_DATE(String ALLOCATION_DATE) {
        this.ALLOCATION_DATE = ALLOCATION_DATE;
    }

    public String getBRAND_NAME() {
        return BRAND_NAME;
    }

    public void setBRAND_NAME(String BRAND_NAME) {
        this.BRAND_NAME = BRAND_NAME;
    }

    public String getMODEL_NAME() {
        return MODEL_NAME;
    }

    public void setMODEL_NAME(String MODEL_NAME) {
        this.MODEL_NAME = MODEL_NAME;
    }

    public String getOPERATING_SYSTEM() {
        return OPERATING_SYSTEM;
    }

    public void setOPERATING_SYSTEM(String OPERATING_SYSTEM) {
        this.OPERATING_SYSTEM = OPERATING_SYSTEM;
    }

    public String getBLUETOOTH() {
        return BLUETOOTH;
    }

    public void setBLUETOOTH(String BLUETOOTH) {
        this.BLUETOOTH = BLUETOOTH;
    }

    public String getWLAN() {
        return WLAN;
    }

    public void setWLAN(String WLAN) {
        this.WLAN = WLAN;
    }

    public String getDEVICE_TYPE() {
        return DEVICE_TYPE;
    }

    public void setDEVICE_TYPE(String DEVICE_TYPE) {
        this.DEVICE_TYPE = DEVICE_TYPE;
    }

    public String getOEM() {
        return OEM;
    }

    public void setOEM(String OEM) {
        this.OEM = OEM;
    }

    
    
 
    public GLDC_MuestraTAC() {
        
    }
    
    public void consultaquery(String username)
    {
        try {
            
            Date date = new Date();
            System.out.println("["+username+"]Consulta TAC:"+date);
            ResultSet rSet;
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
            DateFormat formatt = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");
            nombrearchivo="ReporteEM_";
            nombrearchivo=nombrearchivo.concat(formatt.format(date));
            int cont=0;
            
            //formatter.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
            
            String query="SELECT TAC,"
                    + "MARKETING_NAME,"
                    + "MANUFACTURER,"
                    + "BANDS,"
                    + "ALLOCATION_DATE,"
                    + "BRAND_NAME,"
                    + "MODEL_NAME,"
                    + "OPERATING_SYSTEM,"
                    + "BLUETOOTH,"
                    + "WLAN,"
                    + "DEVICE_TYPE,"
                    + "OEM \n" +
                            "FROM PW_CAT_TAC\n" +
                            "WHERE tac=  substr('"+tacin+"',1,8)";
                                    
            //System.out.println(query);
            
            Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");           
            rSet = conectar.ejecutarQuery(query);
         
    
            
            
            while (rSet.next()) {
            vpanel="true";    
                TAC=rSet.getString(1);
                MARKETING_NAME=rSet.getString(2);
                MANUFACTURER=rSet.getString(3);
                BANDS=rSet.getString(4);
                ALLOCATION_DATE=rSet.getString(5);
                BRAND_NAME=rSet.getString(6);
                MODEL_NAME=rSet.getString(7);
                OPERATING_SYSTEM=rSet.getString(8);
                BLUETOOTH=rSet.getString(9);
                WLAN=rSet.getString(10);
                DEVICE_TYPE=rSet.getString(11);
                OEM =rSet.getString(12);
                
                
                cont++;
            }
            
            conectar.con.close();
            
             FacesContext context = FacesContext.getCurrentInstance();
            if (cont>0)
            {
                  context.addMessage(null, new FacesMessage("Se encontraron ",  ""+cont+" resultados") );
                   
            }
            else {
                 context.addMessage(null, new FacesMessage("NO se encontraron  resultados") );
                 TAC="";MARKETING_NAME="";MANUFACTURER="";BANDS="";ALLOCATION_DATE="";BRAND_NAME="";MODEL_NAME="";
                   OPERATING_SYSTEM="";BLUETOOTH="";WLAN="";DEVICE_TYPE="";OEM="";
                   vpanel="false";
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_MuestraTAC.class.getName()).log(Level.SEVERE, null, ex);
              FacesContext context = FacesContext.getCurrentInstance();
           context.addMessage(null, new FacesMessage("Error en BD",  ""+ex+" ") );
           
           
        }
    }
    
    //Para darle formato al excel a donde exporta
    /*
    public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        HSSFRow header = sheet.getRow(0);
        wb.setSheetName(0, "Informe_1");
                
         
        HSSFCellStyle cellStyle = wb.createCellStyle();  
        
        Font font = wb.createFont();
        font.setColor(HSSFColor.WHITE.index);
        
        
        cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);
        cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        cellStyle.setFont(font);
         
        for(int i=0; i < header.getPhysicalNumberOfCells();i++) {
            HSSFCell cell = header.getCell(i);
             
            cell.setCellStyle(cellStyle);
        }
    }*/
    
    
    
    
}
