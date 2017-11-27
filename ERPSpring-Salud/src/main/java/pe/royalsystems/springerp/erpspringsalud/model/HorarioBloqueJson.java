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
public class HorarioBloqueJson extends EntidadJson {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer estado;	
	
	/***vincualados con fecha**/
	private Date fechaInicio;
	private Date fechaFin;			
	private String patterFecha;		
	private String fechaInicioFormat;
	private String fechaFinFormat;	
	private Date horaInicio;
	private Date horaFin;		
	private String patterHora;
	private String horaInicioFormat;
	private String horaFinFormat;		
	
	/***vincualados con datos clinicos**/
	private Integer idConsultorio;	
	private Integer idEspecialidad;	
	private Integer idGrupoAtencionCompartido;
	private Integer idHorario;
	private Integer idInasistencia;	
	private Integer idServicio;	
	private Integer idTurno;	
	private Integer periodo;
	private Double tiempoPromedioAtencion;
	private String descripcionTurno;
	private String codigoConsultorio;
	private String nombreConsultorio;
	private Integer poolConsultorio;
	
	private boolean citaAsignada;	
	private Integer idCita;

	
	/***vincualados con datos del medico**/
	private Integer medico;
	private String medicoDocumento;
	private String medicoNombreCompleto;
	private String codigoEspecialidad;	
	private String nombreEspecialidad;
	
	/***vincualados con datos del paciente**/
	private Integer pacienteId;
	private String pacienteDocumento;
	private String pacienteNombreCompleto;
	
	/***vincualados con datos del bloque horario**/	
	private String tituloBloque;
	private String descripcionBloque;
	private String estiloBloque;
	private String etiquetaBloque;
	
