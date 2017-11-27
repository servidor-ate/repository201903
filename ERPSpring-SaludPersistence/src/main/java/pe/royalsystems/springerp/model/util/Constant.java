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
	
	
	/** MODALIDADES DE ESTUDIO**/
//	public static final int MODALIDAD_ESTUDIO_FORMACION = 1;
//	public static final int MODALIDAD_ESTUDIO_CAPACITACION = 2;
//	public static final int MODALIDAD_ESTUDIO_MONITOREO = 3;
	
	public static final String MODALIDADESTUDIO_INDICADOR_INSTITUCION = "I";
	public static final String MODALIDADESTUDIO_INDICADOR_UNIVERSIDAD = "U";
	public static final String MODALIDADESTUDIO_INDICADOR_CEO = "CEO";
	
	public static final String MODALIDADESTUDIO_MODALIDAD_PROGRAMA = "P";
	public static final String MODALIDADESTUDIO_MODALIDAD_CURSOLIBRE = "C";
	public static final String MODALIDADESTUDIO_MODALIDAD_TODOS = "T";
	
	public static final int MODALIDAD_ESTUDIO_PREGRADO = 1;
	public static final int MODALIDAD_ESTUDIO_POSGRADO = 2;
	public static final int MODALIDAD_ESTUDIO_MONITOREO = 3;
	
	//public static final String ESTUDIO_POSGRADO = "POSGRADO";
	//public static final String ESTUDIO_PREGRADO = "PREGRADO";
	
	public static final String TIPO_TRAMITE_DIPLOMADO = "DIP";
	public static final String TIPO_TRAMITE_MAESTRIA = "MAE";
	public static final String TIPO_TRAMITE_DOCTORADO = "DOC";
	
	public static final String AGRUPADOR_PROGRAMA_DIPLOMADO = "DIP";
	public static final String AGRUPADOR_PROGRAMA_MAESTRIA = "MAE";
	public static final String AGRUPADOR_PROGRAMA_DOCTORADO = "DOC";
	
	public static final String TURNO_TURCODIGO_MANANA = "TUR_M";
	public static final String TURNO_TURCODIGO_TARDE = "TUR_T";
	public static final String TURNO_TURCODIGO_NOCHE = "TUR_N";
	
	public static final String TURNO_TURDESCRIPCION_MANANA = "MAÑANA";
	public static final String TURNO_TURDESCRIPCION_TARDE = "TARDE";
	public static final String TURNO_TURDESCRIPCION_NOCHE = "NOCHE";
	
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
	
	
	/** SE USA EN REGISTRO DE ALUMNO EN LA COLUMNA EMPLEADO DE LA TABLA USUARIO **/
	public static int TIPO_ALUMNO = 2;
	public static int TIPO_DOCENTE = 3;
	
	/*** TIPO DE CURSO  ***/
	public static final int TIPO_CURSO_TESIS = 4;
	public static final int TIPO_CURSO_TRABAJO_INVESTIGACION = 5;
	
	/** ESTADOS DE MATRICULA **/
	public static final int TABLA_SA_MATRICULA_ESTADO = 12;
	public static final int MATRICULA_ESTADO_PRE_MATRICULADO = 1;
	public static final int MATRICULA_ESTADO_MATRICULADO = 2;
	public static final int MATRICULA_ESTADO_SUSPENDIDO = 3;
	public static final int MATRICULA_ESTADO_RETIRO_CURSO = 4;
	public static final int MATRICULA_ESTADO_DPI = 5;
	public static final int MATRICULA_ESTADO_NOTA_FINAL = 6;
	public static final int MATRICULA_ESTADO_RETIRO_CICLO = 7;
	public static final int MATRICULA_ESTADO_CONVALIDADO = 8;
	public static final int MATRICULA_ESTADO_CONCARGAHABIL = 9;
	public static final int MATRICULA_ESTADO_ANULADA = 10;
	
	/*** ESTADOS DE CARGAHABIL **/
	public static final int CARGAHABIL_ESTADO_PRE_MATRICULADO = 1;
	public static final int CARGAHABIL_ESTADO_MATRICULADO = 2;
	public static final int CARGAHABIL_ESTADO_CONCARGAHABIL = 9;
	
	
	public static final int MATRICULA_TIPO_REGISTRO_DEFAULT = 1;
	
	/** ESTADOS ALUMNOPER **/


	public static final int ALUMNOPER_ESTADO_INICIAL=0;
	public static final int ALUMNOPER_ESTADO_CARGA_HABIL=1;
	public static final int ALUMNOPER_ESTADO_MATRICULADO=2;
	public static final int ALUMNOPER_ESTADO_RETIRO_CICLO=3;
	public static final int ALUMNOPER_ESTADO_RESERVA_MATRICULA=4;
	public static final int ALUMNOPER_ESTADO_PREMATRICULA=5;
	
	/** UNIDAD DE TIEMPO **/
	public static String PAR_UTIME_SEGUNDO="S";
	public static String PAR_UTIME_MINUTO="M";
	public static String PAR_UTIME_HORA="H";
	public static String PAR_UTIME_DIA="D";
	
	/** MODELO TIPO SERVICIO **/
	public static final String MODELO_TIPO_SERVICIO_ADMISION = "1";
	public static final String MODELO_TIPO_SERVICIO_MATRICULA = "2";
	public static final String MODELO_TIPO_SERVICIO_TRAMITE = "3";
	
	/** MODELO DE SERVICIO D=SA_DOCUMENTOS **/
	public static final String MODELO_SERVICIO_DOCUMENTO = "D";
	public static final String MODELO_SERVICIO_SERVICIO = "S";
	
	public static final int DEFAULT_TIPO_SECCION = 1;
	public static final String COD_DOCUMGEN_LOC = "LOC_";
	
	public static final int DEPENDENCIA_ESPECIALISTA_ACADEMICO = 7;
	public static final int DEPENDENCIA_PROGRAMA_ACADEMICO_FORMACION = 3;
	public static final int DEPENDENCIA_PROGRAMA_ACADEMICO_CAPACITACION = 4;
	public static final int DEPENDENCIA_PROGRAMA_ACADEMICO_MONITOREO = 5;
	public static final int DEPENDENCIA_DIRECTOR_ACADEMICO = 2;
	
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
	
	/** SA_TABLA Y SA_TABLAESTADO**/
	public static int TABLA_SA_ADMISION = 5;
	public static int ESTADO_ADMISION_APROBADO = 19;
	public static int ESTADO_ADMISION_CERRADO = 20;
	public static int ESTADO_ADMISION_ELIMINADO = 21;
	/** TABLA SX_PEDIDO **/
	public static int TABLA_SX_PEDIDO = 6;
	public static int ESTADO_PEDIDO_GENERADO = 89;
	public static int ESTADO_PEDIDO_PAGADO = 90;
	public static int ESTADO_PEDIDO_ANULADO = 91;
	public static int ESTADO_PEDIDO_APROBADO = 92;
	/** TABLA SA_POSTULANTE **/
	public static int TABLA_SA_POSTULANTE = 8;
	public static int POSTULANTE_POSTULANTE = 28;
	public static int POSTULANTE_INGRESANTE = 29;
	public static int POSTULANTE_NO_INGRESANTE = 30;
	public static int POSTULANTE_EN_ESPERA = 93;
	public static int POSTULANTE_RECHAZADO = 31;
	public static int POSTULANTE_ALUMNO = 32;
	
	/** TABLA SA_POSTULANTE **/
	public static int TABLA_SA_ALUMNO = 11;
	public static final int TABLA_SA_ALUMNO_ESTADO = 42;	
	public static final int ALUMNO_NUEVO = 1;
	public static final int ALUMNO_REGULAR = 2;
	public static final int ALUMNO_SUSPENDIDO = 3;
	public static final int ALUMNO_RETIRADO_CICLO = 4;
	public static final int ALUMNO_CON_RESERVA = 5;
	public static final int ALUMNO_EGRESADO = 6;
	public static final int ALUMNO_DADO_BAJA = 7;
	public static final int ALUMNO_ANULADO = 8;
	public static final int ALUMNO_DESERTOR = 9;
	public static final int ALUMNO_ANULADO_MATRICULA = 10;

	public static final int ALUMNO_DEFAULT_TIPO_REGISTRO = 1;
	
	/** TABLA SOLICITUD **/
	public static final int TABLA_SA_SOLICITUD_HEADER = 20;
	public static final int SOLICITUD_HEADER_GENERADO = 1;
	public static final int SOLICITUD_HEADER_ENVIADO = 1;
	public static final int SOLICITUD_HEADER_APROBADO = 2;
	public static final int SOLICITUD_HEADER_EN_ELABORACION = 3;
	public static int SOLICITUD_HEADER_EN_PROCESO = 3;
	public static final int SOLICITUD_HEADER_ANULADO = 4;
	public static final int SOLICITUD_HEADER_JUSTIFICADO = 5;
	public static final int SOLICITUD_HEADER_NO_JUSTIFICADO = 6;
	public static int SOLICITUD_HEADER_ARCHIVADO = 3;
	
	
	public static int TABLA_SA_HORARIO_RESERVA_HEADER = 18;
	public static final int ESTADO_HORARIO_RESERVA_PENDIENTE = 1;
	public static final int ESTADO_HORARIO_RESERVA_APROBADO = 2;
	public static final int ESTADO_HORARIO_RESERVA_ANULADO = 4;
	
	public static final String HORARIO_RESERVA_PENDIENTE = "Pendiente";
	public static final String HORARIO_RESERVA_APROBADO = "Aprobado";
	public static final String HORARIO_RESERVA_ANULADO = "Anulado";
	
	
	/**SA_COMPENDIO  NIDECOMPENDIO**/
	public static int TABLA_TIPOS_TRAMITES = 1;
	public static int TABLA_DE_PARA_DERIVACION = 2;
	
	/**SA_COMPENDIODETALLE TIPO SOLICITUD NIDEDETALLE**/
	public static final int  SOLICITA_RESERVA_HORARIO = 1;
	public static int  SOLICITA_RETIRO_CURSO = 2;
	public static int  SOLICITA_RETIRO_CICLO = 3;
	
	public static final int TRAMITE_PRIMERA_SECUENCIA = 1;
	public static final int TRAMITE_DEFAULT_PLAZO = 1;
	public static final int TRAMITE_DEFAULT_RUTA = 1;
	public static int  COMPENDIODETALLE_POR_CORRESPONDER = 5;
	public static int  COMPENDIODETALLE_VISTO_BUENO = 12;
	public static int  COMPENDIODETALLE_ARCHIVAR = 8;
	public static int  COMPENDIODETALLE_ANULAR = 19;
	
	public static String MISCELANEO_CODIGO_TABLA_HORA_LECTIVA = "HORALECTIV";
	public static String MISCELANEO_HORA_LECTIVA_MANANA = "HL_TUR_M";
	public static String MISCELANEO_HORA_LECTIVA_TARDE = "HL_TUR_T";
	public static String MISCELANEO_HORA_LECTIVA_NOCHE = "HL_TUR_N";
	public static String MISCELANEO_FORMATO_RESERVA_HORARIO = "FOR_HOR_RE";
	public static String MISCELANEO_TIPO_RESERVA_HORARIO = "HOR_RES";
	public static String MISCELANEO_TIPO_HORA = "TIP_HORA";
	public static String MISCELANEO_DISTRIBUCION_MUEBLES = "DIST_MU";
	public static String MISCELANEO_TIPO_INFRAESTRUCTURA = "TIP_SEDE";
	public static String MISCELANEO_HEADER_TIPO_PRODUCTO = "TIPOPRODUC";
	public static String MISCELANEO_HEADER_TIPO_CONDICION_MATEMATICA = "TIPOCONDIC";
	public static String MISCELANEO_HEADER_CARGO_LABORAL = "CARGOLABOR";
	public static String MISCELANEO_HEADER_TIPO_CUMPLIMIENTO = "TIPOCUMPLI";
	public static String MISCELANEO_HEADER_TIPO_DOCENTE = "TIPODOCENT";
	public static String MISCELANEO_HEADER_TIPO_MONITOR = "MON_TIPOPE";
	public static String MISCELANEO_HEADER_INSTITUCION = "INSTPUBLIC";
	public static String MISCELANEO_HEADER_TIPO_DICTADO = "TIPO_DICTA";
	public static String MISCELANEO_HEADER_TIPO_SOLICITUD = "TIPOSOLICI";
	public static String MISCELANEO_HEADER_TIPOPRESTAMO = "TIPOPRESTA";
	public static String MISCELANEO_HEADER_HORARIO_VIGENCIA = "HORA_VIGE";
	public static final String MISCELANEO_HEADER_CURSO_TIPO_HORA_RANGO = "CURTIPHORA";
	public static String MISCELANEO_HEADER_INDICADORINSTITUCION = "IND_INSTIT";
	
	public static String MISCELANEO_DETALLE_DOCENTE_TIPO_DOCENTE = "TD_DOCENTE";
	public static String MISCELANEO_DETALLE_DOCENTE_TIPO_AUXILIAR = "TD_AUXILIA";
	public static String MISCELANEO_DETALLE_DOCENTE_TIPO_ASISTENTE = "TD_ASISTEN";
	public static String MISCELANEO_DETALLE_DOCENTE_TIPO_MONITOR = "TD_MONITOR";
	
	public static final String MISCELANEO_DETALLE_HORARIO_VIGENCIA_DEFAULT = "1";//MENSUAL
	
	public static String MISCELANEO_DETALLE_CLASE_HORARIO_ORIGINAL = "HOR_ORG";
	public static String MISCELANEO_DETALLE_CLASE_HORARIO_FRACCIONADO = "HOR_FRAC";
	
	public static String MISCELANEO_DETALLE_TIPOARTICULO = "TIPOARTICU";

	public static String MISCELANEO_DETALLE_TIPOPROGRAMA_VALORCODIGO_OTROS = "OTROS";
	public static String MISCELANEO_DETALLE_TIPOPROGRAMA_VALORCODIGO_POSGRADO = "POSGRADO";
	public static String MISCELANEO_DETALLE_TIPOPROGRAMA_VALORCODIGO_PREGRADO = "PREGRADO";
	
	public static String MISCELANEO_DETALLE_TIPOPROGRAMA = "TIPOPROGRA";
	public static String MISCELANEO_DETALLE_FACULTAD = "FACULTAD";
	public static String MISCELANEO_DETALLE_ESCUELA = "ESCUELA";
	
	public static final String MISCELANEO_DETALLE_AREACURSO = "AREACURSO";
	public static final String MISCELANEO_DETALLE_AGRCURSO = "AGRCURSO";
	public static final String MISCELANEO_DETALLE_SUBSUBCATEGORIA = "SUBSUBCAT"; 
	
	public static String MISCELANEO_DETALLE_SOLICITUD_CERTIFICADO = "20";
	public static String MISCELANEO_DETALLE_SOLICITUD_DIPLOMA = "21";
	public static String MISCELANEO_DETALLE_SOLICITUD_OTRO = "22";
	public static String MISCELANEO_DETALLE_SOLICITUD_MAESTRIA = "23";
	public static String MISCELANEO_DETALLE_SOLICITUD_DOCTORADO = "24";
	
	public static String MISCELANEO_DETALLE_TIPO_DICTADO_PRESENCIAL = "1";
	public static String MISCELANEO_DETALLE_TIPO_DICTADO_VIRTUAL = "2";
	
	public static String MISCELANEO_DETALLE_ACTIVIDAD_CALENDARIO = "GECALENDAR";
	
	public static final String MISCELANEO_DETALLE_CURSO_TIPO_HORA_RANGO_BLOQUE = "CURTIPBLO";
	public static final String MISCELANEO_DETALLE_CURSO_TIPO_HORA_RANGO_LIBRE = "CURTIPLIB";
	
	public static int HORA_INICIO_TURNO_MANANA = 0;
	public static int HORA_INICIO_TURNO_TARDE = 12;
	public static int HORA_INICIO_TURNO_NOCHE = 18;
	
	public static final int TURNO_MANANA = 1;
	public static final int TURNO_TARDE = 2;
	public static final int TURNO_NOCHE = 3;
	
	public static final int HORA_DESCANSO = 1;
	public static final int HORA_NO_DESCANSO = 2;
	
	/** Constantes para el tipo de hora ejemplo: hora academica para clases, break para los recesos**/
	public static final int TIPO_HORA_ACADEMICA = 1;
	public static final int TIPO_HORA_BREAK = 2;
	public static final int TIPO_HORA_REUNION = 3;
	
	public static final int ESTADO_HORARIO_DETALLE_ACTIVO = 1;
	public static final int ESTADO_HORARIO_DETALLE_INACTIVO = 2;
	public static final int ESTADO_HORARIO_DETALLE_ELIMINADO = 3;
	public static final int ESTADO_HORARIO_DETALLE_FRACCIONADO = 4;
	
	public static final String HORARIO_RESERVA_PROGRAMA = "Programa";
	public static final String HORARIO_RESERVA_CURSO = "Curso";
	public static final String HORARIO_RESERVA_EVENTO = "Evento";
	public static final String HORARIO_RESERVA_OTROS = "Otros";
	
	public static final int CURSO_VACANTE_LIBRE = 1;
	public static final int CURSO_VACANTE_NO_LIBRE = 2;
	
	public static final int CURSO_COMPARTIDO_NO_APLICA = 1;
	public static final int CURSO_COMPARTIDO_PAPA = 2;
	public static final int CURSO_COMPARTIDO_HIJO = 3;
	
	public static final int HORA_LECTIVA = 1;
	public static final int HORA_NO_LECTIVA = 2;
	
	/** MODALIDAD DE ESTUDIO **/
	
