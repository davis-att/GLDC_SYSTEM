/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtiles;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author NMI16991
 */
public class SetPlayRPL implements Serializable {

    String ASUNTO, USUARIO_GLDC, FECHA_RECEPCIÓN_CORREO, PARAMETROS_BUSQUEDA, USUARIO_RPL, ACTIVIDAD_REALIZADA,
            MDN, FECHA_APERTURA, ESTATUS, UP_USR_GLDC_C, UP_FCIERRE, UP_ESTATUS, COMENTARIO, FECHA_CIERRE,
            FECHA_ENVIO_COREO;

    int ID_EVENT;
    int TOTAL_ABIERTOS, TOTAL_CERRADOS;

    public SetPlayRPL(int ID_EVENT, String ASUNTO, String USUARIO_GLDC, String FECHA_RECEPCIÓN_CORREO, String PARAMETROS_BUSQUEDA, String USUARIO_RPL, String ACTIVIDAD_REALIZADA, String MDN, String FECHA_APERTURA,
            String ESTATUS, String COMENTARIO, String FECHA_CIERRE, String FECHA_ENVIO_CORREO, String UP_USR_GLDC_C) {
        this.ASUNTO = ASUNTO;
        this.USUARIO_GLDC = USUARIO_GLDC;
        this.FECHA_RECEPCIÓN_CORREO = FECHA_RECEPCIÓN_CORREO;
        this.PARAMETROS_BUSQUEDA = PARAMETROS_BUSQUEDA;
        this.USUARIO_RPL = USUARIO_RPL;
        this.ACTIVIDAD_REALIZADA = ACTIVIDAD_REALIZADA;
        this.MDN = MDN;
        this.FECHA_APERTURA = FECHA_APERTURA;
        this.ID_EVENT = ID_EVENT;
        this.ESTATUS = ESTATUS;
        this.COMENTARIO = COMENTARIO;
        this.FECHA_CIERRE = FECHA_CIERRE;
        this.FECHA_ENVIO_COREO = FECHA_ENVIO_CORREO;
        this.UP_USR_GLDC_C = UP_USR_GLDC_C;

    }

    public SetPlayRPL(int TOTAL_ABIERTOS, int TOTAL_CERRADOS) {
        this.TOTAL_ABIERTOS = TOTAL_ABIERTOS;
        this.TOTAL_CERRADOS = TOTAL_CERRADOS;
    }

    public int getTOTAL_ABIERTOS() {
        return TOTAL_ABIERTOS;
    }

    public void setTOTAL_ABIERTOS(int TOTAL_ABIERTOS) {
        this.TOTAL_ABIERTOS = TOTAL_ABIERTOS;
    }

    public int getTOTAL_CERRADOS() {
        return TOTAL_CERRADOS;
    }

    public void setTOTAL_CERRADOS(int TOTAL_CERRADOS) {
        this.TOTAL_CERRADOS = TOTAL_CERRADOS;
    }

    public String getASUNTO() {
        return ASUNTO;
    }

    public void setASUNTO(String ASUNTO) {
        this.ASUNTO = ASUNTO;
    }

    public String getUSUARIO_GLDC() {
        return USUARIO_GLDC;
    }

    public void setUSUARIO_GLDC(String USUARIO_GLDC) {
        this.USUARIO_GLDC = USUARIO_GLDC;
    }

    public String getFECHA_RECEPCIÓN_CORREO() {
        return FECHA_RECEPCIÓN_CORREO;
    }

    public void setFECHA_RECEPCIÓN_CORREO(String FECHA_RECEPCIÓN_CORREO) {
        this.FECHA_RECEPCIÓN_CORREO = FECHA_RECEPCIÓN_CORREO;
    }

    public String getPARAMETROS_BUSQUEDA() {
        return PARAMETROS_BUSQUEDA;
    }

    public void setPARAMETROS_BUSQUEDA(String PARAMETROS_BUSQUEDA) {
        this.PARAMETROS_BUSQUEDA = PARAMETROS_BUSQUEDA;
    }

    public String getUSUARIO_RPL() {
        return USUARIO_RPL;
    }

    public void setUSUARIO_RPL(String USUARIO_RPL) {
        this.USUARIO_RPL = USUARIO_RPL;
    }

    public String getACTIVIDAD_REALIZADA() {
        return ACTIVIDAD_REALIZADA;
    }

    public void setACTIVIDAD_REALIZADA(String ACTIVIDAD_REALIZADA) {
        this.ACTIVIDAD_REALIZADA = ACTIVIDAD_REALIZADA;
    }

    public String getMDN() {
        return MDN;
    }

    public void setMDN(String MDN) {
        this.MDN = MDN;
    }

    public String getFECHA_APERTURA() {
        return FECHA_APERTURA;
    }

    public void setFECHA_APERTURA(String FECHA_APERTURA) {
        this.FECHA_APERTURA = FECHA_APERTURA;
    }

    public int getID_EVENT() {
        return ID_EVENT;
    }

    public void setID_EVENT(int ID_EVENT) {
        this.ID_EVENT = ID_EVENT;
    }

   

    public String getESTATUS() {
        return ESTATUS;
    }

    public void setESTATUS(String ESTATUS) {
        this.ESTATUS = ESTATUS;
    }

    public String getUP_USR_GLDC_C() {
        return UP_USR_GLDC_C;
    }

    public void setUP_USR_GLDC_C(String UP_USR_GLDC_C) {
        this.UP_USR_GLDC_C = UP_USR_GLDC_C;
    }

    public String getUP_FCIERRE() {
        return UP_FCIERRE;
    }

    public void setUP_FCIERRE(String UP_FCIERRE) {
        this.UP_FCIERRE = UP_FCIERRE;
    }

    public String getUP_ESTATUS() {
        return UP_ESTATUS;
    }

    public void setUP_ESTATUS(String UP_ESTATUS) {
        this.UP_ESTATUS = UP_ESTATUS;
    }

    public String getCOMENTARIO() {
        return COMENTARIO;
    }

    public void setCOMENTARIO(String COMENTARIO) {
        this.COMENTARIO = COMENTARIO;
    }

    public String getFECHA_CIERRE() {
        return FECHA_CIERRE;
    }

    public void setFECHA_CIERRE(String FECHA_CIERRE) {
        this.FECHA_CIERRE = FECHA_CIERRE;
    }

    public String getFECHA_ENVIO_COREO() {
        return FECHA_ENVIO_COREO;
    }

    public void setFECHA_ENVIO_COREO(String FECHA_ENVIO_COREO) {
        this.FECHA_ENVIO_COREO = FECHA_ENVIO_COREO;
    }

}