	/***vincualados con datos de la obligacion y pagos**/
	private String servicioItemcodigo;
	private String servicioItemDescripcion;
	private Integer obligacionId;
	private Integer obligacionEstado;
	private Integer flagPago;
	
	
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
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
	public Integer getIdGrupoAtencionCompartido() {
		return idGrupoAtencionCompartido;
	}
	public void setIdGrupoAtencionCompartido(Integer idGrupoAtencionCompartido) {
		this.idGrupoAtencionCompartido = idGrupoAtencionCompartido;
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
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public Integer getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public Double getTiempoPromedioAtencion() {
		return tiempoPromedioAtencion;
	}
	public void setTiempoPromedioAtencion(Double tiempoPromedioAtencion) {
		this.tiempoPromedioAtencion = tiempoPromedioAtencion;
	}
	public Integer getMedico() {
		return medico;
	}
	public void setMedico(Integer medico) {
		this.medico = medico;
	}
	public String getMedicoDocumento() {
		return medicoDocumento;
	}
	public void setMedicoDocumento(String medicoDocumento) {
		this.medicoDocumento = medicoDocumento;
	}
	public String getMedicoNombreCompleto() {
		return medicoNombreCompleto;
	}
	public void setMedicoNombreCompleto(String medicoNombreCompleto) {
		this.medicoNombreCompleto = medicoNombreCompleto;
	}
	public Integer getPacienteId() {
		return pacienteId;
	}
	public void setPacienteId(Integer pacienteId) {
		this.pacienteId = pacienteId;
	}
	public String getPacienteDocumento() {
		return pacienteDocumento;
	}
	public void setPacienteDocumento(String pacienteDocumento) {
		this.pacienteDocumento = pacienteDocumento;
	}
	public String getPacienteNombreCompleto() {
		return pacienteNombreCompleto;
	}
	public void setPacienteNombreCompleto(String pacienteNombreCompleto) {
		this.pacienteNombreCompleto = pacienteNombreCompleto;
	}
	public String getCodigoEspecialidad() {
		return codigoEspecialidad;
	}
	public void setCodigoEspecialidad(String codigoEspecialidad) {
		this.codigoEspecialidad = codigoEspecialidad;
	}
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}
	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	public String getDescripcionTurno() {
		return descripcionTurno;
	}
	public void setDescripcionTurno(String descripcionTurno) {
		this.descripcionTurno = descripcionTurno;
	}
	public String getCodigoConsultorio() {
		return codigoConsultorio;
	}
	public void setCodigoConsultorio(String codigoConsultorio) {
		this.codigoConsultorio = codigoConsultorio;
	}
	public String getNombreConsultorio() {
		return nombreConsultorio;
	}
	public void setNombreConsultorio(String nombreConsultorio) {
		this.nombreConsultorio = nombreConsultorio;
	}
	public String getTituloBloque() {
		return tituloBloque;
	}
	public void setTituloBloque(String tituloBloque) {
		this.tituloBloque = tituloBloque;
	}
	public String getEstiloBloque() {
		return estiloBloque;
	}
	public void setEstiloBloque(String estiloBloque) {
		this.estiloBloque = estiloBloque;
	}
	public String getEtiquetaBloque() {
		return etiquetaBloque;
	}
	public void setEtiquetaBloque(String etiquetaBloque) {
		this.etiquetaBloque = etiquetaBloque;
	}
	public boolean isCitaAsignada() {
		return citaAsignada;
	}
	public void setCitaAsignada(boolean citaAsignada) {
		this.citaAsignada = citaAsignada;
	}
	public Integer getIdCita() {
		return idCita;
	}
	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}
	public String getPatterFecha() {
		return patterFecha;
	}
	public void setPatterFecha(String patterFecha) {
		this.patterFecha = patterFecha;
	}
	public String getFechaInicioFormat() {
		return fechaInicioFormat;
	}
	public void setFechaInicioFormat(String fechaInicioFormat) {
		this.fechaInicioFormat = fechaInicioFormat;
	}
	public String getFechaFinFormat() {
		return fechaFinFormat;
	}
	public void setFechaFinFormat(String fechaFinFormat) {
		this.fechaFinFormat = fechaFinFormat;
	}
	public String getPatterHora() {
		return patterHora;
	}
	public void setPatterHora(String patterHora) {
		this.patterHora = patterHora;
	}
	public String getHoraInicioFormat() {
		return horaInicioFormat;
	}
	public void setHoraInicioFormat(String horaInicioFormat) {
		this.horaInicioFormat = horaInicioFormat;
	}
	public String getHoraFinFormat() {
		return horaFinFormat;
	}
	public void setHoraFinFormat(String horaFinFormat) {
		this.horaFinFormat = horaFinFormat;
	}
	public String getDescripcionBloque() {
		return descripcionBloque;
	}
	public void setDescripcionBloque(String descripcionBloque) {
		this.descripcionBloque = descripcionBloque;
	}
	public Integer getPoolConsultorio() {
		return poolConsultorio;
	}
	public void setPoolConsultorio(Integer poolConsultorio) {
		this.poolConsultorio = poolConsultorio;
	}
	public String getServicioItemcodigo() {
		return servicioItemcodigo;
	}
	public void setServicioItemcodigo(String servicioItemcodigo) {
		this.servicioItemcodigo = servicioItemcodigo;
	}
	public String getServicioItemDescripcion() {
		return servicioItemDescripcion;
	}
	public void setServicioItemDescripcion(String servicioItemDescripcion) {
		this.servicioItemDescripcion = servicioItemDescripcion;
	}
	public Integer getObligacionId() {
		return obligacionId;
	}
	public void setObligacionId(Integer obligacionId) {
		this.obligacionId = obligacionId;
	}
	public Integer getObligacionEstado() {
		return obligacionEstado;
	}
	public void setObligacionEstado(Integer obligacionEstado) {
		this.obligacionEstado = obligacionEstado;
	}
	public Integer getFlagPago() {
		return flagPago;
	}
	public void setFlagPago(Integer flagPago) {
		this.flagPago = flagPago;
	}
	
}