//	public static final String FLAGMODULAR_TODOS = "T"; // Todas
//	public static final String FLAGMODULAR_PROGRAMA = "P"; // Solo programa
//	public static final String FLAGMODULAR_CURSOLIBRE = "C"; // Solo curso libre
	
	
	
	
	/** EL FIN ES ASIGNARLE POR DEFECTO UN PROGRAMA A UN CURSO O EVENTO. IMPORTANTE EL CRRFLAGMODULAR **/
//	public static final int CARRERA_CURSOS_LIBRES = 4;
//	public static final int CARRERA_EVENTOS = 5;
	
	public static final int CARRERA_FLAGMODULAR_PROGRAMA = 1;
	public static final int CARRERA_FLAGMODULAR_CURSO_LIBRE = 3;	
	public static final int CARRERA_FLAGMODULAR_EVENTO = 4;
	public static final int CARRERA_FLAGMODULAR_OTROS = 5;
	
	public static final int DOCENTE_TIPO_DOCENTE = 1;
	public static final int DOCENTE_TIPO_AUXILIAR = 2;
	public static final int DOCENTE_TIPO_ASISTENTE = 3;
	public static final int DOCENTE_TIPO_CONFERENCISTA = 4;
	public static final int DOCENTE_TIPO_ANALISTA = 5;
	
	public static final int CURSO_TEORIA = 1;
	public static final int CURSO_PRACTICA = 2;
	
	public static final String SUCURSAL_GRUPO_DEFECTO = "0001";
	
	/**CONSTANTES PARA RETIRO DE CURSO, CICLO E INHABILITACION DEL ALUMNO**/
	public static final int RETIRO_CURSO = 4;
	public static final int RETIRO_CICLO = 5;
	public static final int ALUMNO_HABILITADO = 1;
	public static final int ALUMNO_INHABILITADO = 2;
	
	/** ESTADOS DE MATRICULA ALUMNO **/
