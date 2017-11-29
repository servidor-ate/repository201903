package pe.royalsystems.springerp.model.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Constant implements Serializable{

	/*GENERAL NEGOCIO AQUILES*/
	
	public static final String SISTEMA_CODIGO = "SP4W";
	
	public static final String USUARIO_ADMINSYS= "ADMINSYS";
	public static final String COMPANIA_VARIABLE = "999999";
	public static final String APLICACION_CODIGO = "WA"; //***cambiar a WS ...pero PREVENIR IMPACTO EN DB
	public static final String PORC_APLICA_ASISTENCIA = "KEY_PORC_DESAPRUEBA";

	public static final String APP_CODIGO = "WA";
	public static final String APP_COMPANIA = "999999";

	
	private static final long serialVersionUID = -6743013645117707062L;	
	
	//public static ResourceBundle propiedadesParam= ResourceBundle.getBundle("parametrosService");
	
	

	
	/**CONSTANTES PARA LA TABLA DE USUARIO **/
	public static final String USUARIO = "US";
	public static final String PERFIL = "PE";
	public static final String DEFAULT_PASSWORD = "2";
	public static final int USUARIO_INTERNO = 1;
	public static final int USUARIO_EXERTNO = 2;
	
	public static final int AGENTE_PERFIL = 1;
	public static final int AGENTE_USUARIO = 2;
	
	public static final String DEFAULT_PAIS_ID = "PER";
	
	
	public static final String USUARIO_CLAVE_DEF = "1";
	
	/** CONSTANTES PARA SOLO PERFILES DE LA TABLA USUARIO **/
	public static final String PERFIL_PACIENTE_DEF = "PACIENTE";
	public static final String PLATAF_WEB = "WEB";
	
	/** TIPO DE MONEDA**/
	public static final String MONEDA_LOCAL = "LO";
	public static final String MONEDA_EXT = "EX";
	
	/** BOOLEAN EN INT **/
	public static final int INT_BOOLEAN_TRUE = 1;
	public static final int INT_BOOLEAN_FALSE = 0;
	
	public static final String TIPODOC_DNI = "D";
	
		
	

	
	public static final String PATTRON_CODIGO_CURR ="C-";
		
	public static int PRIORIDAD_APROBADO = 1;
	public static int PRIORIDAD_REPROBADO = 2;
	
	public static final String PERSONA_NATURAL = "N";
	public static final String PERSONA_JURIDICA = "J";
	
	/** CONSTANTES PARA CAMBIAR EL VALOR DEL UBIGEO DE LIMA CALLAO QUE SE OBTIENE DE LA RENIEC, HACIA LA BASE DE DATOS DEL ERP**/
	public static final String UBIGEO_DPTO_WS_RENIEC_LIMA_CALLAO = "24";
	public static final String UBIGEO_PROV_WS_RENIEC_LIMA_CALLAO = "01";
	
	public static final String UBIGEO_DPTO_DB_LIMA = "14";
	public static final String UBIGEO_PROV_DB_CALLAO = "11";
	
	/** SE USA EN REGISTRO DE ALUMNO EN LA COLUMNA EMPLEADO DE LA TABLA USUARIO **/
	public static int DOCUMENTO_DNI = 1;
	public static int DOCUMENTO_CARNET_EXTRANJERIA = 2;
	
	public static final String COD_DOCUMGEN_LOC = "LOC_";
	
	/** UNIDAD DE TIEMPO **/
	public static String PAR_UTIME_SEGUNDO="S";
	public static String PAR_UTIME_MINUTO="M";
	public static String PAR_UTIME_HORA="H";
	public static String PAR_UTIME_DIA="D";
	
	
	public static String COMPANIA = "COMPANIASOCIO";
	public static String SUCURSAL = "SUCURSAL";
	public static String APP_CODE = "SA";
	public static String COMPANIA_999999 = "999999";
	
	public static final String SI_db = "S";
	public static final String NO_db = "N";
	public static final int INT_SI = 1;
	public static final int INT_NO = 2;
	
	public static final String DELETE_db = "D";
	public static final String UPDATE_db = "U";
	public static final String INSERT_db = "I";
	
	public static final int YEAR_db = 1970;
	public static final int MONTH_db = 1;
	public static final int DAY_db = 1;
	public static final int HOUR_INI_db = 0;
	public static final int MINUTE_INI_db = 0;
	public static final int SECOND_INI_db = 0;
	public static final int MILLIS_INI_db = 0;
	public static final int HOUR_FIN_db = 23;
	public static final int MINUTE_FIN_db = 59;
	public static final int SECOND_FIN_db = 59;
	public static final int MILLIS_FIN_db = 59;
	
	public static final int INT_LUNES = DateTimeConstants.MONDAY;
	public static final int INT_MARTES = DateTimeConstants.TUESDAY;
	public static final int INT_MIERCOLES = DateTimeConstants.WEDNESDAY;
	public static final int INT_JUEVES = DateTimeConstants.THURSDAY;
	public static final int INT_VIERNES = DateTimeConstants.FRIDAY;
	public static final int INT_SABADO = DateTimeConstants.SATURDAY;
	public static final int INT_DOMINGO = DateTimeConstants.SUNDAY;
	
	public static final String INACTIVO = "I";
	public static final String ACTIVO = "A";
	public static final String ELIMINADO = "E";
	
	public static final String EST_CAMBIAR_CLAVE_db = "C";
	
	public static final Integer INT_INACTIVO = 2;
	public static final Integer INT_ACTIVO = 1;
	public static final Integer INT_MATRICULADO = 2;
	public static final Integer INT_NOTAFINAL = 6;
	public static final Integer INT_ELIMINADO = 3;
	public static final Integer INT_VIGENTE = 3;
	public static final Integer INT_NO_VIGENTE = 4;
	
	public static String TIPO_CLIENTE = "CL";
	public static String TIPO_CONTACTO = "CO";
	public static String TIPO_EMPLEADO = "EM";
	public static String TIPO_PROVEEDOR = "PR";
	public static String TIPO_GENERAL = "GE";
	
	public static String CURSO_LIBRE = "CURSO LIBRE";
	public static final int MODO_TRAMITE_GUARDAR = 1;
	public static final int MODO_TRAMITE_ENVIAR = 2;
	public static final int MODO_TRAMITE_APROBAR = 3;
	public static final int MODO_TRAMITE_ANULAR = 4;
	
	/** TABLA SA_ALUMNOBLO **/
	public static int TABLA_SA_ALUMNOBLOQUEO = 39;
	public static int ESTADO_ALUMNOBLOQUEO_SOLICITUD = 94;
	public static int ESTADO_ALUMNOBLOQUEO_APROBADO = 95;
	public static int ESTADO_ALUMNOBLOQUEO_RECHAZADO = 96;
	
	public static final int TIPO_CURSO_NO_APLICA = 3;
	
	public static final int CONECTOR_AND = 1;
	public static final int CONECTOR_OR = 2;
	
	/** VALOR DEL CUMPLIMIENTO CUANDO NO ESTA SUGETO A REQUISITOS DE OTROS CURSOS**/
	public static final int CUMPLIMIENTO_NINGUNO = 1;
	public static final int CUMPLIMIENTO_REQUISITO = 2;
	
	/** ESTADOS DE LA CARGA HORARIA **/
	public static final int CARGA_HORARIA_PROPUESTO = 1;
	public static final int CARGA_HORARIA_APROBADO = 2;
	public static final int CARGA_HORARIA_APROBADO_RRHH = 3;
	public static final int CARGA_HORARIA_ANULADO = 4;
	
	/** GRADOS Y TITULOS **/
	public static final int ALUMNO_ESTADO_EGRESADO = 1;
	public static final int ALUMNO_ESTADO_ESTUDIANTE = 2;
	public static final int DOCUMENTO_ESTADO_ENTREGADO = 1;
	public static final int DOCUMENTO_ESTADO_PENDIENTE = 2;
	public static final String ACRONIMO_ENAP = "ENAP";
	public static final int TABLA_SA_TITULOGRADO_HEADER = 23;
	public static final int ESTADO_TITULOGRADO_PENDIENTE = 1;
	public static final int ESTADO_TITULOGRADO_ENTREGADO = 2;
	public static final int ESTADO_TITULOGRADO_ATENDIDO = 7;
	public static final String TITULOGRADO_PENDIENTE = "Pendiente";
	public static final String TITULOGRADO_ENTREGADO = "Entregado";		
	public static final int TABLA_TIPOS_DOCUMENTOS = 3;		
	public static final int  SOLICITA_DOCUMENTO_CERTIFICADO = 20;
	public static final int  SOLICITA_DOCUMENTO_DIPLOMA = 21;
	public static final int  SOLICITA_DOCUMENTO_OTRO = 22;	
	public static final int  SOLICITA_DOCUMENTO_MAESTRIA = 23;
	public static final int  SOLICITA_DOCUMENTO_DOCTORADO = 24;
	
	/*** ***/
	public static final int DEFAULT_TIPO_CLASE = 1;
	
	/*** CONSTANTES PARA CONVERTIR DE UNA UNIDAD DE TIEMPO A MINUTOS ***/
	public static final int DURACION_ANIO = 1;
	public static final int DURACION_MES = 2;
	public static final int DURACION_DIA = 3;
	public static final int DURACION_HORAS = 4;
	public static final int DURACION_MINUTOS = 6;
	public static final int DURACION_SEMANAS = 5;
	
	/*** CONSTNTES PARA LOS FORMATOS DE FECHA ***/
	public static final String PATTERN_FECHA = "dd/MM/yyyy";
	public static final String PATTERN_HORA = "HH:mm";
	public static final String PATTERN_FECHA_HORA = PATTERN_FECHA+" "+PATTERN_HORA;
	public static final String PATTERN_HORA_SEGUNDOS = "HH:mm:ss";
	
	public static final DateTime MIN_HOUR_DAY = new DateTime(YEAR_db, MONTH_db, DAY_db, HOUR_INI_db, MINUTE_INI_db);
	public static final DateTime MAX_HOUR_DAY = new DateTime(YEAR_db, MONTH_db, DAY_db, HOUR_FIN_db, MINUTE_FIN_db);
	
	/** CONSTANTES PARA LAS FORMULA ELEMENTO **/
	public static final int FORMULA_ELEMENTO_TIPO_GRUPO = 1;
	public static final int FORMULA_ELEMENTO_TIPO_ELEMENTO = 0;
	
	public static final int FORMULA_ELEMENTO_EVALUACION_NO_APLICA = 1;
	public static final int FORMULA_ELEMENTO_EVALUACION_PROMEDIO = 2;
	public static final int FORMULA_ELEMENTO_EVALUACION_PESO = 3;
	public static final int FORMULA_ELEMENTO_EVALUACION_ULTIMA_NOTA = 4;
	
	public static final int FORMULA_EVALUACION_FINAL_PROMEDIO = 1;
	public static final int FORMULA_EVALUACION_FINAL_PESO = 2;
	public static final int FORMULA_EVALUACION_FINAL_ULTIMA_NOTA = 3;
	
	
	/**CONSTANTES PARA LOS ESTADOS LUEGO DEL ENV�O DEL CORREO **/
	public static final int CORREO_ENVIO_OK = 1;
	public static final int CORREO_ENVIO_PENDIENTE = 2;
	public static final int CORREO_ENVIO_FALLO = 3;
	public static final int CORREO_ENVIO_NO_PROCESADO = 4;
	
	/**PARA NOTAS*/
	public static final int UNIDAD_CALCULO_NOTAS = 100;
	public static  Integer UNIDAD_PORCENTAJEASISTENCIA = 70;
	public static final String TIPO_NOTA = "nota";
	public static final String TIPO_PROMEDIO_ELEMEN = "promel";
	public static final String TIPO_PROMEDIO_GRUPO = "promgr";
	public static final String TIPO_PROMEDIO_FINAL = "promfin";
	
	public static final int HORARIO_RESERVA_TIPO_PROGRAMA = 1;
	public static final int HORARIO_RESERVA_TIPO_CURSO = 2;
	public static final int HORARIO_RESERVA_TIPO_CURSOLIBRE = 3;
	public static final int HORARIO_RESERVA_TIPO_EVENTO = 3;
	public static final int HORARIO_RESERVA_TIPO_OTROS = 5;
	
	/**PARA NOTAS*/
	public static final int MONITOR_ESTADO_PENDIENTE = 1;
	public static final int MONITOR_ESTADO_ATENDIDO = 2;
	public static final int MONITOR_ESTADO_OBSERVADO = 3;
	
	
	
	public static final int EVENT_TIPO_OBS_REGNOGUARDAR = 1;
	public static final int EVENT_TIPO_OBS_DOCUMDUPLICADO = 2;
	public static final int EVENT_TIPO_OBS_VALIDRENIEC_SI = 3;
	public static final int EVENT_TIPO_OBS_VALIDRENIEC_NO = 4;
	
	/*****/
	
	public static final int DEFAULT_TIME_TRANSACTION = 13;
	
	
	public static final int AULA_TIPO_INMUEBLE_FISICO = 1;
	public static final int AULA_TIPO_INMUEBLE_VIRTUAL = 2;
	
	
	/*** CONSTANTES PARA ALFRESCO ***/
	public static final String DEFAULT_PARENT_SITE = "swsdp";
	public static final String DEFAULT_PARENT_FOLDER = "Royal Systems";
	public static final String FOLDER_REGLAMENTOS = "Reglamentos";
	public static final String FOLDER_CV_DOCENTES = "CV Docentes";
	public static final String FOLDER_ADMISION = "Admision";
	


	
	/** CONSTANTES PARA LAS TABLAS DE PAGOS AL DOCENTE**/
	
	public static final int PAGODOCHEADER_PROCESO_PENDIENTE = 1;
	public static final int PAGODOCHEADER_PROCESO_CALCULADO = 2;
	public static final int PAGODOCHEADER_PROCESO_CALCULOERROR = 3;
	public static final int PAGODOCHEADER_PROCESO_ENVIADO = 4;
	
	public static final int PAGODOCHEADER_PAGO_PENDIENTE = 1;
	public static final int PAGODOCHEADER_PAGO_APROBADO = 2;
	
	
	/** CONSTANTES PARA LOS DIAS DE LA SEMANA **/
	public static final String DIA_LUNES_2_CARACTERES = "Lu";
	public static final String DIA_MARTES_2_CARACTERES = "Ma";
	public static final String DIA_MIERCOLES_2_CARACTERES = "Mi";
	public static final String DIA_JUEVES_2_CARACTERES = "Ju";
	public static final String DIA_VIERNES_2_CARACTERES = "Vi";
	public static final String DIA_SABADO_2_CARACTERES = "Sa";
	public static final String DIA_DOMINGO_2_CARACTERES = "Do";
	
	/** CONSTANTES PARA LOS TIPOS DE RECEPTORES DE MENSAJERIA SGA **/
	public static final String MSJ_RECEPTOR_TO = "TO";
	public static final String MSJ_RECEPTOR_CC = "CC";
	public static final String MSJ_RECEPTOR_CCO = "CCO";

	/** CONSTANTES PARA LOS TIPOS DE MENSAJE DE MENSAJERIA SGA **/
	public static final String MSJ_TIPO_GENERICO = "GEN";
	public static final String MSJ_TIPO_EMAIL = "EMAIL";
	
	/** CONSTANTES PARA LOS TIPOS DE EMISORES DE MENSAJERIA SGA **/
	public static final String MSJ_EMISOR_UNICO = "UNICO";
	public static final String MSJ_EMISOR_COAUTOR = "COAUTOR";
	
	/** CONSTANTES PARA LOS ESTADOS DEL MENSAJE RECEPTOR DE MENSAJERIA SGA **/
	public static final int MSJ_RECEPTOR_ESTADO_RECIBIDO = 1;
	public static final int MSJ_RECEPTOR_ESTADO_SPAM = 2;	
	public static final int MSJ_RECEPTOR_ESTADO_ELIMINADO= 3;
	
	/** CONSTANTES PARA LOS ESTADOS DEL MENSAJE EMISOR DE MENSAJERIA SGA **/
	public static final int MSJ_EMISOR_ESTADO_EMITIDO = 1;
	public static final int MSJ_EMISOR_ESTADO_CANCELADO = 2;	
	public static final int MSJ_EMISOR_ESTADO_ELIMINADO= 3;

	
	/** CONSTANTES PARA LOS TIPOS DE SESION DE UN USUARIO MENSAJERIA (o EN GENERAL)**/
	public static final String SESIONUSER_TIPO_ALUMNO = "ALUMNO";
	public static final String SESIONUSER_TIPO_DOCENTE = "DOCENTE";
	public static final String SESIONUSER_TIPO_ADMIN = "ADMIN";
	public static final String SESIONUSER_TIPO_USUARIO = "USUARIO";
	
	public static final String PAR_USAR_PLANILLA = "USAR_PLANI";
	
	/** CONSTANTES PARA LOS TIPOS PANELES EDL MEDIC HCE **/
		
	public static final String VIEW_PANEL_BANDEJA_ENTRADA = "BE";
	public static final String VIEW_PANEL_HISTORIAS_CLINICAS = "HC";
	public static final String VIEW_PANEL_GESTION_SALUD = "GS";
	
	/** CONSTANTES PARA LOS ESTADOS DEL EPISODIO DE ATENCION HCE **/
	public static final int ESTADO_EPIATENCION_PENDIENTE_NO_EPI = 0;
	public static final int ESTADO_EPIATENCION_PENDIENTE = 1;
	public static final int ESTADO_EPIATENCION_EN_ATENCION = 2;
	public static final int ESTADO_EPIATENCION_FIRMADO_CERRADO = 3;
	public static final int ESTADO_EPIATENCION_EN_ANULADO = 4;
	
	/** CONSTANTES PARA LOS ESTADOS DEL EPISODIO DE ATENCION HCE **/
	public static final int TIPO_OPCIONFORMATO_CARPETA = 1;
	public static final int TIPO_OPCIONFORMATO_DOCUM = 2;
	
	/** CONSTANTES RELACIONADOS A CITAS **/
	public static final int ESTADO_DOCUMENTO_APROBADO = 2;
	public static final int ESTADO_DOCUMENTO_ANULADO = 5;

	public static final int TIPO_CITA_DEFAULT = 1;
	public static final int TIPO_SERVICIO_DEFAULT = 1;
	public static final int TIPO_TURNO_DEFAULT = 11;
	public static final int TIPO_REGISTRO_HORARIO_DEFAULT_1 = 1;
	public static final int TIPO_REGISTRO_HORARIO_DEFAULT_2 = 3;
	public static final int HORARIO_INDICADOR_COMPARTIDO_DEFAULT = 2;
	public static final int HORARIO_ID_GRUPO_ATENCION_COMPARTIDO_DEFAULT = 2;
	
	
	public static final int ID_GRUPO_ATENCION_EXTERNO = 1;
	public static final int ID_TIPO_ATENCION_EXTERNO = 1;
	/**j ir bandeja **/
	public static final String PAGINA_INICIO_BANDEJA = "/vistas/bandejaMedico/AtencionPacienteAgenda.jsf";

	/** CONSTANTES PARA LOS MISCEALENOS HEADER **/
	public static final String MISCELANEO_HEADER_VALIDACION_CITAS_WEB = "VAL_CIWEB";
	
	
	/** CONSTANTES PARA LOS MISCELANEOS DETALLE **/
	public static final String MISCELANEO_DETALLE_VALIDACION_CITAS_POR_DIA = "VAL_NCITAS";
	

	/** CONSTANTES PARA CORRELATIVOS DE LA OA**/
	
	public static final String CORREL_SERIE_OA = "1";
	public static final String CORREL_TIPO_OA = "OA";
	
	/** CONSTANTES PARA CORRELATIVOS LOS TIPOS DE ATENCION HCE**/
	public static final String HCE_TIPO_MEDICO_AMBULATORIO = "MED_AMBULATORIO";
	public static final String HCE_TIPO_MEDICO_EMERGENCIA = "MED_EMERGENCIA";
	public static final String HCE_TIPO_MEDICO_HOSPITAL_CIRUGIA = "MED_HOSP_CIRUGIA";
	public static final String HCE_TIPO_ENFERMERA_EMERGENCIA = "ENFERM_EMERGENCIAS";
	public static final String HCE_TIPO_ENFERMERA_HOSPITAL_CIRUGIA = "ENFERM_HOSP_CIRUGIAS";
	public static final String HCE_TIPO_OBSTETRIZ_EMERGENCIA = "OBSTET_EMERGENCIAS";
	public static final String HCE_TIPO_OBSTETRIZ_HOSPITAL_CIRUGIA = "OBSTET_HOSP_CIRUGIAS";
	public static final String HCE_TIPO_TECNO_MEDICO_AMBULATORIO = "TECNOMED_AMBULATORIO";
	public static final String HCE_TIPO_TECNO_MEDICO_EMERGENCIA = "TECNOMED_EMERGENCIA";
	public static final String HCE_TIPO_TECNO_MEDICO_HOSPITAL_CIRUGIA = "TECNOMED_HOSP_CIRUGIA";
	
	/** CONSTANTES PARA ESTADOS DE LOS EPISODIOS HCE**/
	
	public static final int HCE_INT_INACTIVO = 1;
	public static final int HCE_INT_ACTIVO = 2;	

	public static String DOCUMENTO_DNI_STR = "D";
	
	/** CONSTANTES PARA LOS TIPO DE RECETAS MEDICAS**/
	
	public static final String HCE_TIPOMED_MEDICINA = "MED";
	public static final String HCE_TIPOMED_DCI = "DCI";

	
	/** CONSTANTES PARA LOS TIPO DE ITEMS DEL CATALOG**/
	
	public static final int HCE_TIPOFOLDER_ITEM = 1;
	public static final int HCE_TIPOFOLDER_ITEM_PARENT = 0;

	
	public static final String HCE_TIPO_INDIC_RECETA_GEN = "2";
	public static final String HCE_TIPO_INDIC_RECETA_ESPECIF = "1";
	
	/** CONSTANTES PARA ESTADOS DE LOS TIPO DE PAGO DE SERVICIOS HCE**/
	
	public static final int HCE_PAGO_PAGAR = 10;		
	public static final int HCE_PAGO_CUBIERTO = 11;
	public static final int HCE_PAGO_EXONERADO_IMP =12;

	/** TIPOS DE DOCUMENTO DETALLE **/
	public static final String DOCUMENTO_DETALLE_TIPO_ITEM = "I";
	public static final String DOCUMENTO_DETALLE_TIPO_SERVICIO = "S";
	
	/** TIPOS DE DOCUMENTO PAGOS **/
	public static final String TIPO_DOCUMENTO_BOLETA_VENTA = "BV";
	public static final String TIPO_DOCUMENTO_FACTURA_VENTA = "FV";
	
	/** CONSTANTES PARA LOS ESTADOS DE OBLIGACION DEL ALUMNO - INTEGRACION ERP COMERCIAL **/
	public static final int OBLIGACION_ESTADO_PENDIENTE = 1;
	public static final int OBLIGACION_ESTADO_COBRADO = 2;
	public static final int OBLIGACION_ESTADO_ANULADO = 3;
	
	
	/** CONSTANTES PARA LOS CODIGOS TABLAS DE FAVORITOS - CITAS - SALUD **/
	public static final String FAVORITO_TABLA_MEDICO = "MEDICO";
	public static final String FAVORITO_TABLA_ESPECIALIDAD = "ESPECIALIDAD";	
	
	
	/** CONSTANTES PARA LOS TIPOS DE FAVORITOS - CITAS - SALUD **/
	public static final String TIPOFAVORITO_GENERAL = "GEN";
	public static final String TIPOFAVORITO_COMUN = "COM";
	
	
	/** CONSTANTES PARA LOS TIPOS DE IDENTIFICADORES DE FAVORITOS - CITAS - SALUD **/
	public static final String TIPOIDENT_FAVORITO_ID = "ID";
	public static final String TIPOIDENT_FAVORITO_CODIGO = "COD";	
	
	/** CONSTANTES PARA LOS TIPOS DE ICONO PARA DE FAVORITOS - CITAS - SALUD **/
	public static final String ICONFAVORITO_FAVORITO = "favorito.png";
	public static final String ICONFAVORITO_ADD_FAVORITO = "agregar.png";
	

	
	public static String  printDate(String pattern,Date valor){
    	if(valor!=null){
          	 SimpleDateFormat sdf = new SimpleDateFormat(pattern);          	
    		return sdf.format(valor);	        		
    	}else{
    		return null;
    	}    	
    }
	/***/
    public static String formatoCerosIzqNum(int dimensionTotal,String numero){
        String codigo = "";
        int dimNum = numero.length();
        if(dimensionTotal-dimNum>=0){
            for(int i=0;i<dimensionTotal-dimNum;i++){
                codigo=codigo+"0";
            }
        }
        codigo = codigo+numero;
        return codigo;
    }
    
    public static DateTime establecerHoraDefecto(DateTime hora){
    	return hora.withYear(YEAR_db).withMonthOfYear(MONTH_db).withDayOfMonth(DAY_db);
    }
    
    public static DateTime aproximarHora(DateTime horaInicio, DateTime horaFin, int horaAcademica){
    	DateTime index = horaInicio.withYear(YEAR_db).withMonthOfYear(MONTH_db).withDayOfMonth(DAY_db);
    	DateTime fin = horaFin.withYear(YEAR_db).withMonthOfYear(MONTH_db).withDayOfMonth(DAY_db);
    	if(horaAcademica < 1){
    		return fin;
    	}
    	while(fin.isAfter(index)){
    		index = index.plusMinutes(horaAcademica);
    	}
    	return index;
    }
    
    public static int obtenerDuracionEnMinutos(int duracion, int tipo){
    	int minutos = -1;
    	if(tipo == DURACION_SEMANAS){
    		minutos = (DateTimeConstants.MINUTES_PER_WEEK)*duracion;
    	}if(tipo == DURACION_DIA){
    		minutos = (DateTimeConstants.MINUTES_PER_DAY)*duracion;
    	}else if(tipo == DURACION_HORAS){
    		minutos = (DateTimeConstants.MINUTES_PER_HOUR)*duracion;
    	}else {
    		minutos = duracion;// POR DEFECTO DEVUELVE EN MINUTOS
    	}
    	return minutos;
    }
    
    
    public static boolean horaContenidaRango(DateTime horaInicio, DateTime horaFin, DateTime hora){
    	horaInicio = establecerHoraDefecto(horaInicio);
    	horaFin = establecerHoraDefecto(horaFin);
    	hora = establecerHoraDefecto(hora);
    	
    	if((horaInicio.isBefore(hora) || horaInicio.isEqual(hora)) && (horaFin.isAfter(hora) || horaFin.isEqual(hora))){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    public static boolean horaContenidaRango(Date horaInicio, Date horaFin, Date hora){
    	DateTime horaInicioNew = convertirHoraDefecto(horaInicio);
    	DateTime horaFinNew = convertirHoraDefecto(horaFin);
    	DateTime horaNew = convertirHoraDefecto(hora);
    	
    	if((horaInicioNew.isBefore(horaNew) || horaInicioNew.isEqual(horaNew)) && (horaFinNew.isAfter(horaNew) || horaFinNew.isEqual(horaNew))){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    /**
     * Devuelve true si el rango de horas de horaInicio y horaFin estan dentro del rango de horaInicioSup y horaFinSup, en caso contrario false.
     * @param horaInicioSup
     * @param horaFinSup
     * @param horaInicio
     * @param horaFin
     * @return
     */
    public static boolean rangoContenidoRango(DateTime horaInicioSup, DateTime horaFinSup, DateTime horaInicio, DateTime horaFin){
    	horaInicioSup = establecerHoraDefecto(horaInicioSup);
    	horaFinSup = establecerHoraDefecto(horaFinSup);
    	horaInicio = establecerHoraDefecto(horaInicio);
    	horaFin = establecerHoraDefecto(horaFin);
    	
    	if(horaFin.isBefore(horaInicio) || horaFin.isEqual(horaInicio)){
    		return false;
    	}
    	if((horaInicioSup.isBefore(horaInicio) || horaInicioSup.isEqual(horaInicio)) && (horaFinSup.isAfter(horaFin) || horaFinSup.isEqual(horaFin))){
    		return true;
    	}else{
    		return false;
    	}
    	
    }
    
    /**
     * Devuelve true si el rango de horas de horaInicio y horaFin estan dentro del rango de horaInicioSup y horaFinSup, en caso contrario false.
     * @param horaInicioSup
     * @param horaFinSup
     * @param horaInicio
     * @param horaFin
     * @return
     */
    public static boolean rangoContenidoRango(Date horaInicioSup, Date horaFinSup, Date horaInicio, Date horaFin){
    	DateTime rangoInicioSup = convertirDateTime(horaInicioSup);
    	DateTime rangoFinSup = convertirDateTime(horaFinSup);
    	DateTime rangoInicio = convertirDateTime(horaInicio);
    	DateTime rangoFin = convertirDateTime(horaFin);
    	return rangoContenidoRango(rangoInicioSup, rangoFinSup, rangoInicio, rangoFin);
    }
    
    /**
     * Convierte un Date en DateTime de joda.
     * @param date
     * @return
     */
    public static DateTime convertirDateTime(Date date){
    	return new DateTime(date);
    }
    
    public static DateTime convertirHoraDefecto(Date date){
    	return establecerHoraDefecto(convertirDateTime(date));
    }
    
    public static DateTime convertirFechaInicioDefecto(DateTime fecha){
    	return fecha.withHourOfDay(HOUR_INI_db).withMinuteOfHour(MINUTE_INI_db);
    }
    
    public static DateTime convertirFechaFinDefecto(DateTime fecha){
    	return fecha.withHourOfDay(HOUR_FIN_db).withMinuteOfHour(MINUTE_FIN_db);
    }
    
    public static Date obtenerFechaActualPorDia(int dia){
    	LocalDate local = LocalDate.now();
    	return local.withDayOfWeek(dia).toDate();
    }
    
    public static Date obtenerFechaPorDia(DateTime fecha, int dia){
    	LocalDate local = new LocalDate(fecha);
    	return local.withDayOfWeek(dia).toDate();
    }
    
    public static String obtenerStringFechaDefecto(Date fecha){
    	return convertirDateTime(fecha).toString(Constant.PATTERN_FECHA);
    }
    
    public static String obtenerStringHoraDefecto(Date hora){
    	return convertirDateTime(hora).toString(Constant.PATTERN_HORA);
    }
    
    
    /**
     * Devuelve true en caso de que exista un cruce de horas entre el rango 1 y el rango 2.
     * @param rangoInicio1
     * @param rangoFin1
     * @param rangoInicio2
     * @param rangoFin2
     * @return
     */
    public static boolean existeCruceRangos(DateTime rangoInicio1, DateTime rangoFin1, DateTime rangoInicio2, DateTime rangoFin2){
    	boolean cruce = false;
    	rangoInicio1 = establecerHoraDefecto(rangoInicio1);
    	rangoFin1 = establecerHoraDefecto(rangoFin1);
    	rangoInicio2 = establecerHoraDefecto(rangoInicio2);
    	rangoFin2 = establecerHoraDefecto(rangoFin2);
    	
    	if(rangoFin1.isEqual(rangoInicio2) || rangoInicio1.isEqual(rangoFin2)){
    		return false;
    	}
    	
    	if(horaContenidaRango(rangoInicio1, rangoFin1, rangoInicio2) || horaContenidaRango(rangoInicio2, rangoFin2, rangoInicio1)){
    		cruce = true;
    	}
    	
    	if(!cruce && (horaContenidaRango(rangoInicio1, rangoFin1, rangoFin2) || horaContenidaRango(rangoInicio2, rangoFin2, rangoFin1))){
    		cruce = true;
    	}
    	
    	if(!cruce && rangoContenidoRango(rangoInicio1, rangoFin1, rangoInicio2, rangoFin2)){
    	   	cruce = true;
    	}
    	
    	if(!cruce && rangoContenidoRango(rangoInicio2, rangoFin2, rangoInicio1, rangoFin1)){
    		cruce = true;
    	}
    		
    	return cruce;
    }
 
    /**
     * Devuelve true en caso de que exista un cruce de horas entre el rango 1 y el rango 2.
     * @param rangoInicio1
     * @param rangoFin1
     * @param rangoInicio2
     * @param rangoFin2
     * @return
     */
    public static boolean existeCruceRangos(Date rangoInicio1, Date rangoFin1, Date rangoInicio2, Date rangoFin2){
    	return existeCruceRangos(convertirHoraDefecto(rangoInicio1), convertirHoraDefecto(rangoFin1), convertirHoraDefecto(rangoInicio2), convertirHoraDefecto(rangoFin2));
    }
    
    
    public static DateTime generarDateTime(DateTime fecha, DateTime hora){
    	DateTime dt = new DateTime(fecha).withHourOfDay(hora.getHourOfDay()).withMinuteOfHour(hora.getMinuteOfHour()).withSecondOfMinute(hora.getSecondOfMinute()).withMillisOfSecond(hora.getMillisOfSecond());
    	return dt;
    }
    
    public static DateTime obtenerMinHoraDia(){
    	return new DateTime(YEAR_db, MONTH_db, DAY_db, HOUR_INI_db, MINUTE_INI_db, SECOND_INI_db, MILLIS_INI_db);
    }
    
    public static DateTime obtenerMaxHoraDia(){
    	return new DateTime(YEAR_db, MONTH_db, DAY_db, HOUR_FIN_db, MINUTE_FIN_db, SECOND_FIN_db, MILLIS_FIN_db);
    }
    
    
    public static int compararSoloHoras(DateTime dt1, DateTime dt2){
    	dt1 = dt1.withYear(YEAR_db).withMonthOfYear(MONTH_db).withDayOfMonth(DAY_db);
    	dt2 = dt2.withYear(YEAR_db).withMonthOfYear(MONTH_db).withDayOfMonth(DAY_db);
    	
    	if(dt1.isBefore(dt2)){
    		return -1;
    	}else if(dt1.isEqual(dt2)){
    		return 0;
    	}else{
    		return 1;
    	}
    }
}