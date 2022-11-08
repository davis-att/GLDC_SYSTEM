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
public class SetPlayviewPDF implements Serializable {
 
       String NOMBRE_DOCUMENTO, VERSION, RUTA, DESCRIPCION, CATEGORIA, FECHA_ACTUALIZACION;
        
                           

public SetPlayviewPDF(	String NOMBRE_DOCUMENTO,String VERSION,String RUTA,String DESCRIPCION,String CATEGORIA,String FECHA_ACTUALIZACION)
{
    this.NOMBRE_DOCUMENTO = NOMBRE_DOCUMENTO;
	this.VERSION = VERSION;
	this.RUTA = RUTA;
	this.DESCRIPCION = DESCRIPCION;
	this.CATEGORIA = CATEGORIA;
	this.FECHA_ACTUALIZACION = FECHA_ACTUALIZACION;

}


    public SetPlayviewPDF() {
        
    }

    public String getNOMBRE_DOCUMENTO() {
        return NOMBRE_DOCUMENTO;
    }

    public void setNOMBRE_DOCUMENTO(String NOMBRE_DOCUMENTO) {
        this.NOMBRE_DOCUMENTO = NOMBRE_DOCUMENTO;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getRUTA() {
        return RUTA;
    }

    public void setRUTA(String RUTA) {
        this.RUTA = RUTA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public String getFECHA_ACTUALIZACION() {
        return FECHA_ACTUALIZACION;
    }

    public void setFECHA_ACTUALIZACION(String FECHA_ACTUALIZACION) {
        this.FECHA_ACTUALIZACION = FECHA_ACTUALIZACION;
    }
                

    
   

    
}
