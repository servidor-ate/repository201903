package pe.royalsystems.springerp.erpspringsalud.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;

@JsonIgnoreProperties( value = { 
		/**Campos a ignorar*/	
		"uri"
		,"paginable"
	})
@JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
public class VwCitaMedicaJson extends EntidadJson {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2011961751425524575L;
	
	private Integer citaEstado;	

	private String consultorioCodigo;

	private String consultorioDescripcion;

	private String consultorioNombre;

	private Integer consultorioPool;

	private Double duracionPromedio;
	
	private Double duracionReal;

	private String especialidadCodigo;

	private String especialidadDescripcion;

	private String especialidadNombre;

	private Integer citaIndicadorWeb;

	private Date fechaCita;

	private Date fechaCitaFecha;

	private Date fechaLlegada;

	private Date fechaReemplazo;

	private Date horarioFechaFin;

	private Date horarioFechaFinHorario;

	private Date horarioFechaInicio;

	private Date horarioFechaInicioHorario;

	private Date horarioHoraFin;

	private Date horarioHoraInicio;

	private Integer horarioIndicadorDomingo;

	private Integer horarioIndicadorJueves;

	private Integer horarioIndicadorLunes;

	private Integer horarioIndicadorMartes;

	private Integer horarioIndicadorMiercoles;

	private Integer horarioIndicadorSabado;

	private Integer horarioIndicadorViernes;
		
	private Integer idTurno;
	
	private Integer horarioTipoRegistroHorario;
	
	private Integer idCita;

	private Integer idCitaRelacionada;
	
	private Integer idConsultorio;
	
	private Integer idEspecialidad;
	
	private Integer idGrupoAtencion;

	private Integer idHorario;

	private Integer idInasistencia;

	private Integer idMedico;

	private Integer idMedicoReemplazo;

	private Integer idOrdenAtencion;

	private Integer idPaciente;

	private Integer idPersonaAntUnificacion;

	private Integer idServicio;

	private Integer idTipoAtencion;

	private Integer idUbicacion;
	
	private Integer indicadorExcedente;

	private Integer indicadorHistoriaClinica;
	
	private Integer indicadorInasistencia;

	private Integer indicadorReemplazo;

	private Integer indicadorRegistroCompartido;

	private Integer indicadorWeb;

	private Integer lineaOrdenAtencion;


	private String medicoDocumento;

	private String medicoEsEmpleado;

	private String medicoNombreCompleto;

	private String medicoTipoDocumento;

	private Integer medicoTipoMedico;

	private String motivoAnulacion;

	private String pacienteDocumento;

	private String pacienteEsPaciente;

	private String pacienteNombreCompleto;

	private String pacienteNombres;

	private String pacienteTipoDocumento;

	private Integer periodo;

	private Integer tipoCita;

	private Integer tipoReemplazo;

	private Integer tipoCoberturaAtencion;

	public Integer getCitaEstado() {
		return citaEstado;
	}

	public void setCitaEstado(Integer citaEstado) {
		this.citaEstado = citaEstado;
	}

	public String getConsultorioCodigo() {
		return consultorioCodigo;
	}

	public void setConsultorioCodigo(String consultorioCodigo) {
		this.consultorioCodigo = consultorioCodigo;
	}

	public String getConsultorioDescripcion() {
		return consultorioDescripcion;
	}

	public void setConsultorioDescripcion(String consultorioDescripcion) {
		this.consultorioDescripcion = consultorioDescripcion;
	}

	public String getConsultorioNombre() {
		return consultorioNombre;
	}

	public void setConsultorioNombre(String consultorioNombre) {
		this.consultorioNombre = consultorioNombre;
	}

	public Integer getConsultorioPool() {
		return consultorioPool;
	}

	public void setConsultorioPool(Integer consultorioPool) {
		this.consultorioPool = consultorioPool;
	}

	public Double getDuracionPromedio() {
		return duracionPromedio;
	}

	public void setDuracionPromedio(Double duracionPromedio) {
		this.duracionPromedio = duracionPromedio;
	}

	public Double getDuracionReal() {
		return duracionReal;
	}

	public void setDuracionReal(Double duracionReal) {
		this.duracionReal = duracionReal;
	}

	public String getEspecialidadCodigo() {
		return especialidadCodigo;
	}

	public void setEspecialidadCodigo(String especialidadCodigo) {
		this.especialidadCodigo = especialidadCodigo;
	}

	public String getEspecialidadDescripcion() {
		return especialidadDescripcion;
	}

	public void setEspecialidadDescripcion(String especialidadDescripcion) {
		this.especialidadDescripcion = especialidadDescripcion;
	}

	public String getEspecialidadNombre() {
		return especialidadNombre;
	}

	public void setEspecialidadNombre(String especialidadNombre) {
		this.especialidadNombre = especialidadNombre;
	}

	public Integer getCitaIndicadorWeb() {
		return citaIndicadorWeb;
	}

