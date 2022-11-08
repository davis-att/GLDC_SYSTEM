/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NMI16991
 */
public class SetPlayGLDC_ADMIN implements Serializable {

         String USUARIO, ID_USUARIO, ROLL, PASS, NOMBRE_USUARIO, EMAIL, ESTADO, URL, DAPQ, DATOS, TELEFONIA, VAS, ALCANCE, ROAMING, 
                FECHA_CUMPLE, NO_EMPLEADO, PUESTO, FOTO, FECHA_REGISTRO, FECHA_MODIFICACION, CUENTA;
    
 public SetPlayGLDC_ADMIN(
          
         String USUARIO, 
         String ID_USUARIO, 
         String ROLL, 
         String PASS, 
         String NOMBRE_USUARIO, 
         String EMAIL, 
         String ESTADO, 
         String URL, 
         String DAPQ, 
         String DATOS, 
         String TELEFONIA, 
         String VAS, 
         String ALCANCE, 
         String ROAMING, 
         String FECHA_CUMPLE, 
         String NO_EMPLEADO, 
         String PUESTO, 
         String FOTO,
         String FECHA_REGISTRO,
         String FECHA_MODIFICACION,
         String CUENTA
         
    )
     {
        
                this.USUARIO = USUARIO; 
                this.ID_USUARIO =ID_USUARIO; 
                this.ROLL = ROLL; 
                this.PASS = PASS; 
                this.NOMBRE_USUARIO = NOMBRE_USUARIO; 
                this.EMAIL = EMAIL; 
                this.ESTADO = ESTADO; 
                this.URL= URL; 
                this.DAPQ = DAPQ; 
                this.DATOS = DATOS; 
                this.TELEFONIA = TELEFONIA; 
                this.VAS = VAS; 
                this.ALCANCE = ALCANCE; 
                this.ROAMING = ROAMING; 
                this.FECHA_CUMPLE = FECHA_CUMPLE; 
                this.NO_EMPLEADO = NO_EMPLEADO; 
                this.PUESTO = PUESTO; 
                this.FOTO = FOTO;
                this.FECHA_REGISTRO = FECHA_REGISTRO;
                this.FECHA_MODIFICACION = FECHA_MODIFICACION;
                this.CUENTA = CUENTA;
        
    } 


         String USUARIO2, ID_USUARIO2, ROLL2, PASS2, NOMBRE_USUARIO2, EMAIL2, ESTADO2, URL2, DAPQ2, DATOS2, TELEFONIA2, VAS2, ALCANCE2, ROAMING2, 
                FECHA_CUMPLE2, NO_EMPLEADO2, PUESTO2, FECHA_REGISTRO2, FECHA_MODIFICACION2;
    
 public SetPlayGLDC_ADMIN(
          
         String USUARIO2, 
         String ID_USUARIO2, 
         String ROLL2, 
         String PASS2, 
         String NOMBRE_USUARIO2, 
         String EMAIL2, 
         String ESTADO2, 
         String URL2, 
         String DAPQ2, 
         String DATOS2, 
         String TELEFONIA2, 
         String VAS2, 
         String ALCANCE2, 
         String ROAMING2, 
         String FECHA_CUMPLE2, 
         String NO_EMPLEADO2, 
         String PUESTO2, 
         String FECHA_REGISTRO2,
         String FECHA_MODIFICACION2
    )
     {
        
                this.USUARIO2 = USUARIO2; 
                this.ID_USUARIO2 =ID_USUARIO2; 
                this.ROLL2 = ROLL2; 
                this.PASS2 = PASS2; 
                this.NOMBRE_USUARIO2 = NOMBRE_USUARIO2; 
                this.EMAIL2 = EMAIL2; 
                this.ESTADO2 = ESTADO2; 
                this.URL2= URL2; 
                this.DAPQ2 = DAPQ2; 
                this.DATOS2 = DATOS2; 
                this.TELEFONIA2 = TELEFONIA2; 
                this.VAS2 = VAS2; 
                this.ALCANCE2 = ALCANCE2; 
                this.ROAMING2 = ROAMING2; 
                this.FECHA_CUMPLE2 = FECHA_CUMPLE2; 
                this.NO_EMPLEADO2 = NO_EMPLEADO2; 
                this.PUESTO2 = PUESTO2; 
               // this.FOTO2 = FOTO2;
                this.FECHA_REGISTRO2 = FECHA_REGISTRO2;
                this.FECHA_MODIFICACION2 = FECHA_MODIFICACION2;
        
    }

    public String getCUENTA() {
        return CUENTA;
    }

    public void setCUENTA(String CUENTA) {
        this.CUENTA = CUENTA;
    }
 
 
    public String getFECHA_MODIFICACION() {
        return FECHA_MODIFICACION;
    }

