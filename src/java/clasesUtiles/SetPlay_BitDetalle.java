/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesUtiles;

import java.io.Serializable;

/**
 *
 * @author NMI12906
 */
public class SetPlay_BitDetalle implements Serializable{
    
    String dt_service, dt_idevent, dt_iduser, dt_comment, dt_document, dt_date;
    
    public SetPlay_BitDetalle(String dt_service, String dt_idevent,
            String dt_iduser, String dt_comment,
            String dt_document, String dt_date) {

        this.dt_service = dt_service;
        this.dt_idevent = dt_idevent;
        this.dt_iduser = dt_iduser;
        this.dt_comment = dt_comment;
        this.dt_document = dt_document;
        this.dt_date = dt_date;
    }

    public String getDt_service() {
        return dt_service;
    }

    public void setDt_service(String dt_service) {
        this.dt_service = dt_service;
    }

    public String getDt_idevent() {
        return dt_idevent;
    }

    public void setDt_idevent(String dt_idevent) {
        this.dt_idevent = dt_idevent;
    }

    public String getDt_iduser() {
        return dt_iduser;
    }

    public void setDt_iduser(String dt_iduser) {
        this.dt_iduser = dt_iduser;
    }

    public String getDt_comment() {
        return dt_comment;
    }

    public void setDt_comment(String dt_comment) {
        this.dt_comment = dt_comment;
    }

    public String getDt_document() {
        return dt_document;
    }

    public void setDt_document(String dt_document) {
        this.dt_document = dt_document;
    }

    public String getDt_date() {
        return dt_date;
    }

    public void setDt_date(String dt_date) {
        this.dt_date = dt_date;
    }
    
       
}