//	public static final int ESTADO_CARGA_HABIL = 1;//CONSTANTE PARA ELIMINAR
//	public static final int ESTADO_MATRICULADO = 2;//CONSTANTE PARA ELIMINAR
//	public static final int ESTADO_RETIRO_CURSO = 4;//CONSTANTE PARA ELIMINAR
	
	public static final int FLAG_APROBADO = 1;
	public static final int FLAG_DESAPROBADO = 0;
	
	/**ESTADOS DE RETIRO DE CURSO*/
	public static final int ESTADO_RETIRO_CURSO_PENDIENTE = 1;
	public static final int ESTADO_RETIRO_CURSO_APROBADO = 2;
	public static final int ESTADO_RETURO_CURSO_ANULADO = 3;
	
	/**ESTADOS DE RETIRO DE CICLO*/
	public static final int ESTADO_RETIRO_CICLO_PENDIENTE = 1;
	public static final int ESTADO_RETIRO_CICLO_APROBADO = 2;
	public static final int ESTADO_RETIRO_CICLO_ANULADO = 3;
	
	public static final int TIPO_RETIRO_CICLO = 1;
	public static final int TIPO_RETIRO_CICLO_Y_PROGRAMA = 2;
	
	/**ESTADOS DE ALUMNO PER**/