	public void setCitaIndicadorWeb(Integer citaIndicadorWeb) {
		this.citaIndicadorWeb = citaIndicadorWeb;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Date getFechaCitaFecha() {
		return fechaCitaFecha;
	}

	public void setFechaCitaFecha(Date fechaCitaFecha) {
		this.fechaCitaFecha = fechaCitaFecha;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public Date getFechaReemplazo() {
		return fechaReemplazo;
	}

	public void setFechaReemplazo(Date fechaReemplazo) {
		this.fechaReemplazo = fechaReemplazo;
	}

	public Date getHorarioFechaFin() {
		return horarioFechaFin;
	}

	public void setHorarioFechaFin(Date horarioFechaFin) {
		this.horarioFechaFin = horarioFechaFin;
	}

	public Date getHorarioFechaFinHorario() {
		return horarioFechaFinHorario;
	}

	public void setHorarioFechaFinHorario(Date horarioFechaFinHorario) {
		this.horarioFechaFinHorario = horarioFechaFinHorario;
	}

	public Date getHorarioFechaInicio() {
		return horarioFechaInicio;
	}

	public void setHorarioFechaInicio(Date horarioFechaInicio) {
		this.horarioFechaInicio = horarioFechaInicio;
	}

	public Date getHorarioFechaInicioHorario() {
		return horarioFechaInicioHorario;
	}

	public void setHorarioFechaInicioHorario(Date horarioFechaInicioHorario) {
		this.horarioFechaInicioHorario = horarioFechaInicioHorario;
	}

	public Date getHorarioHoraFin() {
		return horarioHoraFin;
	}

	public void setHorarioHoraFin(Date horarioHoraFin) {
		this.horarioHoraFin = horarioHoraFin;
	}

	public Date getHorarioHoraInicio() {
		return horarioHoraInicio;
	}

	public void setHorarioHoraInicio(Date horarioHoraInicio) {
		this.horarioHoraInicio = horarioHoraInicio;
	}

	public Integer getHorarioIndicadorDomingo() {
		return horarioIndicadorDomingo;
	}

	public void setHorarioIndicadorDomingo(Integer horarioIndicadorDomingo) {
		this.horarioIndicadorDomingo = horarioIndicadorDomingo;
	}

	public Integer getHorarioIndicadorJueves() {
		return horarioIndicadorJueves;
	}

	public void setHorarioIndicadorJueves(Integer horarioIndicadorJueves) {
		this.horarioIndicadorJueves = horarioIndicadorJueves;
	}

	public Integer getHorarioIndicadorLunes() {
		return horarioIndicadorLunes;
	}

	public void setHorarioIndicadorLunes(Integer horarioIndicadorLunes) {
		this.horarioIndicadorLunes = horarioIndicadorLunes;
	}

	public Integer getHorarioIndicadorMartes() {
		return horarioIndicadorMartes;
	}

	public void setHorarioIndicadorMartes(Integer horarioIndicadorMartes) {
		this.horarioIndicadorMartes = horarioIndicadorMartes;
	}

	public Integer getHorarioIndicadorMiercoles() {
		return horarioIndicadorMiercoles;
	}

	public void setHorarioIndicadorMiercoles(Integer horarioIndicadorMiercoles) {
		this.horarioIndicadorMiercoles = horarioIndicadorMiercoles;
	}

	public Integer getHorarioIndicadorSabado() {
		return horarioIndicadorSabado;
	}

	public void setHorarioIndicadorSabado(Integer horarioIndicadorSabado) {
		this.horarioIndicadorSabado = horarioIndicadorSabado;
	}

	public Integer getHorarioIndicadorViernes() {
		return horarioIndicadorViernes;
	}

	public void setHorarioIndicadorViernes(Integer horarioIndicadorViernes) {
		this.horarioIndicadorViernes = horarioIndicadorViernes;
	}

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public Integer getHorarioTipoRegistroHorario() {
		return horarioTipoRegistroHorario;
	}

	public void setHorarioTipoRegistroHorario(Integer horarioTipoRegistroHorario) {
		this.horarioTipoRegistroHorario = horarioTipoRegistroHorario;
	}

	public Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public Integer getIdCitaRelacionada() {
		return idCitaRelacionada;
	}

	public void setIdCitaRelacionada(Integer idCitaRelacionada) {
		this.idCitaRelacionada = idCitaRelacionada;
	}

	public Integer getIdConsultorio() {
		return idConsultorio;
	}

	public void setIdConsultorio(Integer idConsultorio) {
		this.idConsultorio = idConsultorio;
	}

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public Integer getIdGrupoAtencion() {
		return idGrupoAtencion;
	}

	public void setIdGrupoAtencion(Integer idGrupoAtencion) {
		this.idGrupoAtencion = idGrupoAtencion;
	}

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Integer getIdInasistencia() {
		return idInasistencia;
	}

	public void setIdInasistencia(Integer idInasistencia) {
		this.idInasistencia = idInasistencia;
	}

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public Integer getIdMedicoReemplazo() {
		return idMedicoReemplazo;
	}

	public void setIdMedicoReemplazo(Integer idMedicoReemplazo) {
		this.idMedicoReemplazo = idMedicoReemplazo;
	}

	public Integer getIdOrdenAtencion() {
		return idOrdenAtencion;
	}

	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Integer getIdPersonaAntUnificacion() {
		return idPersonaAntUnificacion;
	}

	public void setIdPersonaAntUnificacion(Integer idPersonaAntUnificacion) {
		this.idPersonaAntUnificacion = idPersonaAntUnificacion;
	}

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public Integer getIdTipoAtencion() {
		return idTipoAtencion;
	}

	public void setIdTipoAtencion(Integer idTipoAtencion) {
		this.idTipoAtencion = idTipoAtencion;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Integer getIndicadorExcedente() {
		return indicadorExcedente;
	}

	public void setIndicadorExcedente(Integer indicadorExcedente) {
		this.indicadorExcedente = indicadorExcedente;
	}

	public Integer getIndicadorHistoriaClinica() {
		return indicadorHistoriaClinica;
	}

	public void setIndicadorHistoriaClinica(Integer indicadorHistoriaClinica) {
		this.indicadorHistoriaClinica = indicadorHistoriaClinica;
	}

	public Integer getIndicadorInasistencia() {
		return indicadorInasistencia;
	}

	public void setIndicadorInasistencia(Integer indicadorInasistencia) {
		this.indicadorInasistencia = indicadorInasistencia;
	}

	public Integer getIndicadorReemplazo() {
		return indicadorReemplazo;
	}

	public void setIndicadorReemplazo(Integer indicadorReemplazo) {
		this.indicadorReemplazo = indicadorReemplazo;
	}

	public Integer getIndicadorRegistroCompartido() {
		return indicadorRegistroCompartido;
	}

	public void setIndicadorRegistroCompartido(Integer indicadorRegistroCompartido) {
		this.indicadorRegistroCompartido = indicadorRegistroCompartido;
	}

	public Integer getIndicadorWeb() {
		return indicadorWeb;
	}

	public void setIndicadorWeb(Integer indicadorWeb) {
		this.indicadorWeb = indicadorWeb;
	}

	public Integer getLineaOrdenAtencion() {
		return lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}

	public String getMedicoDocumento() {
		return medicoDocumento;
	}

	public void setMedicoDocumento(String medicoDocumento) {
		this.medicoDocumento = medicoDocumento;
	}

	public String getMedicoEsEmpleado() {
		return medicoEsEmpleado;
	}

	public void setMedicoEsEmpleado(String medicoEsEmpleado) {
		this.medicoEsEmpleado = medicoEsEmpleado;
	}

	public String getMedicoNombreCompleto() {
		return medicoNombreCompleto;
	}

	public void setMedicoNombreCompleto(String medicoNombreCompleto) {
		this.medicoNombreCompleto = medicoNombreCompleto;
	}

	public String getMedicoTipoDocumento() {
		return medicoTipoDocumento;
	}

	public void setMedicoTipoDocumento(String medicoTipoDocumento) {
		this.medicoTipoDocumento = medicoTipoDocumento;
	}

	public Integer getMedicoTipoMedico() {
		return medicoTipoMedico;
	}

	public void setMedicoTipoMedico(Integer medicoTipoMedico) {
		this.medicoTipoMedico = medicoTipoMedico;
	}

	public String getMotivoAnulacion() {
		return motivoAnulacion;
	}

	public void setMotivoAnulacion(String motivoAnulacion) {
		this.motivoAnulacion = motivoAnulacion;
	}

	public String getPacienteDocumento() {
		return pacienteDocumento;
	}

	public void setPacienteDocumento(String pacienteDocumento) {
		this.pacienteDocumento = pacienteDocumento;
	}

	public String getPacienteEsPaciente() {
		return pacienteEsPaciente;
	}

	public void setPacienteEsPaciente(String pacienteEsPaciente) {
		this.pacienteEsPaciente = pacienteEsPaciente;
	}

	public String getPacienteNombreCompleto() {
		return pacienteNombreCompleto;
	}

	public void setPacienteNombreCompleto(String pacienteNombreCompleto) {
		this.pacienteNombreCompleto = pacienteNombreCompleto;
	}

	public String getPacienteNombres() {
		return pacienteNombres;
	}

	public void setPacienteNombres(String pacienteNombres) {
		this.pacienteNombres = pacienteNombres;
	}

	public String getPacienteTipoDocumento() {
		return pacienteTipoDocumento;
	}

	public void setPacienteTipoDocumento(String pacienteTipoDocumento) {
		this.pacienteTipoDocumento = pacienteTipoDocumento;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getTipoCita() {
		return tipoCita;
	}

	public void setTipoCita(Integer tipoCita) {
		this.tipoCita = tipoCita;
	}

	public Integer getTipoReemplazo() {
		return tipoReemplazo;
	}

	public void setTipoReemplazo(Integer tipoReemplazo) {
		this.tipoReemplazo = tipoReemplazo;
	}

	public Integer getTipoCoberturaAtencion() {
		return tipoCoberturaAtencion;
	}

	public void setTipoCoberturaAtencion(Integer tipoCoberturaAtencion) {
		this.tipoCoberturaAtencion = tipoCoberturaAtencion;
	}
	
	
	
}
