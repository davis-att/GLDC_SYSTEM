/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clasesUtiles.SetPlayQueue_bancotrab;
import java.io.Serializable;
import static java.lang.Double.min;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.round;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
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
import javax.faces.view.ViewScoped;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;

import static org.apache.commons.lang3.StringUtils.leftPad;
import org.primefaces.PrimeFaces;
//import org.primefaces.context.RequestContext;

@ManagedBean
@ViewScoped
@Named(value = "queue_bancot")

public class GLDC_Queue_Bancotrabajo implements Serializable {

    @ManagedProperty(value = "#{loginBean}")
    private loginBean loginbean;

    List<SetPlayQueue_bancotrab> BancoT = new ArrayList<>();
    List<SetPlayQueue_bancotrab> filterBancoT = new ArrayList<>();
    SetPlayQueue_bancotrab selectedEventoBitacora = new SetPlayQueue_bancotrab();

    ArrayList token_ts = new ArrayList();
    ArrayList token_tsi = new ArrayList();
    ArrayList token_tsn = new ArrayList();
    ArrayList token_pr = new ArrayList();
    ArrayList token_fec = new ArrayList();
    ArrayList token = new ArrayList();
    ArrayList token_md = new ArrayList();
    ArrayList token_prc = new ArrayList();

    private Date fechainicial = null;
    private Date fechafinal = null;
    private String idprogel = "";
    private String usuario = "Todos";
    private List<String> lusuariosmp = new ArrayList();
    private String codigo = "";
    private String token_session = "";
    private boolean bandsesion = false;
    private int stiempo = 0;
    private int pooltiempof = 0;
    private boolean bpooltf = false;
    private int sol_atendidas = 0;
    private String sol_ultima = "sysdate";
    private int sol_urgente = 0;
    private int sol_abierta = 0;
    private String pendiente_idt = "";
    private String pendiente_por = "";

