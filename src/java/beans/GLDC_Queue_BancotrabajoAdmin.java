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
import java.text.DecimalFormat;
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
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import static org.apache.commons.lang3.StringUtils.leftPad;
import org.primefaces.PrimeFaces;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;

import org.primefaces.model.charts.donut.DonutChartModel;
import org.primefaces.model.charts.line.LineChartDataSet;
import org.primefaces.model.charts.line.LineChartModel;
import org.primefaces.model.charts.line.LineChartOptions;
import org.primefaces.model.charts.optionconfig.animation.Animation;
import org.primefaces.model.charts.optionconfig.legend.Legend;
import org.primefaces.model.charts.optionconfig.legend.LegendLabel;
import org.primefaces.model.charts.optionconfig.title.Title;
import org.primefaces.model.charts.optionconfig.tooltip.Tooltip;

//import org.primefaces.context.RequestContext;
//import org.primefaces.model.chart.Axis;
//import org.primefaces.model.chart.AxisType;
@ManagedBean
@ViewScoped
@Named(value = "queue_bancotadmin")

public class GLDC_Queue_BancotrabajoAdmin implements Serializable {

    @ManagedProperty(value = "#{loginBean}")
    private loginBean loginbean;

    List<SetPlayQueue_bancotrab> BancoT = new ArrayList<>();
    List<SetPlayQueue_bancotrab> UsuariosC = new ArrayList<>();
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
    ArrayList gluser = new ArrayList();
    ArrayList glfecha = new ArrayList();
    ArrayList gltotal = new ArrayList();

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
    private List<String> userss;
    private List<String> estatus;
    private List<String> priori;
    private List<String> ruserss;
    private String buser = "";
    private String bestado = "";
    private String bpriori = "";
    private String rea_idtoken = "";
    private int rea_newuser;
    private String rea_newusers;
    private int rea_olduser;
    private boolean rea_dialogo = true;
    private boolean besta = false;
    private BarChartModel barModel;
    private BarChartModel stackedBarModel;
    private BarChartModel stackedGroupBarModel;
    private LineChartModel lineModel;

    private ScheduleModel eventModel;
    private ScheduleModel lazyEventModel;
    private ScheduleEvent event = new DefaultScheduleEvent();
    String hola;

    private LocalDate minDate;
    private LocalDate maxDate;

    //Variables para mostrar bitacora.
    /*
    private BarChartModel graficatraficobarra; // DERECHO BARRAS
    private BarChartModel graficatraficobarra2; //TIEMPO HASTA ABAJO BARRAS
    private BarChartModel lineamodel;
     */
    private int value1 = 0;
    private int value2 = 0;
    private int value3 = 0;
    private int value4 = 0;

    private Date d_fechaini;
    private Date d_fechafin;

    @PostConstruct

