package pe.royalsystems.springerp.model.domain.vista;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import pe.royalsystems.springerp.model.domain.Entidad;


/**
 * The persistent class for the VW_CITA_MEDICA database table.
 * 
 */
@Entity
@Table(name="VW_CITA_MEDICA")
public class VwCitaMedica extends Entidad {
	private static final long serialVersionUID = 1L;

	private Integer citaEstado;

	@Column(name="Comentario")
	private String comentario;

	private String consultorioCodigo;

	private String consultorioDescripcion;

	private String consultorioNombre;

	private Integer consultorioPool;

	@Column(name="DuracionPromedio")
	private Double duracionPromedio;

	@Column(name="DuracionReal")
	private Double duracionReal;

	private String especialidadCodigo;

	private String especialidadDescripcion;

	private String especialidadNombre;

	@Column(name="EstadoDocumento")
	private Integer estadoDocumento;

	@Column(name="EstadoDocumentoAnterior")
	private Integer estadoDocumentoAnterior;

	@Column(name="citaIndicadorWeb")
	private Integer citaIndicadorWeb;

	@Column(name="FechaCita")
	private Date fechaCita;

	@Column(name="FechaCitaFecha")
	private Date fechaCitaFecha;

	@Column(name="FechaCreacion")
	private Date fechaCreacion;

	@Column(name="FechaLlegada")
	private Date fechaLlegada;

	@Column(name="FechaModificacion")
	private Date fechaModificacion;

	@Column(name="FechaReemplazo")
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
	
	@Column(name = "idTurno")
	private Integer idTurno;
	
	@Column(name = "horarioTipoRegistroHorario")
	private Integer horarioTipoRegistroHorario;

	@Id
	@Column(name="IdCita")
	private Integer idCita;

	@Column(name="IdCitaRelacionada")
	private Integer idCitaRelacionada;

	@Column(name="IdConsultorio")
	private Integer idConsultorio;

	@Column(name="IdEspecialidad")
	private Integer idEspecialidad;

	@Column(name="IdGrupoAtencion")
	private Integer idGrupoAtencion;

	@Column(name="IdHorario")
	private Integer idHorario;

	@Column(name="IdInasistencia")
	private Integer idInasistencia;

	@Column(name="IdMedico")
	private Integer idMedico;

	@Column(name="IdMedicoReemplazo")
	private Integer idMedicoReemplazo;

	@Column(name="IdOrdenAtencion")
	private Integer idOrdenAtencion;

	@Column(name="IdPaciente")
	private Integer idPaciente;

	@Column(name="IdPersonaAntUnificacion")
	private Integer idPersonaAntUnificacion;

	@Column(name="IdServicio")
	private Integer idServicio;

	@Column(name="IdTipoAtencion")
	private Integer idTipoAtencion;

	@Column(name="IdUbicacion")
	private Integer idUbicacion;

	@Column(name="IndicadorExcedente")
	private Integer indicadorExcedente;

	@Column(name="IndicadorHistoriaClinica")
	private Integer indicadorHistoriaClinica;

	@Column(name="IndicadorInasistencia")
	private Integer indicadorInasistencia;

	@Column(name="IndicadorReemplazo")
	private Integer indicadorReemplazo;

	@Column(name="IndicadorRegistroCompartido")
	private Integer indicadorRegistroCompartido;

	@Column(name="IndicadorWeb")
	private Integer indicadorWeb;

	@Column(name="LineaOrdenAtencion")
	private Integer lineaOrdenAtencion;

	private String medicoApMaterno;

	private String medicoApPaterno;

	private String medicoDocumento;

	private String medicoEsEmpleado;

	private String medicoNombreCompleto;

	private String medicoNombres;

	private String medicoTipoDocumento;

	private Integer medicoTipoMedico;

	@Column(name="MotivoAnulacion")
	private String motivoAnulacion;

	@Column(name="MotivoCita")
	private Integer motivoCita;

	@Column(name="MotivoReemplazo")
	private Integer motivoReemplazo;

	@Column(name="ObservacionReemplazo")
	private String observacionReemplazo;

	private String pacienteApMaterno;

	private String pacienteApPaterno;

	private String pacienteDocumento;

