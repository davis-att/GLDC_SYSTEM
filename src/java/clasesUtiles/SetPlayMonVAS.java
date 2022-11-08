/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author mgalicia
 */
public class SetPlayMonVAS implements Serializable{
    String tfechauhora;
    String ttrafico;
    String tlimsup;
    String tliminf;
    String tsigno;
    String gfechauhora;
    String gtrafico;
    Double glimsup;
    Double gliminf;
    String mfechauhora;
    String mtrafico;
    String mlimsup;
    String mliminf;
    String mdesviacion;
    String moperador;
    String mhdist;
    String mutype;
    String msigno;
    
    public SetPlayMonVAS(String tfechauhora, String ttrafico, String tliminf, String tlimsup, String tsigno){
        this.tfechauhora=tfechauhora;
        this.ttrafico=ttrafico;
        this.tlimsup=tlimsup;
        this.tliminf=tliminf;
        this.tsigno=tsigno;
    }
    
   public SetPlayMonVAS(String gfechauhora, Double glimsup, Double gliminf){
        this.gfechauhora=gfechauhora;
        this.glimsup=glimsup;
        this.gliminf=gliminf;
    }

   public SetPlayMonVAS(String mfechauhora, String mtrafico, String mlimsup, String mliminf, String mdesviacion, String moperador, String mutype, String msigno, String mhdist){
        this.mfechauhora=mfechauhora;
        this.mlimsup=mlimsup;
        this.mliminf=mliminf;
        this.mtrafico=mtrafico;
        this.mdesviacion=mdesviacion;
        this.moperador=moperador;
        this.mutype=mutype;
        this.msigno=msigno;
        this.mhdist=mhdist;
        
        
    }

    public String getTfechauhora() {
        return tfechauhora;
    }

    public void setTfechauhora(String tfechauhora) {
        this.tfechauhora = tfechauhora;
    }

    public String getTtrafico() {
        return ttrafico;
    }

    public void setTtrafico(String ttrafico) {
        this.ttrafico = ttrafico;
    }

    public String getTlimsup() {
        return tlimsup;
    }

    public void setTlimsup(String tlimsup) {
        this.tlimsup = tlimsup;
    }

    public String getTliminf() {
        return tliminf;
    }

    public void setTliminf(String tliminf) {
        this.tliminf = tliminf;
    }

    public String getTsigno() {
        return tsigno;
    }

    public void setTsigno(String tsigno) {
        this.tsigno = tsigno;
    }

    public String getGfechauhora() {
        return gfechauhora;
    }

    public void setGfechauhora(String gfechauhora) {
        this.gfechauhora = gfechauhora;
    }

    public String getGtrafico() {
        return gtrafico;
    }

    public void setGtrafico(String gtrafico) {
        this.gtrafico = gtrafico;
    }

    public Double getGlimsup() {
        return glimsup;
    }

    public void setGlimsup(Double glimsup) {
        this.glimsup = glimsup;
    }

    public Double getGliminf() {
        return gliminf;
    }

    public void setGliminf(Double gliminf) {
        this.gliminf = gliminf;
    }

    public String getMfechauhora() {
        return mfechauhora;
    }

    public void setMfechauhora(String mfechauhora) {
        this.mfechauhora = mfechauhora;
    }

    public String getMtrafico() {
        return mtrafico;
    }

    public void setMtrafico(String mtrafico) {
        this.mtrafico = mtrafico;
    }

    public String getMlimsup() {
        return mlimsup;
    }

    public void setMlimsup(String mlimsup) {
        this.mlimsup = mlimsup;
    }

    public String getMliminf() {
        return mliminf;
    }

    public void setMliminf(String mliminf) {
        this.mliminf = mliminf;
    }

    public String getMdesviacion() {
        return mdesviacion;
    }

    public void setMdesviacion(String mdesviacion) {
        this.mdesviacion = mdesviacion;
    }

    public String getMoperador() {
        return moperador;
    }

    public void setMoperador(String moperador) {
        this.moperador = moperador;
    }

    public String getMhdist() {
        return mhdist;
    }

    public void setMhdist(String mhdist) {
        this.mhdist = mhdist;
    }

    public String getMutype() {
        return mutype;
    }

    public void setMutype(String mutype) {
        this.mutype = mutype;
    }

    public String getMsigno() {
        return msigno;
    }

    public void setMsigno(String msigno) {
        this.msigno = msigno;
    }


  
   
      
}
