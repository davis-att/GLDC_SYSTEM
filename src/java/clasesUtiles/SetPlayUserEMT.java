/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI16991
 */
public class SetPlayUserEMT implements Serializable {
 
       String NUM	
        ,NOMBRE	
        ,APELLIDOP	
        ,APELLIDOM	                  
        ,ATTID	
        ,TELEFONO	
        ,PUESTO	
        ,FECHA_REPORTE	
        ,LOCALIDAD	
        ,VP	
        ,AREA	
        ,JEFE_INMEDIATO	
        ,ACCIDENTE_TRABAJO	
        ,ACCIDENTE_TRAYECTO	
        ,ENFERMEDAD_PROFESIONAL	
        ,EJECUTIVO
        ;
                           


                
public SetPlayUserEMT(String  ATTID, String  NOMBRE,String  APELLIDOP,String  APELLIDOM,String  TELEFONO,String  PUESTO,String  AREA, String  VP,String  LOCALIDAD, String  JEFE_INMEDIATO, String NUM)
    {
            
            this.ATTID = ATTID;
            this.NOMBRE = NOMBRE;
            this.APELLIDOP = APELLIDOP;
            this.APELLIDOM = APELLIDOM;
            this.TELEFONO = TELEFONO;
            this.PUESTO = PUESTO;
            this.AREA  = AREA;
            this.VP = VP;
            this.LOCALIDAD = LOCALIDAD; 
            this.JEFE_INMEDIATO = JEFE_INMEDIATO; 
            this.NUM = NUM; 


    }

    public String getNUM() {
        return NUM;
    }

    public void setNUM(String NUM) {
        this.NUM = NUM;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOP() {
        return APELLIDOP;
    }

    public void setAPELLIDOP(String APELLIDOP) {
        this.APELLIDOP = APELLIDOP;
    }

    public String getAPELLIDOM() {
        return APELLIDOM;
    }

    public void setAPELLIDOM(String APELLIDOM) {
        this.APELLIDOM = APELLIDOM;
    }

    public String getATTID() {
        return ATTID;
    }

    public void setATTID(String ATTID) {
        this.ATTID = ATTID;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getPUESTO() {
        return PUESTO;
    }

    public void setPUESTO(String PUESTO) {
        this.PUESTO = PUESTO;
    }

    public String getFECHA_REPORTE() {
        return FECHA_REPORTE;
    }

    public void setFECHA_REPORTE(String FECHA_REPORTE) {
        this.FECHA_REPORTE = FECHA_REPORTE;
    }

    public String getLOCALIDAD() {
        return LOCALIDAD;
    }

    public void setLOCALIDAD(String LOCALIDAD) {
        this.LOCALIDAD = LOCALIDAD;
    }

    public String getVP() {
        return VP;
    }

    public void setVP(String VP) {
        this.VP = VP;
    }

    public String getAREA() {
        return AREA;
    }

    public void setAREA(String AREA) {
        this.AREA = AREA;
    }

    public String getJEFE_INMEDIATO() {
        return JEFE_INMEDIATO;
    }

    public void setJEFE_INMEDIATO(String JEFE_INMEDIATO) {
        this.JEFE_INMEDIATO = JEFE_INMEDIATO;
    }

    public String getACCIDENTE_TRABAJO() {
        return ACCIDENTE_TRABAJO;
    }

    public void setACCIDENTE_TRABAJO(String ACCIDENTE_TRABAJO) {
        this.ACCIDENTE_TRABAJO = ACCIDENTE_TRABAJO;
    }

    public String getACCIDENTE_TRAYECTO() {
        return ACCIDENTE_TRAYECTO;
    }

    public void setACCIDENTE_TRAYECTO(String ACCIDENTE_TRAYECTO) {
        this.ACCIDENTE_TRAYECTO = ACCIDENTE_TRAYECTO;
    }

    public String getENFERMEDAD_PROFESIONAL() {
        return ENFERMEDAD_PROFESIONAL;
    }

    public void setENFERMEDAD_PROFESIONAL(String ENFERMEDAD_PROFESIONAL) {
        this.ENFERMEDAD_PROFESIONAL = ENFERMEDAD_PROFESIONAL;
    }

    public String getEJECUTIVO() {
        return EJECUTIVO;
    }

    public void setEJECUTIVO(String EJECUTIVO) {
        this.EJECUTIVO = EJECUTIVO;
    }

   

    
}