	private String pacienteEsPaciente;

	private String pacienteNombreCompleto;

	private String pacienteNombres;

	private String pacienteTipoDocumento;

	@Column(name="Periodo")
	private Integer periodo;

	@Column(name="TipoCita")
	private Integer tipoCita;

	@Column(name="TipoReemplazo")
	private Integer tipoReemplazo;

	@Column(name="UsuarioCreacion")
	private String usuarioCreacion;

	@Column(name="UsuarioModificacion")
	private String usuarioModificacion;

	
	
	//ADD
	
	@Column(name="TipoCoberturaAtencion")
	private Integer tipoCoberturaAtencion;
	
	
	public VwCitaMedica() {
	}

	public Integer getCitaEstado() {
		return this.citaEstado;
	}

	public void setCitaEstado(Integer citaEstado) {
		this.citaEstado = citaEstado;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getConsultorioCodigo() {
		return this.consultorioCodigo;
	}

	public void setConsultorioCodigo(String consultorioCodigo) {
		this.consultorioCodigo = consultorioCodigo;
	}

	public String getConsultorioDescripcion() {
		return this.consultorioDescripcion;
	}

	public void setConsultorioDescripcion(String consultorioDescripcion) {
		this.consultorioDescripcion = consultorioDescripcion;
	}

	public String getConsultorioNombre() {
		return this.consultorioNombre;
	}

	public void setConsultorioNombre(String consultorioNombre) {
		this.consultorioNombre = consultorioNombre;
	}

	public Integer getConsultorioPool() {
		return this.consultorioPool;
	}

	public void setConsultorioPool(Integer consultorioPool) {
		this.consultorioPool = consultorioPool;
	}

	public Double getDuracionPromedio() {
		return this.duracionPromedio;
	}

	public void setDuracionPromedio(Double duracionPromedio) {
		this.duracionPromedio = duracionPromedio;
	}

	public Double getDuracionReal() {
		return this.duracionReal;
	}

	public void setDuracionReal(Double duracionReal) {
		this.duracionReal = duracionReal;
	}

	public String getEspecialidadCodigo() {
		return this.especialidadCodigo;
	}

	public void setEspecialidadCodigo(String especialidadCodigo) {
		this.especialidadCodigo = especialidadCodigo;
	}

	public String getEspecialidadDescripcion() {
		return this.especialidadDescripcion;
	}

	public void setEspecialidadDescripcion(String especialidadDescripcion) {
		this.especialidadDescripcion = especialidadDescripcion;
	}

	public String getEspecialidadNombre() {
		return this.especialidadNombre;
	}

	public void setEspecialidadNombre(String especialidadNombre) {
		this.especialidadNombre = especialidadNombre;
	}

	public Integer getEstadoDocumento() {
		return this.estadoDocumento;
	}

	public void setEstadoDocumento(Integer estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}

	public Integer getEstadoDocumentoAnterior() {
		return this.estadoDocumentoAnterior;
	}

	public void setEstadoDocumentoAnterior(Integer estadoDocumentoAnterior) {
		this.estadoDocumentoAnterior = estadoDocumentoAnterior;
	}

	public Integer getCitaIndicadorWeb() {
		return citaIndicadorWeb;
	}
	
	public void setCitaIndicadorWeb(Integer citaIndicadorWeb) {
		this.citaIndicadorWeb = citaIndicadorWeb;
	}

	public Date getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Date getFechaCitaFecha() {
		return this.fechaCitaFecha;
	}

	public void setFechaCitaFecha(Date fechaCitaFecha) {
		this.fechaCitaFecha = fechaCitaFecha;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaLlegada() {
		return this.fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaReemplazo() {
		return this.fechaReemplazo;
	}

	public void setFechaReemplazo(Date fechaReemplazo) {
		this.fechaReemplazo = fechaReemplazo;
	}

	public Date getHorarioFechaFin() {
		return this.horarioFechaFin;
	}

	public void setHorarioFechaFin(Date horarioFechaFin) {
		this.horarioFechaFin = horarioFechaFin;
	}

	public Date getHorarioFechaFinHorario() {
		return this.horarioFechaFinHorario;
	}

	public void setHorarioFechaFinHorario(Date horarioFechaFinHorario) {
		this.horarioFechaFinHorario = horarioFechaFinHorario;
	}

	public Date getHorarioFechaInicio() {
		return this.horarioFechaInicio;
	}

	public void setHorarioFechaInicio(Date horarioFechaInicio) {
		this.horarioFechaInicio = horarioFechaInicio;
	}

	public Date getHorarioFechaInicioHorario() {
		return this.horarioFechaInicioHorario;
	}

	public void setHorarioFechaInicioHorario(Date horarioFechaInicioHorario) {
		this.horarioFechaInicioHorario = horarioFechaInicioHorario;
	}

	public Date getHorarioHoraFin() {
		return this.horarioHoraFin;
	}

	public void setHorarioHoraFin(Date horarioHoraFin) {
		this.horarioHoraFin = horarioHoraFin;
	}

	public Date getHorarioHoraInicio() {
		return this.horarioHoraInicio;
	}

	public void setHorarioHoraInicio(Date horarioHoraInicio) {
		this.horarioHoraInicio = horarioHoraInicio;
	}

	public Integer getHorarioIndicadorDomingo() {
		return this.horarioIndicadorDomingo;
	}

	public void setHorarioIndicadorDomingo(Integer horarioIndicadorDomingo) {
		this.horarioIndicadorDomingo = horarioIndicadorDomingo;
	}

	public Integer getHorarioIndicadorJueves() {
		return this.horarioIndicadorJueves;
	}

	public void setHorarioIndicadorJueves(Integer horarioIndicadorJueves) {
		this.horarioIndicadorJueves = horarioIndicadorJueves;
	}

	public Integer getHorarioIndicadorLunes() {
		return this.horarioIndicadorLunes;
	}

	public void setHorarioIndicadorLunes(Integer horarioIndicadorLunes) {
		this.horarioIndicadorLunes = horarioIndicadorLunes;
	}

	public Integer getHorarioIndicadorMartes() {
		return this.horarioIndicadorMartes;
	}

	public void setHorarioIndicadorMartes(Integer horarioIndicadorMartes) {
		this.horarioIndicadorMartes = horarioIndicadorMartes;
	}

	public Integer getHorarioIndicadorMiercoles() {
		return this.horarioIndicadorMiercoles;
	}

	public void setHorarioIndicadorMiercoles(Integer horarioIndicadorMiercoles) {
		this.horarioIndicadorMiercoles = horarioIndicadorMiercoles;
	}

	public Integer getHorarioIndicadorSabado() {
		return this.horarioIndicadorSabado;
	}

	public void setHorarioIndicadorSabado(Integer horarioIndicadorSabado) {
		this.horarioIndicadorSabado = horarioIndicadorSabado;
	}

	public Integer getHorarioIndicadorViernes() {
		return this.horarioIndicadorViernes;
	}

	public void setHorarioIndicadorViernes(Integer horarioIndicadorViernes) {
		this.horarioIndicadorViernes = horarioIndicadorViernes;
	}

	public Integer getIdCita() {
		return this.idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	public Integer getIdCitaRelacionada() {
		return this.idCitaRelacionada;
	}

	public void setIdCitaRelacionada(Integer idCitaRelacionada) {
		this.idCitaRelacionada = idCitaRelacionada;
	}

	public Integer getIdConsultorio() {
		return this.idConsultorio;
	}

	public void setIdConsultorio(Integer idConsultorio) {
		this.idConsultorio = idConsultorio;
	}

	public Integer getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public Integer getIdGrupoAtencion() {
		return this.idGrupoAtencion;
	}

	public void setIdGrupoAtencion(Integer idGrupoAtencion) {
		this.idGrupoAtencion = idGrupoAtencion;
	}

	public Integer getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Integer getIdInasistencia() {
		return this.idInasistencia;
	}

	public void setIdInasistencia(Integer idInasistencia) {
		this.idInasistencia = idInasistencia;
	}

	public Integer getIdMedico() {
		return this.idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public Integer getIdMedicoReemplazo() {
		return this.idMedicoReemplazo;
	}

	public void setIdMedicoReemplazo(Integer idMedicoReemplazo) {
		this.idMedicoReemplazo = idMedicoReemplazo;
	}

	public Integer getIdOrdenAtencion() {
		return this.idOrdenAtencion;
	}

	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}

	public Integer getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Integer getIdPersonaAntUnificacion() {
		return this.idPersonaAntUnificacion;
	}

	public void setIdPersonaAntUnificacion(Integer idPersonaAntUnificacion) {
		this.idPersonaAntUnificacion = idPersonaAntUnificacion;
	}

	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public Integer getIdTipoAtencion() {
		return this.idTipoAtencion;
	}

	public void setIdTipoAtencion(Integer idTipoAtencion) {
		this.idTipoAtencion = idTipoAtencion;
	}

	public Integer getIdUbicacion() {
		return this.idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Integer getIndicadorExcedente() {
		return this.indicadorExcedente;
	}

	public void setIndicadorExcedente(Integer indicadorExcedente) {
		this.indicadorExcedente = indicadorExcedente;
	}

	public Integer getIndicadorHistoriaClinica() {
		return this.indicadorHistoriaClinica;
	}

	public void setIndicadorHistoriaClinica(Integer indicadorHistoriaClinica) {
		this.indicadorHistoriaClinica = indicadorHistoriaClinica;
	}

	public Integer getIndicadorInasistencia() {
		return this.indicadorInasistencia;
	}

	public void setIndicadorInasistencia(Integer indicadorInasistencia) {
		this.indicadorInasistencia = indicadorInasistencia;
	}

	public Integer getIndicadorReemplazo() {
		return this.indicadorReemplazo;
	}

	public void setIndicadorReemplazo(Integer indicadorReemplazo) {
		this.indicadorReemplazo = indicadorReemplazo;
	}

	public Integer getIndicadorRegistroCompartido() {
		return this.indicadorRegistroCompartido;
	}

	public void setIndicadorRegistroCompartido(Integer indicadorRegistroCompartido) {
		this.indicadorRegistroCompartido = indicadorRegistroCompartido;
	}

	public Integer getIndicadorWeb() {
		return this.indicadorWeb;
	}

	public void setIndicadorWeb(Integer indicadorWeb) {
		this.indicadorWeb = indicadorWeb;
	}

	public Integer getLineaOrdenAtencion() {
		return this.lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}

	public String getMedicoApMaterno() {
		return this.medicoApMaterno;
	}

	public void setMedicoApMaterno(String medicoApMaterno) {
		this.medicoApMaterno = medicoApMaterno;
	}

	public String getMedicoApPaterno() {
		return this.medicoApPaterno;
	}

	public void setMedicoApPaterno(String medicoApPaterno) {
		this.medicoApPaterno = medicoApPaterno;
	}

	public String getMedicoDocumento() {
		return this.medicoDocumento;
	}

	public void setMedicoDocumento(String medicoDocumento) {
		this.medicoDocumento = medicoDocumento;
	}

	public String getMedicoEsEmpleado() {
		return this.medicoEsEmpleado;
	}

	public void setMedicoEsEmpleado(String medicoEsEmpleado) {
		this.medicoEsEmpleado = medicoEsEmpleado;
	}

	public String getMedicoNombreCompleto() {
		return this.medicoNombreCompleto;
	}

	public void setMedicoNombreCompleto(String medicoNombreCompleto) {
		this.medicoNombreCompleto = medicoNombreCompleto;
	}

	public String getMedicoNombres() {
		return this.medicoNombres;
	}

	public void setMedicoNombres(String medicoNombres) {
		this.medicoNombres = medicoNombres;
	}

	public String getMedicoTipoDocumento() {
		return this.medicoTipoDocumento;
	}

	public void setMedicoTipoDocumento(String medicoTipoDocumento) {
		this.medicoTipoDocumento = medicoTipoDocumento;
	}

	public Integer getMedicoTipoMedico() {
		return this.medicoTipoMedico;
	}

	public void setMedicoTipoMedico(Integer medicoTipoMedico) {
		this.medicoTipoMedico = medicoTipoMedico;
	}

	public String getMotivoAnulacion() {
		return this.motivoAnulacion;
	}

	public void setMotivoAnulacion(String motivoAnulacion) {
		this.motivoAnulacion = motivoAnulacion;
	}

	public Integer getMotivoCita() {
		return this.motivoCita;
	}

	public void setMotivoCita(Integer motivoCita) {
		this.motivoCita = motivoCita;
	}

	public Integer getMotivoReemplazo() {
		return this.motivoReemplazo;
	}

	public void setMotivoReemplazo(Integer motivoReemplazo) {
		this.motivoReemplazo = motivoReemplazo;
	}

	public String getObservacionReemplazo() {
		return this.observacionReemplazo;
	}

	public void setObservacionReemplazo(String observacionReemplazo) {
		this.observacionReemplazo = observacionReemplazo;
	}

	public String getPacienteApMaterno() {
		return this.pacienteApMaterno;
	}

	public void setPacienteApMaterno(String pacienteApMaterno) {
		this.pacienteApMaterno = pacienteApMaterno;
	}

	public String getPacienteApPaterno() {
		return this.pacienteApPaterno;
	}

	public void setPacienteApPaterno(String pacienteApPaterno) {
		this.pacienteApPaterno = pacienteApPaterno;
	}

	public String getPacienteDocumento() {
		return this.pacienteDocumento;
	}

	public void setPacienteDocumento(String pacienteDocumento) {
		this.pacienteDocumento = pacienteDocumento;
	}

	public String getPacienteEsPaciente() {
		return this.pacienteEsPaciente;
	}

	public void setPacienteEsPaciente(String pacienteEsPaciente) {
		this.pacienteEsPaciente = pacienteEsPaciente;
	}

	public String getPacienteNombreCompleto() {
		return this.pacienteNombreCompleto;
	}

	public void setPacienteNombreCompleto(String pacienteNombreCompleto) {
		this.pacienteNombreCompleto = pacienteNombreCompleto;
	}

	public String getPacienteNombres() {
		return this.pacienteNombres;
	}

	public void setPacienteNombres(String pacienteNombres) {
		this.pacienteNombres = pacienteNombres;
	}

	public String getPacienteTipoDocumento() {
		return this.pacienteTipoDocumento;
	}

	public void setPacienteTipoDocumento(String pacienteTipoDocumento) {
		this.pacienteTipoDocumento = pacienteTipoDocumento;
	}

	public Integer getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getTipoCita() {
		return this.tipoCita;
	}

	public void setTipoCita(Integer tipoCita) {
		this.tipoCita = tipoCita;
	}

	public Integer getTipoReemplazo() {
		return this.tipoReemplazo;
	}

	public void setTipoReemplazo(Integer tipoReemplazo) {
		this.tipoReemplazo = tipoReemplazo;
	}

	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
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

	
	
	/** ATRIBUTOS TRANSIENT **/
	@Transient
	private Date horaInicio;
	
	@Transient
	private String strHoraInicio;
	
	@Transient
	private Date horaFin;
	
	@Transient
	private String strHoraFin;
	
	@Transient
	private String descripcionEstadoCita;
	
	@Transient
	private List<Integer> listTipoRegistroHorario;
	
	public Date getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public String getStrHoraInicio() {
		return strHoraInicio;
	}

	public void setStrHoraInicio(String strHoraInicio) {
		this.strHoraInicio = strHoraInicio;
	}

	public String getStrHoraFin() {
		return strHoraFin;
	}

	public void setStrHoraFin(String strHoraFin) {
		this.strHoraFin = strHoraFin;
	}
	
	public String getDescripcionEstadoCita() {
		return descripcionEstadoCita;
	}
	
	public void setDescripcionEstadoCita(String descripcionEstadoCita) {
		this.descripcionEstadoCita = descripcionEstadoCita;
	}
	
	public List<Integer> getListTipoRegistroHorario() {
		return listTipoRegistroHorario;
	}
	
	public void setListTipoRegistroHorario(List<Integer> listTipoRegistroHorario) {
		this.listTipoRegistroHorario = listTipoRegistroHorario;
	}

	public Integer getTipoCoberturaAtencion() {
		return tipoCoberturaAtencion;
	}

	public void setTipoCoberturaAtencion(Integer tipoCoberturaAtencion) {
		this.tipoCoberturaAtencion = tipoCoberturaAtencion;
	}
	
	
}