    public void GLDC_Queue_Programacion() {

        createStackedBarModel(null, null, null);

        createPromedioAtencion(null, null, null, null);

        createLineModel(null, null, null);

        minDate = LocalDate.now().minusDays(7);
        maxDate = LocalDate.now();
        


        Herramientas.Conexion conectar = new Herramientas.Conexion("DG3861_DGLDCSTG");
        String username = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userid");
        System.out.println("usruarrrrrrr:" + username);

        revisaconexion(username);

        try {

            UsuariosConectados();
            besta = false;
            ResultSet rSet;
            DateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateFormat formatt = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");
            String buserq = "", bestadoq = "", bprioriq = "";

            BancoT.clear();
            filterBancoT.clear();

            if (buser.isEmpty()) {
                buserq = "";
            } else {
                buser = buser.replace(" ", "");
                buserq = "AND ID_USUARIO = (select  id_usuario  from pw_queue_usuario where usuario  = '" + buser + "')";
            }

            if (bestado.isEmpty()) {
                bestadoq = "";
            } else {
                bestado = bestado.replace(" ", "");
                bestadoq = "WHERE C.NOMBRE_ESTATUS = '" + bestado + "'";
            }

            if (bpriori.isEmpty()) {
                bprioriq = "";
            } else if (bestado.isEmpty()) {
                bpriori = bpriori.replace(" ", "");
                bprioriq = "WHERE B.NOMBRE_PRIORIDAD = '" + bpriori + "'";
            } else {
                bpriori = bpriori.replace(" ", "");
                bprioriq = "AND B.NOMBRE_PRIORIDAD = '" + bpriori + "'";
            }

            String query = "SELECT ID_QUEUE, ID_TOKEN, TICKET_NUMBER, C.NOMBRE_ESTATUS ,FECHA_ASIGNACION, FECHA_ESTATUS, FECHA_CIERRE, "
                    //+ "B.NOMBRE_PRIORIDAD, "
                    + "'P'|| A.ID_PRIORIDAD PRIORIDAD, "
                    + "C.COLORS,"
                    //+ "B.COLORP,"
                    + "CASE WHEN A.ID_PRIORIDAD = 1 THEN '#E74C3C'  ELSE '#D2B4DE' END COLORP, D.USUARIO \n "
                    + "FROM ( SELECT * FROM PW_QUEUE_BITACTUAL WHERE ( FECHA_CIERRE IS NULL OR FECHA_ASIGNACION > sysdate -7) " + buserq + ")  A\n"
                    + "    LEFT JOIN PW_QUEUE_PRIORIDAD B\n"
                    + "     ON A.ID_PRIORIDAD = B.ID_PRIORIDAD \n"
                    + "    LEFT JOIN PW_QUEUE_USUARIO D\n"
                    + "     ON A.ID_USUARIO = D.ID_USUARIO \n"
                    + "	LEFT JOIN PW_QUEUE_ESTATUS C\n"
                    + "     ON A.ESTATUS  = C.ID_ESTATUS " + bestadoq + " " + bprioriq + " \n"
                    + "ORDER BY (CASE WHEN A.ESTATUS = 24 AND a.FECHA_ASIGNACION IS NULL THEN a.FECHA_ESTATUS ELSE a.FECHA_ASIGNACION END ) desc";

            // System.out.println(query);
            rSet = conectar.ejecutarQuery(query);

            while (rSet.next()) {
                // System.out.println("hola mundo:"+rSet.getString(1));                                

                SetPlayQueue_bancotrab datos = new SetPlayQueue_bancotrab(
                        rSet.getInt(1), rSet.getString(2), rSet.getString(3), rSet.getString(4), rSet.getString(5), rSet.getString(6), rSet.getString(7), rSet.getString(8),
                        rSet.getString(9), rSet.getString(10), rSet.getString(11));
                BancoT.add(datos);
                filterBancoT.add(datos);

            }

            query = "SELECT * FROM (\n"
                    + "SELECT TIPO_SOLICITUD ,TIPO_IDENTIFICADOR, NO_OFICIO, B.NOMBRE_PRIORIDAD ,  ID_TOKEN,  A.FECHA_REGISTRO , MEDIO_RECEPCION \n"
                    + "FROM DG3861.PW_QUEUE_token A\n"
                    + "    LEFT JOIN DG3861.PW_QUEUE_PRIORIDAD B\n"
                    + "     ON A.ID_PRIORIDAD = B.ID_PRIORIDAD \n"
                    + "ORDER BY FECHA_REGISTRO DESC )        \n"
                    + "WHERE rownum < 6  ";

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
            String querySA_UA = "SELECT count(1) total, max(FECHA_CIERRE) ultima FROM dg3861.PW_QUEUE_BITACTUAL  \n"
                    + "WHERE estatus = 6\n"
                    + "and FECHA_ESTATUS > trunc(sysdate) ";

            String queryST_SU = "select count(1)sol_tot \n"
                    + "	,CASE WHEN id_prioridad IN (1,2) AND estatus IN  (2,3) THEN 1 ELSE 0 END	sol_priori\n"
                    + "from (\n"
                    + "		select * from dg3861.PW_QUEUE_BITACTUAL\n"
                    + "			where estatus IN (2 ,3, 4,5)\n"
                    + "					) a\n"
                    + "	inner join dg3861.pw_queue_programacion b\n"
                    + "	on a.id_usuario = b.id_usuario\n"
                    + "		and a.fecha_asignacion between b.fecha_inicial and b.fecha_final\n"
                    + "	inner join \n"
                    + "		(select id_usuario, max(fecha_loguin) fecha_loguin from pw_queue_loguin\n"
                    + "	group by id_usuario\n"
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

            userss = new ArrayList<>();
            estatus = new ArrayList<>();
            priori = new ArrayList<>();

            rSet = conectar.ejecutarQuery("SELECT USUARIO FROM PW_QUEUE_USUARIO");
            while (rSet.next()) {
                userss.add(rSet.getString(1));
            }
            rSet = conectar.ejecutarQuery("SELECT nombre_estatus FROM PW_QUEUE_ESTATUS");
            while (rSet.next()) {
                estatus.add(rSet.getString(1));
            }
            rSet = conectar.ejecutarQuery("SELECT NOMBRE_PRIORIDAD FROM  PW_QUEUE_PRIORIDAD pqp ");
            while (rSet.next()) {
                priori.add(rSet.getString(1));
            }

            conectar.con.close();

        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_BancotrabajoAdmin.class.getName()).log(Level.SEVERE, null, ex);
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

    public void UsuariosConectados() throws SQLException {
        Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
        ResultSet rSet;
        String query = "select c.IMAGEN, \n"
                + "CASE WHEN B.ID_LOGUIN IS NULL THEN 'false' ELSE 'true' END conectado,\n"
                + "CASE WHEN sysdate between a.hora_comida_inicio and a.hora_comida_fin THEN '#F39C12' ELSE '#0F0' END COLOR\n"
                + "	from dg3861.pw_queue_programacion a \n"
                + "		inner join dg3861.pw_queue_loguin b \n"
                + "			on a.id_usuario = b.id_usuario \n"
                + "			 LEFT JOIN dg3861.PW_QUEUE_USUARIO c\n"
                + "				on a.id_usuario = c.id_usuario \n"
                + "		where sysdate between a.fecha_inicial and a.fecha_final \n"
                + "		--and sysdate not between a.hora_comida_inicio and a.hora_comida_fin \n"
                + "		and b.fecha_desconexion is NULL";

        UsuariosC.clear();

        try {
            rSet = con.ejecutarQuery(query);

            while (rSet.next()) {

                SetPlayQueue_bancotrab datos = new SetPlayQueue_bancotrab(
                        "/resources/images/gldc/" + rSet.getString(1) + "", rSet.getString(2), rSet.getString(3));
                UsuariosC.add(datos);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_BancotrabajoAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        con.con.close();
    }

    public void createLineModel(List attid, List fecha, List asignaciones) {

        if (attid == null || attid.isEmpty()) {
            lineModel = new LineChartModel();
            ChartData data = new ChartData();

            LineChartDataSet dataSet = new LineChartDataSet();
            List<Object> values = new ArrayList<>();
            values.add(65);
            dataSet.setData(values);
            dataSet.setFill(false);
            dataSet.setLabel("ATTID1");
            dataSet.setBorderColor("rgb(75, 192, 192)");
            dataSet.setTension(0.1);
            data.addChartDataSet(dataSet);

            LineChartDataSet dataSet1 = new LineChartDataSet();
            List<Object> values1 = new ArrayList<>();
            values1.add(65);
            dataSet1.setData(values1);
            dataSet1.setFill(false);
            dataSet1.setLabel("ATTID2");
            dataSet1.setBorderColor("rgb(75, 180, 180)");
            dataSet1.setTension(0.1);
            data.addChartDataSet(dataSet1);

            List<String> labels = new ArrayList<>();
            labels.add("00");
            data.setLabels(labels);

            //Options
            LineChartOptions options = new LineChartOptions();
            Title title = new Title();
            title.setDisplay(true);
            title.setText("Asignaciones por usuario");
            options.setTitle(title);

            lineModel.setOptions(options);
            lineModel.setData(data);

        } else {

            lineModel = new LineChartModel();
            ChartData data = new ChartData();

            LineChartDataSet dataSet = new LineChartDataSet();
            List<Object> values = new ArrayList<>();

            LineChartDataSet dataSet1 = new LineChartDataSet();
            List<Object> values1 = new ArrayList<>();

            LineChartDataSet dataSet2 = new LineChartDataSet();
            List<Object> values2 = new ArrayList<>();

            LineChartDataSet dataSet3 = new LineChartDataSet();
            List<Object> values3 = new ArrayList<>();

            LineChartDataSet dataSet4 = new LineChartDataSet();
            List<Object> values4 = new ArrayList<>();

            LineChartDataSet dataSet5 = new LineChartDataSet();
            List<Object> values5 = new ArrayList<>();

            LineChartDataSet dataSet6 = new LineChartDataSet();
            List<Object> values6 = new ArrayList<>();

            LineChartDataSet dataSet7 = new LineChartDataSet();
            List<Object> values7 = new ArrayList<>();

            LineChartDataSet dataSet8 = new LineChartDataSet();
            List<Object> values8 = new ArrayList<>();

            LineChartDataSet dataSet9 = new LineChartDataSet();
            List<Object> values9 = new ArrayList<>();

            int cont = 0, cont2 = 0;
            try {
                List attidOrdenado = (List) attid.stream().distinct().collect(Collectors.toList());
                //Collections.sort(attidOrdenado);

                int aux = Collections.frequency(attid, attidOrdenado.get(1));
                System.out.println("Repeticion: " + aux);

                fecha = (List) fecha.stream().distinct().collect(Collectors.toList());
                Collections.sort(fecha);

                int contUser = 0;
                for (Iterator<String> iterAttid = attidOrdenado.iterator(); iterAttid.hasNext();) {
                    switch (contUser) {
                        case 0:

                            dataSet.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 1:

                            dataSet1.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 2:

                            dataSet2.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 3:

                            dataSet3.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 4:

                            dataSet4.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 5:

                            dataSet5.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 6:

                            dataSet6.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 7:

                            dataSet7.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 8:

                            dataSet8.setLabel(iterAttid.next());
                            contUser++;
                            break;
                        case 9:

                            dataSet9.setLabel(iterAttid.next());
                            contUser++;
                            break;

                        default:
                            break;
                    }
                }

                for (Iterator<Integer> iterAsig = asignaciones.iterator(); iterAsig.hasNext();) {
                    switch (cont) {
                        case 0:

                            values.add(iterAsig.next());
                            cont2++;
                            break;
                        case 1:

                            values1.add(iterAsig.next());
                            cont2++;
                            break;
                        case 2:

                            values2.add(iterAsig.next());
                            cont2++;
                            break;
                        case 3:

                            values3.add(iterAsig.next());
                            cont2++;
                            break;
                        case 4:

                            values4.add(iterAsig.next());
                            cont2++;
                            break;
                        case 5:

                            values5.add(iterAsig.next());
                            cont2++;
                            break;
                        case 6:

                            values6.add(iterAsig.next());
                            cont2++;
                            break;

                        case 7:

                            values7.add(iterAsig.next());
                            cont2++;
                            break;
                        case 8:

                            values8.add(iterAsig.next());
                            cont2++;
                            break;
                        case 9:

                            values9.add(iterAsig.next());
                            cont2++;
                            break;
                        default:
                            break;
                    }

                    if (cont2 == (aux - 1)) {
                        cont++;
                        cont2 = 0;
                    }

                }

                for (int i = 0; i < contUser; i++) {
                    switch (i) {
                        case 0:
                            dataSet.setData(values);
                            dataSet.setFill(false);
                            dataSet.setBorderColor("rgb(255, 99, 132)");
                            dataSet.setTension(0.1);
                            data.addChartDataSet(dataSet);
                            break;

                        case 1:
                            dataSet1.setData(values1);
                            dataSet1.setFill(false);
                            dataSet1.setBorderColor("rgb(54, 162, 235)");
                            dataSet1.setTension(0.1);
                            data.addChartDataSet(dataSet1);
                            break;

                        case 2:
                            dataSet2.setData(values2);
                            dataSet2.setFill(false);
                            dataSet2.setBorderColor("rgb(175, 122, 197)");
                            dataSet2.setTension(0.1);
                            data.addChartDataSet(dataSet2);
                            break;

                        case 3:
                            dataSet3.setData(values3);
                            dataSet3.setFill(false);
                            dataSet3.setBorderColor("rgb(163, 228, 215)");
                            dataSet3.setTension(0.1);
                            data.addChartDataSet(dataSet3);
                            break;

                        case 4:
                            dataSet4.setData(values4);
                            dataSet4.setFill(false);
                            dataSet4.setBorderColor("rgb(201, 203, 207)");
                            dataSet4.setTension(0.1);
                            data.addChartDataSet(dataSet4);
                            break;

                        case 5:
                            dataSet5.setData(values5);
                            dataSet5.setFill(false);
                            dataSet5.setBorderColor("rgb(75, 192, 192)");
                            dataSet5.setTension(0.1);
                            data.addChartDataSet(dataSet5);
                            break;

                        case 6:
                            dataSet6.setData(values6);
                            dataSet6.setFill(false);
                            dataSet6.setBorderColor("rgb(255, 205, 86)");
                            dataSet6.setTension(0.1);
                            data.addChartDataSet(dataSet6);
                            break;

                        case 7:
                            dataSet7.setData(values7);
                            dataSet7.setFill(false);
                            dataSet7.setBorderColor("rgb(130, 100, 192)");
                            dataSet7.setTension(0.1);
                            data.addChartDataSet(dataSet7);
                            break;

                        case 8:
                            dataSet8.setData(values8);
                            dataSet8.setFill(false);
                            dataSet8.setBorderColor("rgb(112, 112, 130)");
                            dataSet8.setTension(0.1);
                            data.addChartDataSet(dataSet8);
                            break;

                        case 9:
                            dataSet9.setData(values9);
                            dataSet9.setFill(false);
                            dataSet9.setBorderColor("rgb(160, 160, 192)");
                            dataSet9.setTension(0.1);
                            data.addChartDataSet(dataSet9);
                            break;

                        default:
                            break;
                    }
                }

            } catch (Exception E_List) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Problema: Grafico Asignaciones", "El rango es muy amplio, intente con un rango menor."));
            }

            //rotulos
            data.setLabels(fecha);

            //Options
            LineChartOptions options = new LineChartOptions();
            Title title = new Title();
            title.setDisplay(true);
            title.setText("Asignaciones por usuario");
            options.setTitle(title);

            lineModel.setOptions(options);
            lineModel.setData(data);
        }
    }

    public void createStackedBarModel(List attid, List proceso, List fin) {

        if (attid == null || attid.isEmpty()) {

            stackedBarModel = new BarChartModel();
            ChartData data = new ChartData();

            BarChartDataSet barDataSet = new BarChartDataSet();
            barDataSet.setLabel("Atendidas");
            barDataSet.setBackgroundColor("rgb(255, 99, 132)");
            List<Number> dataVal = new ArrayList<>();
            dataVal.add(0);

            barDataSet.setData(dataVal);

            BarChartDataSet barDataSet2 = new BarChartDataSet();
            barDataSet2.setLabel("Proceso");
            barDataSet2.setBackgroundColor("rgb(54, 162, 235)");
            List<Number> dataVal2 = new ArrayList<>();
            dataVal2.add(0);

            barDataSet2.setData(dataVal2);

            data.addChartDataSet(barDataSet);
            data.addChartDataSet(barDataSet2);

            List<String> labels = new ArrayList<>();
            labels.add("attid");
            data.setLabels(labels);
            stackedBarModel.setData(data);

            //Options
            BarChartOptions options = new BarChartOptions();
            CartesianScales cScales = new CartesianScales();
            CartesianLinearAxes linearAxes = new CartesianLinearAxes();
            linearAxes.setStacked(true);
            linearAxes.setOffset(true);
            cScales.addXAxesData(linearAxes);
            cScales.addYAxesData(linearAxes);
            options.setScales(cScales);

            Title title = new Title();
            title.setDisplay(true);
            title.setText("Solicitudes");
            options.setTitle(title);

            Tooltip tooltip = new Tooltip();
            tooltip.setMode("index");
            tooltip.setIntersect(false);
            options.setTooltip(tooltip);

            stackedBarModel.setOptions(options);
        } else {
            stackedBarModel = new BarChartModel();
            ChartData data = new ChartData();

            BarChartDataSet barDataSet = new BarChartDataSet();
            barDataSet.setLabel("Atendidas");
            barDataSet.setBackgroundColor("rgb(255, 99, 132)");
            List<Number> dataVal = new ArrayList<>();

            for (Iterator<Integer> iter = fin.iterator(); iter.hasNext();) {
                dataVal.add(iter.next());
            }

            barDataSet.setData(dataVal);

            BarChartDataSet barDataSet2 = new BarChartDataSet();
            barDataSet2.setLabel("Proceso");
            barDataSet2.setBackgroundColor("rgb(54, 162, 235)");
            List<Number> dataVal2 = new ArrayList<>();

            for (Iterator<Integer> iter = proceso.iterator(); iter.hasNext();) {
                dataVal2.add(iter.next());
            }

            barDataSet2.setData(dataVal2);

            data.addChartDataSet(barDataSet);
            data.addChartDataSet(barDataSet2);

            List<String> labels = new ArrayList<>();

            for (Iterator<String> iter = attid.iterator(); iter.hasNext();) {
                labels.add(iter.next());
            }

            data.setLabels(labels);
            stackedBarModel.setData(data);

            //Options
            BarChartOptions options = new BarChartOptions();
            CartesianScales cScales = new CartesianScales();
            CartesianLinearAxes linearAxes = new CartesianLinearAxes();
            linearAxes.setStacked(true);
            linearAxes.setOffset(true);
            cScales.addXAxesData(linearAxes);
            cScales.addYAxesData(linearAxes);
            options.setScales(cScales);

            Title title = new Title();
            title.setDisplay(true);
            title.setText("Solicitudes");
            options.setTitle(title);

            Tooltip tooltip = new Tooltip();
            tooltip.setMode("index");
            tooltip.setIntersect(false);
            options.setTooltip(tooltip);

            stackedBarModel.setOptions(options);
        }
    }

    public void createPromedioAtencion(List attid, List sol, List prom, List total) {
        if (attid == null || attid.isEmpty()) {

            stackedGroupBarModel = new BarChartModel();
            ChartData data = new ChartData();

            BarChartDataSet barDataSet = new BarChartDataSet();
            barDataSet.setLabel("Informacion Historica");
            barDataSet.setBackgroundColor("rgb(255, 99, 132)");
            barDataSet.setStack("Stack 0");
            List<Number> dataVal = new ArrayList<>();
            dataVal.add(32);
            barDataSet.setData(dataVal);

            BarChartDataSet barDataSet2 = new BarChartDataSet();
            barDataSet2.setLabel("Intervención");
            barDataSet2.setBackgroundColor("rgb(54, 162, 235)");
            barDataSet2.setStack("Stack 1");
            List<Number> dataVal2 = new ArrayList<>();
            dataVal2.add(83);
            barDataSet2.setData(dataVal2);

            BarChartDataSet barDataSet3 = new BarChartDataSet();
            barDataSet3.setLabel("Localización Geográfica");
            barDataSet3.setBackgroundColor("rgb(175, 122, 197)");
            barDataSet3.setStack("Stack 2");
            List<Number> dataVal3 = new ArrayList<>();
            dataVal3.add(45);
            barDataSet3.setData(dataVal3);

            BarChartDataSet barDataSet4 = new BarChartDataSet();
            barDataSet4.setLabel("Suspensión de Servicios");
            barDataSet4.setBackgroundColor("rgb(163, 228, 215)");
            barDataSet4.setStack("Stack 3");
            List<Number> dataVal4 = new ArrayList<>();
            dataVal4.add(45);
            barDataSet4.setData(dataVal4);

            BarChartDataSet barDataSet5 = new BarChartDataSet();
            barDataSet5.setLabel("Aclaración");
            barDataSet5.setBackgroundColor("rgb(201, 203, 207)");
            barDataSet5.setStack("Stack 4");
            List<Number> dataVal5 = new ArrayList<>();
            dataVal5.add(45);
            barDataSet5.setData(dataVal5);

            BarChartDataSet barDataSet6 = new BarChartDataSet();
            barDataSet6.setLabel("CDRs CISEN");
            barDataSet6.setBackgroundColor("rgb(75, 192, 192)");
            barDataSet6.setStack("Stack 5");
            List<Number> dataVal6 = new ArrayList<>();
            dataVal6.add(45);
            barDataSet6.setData(dataVal6);

            BarChartDataSet barDataSet7 = new BarChartDataSet();
            barDataSet7.setLabel("Cobertura de Radio Bases");
            barDataSet7.setBackgroundColor("rgb(255, 205, 86)");
            barDataSet7.setStack("Stack 6");
            List<Number> dataVal7 = new ArrayList<>();
            dataVal7.add(45);
            barDataSet7.setData(dataVal7);

            data.addChartDataSet(barDataSet);
            data.addChartDataSet(barDataSet2);
            data.addChartDataSet(barDataSet3);
            data.addChartDataSet(barDataSet4);
            data.addChartDataSet(barDataSet5);
            data.addChartDataSet(barDataSet6);
            data.addChartDataSet(barDataSet7);

            List<String> labels = new ArrayList<>();
            labels.add("attid");
            data.setLabels(labels);
            stackedGroupBarModel.setData(data);

            //Options
            BarChartOptions options = new BarChartOptions();
            CartesianScales cScales = new CartesianScales();
            CartesianLinearAxes linearAxes = new CartesianLinearAxes();
            linearAxes.setStacked(true);
            linearAxes.setOffset(true);
            cScales.addXAxesData(linearAxes);
            cScales.addYAxesData(linearAxes);
            options.setScales(cScales);

            Title title = new Title();
            title.setDisplay(true);
            title.setText("Promedio de atención (minutos)");
            options.setTitle(title);

            Tooltip tooltip = new Tooltip();
            tooltip.setMode("index");
            tooltip.setIntersect(false);
            options.setTooltip(tooltip);

            stackedGroupBarModel.setOptions(options);
        } else {
            stackedGroupBarModel = new BarChartModel();
            ChartData data = new ChartData();

            BarChartDataSet barDataSet = new BarChartDataSet();
            BarChartDataSet barDataSet2 = new BarChartDataSet();
            BarChartDataSet barDataSet3 = new BarChartDataSet();
            BarChartDataSet barDataSet4 = new BarChartDataSet();
            BarChartDataSet barDataSet5 = new BarChartDataSet();
            BarChartDataSet barDataSet6 = new BarChartDataSet();
            BarChartDataSet barDataSet7 = new BarChartDataSet();

            barDataSet.setLabel("Aclaración");
            barDataSet.setBackgroundColor("rgb(255, 99, 132)");
            barDataSet.setStack("Stack 0");
            List<Number> dataVal = new ArrayList<>();

            barDataSet2.setLabel("CDRs CISEN");
            barDataSet2.setBackgroundColor("rgb(54, 162, 235)");
            barDataSet2.setStack("Stack 1");
            List<Number> dataVal2 = new ArrayList<>();

            barDataSet3.setLabel("Cobertura de Radio Bases");
            barDataSet3.setBackgroundColor("rgb(175, 122, 197)");
            barDataSet3.setStack("Stack 2");
            List<Number> dataVal3 = new ArrayList<>();

            barDataSet4.setLabel("Intervención Legal");
            barDataSet4.setBackgroundColor("rgb(163, 228, 215)");
            barDataSet4.setStack("Stack 3");
            List<Number> dataVal4 = new ArrayList<>();

            barDataSet5.setLabel("Localización Geográfica");
            barDataSet5.setBackgroundColor("rgb(201, 203, 207)");
            barDataSet5.setStack("Stack 4");
            List<Number> dataVal5 = new ArrayList<>();

            barDataSet6.setLabel("Ordenes de Información Histórica");
            barDataSet6.setBackgroundColor("rgb(75, 192, 192)");
            barDataSet6.setStack("Stack 5");
            List<Number> dataVal6 = new ArrayList<>();

            barDataSet7.setLabel("Suspensión de Servicios");
            barDataSet7.setBackgroundColor("rgb(255, 205, 86)");
            barDataSet7.setStack("Stack 6");
            List<Number> dataVal7 = new ArrayList<>();

            for (Iterator<String> iter = sol.iterator(); iter.hasNext();) {
                for (Iterator<Integer> iter2 = prom.iterator(); iter2.hasNext();) {
                    switch (iter.next()) {
                        case "Aclaración":
                            dataVal.add(iter2.next());
                            break;
                        case "CDRs CISEN":
                            dataVal2.add(iter2.next());
                            break;
                        case "Cobertura de Radio Bases":
                            dataVal3.add(iter2.next());
                            break;
                        case "Intervención Legal":
                            dataVal4.add(iter2.next());
                            break;
                        case "Localización Geográfica":
                            dataVal5.add(iter2.next());
                            break;
                        case "Ordenes de Información Histórica":
                            dataVal6.add(iter2.next());
                            break;
                        case "Suspensión de Servicios":
                            dataVal7.add(iter2.next());
                            break;

                        default:
                            break;
                    }
                }
            }

            barDataSet.setData(dataVal);
            barDataSet2.setData(dataVal2);
            barDataSet3.setData(dataVal3);
            barDataSet4.setData(dataVal4);
            barDataSet5.setData(dataVal5);
            barDataSet6.setData(dataVal6);
            barDataSet7.setData(dataVal7);

            data.addChartDataSet(barDataSet);
            data.addChartDataSet(barDataSet2);
            data.addChartDataSet(barDataSet3);
            data.addChartDataSet(barDataSet4);
            data.addChartDataSet(barDataSet5);
            data.addChartDataSet(barDataSet6);
            data.addChartDataSet(barDataSet7);

            List<String> labels = new ArrayList<>();
            attid = (List) attid.stream().distinct().collect(Collectors.toList());
            Collections.sort(attid);
            for (Iterator<String> iter = attid.iterator(); iter.hasNext();) {
                labels.add(iter.next());
            }
            data.setLabels(labels);
            stackedGroupBarModel.setData(data);

            //Options
            BarChartOptions options = new BarChartOptions();
            CartesianScales cScales = new CartesianScales();
            CartesianLinearAxes linearAxes = new CartesianLinearAxes();
            linearAxes.setStacked(true);
            linearAxes.setOffset(true);
            cScales.addXAxesData(linearAxes);
            cScales.addYAxesData(linearAxes);
            options.setScales(cScales);

            Title title = new Title();
            title.setDisplay(true);
            title.setText("Promedio de atención (minutos)");
            options.setTitle(title);

            Tooltip tooltip = new Tooltip();
            tooltip.setMode("index");
            tooltip.setIntersect(false);
            options.setTooltip(tooltip);

            stackedGroupBarModel.setOptions(options);
        }

    }

    private void KnobView() throws SQLException {

        try {
            //  System.out.println("Entra a estadisticas");

            String condicionq = "", condicionq2 = "";
            DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            if (d_fechaini == null && d_fechafin == null) {
                condicionq = " a.FECHA_ESTATUS > trunc(sysdate)";
            } else if (d_fechaini != null && d_fechafin == null) {
                condicionq = " a.FECHA_ESTATUS  > TO_DATE('" + dF.format(d_fechaini) + "', 'YYYY-MM-DD HH24:mi:ss')";
            } else if (d_fechaini != null && d_fechafin != null) {
                condicionq = " a.FECHA_ESTATUS between TO_DATE('" + dF.format(d_fechaini) + "', 'YYYY-MM-DD HH24:mi:ss') AND TO_DATE('" + dF.format(d_fechafin) + "', 'YYYY-MM-DD HH24:mi:ss')";
                condicionq2 = " and FECHA_CREACION between TO_DATE('" + dF.format(d_fechaini) + "', 'YYYY-MM-DD HH24:mi:ss') AND TO_DATE('" + dF.format(d_fechafin) + "', 'YYYY-MM-DD HH24:mi:ss')";
            }

            //System.out.println("d_fechaini:"+d_fechaini+" d_fechafin:"+d_fechafin);
            String query1 = "WITH qaux AS (\n"
                    + "SELECT count(TA) CTA, count(TB) CTB FROM (\n"
                    + "		SELECT a.ID_TOKEN TA, b.ID_TOKEN TB \n"
                    + "			FROM dg3861.PW_QUEUE_BITACTUAL a\n"
                    + "				LEFT JOIN \n"
                    + "					(SELECT * FROM dg3861.PW_QUEUE_BITACTUAL  WHERE estatus = 6) b\n"
                    + "				ON a.ID_TOKEN = b.ID_TOKEN\n"
                    + "WHERE  " + condicionq + "    ))\n"
                    + "SELECT aux.*, \n"
                    + "	CASE WHEN CTA > 0 THEN CEIL((CTB/CTA)*100)\n"
                    + "	ELSE 0 END PORC, tc.cud\n"
                    + "FROM qaux aux\n"
                    + "	LEFT JOIN (SELECT count(1) cud FROM  PW_QUEUE_CRONO WHERE TRUNC(FECHA_CREACION) = TRUNC(SYSDATE) " + condicionq2 + ") tc\n"
                    + "	 ON 1=1\n"
                    + "	";

            //   System.out.println(query1); 
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            ResultSet rSet;
            rSet = con.ejecutarQuery(query1);

            while (rSet.next()) {
                value1 = rSet.getInt(1);
                value2 = rSet.getInt(2);
                value3 = rSet.getInt(3);
                value4 = rSet.getInt(4);

                //  System.out.println(rSet.getString(1)); 
            }

            con.con.close();

        } catch (SQLException ex) {
            // Logger.getLogger(GLDC_DispAplicaciones.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void limpiafiltros() {
        System.out.println("INTENTANDO RESTABLECER");
        buser = "";
        bestado = "";
        bpriori = "";
        FacesMessage msg = new FacesMessage("Vista restablecida");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        GLDC_Queue_Programacion();
        System.out.println("FINALIZADO RESTABLECER");
    }

    public void onRowSelect(SelectEvent event) {
        System.out.println("INTENTANDO ROWSELECT");
        try {
            FacesMessage msg = new FacesMessage("Token Seleccionado:"
                    + ((SetPlayQueue_bancotrab) event.getObject()).getId_token(), ((SetPlayQueue_bancotrab) event.getObject()).getTicket_number());

            rea_idtoken = ((SetPlayQueue_bancotrab) event.getObject()).getId_token();
            String estatusr = ((SetPlayQueue_bancotrab) event.getObject()).getEstatus();
            System.out.println("Seleecion:" + ((SetPlayQueue_bancotrab) event.getObject()).getId_token() + " Estatus:" + estatusr);

            FacesContext.getCurrentInstance().addMessage(null, msg);
            ruserss = new ArrayList<>();
            ruserss.clear();
            if (estatusr.equals("reasignado") || estatusr.equals("asignado") || estatusr.equals("atendiendo") || estatusr.equals("bandeja_rms") || estatusr.equals("pendiente") || estatusr.equals("p_resuelto")) {
                rea_dialogo = true;
            } else {
                rea_dialogo = false;
            }

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String checkuser = "SELECT b.usuario FROM PW_QUEUE_CRONO a\n"
                    + "	inner JOIN PW_QUEUE_USUARIO B \n"
                    + "ON a.id_usuario = b.id_usuario";

            System.out.println(checkuser);

            rSet = con.ejecutarQuery(checkuser);

            while (rSet.next()) {
                ruserss.add(rSet.getString(1));
            }

            con.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_BancotrabajoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            FacesMessage msg = new FacesMessage("Error en BD:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void reasingaciontoken(String Username) {
        try {
            System.out.println("Reasingara ticket:" + rea_newusers);

            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String quserold = "SELECT DISTINCT ID_USUARIO FROM DG3861.PW_QUEUE_BITACTUAL A\n"
                    + "WHERE ID_TOKEN ='" + rea_idtoken + "'";

            rSet = con.ejecutarQuery(quserold);

            while (rSet.next()) {
                rea_olduser = rSet.getInt(1);
            }

            String qusernew = "SELECT DISTINCT ID_USUARIO FROM PW_QUEUE_USUARIO WHERE USUARIO = '" + rea_newusers.replace(" ", "") + "'";

            rSet = con.ejecutarQuery(qusernew);

            while (rSet.next()) {
                rea_newuser = rSet.getInt(1);
            }

            if (rea_olduser == rea_newuser) {
                FacesMessage msg = new FacesMessage("No puedes reasingar al mismo usuario.");
                FacesContext.getCurrentInstance().addMessage(null, msg);
            } else {
                String insr_treac = "	INSERT INTO DG3861.PW_QUEUE_REASIGNACIONES\n"
                        + "			(ID_USUARIO_ANT, ID_USUARIO_NVO, ID_USUARIO_REASIGNA, FECHA_REGISTRO)\n"
                        + "			SELECT " + rea_olduser + "," + rea_newuser + ", ID_USUARIO, sysdate FROM (SELECT DISTINCT ID_USUARIO FROM PW_QUEUE_USUARIO WHERE USUARIO = '" + Username + "') ";

                String inst_bitacora = " INSERT INTO DG3861.PW_QUEUE_BITACORA \n"
                        + "  		(ID_TOKEN, TICKET_NUMBER, ID_USUARIO, ID_LOGIN, ESTATUS, FECHA_ASIGNACION, FECHA_ESTATUS, FECHA_CIERRE, ID_PRIORIDAD, BAND_REASIGNADO, FECHA_REGISTRO)\n"
                        + "     SELECT ID_TOKEN, TICKET_NUMBER, " + rea_newuser + ", NULL, 2, SYSDATE, SYSDATE, NULL, ID_PRIORIDAD, 1, sysdate FROM PW_QUEUE_BITACTUAL WHERE ID_TOKEN ='" + rea_idtoken + "'";

                String querymrgbitactual = "MERGE INTO DG3861.PW_QUEUE_BITACTUAL x\n"
                        + "USING (\n"
                        + "			SELECT * FROM DG3861.PW_QUEUE_BITACORA where id_token='" + rea_idtoken + "'\n"
                        + "					AND (ID_TOKEN,FECHA_REGISTRO ) IN (\n"
                        + "		 	SELECT ID_TOKEN, max(FECHA_REGISTRO) FROM DG3861.pw_queue_bitacora where id_token='" + rea_idtoken + "' 	 \n"
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

                System.out.println(insr_treac);
                System.out.println(inst_bitacora);
                System.out.println(querymrgbitactual);
                // System.out.println(inst_bitactual);

                rSet = con.ejecutarQuery(insr_treac);
                rSet = con.ejecutarQuery(inst_bitacora);
                rSet = con.ejecutarQuery(querymrgbitactual);
                //rSet = con.ejecutarQuery(inst_bitactual);

                FacesMessage msg = new FacesMessage("Token:" + rea_idtoken + " reasingado.");
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }

            con.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_BancotrabajoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            FacesMessage msg = new FacesMessage("No se reasigno token, Error en BD:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }

    public static String gentoken(int length) {
        StringBuilder sb = new StringBuilder();
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

            System.out.println("bandsesion" + bandsesion);

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

    public void Restatiempofuera() {
        pooltiempof++;
        System.out.println("entra" + pooltiempof);

        if (stiempo == pooltiempof) {
            bpooltf = false;
            // RequestContext.getCurrentInstance().execute("PF('idpool').stop()");
            PrimeFaces.current().executeScript("PF('idpool').stop()");
            pooltiempof = 0;
            // RequestContext.getCurrentInstance().execute("PF('idpoolg').start()");
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

            //System.out.println(insert);
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

            System.out.println("bandsesion" + bandsesion);

        }

    }

    public void estadismetod() throws SQLException {

        Estadisticas();
        KnobView();
        besta = true;
        FacesMessage msg = new FacesMessage("Estadísticas parte inferior");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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

            System.out.println(update);

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

            System.out.println("bandsesion" + bandsesion);

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

    public void Estadisticas() throws SQLException {
        List<String> attid = new ArrayList();
        List<String> attid1 = new ArrayList();
        List<String> attid2 = new ArrayList();
        List<Integer> atendiendo = new ArrayList<>();
        List<Integer> finalizadas = new ArrayList<>();
        List<String> tipo = new ArrayList<>();
        List<Integer> prom = new ArrayList<>();
        List<Integer> total = new ArrayList<>();
        List<String> fecha = new ArrayList();
        List<Integer> asig = new ArrayList();

        DateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String condicionq = "", forlineax = "HH24";

        if (d_fechaini == null && d_fechafin == null) {
            condicionq = " FECHA_ASIGNACION > trunc(sysdate-1)+(20/24)";
        } else if (d_fechaini != null && d_fechafin == null) {
            condicionq = " FECHA_ASIGNACION > TO_DATE('" + dF.format(d_fechaini) + "', 'YYYY-MM-DD HH24:mi:ss')";
            forlineax = "YYYY-MM-DD HH24";
        } else if (d_fechaini != null && d_fechafin != null) {
            condicionq = " FECHA_ASIGNACION between TO_DATE('" + dF.format(d_fechaini) + "', 'YYYY-MM-DD HH24:mi:ss') AND TO_DATE('" + dF.format(d_fechafin) + "', 'YYYY-MM-DD HH24:mi:ss')";
            forlineax = "YYYY-MM-DD HH24";
        }

        // System.out.println("Condicion: " + condicionq);
        //System.out.println("FORLINEAX: " + forlineax);
        String ConsultaSolicitudes = "  	SELECT a.USUARIO, NVL( b.atendiendo, 0) atendiendo, NVL(c.finalizadas, 0) finalizadas FROM\n"
                + "		DG3861.PW_QUEUE_USUARIO a\n"
                + "		left JOIN (select id_usuario, count(1) atendiendo \n"
                + "					from dg3861.PW_QUEUE_BITACTUAL\n"
                + "					where estatus IN (2,3,5,81,4)\n"
                + "              --      AND id_TOKEN  NOT LIKE '%AT22__________A%'\n"
                + "					AND " + condicionq + "\n"
                + "					GROUP BY id_usuario) b\n"
                + "			  ON a.ID_USUARIO = b.id_usuario\n"
                + "		LEFT JOIN\n"
                + "			(\n"
                + "			  select id_usuario, count(1) finalizadas from dg3861.PW_QUEUE_BITACTUAL\n"
                + "			  where estatus=6\n"
                + "			--  AND id_TOKEN  NOT LIKE '%AT22__________A%'\n"
                + "				AND " + condicionq + "\n"
                + "				GROUP BY id_usuario) c\n"
                + "ON a.ID_USUARIO = c.id_usuario\n"
                + "WHERE (b.atendiendo IS NOT NULL OR c.finalizadas IS NOT null )";

        String ConsultaPromedioA = "  WITH QAUX AS\n"
                + "(\n"
                + "	SELECT * FROM (\n"
                + "	SELECT C.USUARIO, B.TIPO_SOLICITUD , A.MINUTOS, COUNT(1) TOTAL_SOL  FROM\n"
                + "        (\n"
                + "            SELECT ID_USUARIO, ID_TOKEN,  (FECHA_CIERRE - FECHA_ASIGNACION) *24*60 minutos   FROM dg3861.PW_QUEUE_BITACTUAL A\n"
                + "                WHERE ESTATUS = 6\n"
                + "                AND ID_TOKEN NOT IN (\n"
                + "                        SELECT DISTINCT ID_TOKEN FROM dg3861.PW_QUEUE_BITACORA\n"
                + "                    WHERE ( ESTATUS IN  (2, 41,63,81,123,121,21,22,23,24) OR ID_TOKEN LIKE '%______________A_____%'))\n"
                + "                AND  FECHA_CIERRE > FECHA_ASIGNACION\n"
                + "                AND " + condicionq + "\n"
                + "               --AND ID_TOKEN ='AT220922184535YE0066'\n"
                + "        ) A\n"
                + "          INNER JOIN\n"
                + "        dg3861.PW_QUEUE_TOKEN B\n"
                + "          ON A.ID_TOKEN= B.ID_TOKEN\n"
                + "          INNER JOIN\n"
                + "        dg3861.PW_QUEUE_USUARIO C\n"
                + "          ON A.ID_USUARIO= C.ID_USUARIO\n"
                + "        GROUP BY  C.USUARIO, B.TIPO_SOLICITUD , A.MINUTOS  \n"
                + "        )\n"
                + ") \n"
                + "SELECT  usuario, tipo_sol, CEIL (sum (minutos)/sum(CASE WHEN total_sol = 0 THEN 0.1 ELSE total_sol end)) PROM, SUM(TOTAL_SOL) TOTAL_SOl FROM (\n"
                + "SELECT usr usuario, tipo_sol, nvl(minutos, totalaux) minutos, nvl( TOTAL_SOL, totalaux) total_sol FROM (\n"
                + "SELECT A.NOMBRE_ROL TIPO_SOL, B.USUARIO usr, 0 totalaux, c.* FROM ( SELECT NOMBRE_ROL  FROM dg3861.PW_QUEUE_TIPOSOL WHERE ID_SOL NOT IN (8,9))  A\n"
                + "   LEFT JOIN( SELECT * FROM  dg3861.PW_QUEUE_USUARIO WHERE usuario IN (SELECT DISTINCT usuario FROM QAUX)) B\n"
                + "      ON 1=1\n"
                + "         LEFT JOIN QAUX c\n"
                + "         ON a.NOMBRE_ROL=c.TIPO_SOLICITUD\n"
                + "         AND b.usuario = c.usuario   \n"
                + "         )\n"
                + "         )         \n"
                + "  GROUP BY  usuario, tipo_sol\n"
                + "  ORDER BY tipo_sol ASC, usuario ASC";

        String ConsultaAsig = "WITH AUX AS (\n"
                + " SELECT b.USUARIO, TO_CHAR(FECHA_ASIGNACION, '" + forlineax + "') FECHA, COUNT(1) TOTAL_ASIG\n"
                + "    FROM PW_QUEUE_BITACTUAL a\n"
                + "        LEFT JOIN PW_QUEUE_USUARIO b\n"
                + "        ON a.ID_USUARIO = b.ID_USUARIO    where  " + condicionq + "       \n"
                + "GROUP BY b.USUARIO, TO_CHAR(FECHA_ASIGNACION, '" + forlineax + "')\n"
                + "ORDER BY USUARIO , FECHA)\n"
                + "SELECT DISTINCT a.usuario, b.fecha,0 FROM AUX A \n"
                + "   FULL OUTER join (SELECT DISTINCT fecha FROM AUX) b\n"
                + "    ON 1=1\n"
                + "--    ORDER BY b.fecha, usuario\n"
                + "   MINUS\n"
                + " SELECT DISTINCT usuario, fecha,0 FROM AUX\n"
                + " UNION ALL \n"
                + " SELECT * FROM AUX  ORDER BY 1,2";

        //System.out.println("QUERY 1:" + ConsultaSolicitudes);
        //System.out.println("QUERY 2:" + ConsultaPromedioA);
        System.out.println("QUERY UNKW: " + ConsultaAsig);
        try {
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            ResultSet rSet;

            rSet = con.ejecutarQuery(ConsultaSolicitudes);

            while (rSet.next()) {
                //System.out.println("DATOS: " + rSet.getString("USUARIO"));
                attid.add(rSet.getString("USUARIO"));
                //System.out.println("DATOS: " + rSet.getInt("ATENDIENDO"));
                atendiendo.add(rSet.getInt("ATENDIENDO"));
                //System.out.println("DATOS: " + rSet.getInt("FINALIZADAS"));
                finalizadas.add(rSet.getInt("FINALIZADAS"));
            }

            createStackedBarModel(attid, atendiendo, finalizadas);

            rSet.close();

            rSet = con.ejecutarQuery(ConsultaPromedioA);
            while (rSet.next()) {
                attid1.add(rSet.getString("USUARIO"));
                tipo.add(rSet.getString("TIPO_SOL"));
                prom.add(rSet.getInt("PROM"));
                total.add(rSet.getInt("TOTAL_SOL"));
            }
            createPromedioAtencion(attid1, tipo, prom, total);

            rSet.close();

            rSet = con.ejecutarQuery(ConsultaAsig);

            while (rSet.next()) {
                attid2.add(rSet.getString("USUARIO"));
                fecha.add(rSet.getString("FECHA"));
                asig.add(rSet.getInt("0"));
            }

            createLineModel(attid2, fecha, asig);

            rSet.close();

            con.con.close();

        } catch (SQLException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,
                    "ERROR", "Estadisticas:" + ex));
        }
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

    public List<String> getUserss() {
        return userss;
    }

    public void setUserss(List<String> userss) {
        this.userss = userss;
    }

    public List<String> getEstatus() {
        return estatus;
    }

    public void setEstatus(List<String> estatus) {
        this.estatus = estatus;
    }

    public List<String> getPriori() {
        return priori;
    }

    public void setPriori(List<String> priori) {
        this.priori = priori;
    }

    public String getBuser() {
        return buser;
    }

    public void setBuser(String buser) {
        this.buser = buser;
    }

    public String getBestado() {
        return bestado;
    }

    public void setBestado(String bestado) {
        this.bestado = bestado;
    }

    public String getBpriori() {
        return bpriori;
    }

    public void setBpriori(String bpriori) {
        this.bpriori = bpriori;
    }

    public String getRea_idtoken() {
        return rea_idtoken;
    }

    public void setRea_idtoken(String rea_idtoken) {
        this.rea_idtoken = rea_idtoken;
    }

    public List<String> getRuserss() {
        return ruserss;
    }

    public void setRuserss(List<String> ruserss) {
        this.ruserss = ruserss;
    }

    public boolean isRea_dialogo() {
        return rea_dialogo;
    }

    public void setRea_dialogo(boolean rea_dialogo) {
        this.rea_dialogo = rea_dialogo;
    }

    public int getRea_newuser() {
        return rea_newuser;
    }

    public void setRea_newuser(int rea_newuser) {
        this.rea_newuser = rea_newuser;
    }

    public int getRea_olduser() {
        return rea_olduser;
    }

    public void setRea_olduser(int rea_olduser) {
        this.rea_olduser = rea_olduser;
    }

    public String getRea_newusers() {
        return rea_newusers;
    }

    public void setRea_newusers(String rea_newusers) {
        this.rea_newusers = rea_newusers;
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

    public String getHola() {
        return hola;
    }

    public void setHola(String hola) {
        this.hola = hola;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public int getValue4() {
        return value4;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
    }

    public ArrayList getGluser() {
        return gluser;
    }

    public void setGluser(ArrayList gluser) {
        this.gluser = gluser;
    }

    public ArrayList getGlfecha() {
        return glfecha;
    }

    public void setGlfecha(ArrayList glfecha) {
        this.glfecha = glfecha;
    }

    public ArrayList getGltotal() {
        return gltotal;
    }

    public void setGltotal(ArrayList gltotal) {
        this.gltotal = gltotal;
    }

    public boolean isBesta() {
        return besta;
    }

    public void setBesta(boolean besta) {
        this.besta = besta;
    }

    public List<SetPlayQueue_bancotrab> getUsuariosC() {
        return UsuariosC;
    }

    public void setUsuariosC(List<SetPlayQueue_bancotrab> UsuariosC) {
        this.UsuariosC = UsuariosC;
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

    public BarChartModel getBarModel() {
        return barModel;
    }

    public void setBarModel(BarChartModel barModel) {
        this.barModel = barModel;
    }

    public BarChartModel getStackedBarModel() {
        return stackedBarModel;
    }

    public void setStackedBarModel(BarChartModel stackedBarModel) {
        this.stackedBarModel = stackedBarModel;
    }

    public LineChartModel getLineModel() {
        return lineModel;
    }

    public void setLineModel(LineChartModel lineModel) {
        this.lineModel = lineModel;
    }

    public BarChartModel getStackedGroupBarModel() {
        return stackedGroupBarModel;
    }

    public void setStackedGroupBarModel(BarChartModel stackedGroupBarModel) {
        this.stackedGroupBarModel = stackedGroupBarModel;
    }

    public LocalDate getMinDate() {
        return minDate;
    }

    public void setMinDate(LocalDate minDate) {
        this.minDate = minDate;
    }

    public LocalDate getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(LocalDate maxDate) {
        this.maxDate = maxDate;
    }

}