    @PostConstruct
    public void GLDC_Queue_Programacion() {

        Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
        String username = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userid");
        System.out.println("usruarrrrrrr:" + username);

        revisaconexion(username);

        try {

            ResultSet rSet;
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateFormat formatt = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");

            BancoT.clear();
            filterBancoT.clear();

            /*
           
            String query = "SELECT ID_QUEUE, ID_TOKEN, TICKET_NUMBER, C.NOMBRE_ESTATUS ,FECHA_ASIGNACION, FECHA_ESTATUS, FECHA_CIERRE, "
                    //+ "B.NOMBRE_PRIORIDAD, "
                    + "'P'|| A.ID_PRIORIDAD PRIORIDAD, "
                    + "C.COLORS,"
                    //+ "B.COLORP,"
                    + "CASE WHEN A.ID_PRIORIDAD = 1 THEN '#E74C3C'  ELSE '#D2B4DE' END COLORP  \n"
                    + "FROM ( SELECT * FROM PW_QUEUE_BITACTUAL WHERE ( FECHA_CIERRE IS NULL OR FECHA_ASIGNACION > sysdate -1) AND ID_USUARIO = (select  id_usuario  from pw_queue_usuario where usuario  = '"+username+"'))  A\n"
                    + "    LEFT JOIN PW_QUEUE_PRIORIDAD B\n"
                    + "     ON A.ID_PRIORIDAD = B.ID_PRIORIDAD \n"
                    + "	LEFT JOIN PW_QUEUE_ESTATUS C\n"
                    + "     ON A.ESTATUS  = C.ID_ESTATUS \n"
                    + "ORDER BY ID_TOKEN desc"; */
            String query = "SELECT ID_QUEUE, ID_TOKEN, TICKET_NUMBER, C.NOMBRE_ESTATUS ,FECHA_ASIGNACION, FECHA_ESTATUS, FECHA_CIERRE, "
                    //+ "B.NOMBRE_PRIORIDAD, "
                    + "'P'|| A.ID_PRIORIDAD PRIORIDAD, "
                    + "C.COLORS,"
                    //+ "B.COLORP,"
                    + "CASE WHEN A.ID_PRIORIDAD = 1 THEN '#E74C3C'  ELSE '#D2B4DE' END COLORP  \n"
                    + "FROM ( SELECT * FROM PW_QUEUE_BITACTUAL WHERE ( FECHA_CIERRE IS NULL OR FECHA_ASIGNACION > sysdate -1) AND ID_USUARIO = (select  id_usuario  from pw_queue_usuario where usuario  = '" + username + "'))  A\n"
                    + "    LEFT JOIN PW_QUEUE_PRIORIDAD B\n"
                    + "     ON A.ID_PRIORIDAD = B.ID_PRIORIDAD \n"
                    + "	LEFT JOIN PW_QUEUE_ESTATUS C\n"
                    + "     ON A.ESTATUS  = C.ID_ESTATUS \n"
                    + "ORDER BY FECHA_ASIGNACION desc";

            rSet = conectar.ejecutarQuery(query);

            while (rSet.next()) {
                // System.out.println("hola mundo:"+rSet.getString(1));                                

                SetPlayQueue_bancotrab datos = new SetPlayQueue_bancotrab(
                        rSet.getInt(1), rSet.getString(2), rSet.getString(3), rSet.getString(4), rSet.getString(5), rSet.getString(6), rSet.getString(7), rSet.getString(8),
                         rSet.getString(9), rSet.getString(10));
                BancoT.add(datos);
                filterBancoT.add(datos);

            }

            query = "SELECT * FROM (\n"
                    + "SELECT TIPO_SOLICITUD ,TIPO_IDENTIFICADOR, NO_OFICIO, B.NOMBRE_PRIORIDAD , ID_TOKEN, A.FECHA_REGISTRO , MEDIO_RECEPCION\n"
                    + "FROM PW_QUEUE_token A\n"
                    + "LEFT JOIN PW_QUEUE_PRIORIDAD B\n"
                    + "ON A.ID_PRIORIDAD = B.ID_PRIORIDAD\n"
                    + "ORDER BY FECHA_REGISTRO DESC )\n"
                    + "WHERE rownum < 6";

            token_ts.clear();
            token_tsi.clear();
            token_tsn.clear();
            token_pr.clear();
            token_fec.clear();
            token.clear();
            token_md.clear();
            token_prc.clear();
            codigo = "";

            rSet = conectar.ejecutarQuery(query);

            int cont = 0;
            while (rSet.next()) {

                token_ts.add(rSet.getString(1));
                token_tsi.add(rSet.getString(2));
                token_tsn.add(rSet.getString(3));
                token_pr.add(rSet.getString(4));
                token_fec.add(rSet.getString(6));
                token.add(rSet.getString(5));
                token_md.add(rSet.getString(7));

                // System.out.println("toke"+rSet.getString(4));
                if (rSet.getString(4).equals("Exigente") || rSet.getString(4).equals("Extra Urgente") || rSet.getString(4).equals("Urgente")) {
                    token_prc.add("badge bg-danger");
                } else if (rSet.getString(4).contains("Alta") || rSet.getString(4).contains("Media")) {
                    token_prc.add("badge bg-warning text-dark");
                } else {
                    token_prc.add("badge bg-primary");
                }

                //  System.out.println("toke"+token_prc.get(cont));
                 codigo = codigo.concat("<div class=\"row\">\n"
                        + "        <div class=\"col-md-2\">\n"
                        + "            <span class=\"" + token_prc.get(cont) + "\" style=\"font-size:12px\">" + token_pr.get(cont) + "</span>\n"
                        + "        </div>\n"
                        + "        <div class=\"col-md-10 text-center\">\n"
                        + "           <span class=\"fw-bold\" style=\"font-size:12px\">" + token_ts.get(cont) + "</span>\n"
                        + "        </div>\n"
                        + "    </div>\n"
                        + "    <div class=\"row\">\n"
                        + "        <div class=\"col-md-12\">\n"
                        + "            <p class=\"fw-light\" style=\"font-size:11px\">" + token_tsi.get(cont) + " </p>\n"
                        + "            <p class=\"fw-light\" style=\"font-size:11px\">" + token_tsn.get(cont) + " </p>\n"
                        + "        </div>        \n"
                        + "    </div>\n"
                        + "    <div class=\"row\">\n"
                        + "        <div class=\"col-md-5\">\n"
                        + "            <span class=\"badge bg-info\" style=\"font-size:11px\">" + token.get(cont) + "</span>\n"
                        + "        </div>\n"
                        + "        <div class=\"col-md-7 text-end\">\n"
                        + "            <span style=\"font-size:11px\">" + TiempoTranscurrido(token_fec.get(cont).toString()) + "</span>\n"
                        + "        </div>\n"
                        + "    </div>\n"
                        + "    <div class=\"row\">\n"
                        + "        <div class=\"col-md-12\">\n"
                        + "          <hr class=\"hr\">\n"
                        + "        </div>\n"
                        + "    </div>");

                cont++;

            }

            //System.out.println("codigo"+codigo);
            String querySA_UA = "select  count(1) , nvl(max(a.fecha_cierre), sysdate)  ultima_at	\n"
                    + "from (\n"
                    + "		select * from dg3861.PW_QUEUE_BITACTUAL\n"
                    + "			where estatus=6\n"
                    + "			and id_usuario = (select  id_usuario  from pw_queue_usuario where usuario  = '" + username + "')\n"
                    + "					) a\n"
                    + "	inner join dg3861.pw_queue_programacion b\n"
                    + "	on a.id_usuario = b.id_usuario\n"
                    + "		and a.fecha_cierre between b.fecha_inicial and b.fecha_final\n"
                    + "	inner join \n"
                    + "		(select id_usuario, max(fecha_loguin) fecha_loguin from pw_queue_loguin\n"
                    + "		where id_usuario = (select  id_usuario  from pw_queue_usuario where usuario  = '" + username + "') group by id_usuario\n"
                    + "		) c\n"
                    + "	on a.id_usuario = c.id_usuario\n"
                    + "	and c.fecha_loguin between b.fecha_inicial and b.fecha_final";

            String queryST_SU = "select count(1)sol_tot \n"
                    + "	,CASE WHEN id_prioridad IN (1,2) AND estatus IN  (2,3) THEN 1 ELSE 0 END	sol_priori\n"
                    + "from (\n"
                    + "		select * from dg3861.PW_QUEUE_BITACTUAL\n"
                    + "			where estatus IN (2 ,3, 4,5)\n"
                    + "			and id_usuario = (select  id_usuario  from pw_queue_usuario where usuario  = '" + username + "')\n"
                    + "					) a\n"
                    + "	inner join dg3861.pw_queue_programacion b\n"
                    + "	on a.id_usuario = b.id_usuario\n"
                    + "		and a.fecha_asignacion between b.fecha_inicial and b.fecha_final\n"
                    + "	inner join \n"
                    + "		(select id_usuario, max(fecha_loguin) fecha_loguin from pw_queue_loguin\n"
                    + "		where id_usuario = (select  id_usuario  from pw_queue_usuario where usuario  = '" + username + "') group by id_usuario\n"
                    + "		) c\n"
                    + "	on a.id_usuario = c.id_usuario\n"
                    + "	and c.fecha_loguin between b.fecha_inicial and b.fecha_final\n"
                    + "	GROUP BY CASE WHEN id_prioridad IN (1,2) AND estatus IN  (2,3)  THEN 1 ELSE 0 END";

            rSet = conectar.ejecutarQuery(querySA_UA);

            while (rSet.next()) {
                sol_atendidas = rSet.getInt(1);
                sol_ultima = rSet.getString(2);

            }

            rSet = conectar.ejecutarQuery(queryST_SU);

            int conta = 0;
            int contu = 0;

            while (rSet.next()) {

                if (rSet.getInt(2) == 1) {
                    contu = contu + rSet.getInt(1);
                    conta = conta + rSet.getInt(1);
                } else {
                    conta = conta + rSet.getInt(1);
                }

            }

            sol_urgente = contu;
            sol_abierta = conta;

            conectar.con.close();

        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_Bancotrabajo.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Error en BD", "" + ex + " "));

        }

    }

