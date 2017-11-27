package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SS_AD_OrdenAtencionDetalleX database table.
 * 
 */
@Entity
@Table(name = "SS_AD_OrdenAtencionDetalle")
public class SsAdOrdenAtencionDetalle extends Entidad {
	private static final Long serialVersionUID = 1L;
	private SsAdOrdenAtencionDetallePK id;
	private String almacenDestino;
	private Integer cama;
	private String campoReferencia;
	private BigDecimal cantidad;
	private BigDecimal cantidadDesechada;
	private BigDecimal cantidadDespachada;
	private BigDecimal cantidadDevuelta;
	private BigDecimal cantidadPresupuestada;
	private BigDecimal cantidadRecepcionada;
	private BigDecimal cantidadSolicitada;
	private BigDecimal cantidadSuministrada;
	private String centroCosto;
	private String clasificadorMovimiento;
	private String compania;
	private String componente;
	private String componentePaquete;
	private String componentePerfil;
	private String conceptoGasto;
	private String condicionComponente;
	private Integer cuarto;
	private String diagnostico_Clinico;
	private String documentoRelacionado;
	private String enfermedadActual;
	private Integer episodioClinicoHCE;
	private Integer especialidad;
	private String especimen;
	private Integer estado;
	private BigDecimal factorConversion;
	private String familia;
	private Date fechaAlertaInterfase;
	private Date fechaAplicacion;
	private Date fechaAutoriza;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Date fechaProcesoExpediente;
	private Integer grupoInterfase;
	private String hallazgos_Operatorios;
	private Integer idCita;
	private Integer idDiagnostico;
	private Integer idDocumentoRelacionado;
	private Long idEpisodioAtencionHCE;
	private Integer idEstablecimiento;
	private Integer idOAOrigenTraslado;
	private Integer idOPC;
	private Integer idPaciente;
	private Integer idPacienteHCE;
	private Integer idPersonaAntUnificacion;
	private Integer idProcesoExpediente;
	private Integer idProcesoExpedienteBk;
	private Integer idServicio;
	private Integer idTransaccionCambioHospitalizacion;
	private Integer idTurno;
	private Integer idUnidadMedida;
	private Integer idVisita;
	private Integer indicadorAgregado;
	private Integer indicadorAlertaInterfase;
	private Integer indicadorCoberturado;
	private Integer indicadorCobrado;
	private Integer indicadorCorreoLaboratorio;
	private Integer indicadorCostoCero;
	private Integer indicadorDisponible;
	private Integer indicadorEliminado;
	private Integer indicadorEPS;
	private Integer indicadorEstHospIngresoLinea;
	private Integer indicadorExpediente;
	private Integer indicadorExpedienteBk;
	private Integer indicadorFacturacion;
	private Integer indicadorHonorarios;
	private Integer indicadorLlegada;
	private String indicadorMigrado;
	private Integer indicadorMigradoHospital;
	private Integer indicadorOcultarConsulta;
	private Integer indicadorPaquete;
	private Integer indicadorPerfil;
	private Integer indicadorPlanilla;
	private Integer indicadorProcedimiento;
	private Integer indicadorReceta;
	private Integer indicadorReingresoSalida;
	private Integer indicadorRiesgoQuirurgico;
	private Integer indicadorSeCobra;
	private Integer indicadorTransferir;
	private Integer indicadorValidarFechaTrat;
	private Integer indRequiereCirugia;
	private Integer lineaDocumentoRelacionado;
	private String lineaFamilia;
	private Integer lineaHospInicial;
	private String loteComponente;
	private Integer modoIngreso;
	private Integer motivoInterFase;
	private String motivoRechazo;
	private String numeroDocumento;
	private Integer numeroExpediente;
	private Integer numeroExpedienteBk;
	private Integer numeroOPC;
	private String observacion;
	private String observacionHospitalizacion;
	private Integer ordenPerfil;
	private Integer periodoEmision;
	private String procedenciaComponente;
	private String proyecto;
	private Integer secuencia;
	private Integer secuenciaHCE;
	private Integer secuencialDocumentoRelacionado;
	private Integer secuencialInterfase;
	private String serieDocumentoRelacionado;
	private String serieOPC;
	private Integer situacion;
	private Integer situacionInterfase;
	private Integer situacionLineaHosp;
	private Integer situacionLineaHospPreAltaAdm;
	private String subFamilia;
	private String sucursal;
	private String tipoComponente;
	private String tipoDocumento;
	private String tipoDocumentoRelacionado;
	private Integer tipoHospitalizacion;
	private Integer tipoInterConsulta;
	private String tipoOPC;
	private Integer tipoOrdenAtencion;
	private Integer tipoordenatencionBk;
	private Integer tipoReceta;
	private String tipoRelacion;
	private Integer tipoTecnica;
	private String unidadOrganizacional;
	private String unidadReplicacionHCE;
	private String unidadReplicacionT;
	private String usuarioAutoriza;
	private String usuarioCreacion;
	private String usuarioModificacion;