//	public static final int ESTADO_ALUMNO_CARGA_HABIL = 1;//CONSTANTE PARA ELIMINAR
//	public static final int ESTADO_ALUMNO_MATRICULADO = 2;//CONSTANTE PARA ELIMINAR
//	public static final int ESTADO_ALUMNO_RETIRO_CICLO = 3;//CONSTANTE PARA ELIMINAR
//	public static final int ESTADO_ALUMNO_DADO_BAJA = 4;//CONSTANTE PARA ELIMINAR
	
	/**CONSTANTES PARA TIPO FORMATO DE SOLICITUD DE EVENTO**/
	public static final int TIPO_RECURSO_ACTIVIDAD = 1;
	public static final int TIPO_RECURSO_REQUERIMIENTO = 2;
	public static final int TIPO_RECURSO_EXTRA = 3;
	
	/**CONSTANTES PARA SUBTIPO FORMATO DE SOLICITUD DE EVENTO**/
	public static final int SUB_TIPO_ACTIVIDAD_AGREGACION = 1;
	public static final int SUB_TIPO_ACTIVIDAD_COORGANIZAR = 2;
	public static final int SUB_TIPO_REQUERIMIENTO_ASIGNACION = 1;
	public static final int SUB_TIPO_REQUERIMIENTO_PATRIMONIO = 2;
	public static final int SUB_TIPO_REQUERIMIENTO_COORDINACION = 3;
	public static final int SUB_TIPO_REQUERIMIENTO_TI = 4;
	
	public static final int SUB_TIPO_RECURSO_EXTRA = 1;
	
	public static final int RECURSO_NO_ATENDIDO = 2;
	public static final int RECURSO_ATENDIDO = 1;

	/** ENCUESTAS PARAMETROS  **/
	public static final String PAR_EVAL_TP_EVALGENERAL = "CUEST_T1";
	public static final String PAR_EVAL_TEVAL_EXAMEN = "EXAM";
	public static final int COD_EVAL_PREPAR = 1;
	public static final int COD_EVAL_EVALUACION = 2;
	public static final int COD_EVAL_EVALCOMPLETO = 3;
	/**VALORES DE PROPERTIES***/
	
	/** TIPO DE SESION DE CURSO_CLASE**/
	public static final int CURSO_CLASE_NORMAL = 1;
	public static final int CURSO_CLASE_RECUPERACION = 2;
	public static final int CURSO_CLASE_ADELANTO = 3;
	public static final int CURSO_CLASE_ROL_EXAMEN = 4;
	public static final int CURSO_CLASE_FECHAS_CREADAS = 5;
	
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
	

	

	
	/** CONSTANTES PARA LA CONFIGURACIO  DE PAGOS DOCENTES **/
	
	public static final String CONFIGPAGOS_TIPO_XCURSOS = "XCURSOS";
	public static final String CONFIGPAGOS_TIPO_XDOCENTES = "XDOCENTE";
	
	public static final String CONFIGPAGOS_PERIODO_TODOS = "TODO";
	public static final String CONFIGPAGOS_PERIODO_PERIODO = "PER";
	
	public static final String CONFIGPAGOS_TIPOPAGO_XALUMNO = "XALUM";
	public static final String CONFIGPAGOS_TIPOPAGO_XHORASCURSO = "XHORC";
	public static final String CONFIGPAGOS_TIPOPAGO_XALUMNOASIST = "XALUMASIST";
	
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
	
	public static final String PAR_ALUMNO_HORARIO_MODO_REGISTRO = "AH_MOD_REG";
	public static final String PAR_ALUMNO_HORARIO_MODO_REGISTRO_SEMANA = "SEM";
	public static final String PAR_ALUMNO_HORARIO_MODO_REGISTRO_FECHA = "FEC";
	
	/** CONSTANTES PARA LOS ESTADOS DE LOS HORARIOS DEL ALUMNO **/
	public static final String ALUMNO_HORARIO_CONTROL_ESTADO_PENDIENTE = "PE";
	public static final String ALUMNO_HORARIO_CONTROL_ESTADO_EJECUTADO = "EJ";
	public static final String ALUMNO_HORARIO_CONTROL_ESTADO_ANULADO = "AN";
	
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