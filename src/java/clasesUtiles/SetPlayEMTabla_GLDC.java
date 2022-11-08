/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI11915
 */
public class SetPlayEMTabla_GLDC implements Serializable{
    
     String ID_REGISTRO, NOMBRE, APELLIDOP, APELLIDOM, ATTID, TELEFONO, PUESTO, FECHA_REPORTE, LOCALIDAD, VP, AREA, JEFE_INMEDIATO, ACCIDENTE_TRABAJO, ACCIDENTE_TRAYECTO, ENFERMEDAD_PROFESIONAL, 
             EJECUTIVO,PREPORTA,NO_EMPLEADO;
                                  
    public SetPlayEMTabla_GLDC(String ID_REGISTRO, String NOMBRE, String APELLIDOP,String APELLIDOM,String ATTID, String TELEFONO,String PUESTO,String
            FECHA_REPORTE,String LOCALIDAD,String VP,String AREA,String JEFE_INMEDIATO,String ACCIDENTE_TRABAJO,String ACCIDENTE_TRAYECTO,String ENFERMEDAD_PROFESIONAL,
            String EJECUTIVO,String PREPORTA,String NO_EMPLEADO)
    {
            this.ID_REGISTRO = ID_REGISTRO;
            this.NOMBRE = NOMBRE;
            this.APELLIDOP = APELLIDOP;
            this.APELLIDOM = APELLIDOM;
            this.ATTID = ATTID;
            this.TELEFONO = TELEFONO;
            this.PUESTO = PUESTO;
            this.FECHA_REPORTE  = FECHA_REPORTE;
            this.LOCALIDAD = LOCALIDAD;
            this.VP = VP;
            this.AREA = AREA;            
            this.JEFE_INMEDIATO = JEFE_INMEDIATO;
            this.ACCIDENTE_TRABAJO = ACCIDENTE_TRABAJO;
            this.ACCIDENTE_TRAYECTO = ACCIDENTE_TRAYECTO;
            this.ENFERMEDAD_PROFESIONAL = ENFERMEDAD_PROFESIONAL;
            this.EJECUTIVO = EJECUTIVO;
            this.PREPORTA = PREPORTA;
            this.NO_EMPLEADO = NO_EMPLEADO;
    }

    public SetPlayEMTabla_GLDC() {
        
    }

    public String getID_REGISTRO() {
        return ID_REGISTRO;
    }

    public void setID_REGISTRO(String ID_REGISTRO) {
        this.ID_REGISTRO = ID_REGISTRO;
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

    public String getPREPORTA() {
        return PREPORTA;
    }

    public void setPREPORTA(String PREPORTA) {
        this.PREPORTA = PREPORTA;
    }

    public String getNO_EMPLEADO() {
        return NO_EMPLEADO;
    }

    public void setNO_EMPLEADO(String NO_EMPLEADO) {
        this.NO_EMPLEADO = NO_EMPLEADO;
    }

    
    
    
}