	public SsAdOrdenAtencionDetalle() {
		id = new SsAdOrdenAtencionDetallePK();
	}


	@EmbeddedId
	public SsAdOrdenAtencionDetallePK getId() {
		return this.id;
	}

	public void setId(SsAdOrdenAtencionDetallePK id) {
		this.id = id;
	}


	@Column(name="AlmacenDestino")
	public String getAlmacenDestino() {
		return this.almacenDestino;
	}

	public void setAlmacenDestino(String almacenDestino) {
		this.almacenDestino = almacenDestino;
	}


	@Column(name="Cama")
	public Integer getCama() {
		return this.cama;
	}

	public void setCama(Integer cama) {
		this.cama = cama;
	}


	@Column(name="CampoReferencia")
	public String getCampoReferencia() {
		return this.campoReferencia;
	}

	public void setCampoReferencia(String campoReferencia) {
		this.campoReferencia = campoReferencia;
	}


	@Column(name="Cantidad")
	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}


	@Column(name="CantidadDesechada")
	public BigDecimal getCantidadDesechada() {
		return this.cantidadDesechada;
	}

	public void setCantidadDesechada(BigDecimal cantidadDesechada) {
		this.cantidadDesechada = cantidadDesechada;
	}


	@Column(name="CantidadDespachada")
	public BigDecimal getCantidadDespachada() {
		return this.cantidadDespachada;
	}

	public void setCantidadDespachada(BigDecimal cantidadDespachada) {
		this.cantidadDespachada = cantidadDespachada;
	}


	@Column(name="CantidadDevuelta")
	public BigDecimal getCantidadDevuelta() {
		return this.cantidadDevuelta;
	}

	public void setCantidadDevuelta(BigDecimal cantidadDevuelta) {
		this.cantidadDevuelta = cantidadDevuelta;
	}


	@Column(name="CantidadPresupuestada")
	public BigDecimal getCantidadPresupuestada() {
		return this.cantidadPresupuestada;
	}

	public void setCantidadPresupuestada(BigDecimal cantidadPresupuestada) {
		this.cantidadPresupuestada = cantidadPresupuestada;
	}


	@Column(name="CantidadRecepcionada")
	public BigDecimal getCantidadRecepcionada() {
		return this.cantidadRecepcionada;
	}

	public void setCantidadRecepcionada(BigDecimal cantidadRecepcionada) {
		this.cantidadRecepcionada = cantidadRecepcionada;
	}


	@Column(name="CantidadSolicitada")
	public BigDecimal getCantidadSolicitada() {
		return this.cantidadSolicitada;
	}

	public void setCantidadSolicitada(BigDecimal cantidadSolicitada) {
		this.cantidadSolicitada = cantidadSolicitada;
	}


	@Column(name="CantidadSuministrada")
	public BigDecimal getCantidadSuministrada() {
		return this.cantidadSuministrada;
	}

	public void setCantidadSuministrada(BigDecimal cantidadSuministrada) {
		this.cantidadSuministrada = cantidadSuministrada;
	}


	@Column(name="CentroCosto")
	public String getCentroCosto() {
		return this.centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}


	@Column(name="ClasificadorMovimiento")
	public String getClasificadorMovimiento() {
		return this.clasificadorMovimiento;
	}

	public void setClasificadorMovimiento(String clasificadorMovimiento) {
		this.clasificadorMovimiento = clasificadorMovimiento;
	}


	@Column(name="Compania")
	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}


	@Column(name="Componente")
	public String getComponente() {
		return this.componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}


	@Column(name="ComponentePaquete")
	public String getComponentePaquete() {
		return this.componentePaquete;
	}

	public void setComponentePaquete(String componentePaquete) {
		this.componentePaquete = componentePaquete;
	}


	@Column(name="ComponentePerfil")
	public String getComponentePerfil() {
		return this.componentePerfil;
	}

	public void setComponentePerfil(String componentePerfil) {
		this.componentePerfil = componentePerfil;
	}


	@Column(name="ConceptoGasto")
	public String getConceptoGasto() {
		return this.conceptoGasto;
	}

	public void setConceptoGasto(String conceptoGasto) {
		this.conceptoGasto = conceptoGasto;
	}


	@Column(name="CondicionComponente")
	public String getCondicionComponente() {
		return this.condicionComponente;
	}

	public void setCondicionComponente(String condicionComponente) {
		this.condicionComponente = condicionComponente;
	}


	@Column(name="Cuarto")
	public Integer getCuarto() {
		return this.cuarto;
	}

	public void setCuarto(Integer cuarto) {
		this.cuarto = cuarto;
	}


	@Column(name="Diagnostico_Clinico")
	public String getDiagnostico_Clinico() {
		return this.diagnostico_Clinico;
	}

	public void setDiagnostico_Clinico(String diagnostico_Clinico) {
		this.diagnostico_Clinico = diagnostico_Clinico;
	}


	@Column(name="DocumentoRelacionado")
	public String getDocumentoRelacionado() {
		return this.documentoRelacionado;
	}

	public void setDocumentoRelacionado(String documentoRelacionado) {
		this.documentoRelacionado = documentoRelacionado;
	}


	@Column(name="EnfermedadActual")
	public String getEnfermedadActual() {
		return this.enfermedadActual;
	}

	public void setEnfermedadActual(String enfermedadActual) {
		this.enfermedadActual = enfermedadActual;
	}


	@Column(name="EpisodioClinicoHCE")
	public Integer getEpisodioClinicoHCE() {
		return this.episodioClinicoHCE;
	}

	public void setEpisodioClinicoHCE(Integer episodioClinicoHCE) {
		this.episodioClinicoHCE = episodioClinicoHCE;
	}


	@Column(name="Especialidad")
	public Integer getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(Integer especialidad) {
		this.especialidad = especialidad;
	}


	@Column(name="Especimen")
	public String getEspecimen() {
		return this.especimen;
	}

	public void setEspecimen(String especimen) {
		this.especimen = especimen;
	}


	@Column(name="Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}


	@Column(name="FactorConversion")
	public BigDecimal getFactorConversion() {
		return this.factorConversion;
	}

	public void setFactorConversion(BigDecimal factorConversion) {
		this.factorConversion = factorConversion;
	}


	@Column(name="Familia")
	public String getFamilia() {
		return this.familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}


	@Column(name="FechaAlertaInterfase")
	public Date getFechaAlertaInterfase() {
		return this.fechaAlertaInterfase;
	}

	public void setFechaAlertaInterfase(Date fechaAlertaInterfase) {
		this.fechaAlertaInterfase = fechaAlertaInterfase;
	}


	@Column(name="FechaAplicacion")
	public Date getFechaAplicacion() {
		return this.fechaAplicacion;
	}

	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}


	@Column(name="FechaAutoriza")
	public Date getFechaAutoriza() {
		return this.fechaAutoriza;
	}

	public void setFechaAutoriza(Date fechaAutoriza) {
		this.fechaAutoriza = fechaAutoriza;
	}


	@Column(name="FechaCreacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="FechaModificacion")
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	@Column(name="FechaProcesoExpediente")
	public Date getFechaProcesoExpediente() {
		return this.fechaProcesoExpediente;
	}

	public void setFechaProcesoExpediente(Date fechaProcesoExpediente) {
		this.fechaProcesoExpediente = fechaProcesoExpediente;
	}


	@Column(name="GrupoInterfase")
	public Integer getGrupoInterfase() {
		return this.grupoInterfase;
	}

	public void setGrupoInterfase(Integer grupoInterfase) {
		this.grupoInterfase = grupoInterfase;
	}


	@Column(name="Hallazgos_Operatorios")
	public String getHallazgos_Operatorios() {
		return this.hallazgos_Operatorios;
	}

	public void setHallazgos_Operatorios(String hallazgos_Operatorios) {
		this.hallazgos_Operatorios = hallazgos_Operatorios;
	}


	@Column(name="IdCita")
	public Integer getIdCita() {
		return this.idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}


	@Column(name="IdDiagnostico")
	public Integer getIdDiagnostico() {
		return this.idDiagnostico;
	}

	public void setIdDiagnostico(Integer idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}


	@Column(name="IdDocumentoRelacionado")
	public Integer getIdDocumentoRelacionado() {
		return this.idDocumentoRelacionado;
	}

	public void setIdDocumentoRelacionado(Integer idDocumentoRelacionado) {
		this.idDocumentoRelacionado = idDocumentoRelacionado;
	}


	@Column(name="IdEpisodioAtencionHCE")
	public Long getIdEpisodioAtencionHCE() {
		return this.idEpisodioAtencionHCE;
	}

	public void setIdEpisodioAtencionHCE(Long idEpisodioAtencionHCE) {
		this.idEpisodioAtencionHCE = idEpisodioAtencionHCE;
	}


	@Column(name="IdEstablecimiento")
	public Integer getIdEstablecimiento() {
		return this.idEstablecimiento;
	}

	public void setIdEstablecimiento(Integer idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}


	@Column(name="IdOAOrigenTraslado")
	public Integer getIdOAOrigenTraslado() {
		return this.idOAOrigenTraslado;
	}

	public void setIdOAOrigenTraslado(Integer idOAOrigenTraslado) {
		this.idOAOrigenTraslado = idOAOrigenTraslado;
	}


	@Column(name="IdOPC")
	public Integer getIdOPC() {
		return this.idOPC;
	}

	public void setIdOPC(Integer idOPC) {
		this.idOPC = idOPC;
	}


	@Column(name="IdPaciente")
	public Integer getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}


	@Column(name="IdPacienteHCE")
	public Integer getIdPacienteHCE() {
		return this.idPacienteHCE;
	}

	public void setIdPacienteHCE(Integer idPacienteHCE) {
		this.idPacienteHCE = idPacienteHCE;
	}


	@Column(name="IdPersonaAntUnificacion")
	public Integer getIdPersonaAntUnificacion() {
		return this.idPersonaAntUnificacion;
	}

	public void setIdPersonaAntUnificacion(Integer idPersonaAntUnificacion) {
		this.idPersonaAntUnificacion = idPersonaAntUnificacion;
	}


	@Column(name="IdProcesoExpediente")
	public Integer getIdProcesoExpediente() {
		return this.idProcesoExpediente;
	}

	public void setIdProcesoExpediente(Integer idProcesoExpediente) {
		this.idProcesoExpediente = idProcesoExpediente;
	}


	@Column(name="IdProcesoExpedienteBk")
	public Integer getIdProcesoExpedienteBk() {
		return this.idProcesoExpedienteBk;
	}

	public void setIdProcesoExpedienteBk(Integer idProcesoExpedienteBk) {
		this.idProcesoExpedienteBk = idProcesoExpedienteBk;
	}


	@Column(name="IdServicio")
	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}


	@Column(name="IdTransaccionCambioHospitalizacion")
	public Integer getIdTransaccionCambioHospitalizacion() {
		return this.idTransaccionCambioHospitalizacion;
	}

	public void setIdTransaccionCambioHospitalizacion(Integer idTransaccionCambioHospitalizacion) {
		this.idTransaccionCambioHospitalizacion = idTransaccionCambioHospitalizacion;
	}


	@Column(name="IdTurno")
	public Integer getIdTurno() {
		return this.idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}


	@Column(name="IdUnidadMedida")
	public Integer getIdUnidadMedida() {
		return this.idUnidadMedida;
	}

	public void setIdUnidadMedida(Integer idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}


	@Column(name="IdVisita")
	public Integer getIdVisita() {
		return this.idVisita;
	}

	public void setIdVisita(Integer idVisita) {
		this.idVisita = idVisita;
	}


	@Column(name="IndicadorAgregado")
	public Integer getIndicadorAgregado() {
		return this.indicadorAgregado;
	}

	public void setIndicadorAgregado(Integer indicadorAgregado) {
		this.indicadorAgregado = indicadorAgregado;
	}


	@Column(name="IndicadorAlertaInterfase")
	public Integer getIndicadorAlertaInterfase() {
		return this.indicadorAlertaInterfase;
	}

	public void setIndicadorAlertaInterfase(Integer indicadorAlertaInterfase) {
		this.indicadorAlertaInterfase = indicadorAlertaInterfase;
	}


	@Column(name="IndicadorCoberturado")
	public Integer getIndicadorCoberturado() {
		return this.indicadorCoberturado;
	}

	public void setIndicadorCoberturado(Integer indicadorCoberturado) {
		this.indicadorCoberturado = indicadorCoberturado;
	}


	@Column(name="IndicadorCobrado")
	public Integer getIndicadorCobrado() {
		return this.indicadorCobrado;
	}

	public void setIndicadorCobrado(Integer indicadorCobrado) {
		this.indicadorCobrado = indicadorCobrado;
	}


	@Column(name="IndicadorCorreoLaboratorio")
	public Integer getIndicadorCorreoLaboratorio() {
		return this.indicadorCorreoLaboratorio;
	}

	public void setIndicadorCorreoLaboratorio(Integer indicadorCorreoLaboratorio) {
		this.indicadorCorreoLaboratorio = indicadorCorreoLaboratorio;
	}


	@Column(name="IndicadorCostoCero")
	public Integer getIndicadorCostoCero() {
		return this.indicadorCostoCero;
	}

	public void setIndicadorCostoCero(Integer indicadorCostoCero) {
		this.indicadorCostoCero = indicadorCostoCero;
	}


	@Column(name="IndicadorDisponible")
	public Integer getIndicadorDisponible() {
		return this.indicadorDisponible;
	}

	public void setIndicadorDisponible(Integer indicadorDisponible) {
		this.indicadorDisponible = indicadorDisponible;
	}


	@Column(name="IndicadorEliminado")
	public Integer getIndicadorEliminado() {
		return this.indicadorEliminado;
	}

	public void setIndicadorEliminado(Integer indicadorEliminado) {
		this.indicadorEliminado = indicadorEliminado;
	}


	@Column(name="IndicadorEPS")
	public Integer getIndicadorEPS() {
		return this.indicadorEPS;
	}

	public void setIndicadorEPS(Integer indicadorEPS) {
		this.indicadorEPS = indicadorEPS;
	}


	@Column(name="IndicadorEstHospIngresoLinea")
	public Integer getIndicadorEstHospIngresoLinea() {
		return this.indicadorEstHospIngresoLinea;
	}

	public void setIndicadorEstHospIngresoLinea(Integer indicadorEstHospIngresoLinea) {
		this.indicadorEstHospIngresoLinea = indicadorEstHospIngresoLinea;
	}


	@Column(name="IndicadorExpediente")
	public Integer getIndicadorExpediente() {
		return this.indicadorExpediente;
	}

	public void setIndicadorExpediente(Integer indicadorExpediente) {
		this.indicadorExpediente = indicadorExpediente;
	}


	@Column(name="IndicadorExpedienteBk")
	public Integer getIndicadorExpedienteBk() {
		return this.indicadorExpedienteBk;
	}

	public void setIndicadorExpedienteBk(Integer indicadorExpedienteBk) {
		this.indicadorExpedienteBk = indicadorExpedienteBk;
	}


	@Column(name="IndicadorFacturacion")
	public Integer getIndicadorFacturacion() {
		return this.indicadorFacturacion;
	}

	public void setIndicadorFacturacion(Integer indicadorFacturacion) {
		this.indicadorFacturacion = indicadorFacturacion;
	}


	@Column(name="IndicadorHonorarios")
	public Integer getIndicadorHonorarios() {
		return this.indicadorHonorarios;
	}

	public void setIndicadorHonorarios(Integer indicadorHonorarios) {
		this.indicadorHonorarios = indicadorHonorarios;
	}


	@Column(name="IndicadorLlegada")
	public Integer getIndicadorLlegada() {
		return this.indicadorLlegada;
	}

	public void setIndicadorLlegada(Integer indicadorLlegada) {
		this.indicadorLlegada = indicadorLlegada;
	}


	@Column(name="IndicadorMigrado")
	public String getIndicadorMigrado() {
		return this.indicadorMigrado;
	}

	public void setIndicadorMigrado(String indicadorMigrado) {
		this.indicadorMigrado = indicadorMigrado;
	}


	@Column(name="IndicadorMigradoHospital")
	public Integer getIndicadorMigradoHospital() {
		return this.indicadorMigradoHospital;
	}

	public void setIndicadorMigradoHospital(Integer indicadorMigradoHospital) {
		this.indicadorMigradoHospital = indicadorMigradoHospital;
	}


	@Column(name="IndicadorOcultarConsulta")
	public Integer getIndicadorOcultarConsulta() {
		return this.indicadorOcultarConsulta;
	}

	public void setIndicadorOcultarConsulta(Integer indicadorOcultarConsulta) {
		this.indicadorOcultarConsulta = indicadorOcultarConsulta;
	}


	@Column(name="IndicadorPaquete")
	public Integer getIndicadorPaquete() {
		return this.indicadorPaquete;
	}

	public void setIndicadorPaquete(Integer indicadorPaquete) {
		this.indicadorPaquete = indicadorPaquete;
	}


	@Column(name="IndicadorPerfil")
	public Integer getIndicadorPerfil() {
		return this.indicadorPerfil;
	}

	public void setIndicadorPerfil(Integer indicadorPerfil) {
		this.indicadorPerfil = indicadorPerfil;
	}


	@Column(name="IndicadorPlanilla")
	public Integer getIndicadorPlanilla() {
		return this.indicadorPlanilla;
	}

	public void setIndicadorPlanilla(Integer indicadorPlanilla) {
		this.indicadorPlanilla = indicadorPlanilla;
	}


	@Column(name="IndicadorProcedimiento")
	public Integer getIndicadorProcedimiento() {
		return this.indicadorProcedimiento;
	}

	public void setIndicadorProcedimiento(Integer indicadorProcedimiento) {
		this.indicadorProcedimiento = indicadorProcedimiento;
	}


	@Column(name="IndicadorReceta")
	public Integer getIndicadorReceta() {
		return this.indicadorReceta;
	}

	public void setIndicadorReceta(Integer indicadorReceta) {
		this.indicadorReceta = indicadorReceta;
	}


	@Column(name="IndicadorReingresoSalida")
	public Integer getIndicadorReingresoSalida() {
		return this.indicadorReingresoSalida;
	}

	public void setIndicadorReingresoSalida(Integer indicadorReingresoSalida) {
		this.indicadorReingresoSalida = indicadorReingresoSalida;
	}


	@Column(name="IndicadorRiesgoQuirurgico")
	public Integer getIndicadorRiesgoQuirurgico() {
		return this.indicadorRiesgoQuirurgico;
	}

	public void setIndicadorRiesgoQuirurgico(Integer indicadorRiesgoQuirurgico) {
		this.indicadorRiesgoQuirurgico = indicadorRiesgoQuirurgico;
	}


	@Column(name="IndicadorSeCobra")
	public Integer getIndicadorSeCobra() {
		return this.indicadorSeCobra;
	}

	public void setIndicadorSeCobra(Integer indicadorSeCobra) {
		this.indicadorSeCobra = indicadorSeCobra;
	}


	@Column(name="IndicadorTransferir")
	public Integer getIndicadorTransferir() {
		return this.indicadorTransferir;
	}

	public void setIndicadorTransferir(Integer indicadorTransferir) {
		this.indicadorTransferir = indicadorTransferir;
	}


	@Column(name="IndicadorValidarFechaTrat")
	public Integer getIndicadorValidarFechaTrat() {
		return this.indicadorValidarFechaTrat;
	}

	public void setIndicadorValidarFechaTrat(Integer indicadorValidarFechaTrat) {
		this.indicadorValidarFechaTrat = indicadorValidarFechaTrat;
	}


	@Column(name="IndRequiereCirugia")
	public Integer getIndRequiereCirugia() {
		return this.indRequiereCirugia;
	}

	public void setIndRequiereCirugia(Integer indRequiereCirugia) {
		this.indRequiereCirugia = indRequiereCirugia;
	}


	@Column(name="LineaDocumentoRelacionado")
	public Integer getLineaDocumentoRelacionado() {
		return this.lineaDocumentoRelacionado;
	}

	public void setLineaDocumentoRelacionado(Integer lineaDocumentoRelacionado) {
		this.lineaDocumentoRelacionado = lineaDocumentoRelacionado;
	}


	@Column(name="LineaFamilia")
	public String getLineaFamilia() {
		return this.lineaFamilia;
	}

	public void setLineaFamilia(String lineaFamilia) {
		this.lineaFamilia = lineaFamilia;
	}


	@Column(name="LineaHospInicial")
	public Integer getLineaHospInicial() {
		return this.lineaHospInicial;
	}

	public void setLineaHospInicial(Integer lineaHospInicial) {
		this.lineaHospInicial = lineaHospInicial;
	}


	@Column(name="LoteComponente")
	public String getLoteComponente() {
		return this.loteComponente;
	}

	public void setLoteComponente(String loteComponente) {
		this.loteComponente = loteComponente;
	}


	@Column(name="ModoIngreso")
	public Integer getModoIngreso() {
		return this.modoIngreso;
	}

	public void setModoIngreso(Integer modoIngreso) {
		this.modoIngreso = modoIngreso;
	}


	@Column(name="MotivoInterFase")
	public Integer getMotivoInterFase() {
		return this.motivoInterFase;
	}

	public void setMotivoInterFase(Integer motivoInterFase) {
		this.motivoInterFase = motivoInterFase;
	}


	@Column(name="MotivoRechazo")
	public String getMotivoRechazo() {
		return this.motivoRechazo;
	}

	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
	}


	@Column(name="NumeroDocumento")
	public String getNumeroDocumento() {
		return this.numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	@Column(name="NumeroExpediente")
	public Integer getNumeroExpediente() {
		return this.numeroExpediente;
	}

	public void setNumeroExpediente(Integer numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}


	@Column(name="NumeroExpedienteBk")
	public Integer getNumeroExpedienteBk() {
		return this.numeroExpedienteBk;
	}

	public void setNumeroExpedienteBk(Integer numeroExpedienteBk) {
		this.numeroExpedienteBk = numeroExpedienteBk;
	}


	@Column(name="NumeroOPC")
	public Integer getNumeroOPC() {
		return this.numeroOPC;
	}

	public void setNumeroOPC(Integer numeroOPC) {
		this.numeroOPC = numeroOPC;
	}


	@Column(name="Observacion")
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	@Column(name="ObservacionHospitalizacion")
	public String getObservacionHospitalizacion() {
		return this.observacionHospitalizacion;
	}

	public void setObservacionHospitalizacion(String observacionHospitalizacion) {
		this.observacionHospitalizacion = observacionHospitalizacion;
	}


	@Column(name="OrdenPerfil")
	public Integer getOrdenPerfil() {
		return this.ordenPerfil;
	}

	public void setOrdenPerfil(Integer ordenPerfil) {
		this.ordenPerfil = ordenPerfil;
	}


	@Column(name="PeriodoEmision")
	public Integer getPeriodoEmision() {
		return this.periodoEmision;
	}

	public void setPeriodoEmision(Integer periodoEmision) {
		this.periodoEmision = periodoEmision;
	}


	@Column(name="ProcedenciaComponente")
	public String getProcedenciaComponente() {
		return this.procedenciaComponente;
	}

	public void setProcedenciaComponente(String procedenciaComponente) {
		this.procedenciaComponente = procedenciaComponente;
	}


	@Column(name="Proyecto")
	public String getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}


	@Column(name="Secuencia")
	public Integer getSecuencia() {
		return this.secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}


	@Column(name="SecuenciaHCE")
	public Integer getSecuenciaHCE() {
		return this.secuenciaHCE;
	}

	public void setSecuenciaHCE(Integer secuenciaHCE) {
		this.secuenciaHCE = secuenciaHCE;
	}


	@Column(name="SecuencialDocumentoRelacionado")
	public Integer getSecuencialDocumentoRelacionado() {
		return this.secuencialDocumentoRelacionado;
	}

	public void setSecuencialDocumentoRelacionado(Integer secuencialDocumentoRelacionado) {
		this.secuencialDocumentoRelacionado = secuencialDocumentoRelacionado;
	}


	@Column(name="SecuencialInterfase")
	public Integer getSecuencialInterfase() {
		return this.secuencialInterfase;
	}

	public void setSecuencialInterfase(Integer secuencialInterfase) {
		this.secuencialInterfase = secuencialInterfase;
	}


	@Column(name="SerieDocumentoRelacionado")
	public String getSerieDocumentoRelacionado() {
		return this.serieDocumentoRelacionado;
	}

	public void setSerieDocumentoRelacionado(String serieDocumentoRelacionado) {
		this.serieDocumentoRelacionado = serieDocumentoRelacionado;
	}


	@Column(name="SerieOPC")
	public String getSerieOPC() {
		return this.serieOPC;
	}

	public void setSerieOPC(String serieOPC) {
		this.serieOPC = serieOPC;
	}


	@Column(name="Situacion")
	public Integer getSituacion() {
		return this.situacion;
	}

	public void setSituacion(Integer situacion) {
		this.situacion = situacion;
	}


	@Column(name="SituacionInterfase")
	public Integer getSituacionInterfase() {
		return this.situacionInterfase;
	}

	public void setSituacionInterfase(Integer situacionInterfase) {
		this.situacionInterfase = situacionInterfase;
	}


	@Column(name="SituacionLineaHosp")
	public Integer getSituacionLineaHosp() {
		return this.situacionLineaHosp;
	}

	public void setSituacionLineaHosp(Integer situacionLineaHosp) {
		this.situacionLineaHosp = situacionLineaHosp;
	}


	@Column(name="SituacionLineaHospPreAltaAdm")
	public Integer getSituacionLineaHospPreAltaAdm() {
		return this.situacionLineaHospPreAltaAdm;
	}

	public void setSituacionLineaHospPreAltaAdm(Integer situacionLineaHospPreAltaAdm) {
		this.situacionLineaHospPreAltaAdm = situacionLineaHospPreAltaAdm;
	}


	@Column(name="SubFamilia")
	public String getSubFamilia() {
		return this.subFamilia;
	}

	public void setSubFamilia(String subFamilia) {
		this.subFamilia = subFamilia;
	}


	@Column(name="Sucursal")
	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	@Column(name="TipoComponente")
	public String getTipoComponente() {
		return this.tipoComponente;
	}

	public void setTipoComponente(String tipoComponente) {
		this.tipoComponente = tipoComponente;
	}


	@Column(name="TipoDocumento")
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	@Column(name="TipoDocumentoRelacionado")
	public String getTipoDocumentoRelacionado() {
		return this.tipoDocumentoRelacionado;
	}

	public void setTipoDocumentoRelacionado(String tipoDocumentoRelacionado) {
		this.tipoDocumentoRelacionado = tipoDocumentoRelacionado;
	}


	@Column(name="TipoHospitalizacion")
	public Integer getTipoHospitalizacion() {
		return this.tipoHospitalizacion;
	}

	public void setTipoHospitalizacion(Integer tipoHospitalizacion) {
		this.tipoHospitalizacion = tipoHospitalizacion;
	}


	@Column(name="TipoInterConsulta")
	public Integer getTipoInterConsulta() {
		return this.tipoInterConsulta;
	}

	public void setTipoInterConsulta(Integer tipoInterConsulta) {
		this.tipoInterConsulta = tipoInterConsulta;
	}


	@Column(name="TipoOPC")
	public String getTipoOPC() {
		return this.tipoOPC;
	}

	public void setTipoOPC(String tipoOPC) {
		this.tipoOPC = tipoOPC;
	}


	@Column(name="TipoOrdenAtencion")
	public Integer getTipoOrdenAtencion() {
		return this.tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
	}


	@Column(name="tipoordenatencion_bk")
	public Integer getTipoordenatencionBk() {
		return this.tipoordenatencionBk;
	}

	public void setTipoordenatencionBk(Integer tipoordenatencionBk) {
		this.tipoordenatencionBk = tipoordenatencionBk;
	}


	@Column(name="TipoReceta")
	public Integer getTipoReceta() {
		return this.tipoReceta;
	}

	public void setTipoReceta(Integer tipoReceta) {
		this.tipoReceta = tipoReceta;
	}


	@Column(name="TipoRelacion")
	public String getTipoRelacion() {
		return this.tipoRelacion;
	}

	public void setTipoRelacion(String tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}


	@Column(name="TipoTecnica")
	public Integer getTipoTecnica() {
		return this.tipoTecnica;
	}

	public void setTipoTecnica(Integer tipoTecnica) {
		this.tipoTecnica = tipoTecnica;
	}


	@Column(name="UnidadOrganizacional")
	public String getUnidadOrganizacional() {
		return this.unidadOrganizacional;
	}

	public void setUnidadOrganizacional(String unidadOrganizacional) {
		this.unidadOrganizacional = unidadOrganizacional;
	}


	@Column(name="UnidadReplicacionHCE")
	public String getUnidadReplicacionHCE() {
		return this.unidadReplicacionHCE;
	}

	public void setUnidadReplicacionHCE(String unidadReplicacionHCE) {
		this.unidadReplicacionHCE = unidadReplicacionHCE;
	}


	@Column(name="UnidadReplicacionT")
	public String getUnidadReplicacionT() {
		return this.unidadReplicacionT;
	}

	public void setUnidadReplicacionT(String unidadReplicacionT) {
		this.unidadReplicacionT = unidadReplicacionT;
	}


	@Column(name="UsuarioAutoriza")
	public String getUsuarioAutoriza() {
		return this.usuarioAutoriza;
	}

	public void setUsuarioAutoriza(String usuarioAutoriza) {
		this.usuarioAutoriza = usuarioAutoriza;
	}


	@Column(name="UsuarioCreacion")
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}


	@Column(name="UsuarioModificacion")
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

}