     public String TiempoTranscurrido(String fecha_sol) {
        //System.out.println(fecha_sol);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String date = dateFormat.format(new Date());

        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        try {
            Date date1 = sdf.parse(date);
            Date date2 = sdf.parse(fecha_sol);
            double parteDecimal = 0, parteEntera = 0;
            // get the difference between two dates in MINUTES
            long elapsedms = date1.getTime() - date2.getTime();
            long diff = TimeUnit.MINUTES.convert(elapsedms, TimeUnit.MILLISECONDS);

            if ((diff / 60) >= 1) {
                parteDecimal = diff % 60;

                parteEntera = diff - parteDecimal;
                parteEntera = parteEntera / 60;
                if (parteEntera == 1) {
                    return ("hace: " + (int) parteEntera + " hora");
                } else {
                    return ("hace: " + (int) parteEntera + " horas");
                }

            } else {

                if (diff >= 1) {
                    return ("hace: " + diff + " min");
                } else {
                    return ("ahora mismo");
                }

            }
        } catch (ParseException e) {
        }
        return "sin datos";
    }
     
    public static String gentoken(int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = length; i > 0; i -= 12) {
            int n = (int) min(12, abs(i));
            sb.append(leftPad(Long.toString(round(random() * pow(36, n)), 36), n, '0'));
        }
        return sb.toString();
    }

    public void revisaconexion(String userattid) {

        int bandloginant = 0;

        try {

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String checkuser = "SELECT count(1) FROM pw_queue_loguin \n"
                    + "WHERE id_Usuario = (SELECT id_usuario FROM pw_queue_usuario WHERE usuario  ='" + userattid + "')\n"
                    + "AND fecha_desconexion IS null";

            System.out.println(checkuser);

            rSet = con.ejecutarQuery(checkuser);

            while (rSet.next()) {
                bandloginant = rSet.getInt(1);

            }

            con.con.close();
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));

        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión:" + ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        if (bandloginant > 0) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmado", "En linea!!!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            bandsesion = true;

            System.out.println("Revisa conexion -> bandsesion :" + bandsesion);

        } else {
            bandsesion = false;
        }

    }

    public void solictatiempo(String userattid) {

        try {

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String insertteimpo = "INSERT INTO pw_queue_tiempofuera\n"
                    + "    (id_usuario, total_tiempo, fecha_solicitud, fecha_nvaconex)\n"
                    + "        SELECT  id_usuario, " + stiempo + " , sysdate,  NULL  FROM pw_queue_usuario WHERE usuario  = '" + userattid + "'";

            System.out.println(insertteimpo);

            rSet = con.ejecutarQuery(insertteimpo);

            con.con.close();
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));

            bpooltf = true;
            //RequestContext.getCurrentInstance().execute("PF('idpool').start()");
            PrimeFaces.current().executeScript("PF('idpool').start()");

            System.out.println("bpooltf" + bpooltf);

        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión:" + ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmación tiempo", "Solicitud de: " + stiempo + " min!!!");
        FacesContext.getCurrentInstance().addMessage(null, message);

    }

    public void pendiente(String userattid) {

        int StatusP = 0;
        String NomP = "";
        try {

            System.out.println("ID TOKEN: " + pendiente_idt);
            System.out.println("Pendiente Por: " + pendiente_por);

            if ("5".equals(pendiente_por)) {

                StatusP = 63;
                NomP = "SOPORTE";
            } else {
                StatusP = 64;
                NomP = "LEGAL";
            }

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String updatepen = " INSERT INTO DG3861.PW_QUEUE_BITACORA \n"
                    + "  		(ID_TOKEN, TICKET_NUMBER, ID_USUARIO, ID_LOGIN, ESTATUS, FECHA_ASIGNACION, FECHA_ESTATUS, FECHA_CIERRE, ID_PRIORIDAD, BAND_REASIGNADO, FECHA_REGISTRO)\n"
                    + "     SELECT ID_TOKEN, TICKET_NUMBER, " + pendiente_por + ", NULL, " + StatusP + ", SYSDATE, SYSDATE, NULL, ID_PRIORIDAD, 1, sysdate FROM PW_QUEUE_BITACTUAL WHERE ID_TOKEN ='" + pendiente_idt + "'";

            String mergepen = "MERGE INTO DG3861.PW_QUEUE_BITACTUAL x\n"
                    + "USING (\n"
                    + "			SELECT * FROM DG3861.PW_QUEUE_BITACORA where id_token='" + pendiente_idt + "'\n"
                    + "					AND (ID_TOKEN,FECHA_REGISTRO ) IN (\n"
                    + "		 	SELECT ID_TOKEN, max(FECHA_REGISTRO) FROM DG3861.pw_queue_bitacora where id_token='" + pendiente_idt + "' 	 \n"
                    + "		 	GROUP BY id_token) 			\n"
                    + "			) y\n"
                    + "ON (x.ID_TOKEN  = y.ID_TOKEN)\n"
                    + "WHEN MATCHED THEN\n"
                    + "    UPDATE SET \n"
                    + "    x.TICKET_NUMBER = y.TICKET_NUMBER, \n"
                    + "    x.ID_USUARIO = y.ID_USUARIO, \n"
                    + "    x.ID_LOGIN = y.ID_LOGIN, \n"
                    + "    x.ESTATUS = y.ESTATUS, \n"
                    + "    x.FECHA_ASIGNACION = y.FECHA_ASIGNACION, \n"
                    + "    x.FECHA_ESTATUS = y.FECHA_ESTATUS, \n"
                    + "    x.FECHA_CIERRE = y.FECHA_CIERRE, \n"
                    + "    x.ID_PRIORIDAD = y.ID_PRIORIDAD, \n"
                    + "    x.BAND_REASIGNADO = y.BAND_REASIGNADO,\n"
                    + "    x.ID_QUEUE = y.ID_QUEUE";

            System.out.println(updatepen);
            System.out.println(mergepen);

            rSet = con.ejecutarQuery(updatepen);
            rSet = con.ejecutarQuery(mergepen);

            con.con.close();
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));

        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión:" + ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmación de Pendiente", "La solicitud sera atendida por " + NomP + " ");
        FacesContext.getCurrentInstance().addMessage(null, message);

    }

    public void Restatiempofuera() {
        pooltiempof++;
        System.out.println("entra" + pooltiempof);

        if (stiempo == pooltiempof) {
            bpooltf = false;
            // RequestContext.getCurrentInstance().execute("PF('idpool').stop()");
            PrimeFaces.current().executeScript("PF('idpool').stop()");
            pooltiempof = 0;
            //RequestContext.getCurrentInstance().execute("PF('idpoolg').start()");
            PrimeFaces.current().executeScript("PF('idpoolg').start()");
        } else {
            bpooltf = true;
            //RequestContext.getCurrentInstance().execute("PF('idpoolg').stop()");
            PrimeFaces.current().executeScript("PF('idpoolg').stop()");
        }

        System.out.println("tiempo" + pooltiempof + "tiempo" + stiempo);

    }

    public static Object getSessionObject(String objName) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext extCtx = ctx.getExternalContext();
        Map<String, Object> sessionMap = extCtx.getSessionMap();
        return sessionMap.get(objName);
    }

    public void login(String userattid) {

        boolean band = true;
        int bandloginant = 0;

        try {

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            token_session = gentoken(10);

            String insert = "INSERT INTO pw_queue_loguin(\n"
                    + "  id_usuario , id_sesion, \n"
                    + "  fecha_loguin   ,\n"
                    + "  fecha_desconexion ,\n"
                    + "  id_desconexion)\n"
                    + "   SELECT  id_usuario, '" + token_session + "' , sysdate, NULL, NULL  FROM pw_queue_usuario WHERE usuario  = '" + userattid + "'";

            System.out.println("INSERT INICIAR BANCO -> "+insert);
            rSet = con.ejecutarQuery(insert);

            con.con.close();
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));

        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión:" + ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            band = false;
        }
        if (band) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Confirmado", "Ahora estas en linea!!!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            bandsesion = true;

            System.out.println("bandsesion: " + bandsesion);

        }

    }

    public void logout(String userattid) {
        System.out.println("Entra logout");

        boolean band = true;
        try {

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String update = "UPDATE dg3861.pw_queue_loguin\n"
                    + "SET fecha_desconexion = SYSDATE \n"
                    + ", id_desconexion=1\n"
                    + "WHERE (ID_LOGUIN, FECHA_LOGUIN) IN \n"
                    + "(SELECT max(ID_LOGUIN), max(FECHA_LOGUIN) FROM dg3861.pw_queue_loguin\n"
                    + "WHERE id_usuario  = (SELECT  id_usuario  FROM pw_queue_usuario WHERE usuario  = '" + userattid + "'))";

            
            System.out.println("UPDATE CERRAR BANCO -> "+update);

            rSet = con.ejecutarQuery(update);

            con.con.close();
            //    eventModel.addEvent(new DefaultScheduleEvent(rSet.getInt(1)+"-"+rSet.getInt(2), dateini, datefin));

        } catch (SQLException ex) {
            System.out.println("Error de cierre de sesión:" + ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            band = false;
        }
        if (band) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Desconectado", "Tu conexión se ha cerrado!!!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            bandsesion = false;

            System.out.println("bandsesion: " + bandsesion);

        }

    }

    public void onIdle() {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                "Actualización", "Monitor:" + date));
        GLDC_Queue_Programacion();

    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public List<SetPlayQueue_bancotrab> getBancoT() {
        return BancoT;
    }

    public void setBancoT(List<SetPlayQueue_bancotrab> BancoT) {
        this.BancoT = BancoT;
    }

    public List<SetPlayQueue_bancotrab> getFilterBancoT() {
        return filterBancoT;
    }

    public void setFilterBancoT(List<SetPlayQueue_bancotrab> filterBancoT) {
        this.filterBancoT = filterBancoT;
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

    public String getIdprogel() {
        return idprogel;
    }

    public void setIdprogel(String idprogel) {
        this.idprogel = idprogel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<String> getLusuariosmp() {
        return lusuariosmp;
    }

    public void setLusuariosmp(List<String> lusuariosmp) {
        this.lusuariosmp = lusuariosmp;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList getToken_ts() {
        return token_ts;
    }

    public void setToken_ts(ArrayList token_ts) {
        this.token_ts = token_ts;
    }

    public ArrayList getToken_tsi() {
        return token_tsi;
    }

    public void setToken_tsi(ArrayList token_tsi) {
        this.token_tsi = token_tsi;
    }

    public ArrayList getToken_tsn() {
        return token_tsn;
    }

    public void setToken_tsn(ArrayList token_tsn) {
        this.token_tsn = token_tsn;
    }

    public ArrayList getToken_pr() {
        return token_pr;
    }

    public void setToken_pr(ArrayList token_pr) {
        this.token_pr = token_pr;
    }

    public ArrayList getToken_fec() {
        return token_fec;
    }

    public void setToken_fec(ArrayList token_fec) {
        this.token_fec = token_fec;
    }

    public ArrayList getToken() {
        return token;
    }

    public void setToken(ArrayList token) {
        this.token = token;
    }

    public ArrayList getToken_md() {
        return token_md;
    }

    public void setToken_md(ArrayList token_md) {
        this.token_md = token_md;
    }

    public ArrayList getToken_prc() {
        return token_prc;
    }

    public void setToken_prc(ArrayList token_prc) {
        this.token_prc = token_prc;
    }

    public String getToken_session() {
        return token_session;
    }

    public void setToken_session(String token_session) {
        this.token_session = token_session;
    }

    public boolean isBandsesion() {
        return bandsesion;
    }

    public void setBandsesion(boolean bandsesion) {
        this.bandsesion = bandsesion;
    }

    public loginBean getLoginbean() {
        return loginbean;
    }

    public void setLoginbean(loginBean loginbean) {
        this.loginbean = loginbean;
    }

    public int getStiempo() {
        return stiempo;
    }

    public void setStiempo(int stiempo) {
        this.stiempo = stiempo;
    }

    public int getPooltiempof() {
        return pooltiempof;
    }

    public boolean isBpooltf() {
        return bpooltf;
    }

    public void setBpooltf(boolean bpooltf) {
        this.bpooltf = bpooltf;
    }

    public int getSol_atendidas() {
        return sol_atendidas;
    }

    public void setSol_atendidas(int sol_atendidas) {
        this.sol_atendidas = sol_atendidas;
    }

    public String getSol_ultima() {
        return sol_ultima;
    }

    public void setSol_ultima(String sol_ultima) {
        this.sol_ultima = sol_ultima;
    }

    public int getSol_urgente() {
        return sol_urgente;
    }

    public void setSol_urgente(int sol_urgente) {
        this.sol_urgente = sol_urgente;
    }

    public int getSol_abierta() {
        return sol_abierta;
    }

    public void setSol_abierta(int sol_abierta) {
        this.sol_abierta = sol_abierta;
    }

    public SetPlayQueue_bancotrab getSelectedEventoBitacora() {
        return selectedEventoBitacora;
    }

    public void setSelectedEventoBitacora(SetPlayQueue_bancotrab selectedEventoBitacora) {
        this.selectedEventoBitacora = selectedEventoBitacora;
    }

    public String getPendiente_idt() {
        return pendiente_idt;
    }

    public void setPendiente_idt(String pendiente_idt) {
        this.pendiente_idt = pendiente_idt;
    }

    public String getPendiente_por() {
        return pendiente_por;
    }

    public void setPendiente_por(String pendiente_por) {
        this.pendiente_por = pendiente_por;
    }

}
