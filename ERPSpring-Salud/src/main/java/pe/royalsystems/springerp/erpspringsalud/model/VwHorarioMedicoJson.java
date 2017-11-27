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
public class VwHorarioMedicoJson extends EntidadJson {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1315432599421305222L;
	
	
	private Integer estado;	
	private Date fechaCreacion;	
	private Date fechaFin;	
	private Date fechaFinHorario;
	private Date fechaInicio;
	private Date fechaInicioHorario;	
	private Date fechaModificacion;	
	private Date horaFin;	
	private Date horaInicio;	
	private Integer idConsultorio;	
	private Integer idEspecialidad;	
	private Integer idGrupoAtencionCompartido;
	private Integer idHorario;
	private Integer idInasistencia;	
	private Integer idServicio;	
	private Integer idTurno;	
	private Integer indicadorCitaMultiple;
	private Integer indicadorCompartido;
	private Integer indicadorDomingo;
	private Integer indicadorJueves;
	private Integer indicadorLunes;
	private Integer indicadorMartes;	
	private Integer indicadorMiercoles;	
	private Integer indicadorSabado;
	private Integer indicadorViernes;
	private Integer medico;
	private Integer periodo;
	private Double tiempoPromedioAtencion;
	private Integer tipoGeneracionCita;
	private Integer tipoRegistroHorario;
	private Integer tipoUso;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Integer yearFechaInicioHorario;
	private Integer monthFechaInicioHorario;
	private Integer dayFechaInicioHorario;
	private Integer yearFechaFinHorario;
	private Integer monthFechaFinHorario;	
	private Integer dayFechaFinHorario;		
	private Integer yearFechaInicio;		
	private Integer monthFechaInicio;		
	private Integer dayFechaInicio;		
	private Integer yearFechaFin;
	
	private Integer monthFechaFin;
	
	private Integer dayFechaFin;
	
	
	private String apellidoMaterno;

	
	private String apellidoPaterno;
	

	private String nombres;
	

	private String nombreCompleto;
	

	private String documento;
	
	private String codigoEspecialidad;	
	private String nombreEspecialidad;

	private String descripcionEspecialidad;

	private String tipoTurno;
	
	private String descripcionTurno;

	private String codigoConsultorio;

	private String nombreConsultorio;

	private String descripcionConsultorio;

	private Integer idUbicacion;

	private Integer poolConsultorio;

	private Integer estadoConsultorio;
	
	// NUEVOS ATRIBUTO
	private Integer idGrupoAtencion;

	private Integer idTipoAtencion;

	private String codigoGrupoAtencion;

	private String nombreGrupoAtencion;

	private String descripcionGrupoAtencion;

	private Integer estadoGrupoAtencion;

	private Integer indicadorEspecialidadGrupoAtencion;

	private String almacenCodigoGrupoAtencion;

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaFinHorario() {
		return fechaFinHorario;
	}

