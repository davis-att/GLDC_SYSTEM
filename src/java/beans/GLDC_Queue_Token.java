/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clasesUtiles.SetPlayCatalogosToken;
import clasesUtiles.SetPlayGLDC_Token;

import java.io.IOException;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpServletRequest;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import javax.annotation.PostConstruct;

@ManagedBean
@ViewScoped
@Named(value = "GLDCToken")

public class GLDC_Queue_Token implements Serializable {

    private String vpanel = "false";
    private String rea_idtoken = "";
    private boolean rea_dialogo = true;

    String NO_OFICIO, ID_USUARIO, TIPO_SOLICITUD, ID_PRIORIDAD, MEDIO_RECEPCION, FECHA_REGISTRO, TIPO_IDENTIFICADOR, PROCEDE, FIRMA, TERMINO, FUNDAMENTO, OBERVACION, COLOR;
    static int contador;
    boolean rendered;
    boolean v_tipo_envio = false;
    boolean v_prioridad = false;
    boolean v_procede = false;
    boolean v_fundamento = false;
    boolean v_firma = false;
    boolean v_termino = false;
    boolean v_indicardor = false;
    boolean v_no_oficio = false;
    boolean v_comentarios = false;

    boolean v_ticket = false;
    boolean v_caso = false;
    String TOKEN, EliTOKEN;
    String NTICKET, Caso;

    String Ckprocede, CkTipoSol, CKPriori, CKFundam, CKfirma, CKTermino, CKRescep, CKObserva, CKToken, CKID_CASO, CKNTICKET;

    private List<SetPlayGLDC_Token> listaPrioridad = new ArrayList<>();

    private List<SetPlayGLDC_Token> mostrarProcesados = new ArrayList<>();
    private List<SetPlayGLDC_Token> filteredProcesados = new ArrayList<>();
    private List<SetPlayGLDC_Token> detProcesados = new ArrayList<>();
    SetPlayGLDC_Token selectedProcesados;
    private List<SetPlayCatalogosToken> Tiposol;

    @PostConstruct

    public void init() {
        rendered = false;

        consulta();

    }

    public void consulta() {

        System.out.println("Entra el Setplay de TOKEN ");

        try {

            ResultSet rSet, rSet1;
            detProcesados.clear();
            mostrarProcesados.clear();
            filteredProcesados.clear();

            //System.out.println("Entra el Setplay ");
            String query1 = "SELECT * FROM (\n"
                    + "SELECT A.ID_TOKEN, A.TIPO_IDENTIFICADOR, A.NO_OFICIO, B.USUARIO, A.TIPO_SOLICITUD, C.NOMBRE_PRIORIDAD, A.MEDIO_RECEPCION, A.FECHA_REGISTRO,  C.COLORP  \n"
                    + "FROM  pw_queue_token A\n"
                    + "	LEFT JOIN DG3861.pw_queue_usuario B \n"
                    + "	ON A.ID_USUARIO = B.ID_USUARIO \n"
                    + "		LEFT JOIN pw_queue_prioridad C\n"
                    + "		ON A.ID_PRIORIDAD = C.ID_PRIORIDAD\n"
                    + "WHERE A.ELIMINAR = 0\n"
                    + "ORDER BY  A.FECHA_REGISTRO DESC \n"
                    + ") \n"
                    + "--WHERE FECHA_REGISTRO > SYSDATE -2";
            int cont = 0;

            // Herramientas.Conexion_DS_GLDC con = new Herramientas.Conexion_DS_GLDC("jdbc/gldc");
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            //String query ="select * from all_tables";
            rSet = con.ejecutarQuery(query1);
            while (rSet.next()) {

                SetPlayGLDC_Token datosprincipal
                        = new SetPlayGLDC_Token(rSet.getString(1),
                                rSet.getString(2),
                                rSet.getString(3),
                                rSet.getString(4),
                                rSet.getString(5),
                                rSet.getString(6),
                                rSet.getString(7),
                                rSet.getString(8),
                                rSet.getString(9));

                mostrarProcesados.add(datosprincipal);
                filteredProcesados.add(datosprincipal);

                //System.out.println(rSet.getString(1)+rSet.getString(2)+rSet.getString(3)+rSet.getString(4)+rSet.getString(5)+rSet.getString(6)+rSet.getString(7));
                cont = cont + 1;
            }
            // System.out.println();             
            Tiposol = new ArrayList<>();
            Tiposol.clear();
            rSet1 = con.ejecutarQuery("SELECT NOMBRE_ROL FROM pw_queue_tiposol ORDER by ID_SOL");

            while (rSet1.next()) {
                SetPlayCatalogosToken datos = new SetPlayCatalogosToken(rSet1.getString(1));
                //System.out.println(rSet1.getString(1));
                Tiposol.add(datos);
            }

            con.con.close();

        } catch (SQLException ex) {
            System.out.println("ERROR:Error de BD: "
                    + ex.getMessage());
        }

    }