    public void setFECHA_MODIFICACION(String FECHA_MODIFICACION) {
        this.FECHA_MODIFICACION = FECHA_MODIFICACION;
    }

 
    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(String ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getROLL() {
        return ROLL;
    }

    public void setROLL(String ROLL) {
        this.ROLL = ROLL;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public String getNOMBRE_USUARIO() {
        return NOMBRE_USUARIO;
    }

    public void setNOMBRE_USUARIO(String NOMBRE_USUARIO) {
        this.NOMBRE_USUARIO = NOMBRE_USUARIO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDAPQ() {
        return DAPQ;
    }

    public void setDAPQ(String DAPQ) {
        this.DAPQ = DAPQ;
    }

    public String getDATOS() {
        return DATOS;
    }

    public void setDATOS(String DATOS) {
        this.DATOS = DATOS;
    }

    public String getTELEFONIA() {
        return TELEFONIA;
    }

    public void setTELEFONIA(String TELEFONIA) {
        this.TELEFONIA = TELEFONIA;
    }

    public String getVAS() {
        return VAS;
    }

    public void setVAS(String VAS) {
        this.VAS = VAS;
    }

    public String getALCANCE() {
        return ALCANCE;
    }

    public void setALCANCE(String ALCANCE) {
        this.ALCANCE = ALCANCE;
    }

    public String getROAMING() {
        return ROAMING;
    }

    public void setROAMING(String ROAMING) {
        this.ROAMING = ROAMING;
    }

    public String getFECHA_CUMPLE() {
        return FECHA_CUMPLE;
    }

    public void setFECHA_CUMPLE(String FECHA_CUMPLE) {
        this.FECHA_CUMPLE = FECHA_CUMPLE;
    }

    public String getNO_EMPLEADO() {
        return NO_EMPLEADO;
    }

    public void setNO_EMPLEADO(String NO_EMPLEADO) {
        this.NO_EMPLEADO = NO_EMPLEADO;
    }

    public String getPUESTO() {
        return PUESTO;
    }

    public void setPUESTO(String PUESTO) {
        this.PUESTO = PUESTO;
    }

    public String getFOTO() {
        return FOTO;
    }

    public void setFOTO(String FOTO) {
        this.FOTO = FOTO;
    }
    
    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    public String getUSUARIO2() {
        return USUARIO2;
    }

    public void setUSUARIO2(String USUARIO2) {
        this.USUARIO2 = USUARIO2;
    }

    public String getID_USUARIO2() {
        return ID_USUARIO2;
    }

    public void setID_USUARIO2(String ID_USUARIO2) {
        this.ID_USUARIO2 = ID_USUARIO2;
    }

    public String getROLL2() {
        return ROLL2;
    }

    public void setROLL2(String ROLL2) {
        this.ROLL2 = ROLL2;
    }

    public String getPASS2() {
        return PASS2;
    }

    public void setPASS2(String PASS2) {
        this.PASS2 = PASS2;
    }

    public String getNOMBRE_USUARIO2() {
        return NOMBRE_USUARIO2;
    }

    public void setNOMBRE_USUARIO2(String NOMBRE_USUARIO2) {
        this.NOMBRE_USUARIO2 = NOMBRE_USUARIO2;
    }

    public String getEMAIL2() {
        return EMAIL2;
    }

    public void setEMAIL2(String EMAIL2) {
        this.EMAIL2 = EMAIL2;
    }

    public String getESTADO2() {
        return ESTADO2;
    }

    public void setESTADO2(String ESTADO2) {
        this.ESTADO2 = ESTADO2;
    }

    public String getURL2() {
        return URL2;
    }

    public void setURL2(String URL2) {
        this.URL2 = URL2;
    }

    public String getDAPQ2() {
        return DAPQ2;
    }

    public void setDAPQ2(String DAPQ2) {
        this.DAPQ2 = DAPQ2;
    }

    public String getDATOS2() {
        return DATOS2;
    }

    public void setDATOS2(String DATOS2) {
        this.DATOS2 = DATOS2;
    }

    public String getTELEFONIA2() {
        return TELEFONIA2;
    }

    public void setTELEFONIA2(String TELEFONIA2) {
        this.TELEFONIA2 = TELEFONIA2;
    }

    public String getVAS2() {
        return VAS2;
    }

    public void setVAS2(String VAS2) {
        this.VAS2 = VAS2;
    }

    public String getALCANCE2() {
        return ALCANCE2;
    }

    public void setALCANCE2(String ALCANCE2) {
        this.ALCANCE2 = ALCANCE2;
    }

    public String getROAMING2() {
        return ROAMING2;
    }

    public void setROAMING2(String ROAMING2) {
        this.ROAMING2 = ROAMING2;
    }

    public String getFECHA_CUMPLE2() {
        return FECHA_CUMPLE2;
    }

    public void setFECHA_CUMPLE2(String FECHA_CUMPLE2) {
        this.FECHA_CUMPLE2 = FECHA_CUMPLE2;
    }

    public String getNO_EMPLEADO2() {
        return NO_EMPLEADO2;
    }

    public void setNO_EMPLEADO2(String NO_EMPLEADO2) {
        this.NO_EMPLEADO2 = NO_EMPLEADO2;
    }

    public String getPUESTO2() {
        return PUESTO2;
    }

    public void setPUESTO2(String PUESTO2) {
        this.PUESTO2 = PUESTO2;
    }

  

    public String getFECHA_REGISTRO2() {
        return FECHA_REGISTRO2;
    }

    public void setFECHA_REGISTRO2(String FECHA_REGISTRO2) {
        this.FECHA_REGISTRO2 = FECHA_REGISTRO2;
    }

    public String getFECHA_MODIFICACION2() {
        return FECHA_MODIFICACION2;
    }

    public void setFECHA_MODIFICACION2(String FECHA_MODIFICACION2) {
        this.FECHA_MODIFICACION2 = FECHA_MODIFICACION2;
    }

 
    
    
}