	public void setFechaFinHorario(Date fechaFinHorario) {
		this.fechaFinHorario = fechaFinHorario;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaInicioHorario() {
		return fechaInicioHorario;
	}

	public void setFechaInicioHorario(Date fechaInicioHorario) {
		this.fechaInicioHorario = fechaInicioHorario;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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

	public Integer getIndicadorCitaMultiple() {
		return indicadorCitaMultiple;
	}

	public void setIndicadorCitaMultiple(Integer indicadorCitaMultiple) {
		this.indicadorCitaMultiple = indicadorCitaMultiple;
	}

	public Integer getIndicadorCompartido() {
		return indicadorCompartido;
	}

	public void setIndicadorCompartido(Integer indicadorCompartido) {
		this.indicadorCompartido = indicadorCompartido;
	}

	public Integer getIndicadorDomingo() {
		return indicadorDomingo;
	}

	public void setIndicadorDomingo(Integer indicadorDomingo) {
		this.indicadorDomingo = indicadorDomingo;
	}

	public Integer getIndicadorJueves() {
		return indicadorJueves;
	}

	public void setIndicadorJueves(Integer indicadorJueves) {
		this.indicadorJueves = indicadorJueves;
	}

	public Integer getIndicadorLunes() {
		return indicadorLunes;
	}

	public void setIndicadorLunes(Integer indicadorLunes) {
		this.indicadorLunes = indicadorLunes;
	}

	public Integer getIndicadorMartes() {
		return indicadorMartes;
	}

	public void setIndicadorMartes(Integer indicadorMartes) {
		this.indicadorMartes = indicadorMartes;
	}

	public Integer getIndicadorMiercoles() {
		return indicadorMiercoles;
	}

	public void setIndicadorMiercoles(Integer indicadorMiercoles) {
		this.indicadorMiercoles = indicadorMiercoles;
	}

	public Integer getIndicadorSabado() {
		return indicadorSabado;
	}

	public void setIndicadorSabado(Integer indicadorSabado) {
		this.indicadorSabado = indicadorSabado;
	}

	public Integer getIndicadorViernes() {
		return indicadorViernes;
	}

	public void setIndicadorViernes(Integer indicadorViernes) {
		this.indicadorViernes = indicadorViernes;
	}

	public Integer getMedico() {
		return medico;
	}

	public void setMedico(Integer medico) {
		this.medico = medico;
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

	public Integer getTipoGeneracionCita() {
		return tipoGeneracionCita;
	}

	public void setTipoGeneracionCita(Integer tipoGeneracionCita) {
		this.tipoGeneracionCita = tipoGeneracionCita;
	}

	public Integer getTipoRegistroHorario() {
		return tipoRegistroHorario;
	}

	public void setTipoRegistroHorario(Integer tipoRegistroHorario) {
		this.tipoRegistroHorario = tipoRegistroHorario;
	}

	public Integer getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(Integer tipoUso) {
		this.tipoUso = tipoUso;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Integer getYearFechaInicioHorario() {
		return yearFechaInicioHorario;
	}

	public void setYearFechaInicioHorario(Integer yearFechaInicioHorario) {
		this.yearFechaInicioHorario = yearFechaInicioHorario;
	}

	public Integer getMonthFechaInicioHorario() {
		return monthFechaInicioHorario;
	}

	public void setMonthFechaInicioHorario(Integer monthFechaInicioHorario) {
		this.monthFechaInicioHorario = monthFechaInicioHorario;
	}

	public Integer getDayFechaInicioHorario() {
		return dayFechaInicioHorario;
	}

	public void setDayFechaInicioHorario(Integer dayFechaInicioHorario) {
		this.dayFechaInicioHorario = dayFechaInicioHorario;
	}

	public Integer getYearFechaFinHorario() {
		return yearFechaFinHorario;
	}

	public void setYearFechaFinHorario(Integer yearFechaFinHorario) {
		this.yearFechaFinHorario = yearFechaFinHorario;
	}

	public Integer getMonthFechaFinHorario() {
		return monthFechaFinHorario;
	}

	public void setMonthFechaFinHorario(Integer monthFechaFinHorario) {
		this.monthFechaFinHorario = monthFechaFinHorario;
	}

	public Integer getDayFechaFinHorario() {
		return dayFechaFinHorario;
	}

	public void setDayFechaFinHorario(Integer dayFechaFinHorario) {
		this.dayFechaFinHorario = dayFechaFinHorario;
	}

	public Integer getYearFechaInicio() {
		return yearFechaInicio;
	}

	public void setYearFechaInicio(Integer yearFechaInicio) {
		this.yearFechaInicio = yearFechaInicio;
	}

	public Integer getMonthFechaInicio() {
		return monthFechaInicio;
	}

	public void setMonthFechaInicio(Integer monthFechaInicio) {
		this.monthFechaInicio = monthFechaInicio;
	}

	public Integer getDayFechaInicio() {
		return dayFechaInicio;
	}

	public void setDayFechaInicio(Integer dayFechaInicio) {
		this.dayFechaInicio = dayFechaInicio;
	}

	public Integer getYearFechaFin() {
		return yearFechaFin;
	}

	public void setYearFechaFin(Integer yearFechaFin) {
		this.yearFechaFin = yearFechaFin;
	}

	public Integer getMonthFechaFin() {
		return monthFechaFin;
	}

	public void setMonthFechaFin(Integer monthFechaFin) {
		this.monthFechaFin = monthFechaFin;
	}

	public Integer getDayFechaFin() {
		return dayFechaFin;
	}

	public void setDayFechaFin(Integer dayFechaFin) {
		this.dayFechaFin = dayFechaFin;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	public String getDescripcionEspecialidad() {
		return descripcionEspecialidad;
	}

	public void setDescripcionEspecialidad(String descripcionEspecialidad) {
		this.descripcionEspecialidad = descripcionEspecialidad;
	}

	public String getTipoTurno() {
		return tipoTurno;
	}

	public void setTipoTurno(String tipoTurno) {
		this.tipoTurno = tipoTurno;
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

	public String getDescripcionConsultorio() {
		return descripcionConsultorio;
	}

	public void setDescripcionConsultorio(String descripcionConsultorio) {
		this.descripcionConsultorio = descripcionConsultorio;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Integer getPoolConsultorio() {
		return poolConsultorio;
	}

	public void setPoolConsultorio(Integer poolConsultorio) {
		this.poolConsultorio = poolConsultorio;
	}

	public Integer getEstadoConsultorio() {
		return estadoConsultorio;
	}

	public void setEstadoConsultorio(Integer estadoConsultorio) {
		this.estadoConsultorio = estadoConsultorio;
	}

	public Integer getIdGrupoAtencion() {
		return idGrupoAtencion;
	}

	public void setIdGrupoAtencion(Integer idGrupoAtencion) {
		this.idGrupoAtencion = idGrupoAtencion;
	}

	public Integer getIdTipoAtencion() {
		return idTipoAtencion;
	}

	public void setIdTipoAtencion(Integer idTipoAtencion) {
		this.idTipoAtencion = idTipoAtencion;
	}

	public String getCodigoGrupoAtencion() {
		return codigoGrupoAtencion;
	}

	public void setCodigoGrupoAtencion(String codigoGrupoAtencion) {
		this.codigoGrupoAtencion = codigoGrupoAtencion;
	}

	public String getNombreGrupoAtencion() {
		return nombreGrupoAtencion;
	}

	public void setNombreGrupoAtencion(String nombreGrupoAtencion) {
		this.nombreGrupoAtencion = nombreGrupoAtencion;
	}

	public String getDescripcionGrupoAtencion() {
		return descripcionGrupoAtencion;
	}

	public void setDescripcionGrupoAtencion(String descripcionGrupoAtencion) {
		this.descripcionGrupoAtencion = descripcionGrupoAtencion;
	}

	public Integer getEstadoGrupoAtencion() {
		return estadoGrupoAtencion;
	}

	public void setEstadoGrupoAtencion(Integer estadoGrupoAtencion) {
		this.estadoGrupoAtencion = estadoGrupoAtencion;
	}

	public Integer getIndicadorEspecialidadGrupoAtencion() {
		return indicadorEspecialidadGrupoAtencion;
	}

	public void setIndicadorEspecialidadGrupoAtencion(Integer indicadorEspecialidadGrupoAtencion) {
		this.indicadorEspecialidadGrupoAtencion = indicadorEspecialidadGrupoAtencion;
	}

	public String getAlmacenCodigoGrupoAtencion() {
		return almacenCodigoGrupoAtencion;
	}

	public void setAlmacenCodigoGrupoAtencion(String almacenCodigoGrupoAtencion) {
		this.almacenCodigoGrupoAtencion = almacenCodigoGrupoAtencion;
	}

	
}