    public void insertaquery(String Nombre) throws SQLException, ParseException {
        try {
            rendered = true;
            ResultSet rSet;
            int cont = 0;
            String id_usua = "";
            String id_prio = "";

            //                  System.out.println("Numero de oficio: "+NO_OFICIO);
            //                  System.out.println("Id de usuario: "+ID_USUARIO);
            //                  System.out.println("TIPO SOLICITUD: "+TIPO_SOLICITUD);
            //                  System.out.println("ID PRIORIDAD: "+ID_PRIORIDAD);
            //                  System.out.println("medio de recepcion: "+MEDIO_RECEPCION);
            //                   System.out.println("procede: "+PROCEDE);
            //                  System.out.println("firma: "+FIRMA);
            //                  System.out.println("termino: "+TERMINO);
            //                  System.out.println("fundamento: "+FUNDAMENTO);
            //                 System.out.println("Observaciones: "+ OBERVACION );
            String R1 = "", R2;

            if ("".equals(OBERVACION) || OBERVACION == null) {
                OBERVACION = "Sin comentarios";
                System.out.println(OBERVACION);
            } else {
                R1 = OBERVACION.replaceAll("'", " ");

            }
            System.out.println(R1);
            R2 = NO_OFICIO.replaceAll("'", " ");
//
            String Query1 = "SELECT ID_USUARIO FROM pw_queue_usuario WHERE USUARIO = '" + Nombre + "' ";
            String Query2 = "SELECT ID_PRIORIDAD FROM  pw_queue_prioridad WHERE NOMBRE_PRIORIDAD = '" + ID_PRIORIDAD + "'";

            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            rSet = con.ejecutarQuery(Query1);
            while (rSet.next()) {
                id_usua = rSet.getString(1);
                cont++;
            }

            rSet = con.ejecutarQuery(Query2);
            while (rSet.next()) {
                id_prio = rSet.getString(1);
                cont++;
            }

            String Query3 = "INSERT INTO pw_queue_token "
                    + "VALUES ('" + TOKEN + "','" + R2 + "', " + id_usua + ", '" + TIPO_SOLICITUD + "', " + id_prio + ", '" + MEDIO_RECEPCION + "', sysdate, '" + TIPO_IDENTIFICADOR + "','0','" + PROCEDE + "','" + FIRMA + "','" + TERMINO + "','" + FUNDAMENTO + "','" + R1 + "'," + Caso + ", '" + NTICKET + "' )";
            String Query5 = "INSERT INTO PW_QUEUE_BITACORA (ID_TOKEN,ID_USUARIO,ESTATUS, FECHA_ESTATUS, ID_PRIORIDAD, FECHA_REGISTRO ) \n"
                    + "						VALUES ('" + TOKEN + "', NULL, 1, sysdate," + id_prio + ", sysdate)";
            String Query6 = "INSERT INTO PW_QUEUE_BITACTUAL (ID_TOKEN,ID_USUARIO,ESTATUS, FECHA_ESTATUS, ID_PRIORIDAD, FECHA_REGISTRO ) \n"
                    + "						VALUES ('" + TOKEN + "', NULL, 1, sysdate," + id_prio + ", sysdate)";

            con.ejecutarQuery(Query3);
            con.ejecutarQuery(Query5);
            con.ejecutarQuery(Query6);
            con.con.close();

            System.out.println(Query3);
//System.out.println(Query2);
//System.out.println(Query3);

            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Se genero el TOKEN "));
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(GLDC_Queue_Token.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("Error en BD", "" + ex + " "));

        }

    }

    public void onRowEdit(RowEditEvent event) {
        boolean band = true;
        int NomP = 0;
        try {

            // System.out.println(event.getObject());
            SetPlayGLDC_Token datos = (SetPlayGLDC_Token) event.getObject();
            //System.out.println(datos.getTIPO_SOLICITUD()+" "+datos.getID_PRIORIDAD());

            if ("Exigente".equals(datos.getID_PRIORIDAD())) {
                NomP = 1;
            }

            if ("Urgente".equals(datos.getID_PRIORIDAD())) {
                NomP = 3;
            }

            if ("Normal".equals(datos.getID_PRIORIDAD())) {
                NomP = 6;
            }

            if ("Baja".equals(datos.getID_PRIORIDAD())) {
                NomP = 7;
            }

            int ValorPrio = 0;
            int cont = 0;
            ResultSet rSet;
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            String update = "UPDATE DG3861.PW_QUEUE_TOKEN\n"
                    + "SET TIPO_SOLICITUD = '" + datos.getTIPO_SOLICITUD() + "', \n"
                    + "ID_PRIORIDAD   = " + NomP + "\n"
                    + "WHERE ID_TOKEN = '" + datos.getID_TOKEN() + "'";

            con.ejecutarQuery(update);
            //System.out.println(update);

            String Prioridad = "SELECT  b.id_prioridadatencion, d.FECHA_REGISTRO  \n"
                    + "FROM DG3861.PW_QUEUE_TOKEN A\n"
                    + "	INNER JOIN DG3861.pw_queue_priori_atencion B\n"
                    + "	   ON A.ID_PRIORIDAD  = B.ID_PRIORIDAD \n"
                    + "			INNER JOIN   DG3861.PW_QUEUE_TIPOSOL C\n"
                    + "				ON a.tipo_solicitud = c.NOMBRE_ROL\n"
                    + "				   AND c.id_sol=b.id_solicitud\n"
                    + "				   	 INNER JOIN DG3861.PW_QUEUE_BITACTUAl d\n"
                    + "				   	   ON  a.id_token = d.id_token\n"
                    + "WHERE A.ID_TOKEN = '" + datos.getID_TOKEN() + "' 				   	   \n"
                    + "ORDER BY b.id_prioridadatencion ,FECHA_REGISTRO";

            rSet = con.ejecutarQuery(Prioridad);
            while (rSet.next()) {
                ValorPrio = rSet.getInt(1);
                cont++;
            }

            // System.out.println(ValorPrio);
            String update2 = "UPDATE DG3861.PW_QUEUE_BITACTUAL\n"
                    + "SET ID_PRIORIDAD   = " + ValorPrio + "\n"
                    + "WHERE ID_TOKEN = '" + datos.getID_TOKEN() + "'";

            String update3 = "UPDATE DG3861.PW_QUEUE_BITACORA\n"
                    + "SET ID_PRIORIDAD   = " + ValorPrio + "\n"
                    + "WHERE ID_TOKEN = '" + datos.getID_TOKEN() + "'";

            con.ejecutarQuery(update2);
            con.ejecutarQuery(update3);

            con.con.close();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar:" + ex);
            FacesMessage msg = new FacesMessage("Error al actualizar:" + ex);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            band = false;
        }
        if (band) {
            FacesMessage msg = new FacesMessage("Actualización Exitosa");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("No se realiza ningun cambio");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void GenerarTk(String Nombre) throws SQLException, ParseException {

        System.out.println("Entra a Generar TOKEN");

        /* if(TIPO_IDENTIFICADOR == null || "".equals(TIPO_IDENTIFICADOR)) 
           {
             FacesContext context = FacesContext.getCurrentInstance();
             context.addMessage(null, new FacesMessage(" Se necesita el identificador " ) );
           }
       else if(NO_OFICIO == null || "".equals(NO_OFICIO))
           {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(" Se necesita Numero del Oficio " ) );
          }
       
       else*/
        if (TIPO_SOLICITUD == null || "".equals(TIPO_SOLICITUD)) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(" Se necesita el Tipo de solicitud "));
        } else if (ID_PRIORIDAD == null || "".equals(ID_PRIORIDAD)) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(" Se necesita la Prioridad "));
        } else if ("Intervención Legal Baja Natural".equals(TIPO_SOLICITUD)) {
            if (NTICKET == null || "".equals(NTICKET)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(" Se necesita el NUMERO DE TICKET "));
            } else if (Caso == null || "".equals(Caso)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(" Se necesita el NUMERO DE CASO "));
            } else {
                GenerarTK2(Nombre);

            }
        } else if ("Localización Geográfica Baja Natural".equals(TIPO_SOLICITUD)) {
            if (NTICKET == null || "".equals(NTICKET)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(" Se necesita el NUMERO DE TICKET "));
            } else if (Caso == null || "".equals(Caso)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(" Se necesita el NUMERO DE CASO "));
            } else {
                GenerarTK2(Nombre);

            }

        } else {

            GenerarTK2(Nombre);

        }
    }

    public void GenerarTK2(String Nombre) throws SQLException, ParseException {

        String timeStamp = new java.text.SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime());

        contador = contador + 1;

        String Res = MEDIO_RECEPCION.substring(0, 1);
        String Nom = Nombre.substring(0, 1).toUpperCase();

        if (contador < 10) {
            TOKEN = "AT" + timeStamp + Nom + Res + "000" + contador;
        } else if (contador > 9 && contador < 100) {
            TOKEN = "AT" + timeStamp + Nom + Res + "00" + contador;

        } else if (contador > 99 && contador < 1000) {
            TOKEN = "AT" + timeStamp + Nom + Res + "0" + contador;
        } else {
            TOKEN = "AT" + timeStamp + Nom + Res + contador;

        }

        insertaquery(Nombre);

    }

    public void borrar() {
        ResultSet rSet;
        int cont = 0;
        String Val_estatus = "";
        System.out.println("Entra borrar TOKEN ");
        //System.out.println(EliTOKEN);

        try {

            String Query7 = "SELECT ID_TOKEN FROM DG3861.PW_QUEUE_TOKEN		\n"
                    + "	WHERE ID_TOKEN IN (SELECT ID_TOKEN FROM DG3861.PW_QUEUE_BITACTUAL \n"
                    + "							WHERE ESTATUS IN (1,3)\n"
                    + "							AND ID_TOKEN = '" + EliTOKEN + "' )";

            String Update1 = "UPDATE  DG3861.pw_queue_token SET ELIMINAR = 1\n"
                    + "WHERE ID_TOKEN = '" + EliTOKEN + "'";

            String Insert1 = "INSERT INTO DG3861.PW_QUEUE_BITACORA\n"
                    + "SELECT NULL, ID_TOKEN, TICKET_NUMBER, ID_USUARIO, ID_LOGIN, 24, FECHA_ASIGNACION, SYSDATE, FECHA_CIERRE, ID_PRIORIDAD, BAND_REASIGNADO, sysdate\n"
                    + "FROM DG3861.PW_QUEUE_BITACORA\n"
                    + "WHERE (ID_TOKEN,FECHA_REGISTRO ) IN (\n"
                    + "SELECT ID_TOKEN, max(FECHA_REGISTRO) FROM DG3861.pw_queue_bitacora WHERE ID_TOKEN='" + EliTOKEN + "' GROUP BY ID_TOKEN)";

            String Update2 = "UPDATE  DG3861.PW_QUEUE_BITACTUAL SET ESTATUS = 24, FECHA_ESTATUS = SYSDATE \n"
                    + "WHERE ID_TOKEN = '" + EliTOKEN + "'\n"
                    + "AND ESTATUS IN (1,3)";
            // System.out.println(Query4);
            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

            rSet = con.ejecutarQuery(Query7);
            while (rSet.next()) {
                Val_estatus = rSet.getString(1);
                cont++;
            }

            //  System.out.println("valor de "+Val_estatus);
            if ("".equals(Val_estatus) || Val_estatus == null) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage("No se puede borrar, \n Esta siendo atendido"));
            } else {
                con.ejecutarQuery(Insert1);
                con.ejecutarQuery(Update1);
                con.ejecutarQuery(Update2);
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage("Se Borro el TOKEN "));
            }
            con.con.close();

            consulta();
        } catch (SQLException ex) {
            System.out.println("ERROR:Error de BD: "
                    + ex.getMessage());
        }

    }

    public void clipboard() {
        String myString = TOKEN;
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public void reload() throws IOException {

        limpiar();
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }

    public void limpiar() {
        NO_OFICIO = "";
        ID_USUARIO = "";
        TIPO_SOLICITUD = "";
        ID_PRIORIDAD = "";
        MEDIO_RECEPCION = "";
        FECHA_REGISTRO = "";
        PROCEDE = "";
        FIRMA = "";
        TERMINO = "";
        FUNDAMENTO = "";

        v_tipo_envio = false;
        v_prioridad = false;
        v_procede = false;
        v_fundamento = false;
        v_firma = false;
        v_termino = false;

        CKToken = "";
        Ckprocede = "";
        CkTipoSol = "";
        CKPriori = "";
        CKFundam = "";
        CKfirma = "";
        CKTermino = "";
        CKRescep = "";
        CKObserva = "";
        CKID_CASO = "";
        CKNTICKET = "";

    }

    public void catalogosPrioridades() {

        listaPrioridad = new ArrayList<>();

        try {

            ResultSet rSet;

            Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");
            rSet = con.ejecutarQuery("SELECT C.NOMBRE_PRIORIDAD FROM DG3861.PW_QUEUE_PRIORI_ATENCION A \n"
                    + "	LEFT JOIN DG3861.PW_QUEUE_TIPOSOL B \n"
                    + "		ON A.ID_SOLICITUD = B.ID_SOL \n"
                    + "			LEFT JOIN DG3861.PW_QUEUE_PRIORIDAD C\n"
                    + "				ON	A.ID_PRIORIDAD = C.ID_PRIORIDAD\n"
                    + "WHERE NOMBRE_ROL = '" + TIPO_SOLICITUD + "'");

            while (rSet.next()) {
                SetPlayGLDC_Token datos = new SetPlayGLDC_Token(rSet.getString(1));
                //System.out.println(rSet.getString(1));
                listaPrioridad.add(datos);

            }

            con.con.close();

            if ("Intervención Legal".equals(TIPO_SOLICITUD)) {
                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "SI";
                TERMINO = "24 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = false;
                v_caso = false;

            } else if ("Localización Geográfica".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Exigente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "1 hr";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_ticket = false;
                v_caso = false;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;
            } else if ("Ordenes de Información Histórica".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "48 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = false;
                v_caso = false;
            } else if ("Suspensión de Servicios".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "48 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = false;
                v_caso = false;

            } else if ("Aclaración".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "48 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = false;
                v_caso = false;
            } else if ("Cobertura de Radio Bases".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "24 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = false;
                v_caso = false;
            } else if ("CDRs CISEN".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "24 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "NULL";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = false;
                v_caso = false;
            } else if ("Intervención Legal Baja Natural".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Urgente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "24 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = true;
                v_caso = true;

            } else if ("Localización Geográfica Baja Natural".equals(TIPO_SOLICITUD)) {

                ID_PRIORIDAD = "Exigente";
                PROCEDE = "SI";
                FUNDAMENTO = "FUNDAMENTO EN LOS ARTICULOS 189 Y 190 DE LA LEY FEDERAL DE TELECOMUNICACIONES Y RADIODIFUSION Y ARTICULO 303 DEL CODIGO NACIONAL DE PROCEDIMIENTOS PENALES";
                FIRMA = "NO";
                TERMINO = "24 hrs";
                MEDIO_RECEPCION = "Email";
                NTICKET = "";
                Caso = "";

                v_prioridad = true;
                v_procede = true;
                v_fundamento = true;
                v_firma = true;
                v_termino = true;
                v_tipo_envio = true;
                v_termino = true;
                v_indicardor = true;
                v_no_oficio = true;
                v_comentarios = true;

                v_ticket = true;
                v_caso = true;
            }

        } catch (SQLException ex) {
            System.out.println("Error en BD:" + ex);
        }

    }

    public void onRowSelect() throws IOException {

        System.out.println("Entra consultar Check List");

        if (EliTOKEN == null || "".equals(EliTOKEN)) {
            FacesMessage msg = new FacesMessage("Introducir un Valor");
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } else {

            //      rea_dialogo=true;
            //       rea_idtoken=((SetPlayGLDC_Token) event.getObject()).getID_TOKEN();
            //         System.out.println("Seleecion: "+((SetPlayGLDC_Token) event.getObject()).getID_TOKEN());
            ResultSet rSet;
            int cont = 0;

            //System.out.println(EliTOKEN);
            try {

                String ConSulChekList = "SELECT A.ID_TOKEN, A.PROCEDE,A.TIPO_SOLICITUD, B.NOMBRE_PRIORIDAD, A.FUNDAMENTO, A.FIRMA, A.TÉRMINO, A.MEDIO_RECEPCION,A.OBSERVACIONES, A.ID_CASO, A.NTICKET \n"
                        + "	  FROM DG3861.PW_QUEUE_TOKEN A\n"
                        + " 		LEFT JOIN DG3861.PW_QUEUE_PRIORIDAD B \n"
                        + " 		ON A.ID_PRIORIDAD = B.ID_PRIORIDAD\n"
                        + "WHERE A.ID_TOKEN = '" + EliTOKEN + "'";

                //   System.out.println(ConSulChekList);
                Herramientas.Conexion con = new Herramientas.Conexion("DG3861_DGLDCSTG");

                rSet = con.ejecutarQuery(ConSulChekList);
                while (rSet.next()) {
                    CKToken = rSet.getString(1);
                    Ckprocede = rSet.getString(2);
                    CkTipoSol = rSet.getString(3);
                    CKPriori = rSet.getString(4);
                    CKFundam = rSet.getString(5);
                    CKfirma = rSet.getString(6);
                    CKTermino = rSet.getString(7);
                    CKRescep = rSet.getString(8);
                    CKObserva = rSet.getString(9);
                    CKID_CASO = rSet.getString(10);
                    CKNTICKET = rSet.getString(11);
                    cont++;
                }

                //  System.out.println("valor de "+Val_estatus);
                con.con.close();

                if ("".equals(CKToken) || CKToken == null) {
                    FacesMessage msg = new FacesMessage("Valor incorrecto");
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                } else {

                    if ("".equals(CKObserva) || CKObserva == null) {
                        CKObserva = "Sin comentarios";
                    }

                    if ("Intervención Legal Baja Natural".equals(CkTipoSol) || "Localización Geográfica Baja Natural".equals(CkTipoSol)) {
                        v_ticket = true;
                        v_caso = true;
                    } else {
                        v_ticket = false;
                        v_caso = false;
                    }
                }
                //EliTOKEN = "";

                /*  System.out.println("Proicede "+Ckprocede);
            System.out.println("Proicede "+CkTipoSol);
            System.out.println("Proicede "+CKPriori);
            System.out.println("Proicede "+CKFundam);
            System.out.println("Proicede "+CKfirma);
            System.out.println("Proicede "+CKTermino);
            System.out.println("Proicede "+CKRescep);
            System.out.println("Proicede "+CKObserva);
            System.out.println("Proicede "+CKToken);
                 */
            } catch (SQLException ex) {
                System.out.println("ERROR:Error de BD: "
                        + ex.getMessage());
            }
        }

    }

    public String getCKID_CASO() {
        return CKID_CASO;
    }

    public void setCKID_CASO(String CKID_CASO) {
        this.CKID_CASO = CKID_CASO;
    }

    public String getCKNTICKET() {
        return CKNTICKET;
    }

    public void setCKNTICKET(String CKNTICKET) {
        this.CKNTICKET = CKNTICKET;
    }

    public String getRea_idtoken() {
        return rea_idtoken;
    }

    public void setRea_idtoken(String rea_idtoken) {
        this.rea_idtoken = rea_idtoken;
    }

    public boolean isRea_dialogo() {
        return rea_dialogo;
    }

    public void setRea_dialogo(boolean rea_dialogo) {
        this.rea_dialogo = rea_dialogo;
    }

    public String getCKToken() {
        return CKToken;
    }

    public void setCKToken(String CKToken) {
        this.CKToken = CKToken;
    }

    public String getCkprocede() {
        return Ckprocede;
    }

    public void setCkprocede(String Ckprocede) {
        this.Ckprocede = Ckprocede;
    }

    public String getCkTipoSol() {
        return CkTipoSol;
    }

    public void setCkTipoSol(String CkTipoSol) {
        this.CkTipoSol = CkTipoSol;
    }

    public String getCKPriori() {
        return CKPriori;
    }

    public void setCKPriori(String CKPriori) {
        this.CKPriori = CKPriori;
    }

    public String getCKFundam() {
        return CKFundam;
    }

    public void setCKFundam(String CKFundam) {
        this.CKFundam = CKFundam;
    }

    public String getCKfirma() {
        return CKfirma;
    }

    public void setCKfirma(String CKfirma) {
        this.CKfirma = CKfirma;
    }

    public String getCKTermino() {
        return CKTermino;
    }

    public void setCKTermino(String CKTermino) {
        this.CKTermino = CKTermino;
    }

    public String getCKRescep() {
        return CKRescep;
    }

    public void setCKRescep(String CKRescep) {
        this.CKRescep = CKRescep;
    }

    public String getCKObserva() {
        return CKObserva;
    }

    public void setCKObserva(String CKObserva) {
        this.CKObserva = CKObserva;
    }

    public boolean isV_indicardor() {
        return v_indicardor;
    }

    public void setV_indicardor(boolean v_indicardor) {
        this.v_indicardor = v_indicardor;
    }

    public boolean isV_no_oficio() {
        return v_no_oficio;
    }

    public void setV_no_oficio(boolean v_no_oficio) {
        this.v_no_oficio = v_no_oficio;
    }

    public boolean isV_comentarios() {
        return v_comentarios;
    }

    public void setV_comentarios(boolean v_comentarios) {
        this.v_comentarios = v_comentarios;
    }

    public boolean isV_ticket() {
        return v_ticket;
    }

    public void setV_ticket(boolean v_ticket) {
        this.v_ticket = v_ticket;
    }

    public boolean isV_caso() {
        return v_caso;
    }

    public void setV_caso(boolean v_caso) {
        this.v_caso = v_caso;
    }

    public String getNTICKET() {
        return NTICKET;
    }

    public void setNTICKET(String NTICKET) {
        this.NTICKET = NTICKET;
    }

    public String getCaso() {
        return Caso;
    }

    public void setCaso(String Caso) {
        this.Caso = Caso;
    }

    public boolean isV_tipo_envio() {
        return v_tipo_envio;
    }

    public void setV_tipo_envio(boolean v_tipo_envio) {
        this.v_tipo_envio = v_tipo_envio;
    }

    public boolean isV_prioridad() {
        return v_prioridad;
    }

    public void setV_prioridad(boolean v_prioridad) {
        this.v_prioridad = v_prioridad;
    }

    public boolean isV_procede() {
        return v_procede;
    }

    public void setV_procede(boolean v_procede) {
        this.v_procede = v_procede;
    }

    public boolean isV_fundamento() {
        return v_fundamento;
    }

    public void setV_fundamento(boolean v_fundamento) {
        this.v_fundamento = v_fundamento;
    }

    public boolean isV_firma() {
        return v_firma;
    }

    public void setV_firma(boolean v_firma) {
        this.v_firma = v_firma;
    }

    public boolean isV_termino() {
        return v_termino;
    }

    public void setV_termino(boolean v_termino) {
        this.v_termino = v_termino;
    }

    public List<SetPlayGLDC_Token> getListaPrioridad() {
        return listaPrioridad;
    }

    public void setListaPrioridad(List<SetPlayGLDC_Token> listaPrioridad) {
        this.listaPrioridad = listaPrioridad;
    }

    public List<SetPlayCatalogosToken> getTiposol() {
        return Tiposol;
    }

    public void setTiposol(List<SetPlayCatalogosToken> Tiposol) {
        this.Tiposol = Tiposol;
    }

    public String getVpanel() {
        return vpanel;
    }

    public void setVpanel(String vpanel) {
        this.vpanel = vpanel;
    }

    public String getNO_OFICIO() {
        return NO_OFICIO;
    }

    public void setNO_OFICIO(String NO_OFICIO) {
        this.NO_OFICIO = NO_OFICIO;
    }

    public String getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(String ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getTIPO_SOLICITUD() {
        return TIPO_SOLICITUD;
    }

    public void setTIPO_SOLICITUD(String TIPO_SOLICITUD) {
        this.TIPO_SOLICITUD = TIPO_SOLICITUD;
    }

    public String getID_PRIORIDAD() {
        return ID_PRIORIDAD;
    }

    public void setID_PRIORIDAD(String ID_PRIORIDAD) {
        this.ID_PRIORIDAD = ID_PRIORIDAD;
    }

    public String getMEDIO_RECEPCION() {
        return MEDIO_RECEPCION;
    }

    public void setMEDIO_RECEPCION(String MEDIO_RECEPCION) {
        this.MEDIO_RECEPCION = MEDIO_RECEPCION;
    }

    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    public List<SetPlayGLDC_Token> getMostrarProcesados() {
        return mostrarProcesados;
    }

    public void setMostrarProcesados(List<SetPlayGLDC_Token> mostrarProcesados) {
        this.mostrarProcesados = mostrarProcesados;
    }

    public List<SetPlayGLDC_Token> getFilteredProcesados() {
        return filteredProcesados;
    }

    public void setFilteredProcesados(List<SetPlayGLDC_Token> filteredProcesados) {
        this.filteredProcesados = filteredProcesados;
    }

    public List<SetPlayGLDC_Token> getDetProcesados() {
        return detProcesados;
    }

    public void setDetProcesados(List<SetPlayGLDC_Token> detProcesados) {
        this.detProcesados = detProcesados;
    }

    public SetPlayGLDC_Token getSelectedProcesados() {
        return selectedProcesados;
    }

    public void setSelectedProcesados(SetPlayGLDC_Token selectedProcesados) {
        this.selectedProcesados = selectedProcesados;
    }

    public String getTIPO_IDENTIFICADOR() {
        return TIPO_IDENTIFICADOR;
    }

    public void setTIPO_IDENTIFICADOR(String TIPO_IDENTIFICADOR) {
        this.TIPO_IDENTIFICADOR = TIPO_IDENTIFICADOR;
    }

    public String getEliTOKEN() {
        return EliTOKEN;
    }

    public void setEliTOKEN(String EliTOKEN) {
        this.EliTOKEN = EliTOKEN;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        GLDC_Queue_Token.contador = contador;
    }

    public String getPROCEDE() {
        return PROCEDE;
    }

    public void setPROCEDE(String PROCEDE) {
        this.PROCEDE = PROCEDE;
    }

    public String getFIRMA() {
        return FIRMA;
    }

    public void setFIRMA(String FIRMA) {
        this.FIRMA = FIRMA;
    }

    public String getTERMINO() {
        return TERMINO;
    }

    public void setTERMINO(String TERMINO) {
        this.TERMINO = TERMINO;
    }

    public String getFUNDAMENTO() {
        return FUNDAMENTO;
    }

    public void setFUNDAMENTO(String FUNDAMENTO) {
        this.FUNDAMENTO = FUNDAMENTO;
    }

    public String getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(String TOKEN) {
        this.TOKEN = TOKEN;
    }

    public boolean isRendered() {
        return rendered;
    }

    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

    public String getOBERVACION() {
        return OBERVACION;
    }

    public void setOBERVACION(String OBERVACION) {
        this.OBERVACION = OBERVACION;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

}
