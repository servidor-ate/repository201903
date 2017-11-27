package pe.royalsystems.springerp.model.domain.vista;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.model.domain.Entidad;


/**
 * The persistent class for the VW_HORARIO_MEDICO database table.
 * 
 */
@Entity
@Table(name="VW_HORARIO_MEDICO")
public class VwHorarioMedico extends Entidad{
	private static final long serialVersionUID = 1L;

	@Column(name="Estado")
	private Integer estado;

	@Column(name="FechaCreacion")
	private Date fechaCreacion;

	@Column(name="FechaFin")
	private Date fechaFin;

	@Column(name="FechaFinHorario")
	private Date fechaFinHorario;

	@Column(name="FechaInicio")
	private Date fechaInicio;

	@Column(name="FechaInicioHorario")
	private Date fechaInicioHorario;

	@Column(name="FechaModificacion")
	private Date fechaModificacion;

	@Column(name="HoraFin")
	private Date horaFin;

	@Column(name="HoraInicio")
	private Date horaInicio;

	@Column(name="IdConsultorio")
	private Integer idConsultorio;

	@Column(name="IdEspecialidad")
	private Integer idEspecialidad;

	@Column(name="IdGrupoAtencionCompartido")
	private Integer idGrupoAtencionCompartido;

	@Id
	@Column(name="IdHorario")
	private Integer idHorario;

	@Column(name="IdInasistencia")
	private Integer idInasistencia;

	@Column(name="IdServicio")
	private Integer idServicio;

	@Column(name="IdTurno")
	private Integer idTurno;

	@Column(name="IndicadorCitaMultiple")
	private Integer indicadorCitaMultiple;

	@Column(name="IndicadorCompartido")
	private Integer indicadorCompartido;

	@Column(name="IndicadorDomingo")
	private Integer indicadorDomingo;

	@Column(name="IndicadorJueves")
	private Integer indicadorJueves;

	@Column(name="IndicadorLunes")
	private Integer indicadorLunes;

	@Column(name="IndicadorMartes")
	private Integer indicadorMartes;

	@Column(name="IndicadorMiercoles")
	private Integer indicadorMiercoles;

	@Column(name="IndicadorSabado")
	private Integer indicadorSabado;

	@Column(name="IndicadorViernes")
	private Integer indicadorViernes;

	@Column(name="Medico")
	private Integer medico;

	@Column(name="Periodo")
	private Integer periodo;

	@Column(name="TiempoPromedioAtencion")
	private Double tiempoPromedioAtencion;

	@Column(name="TipoGeneracionCita")
	private Integer tipoGeneracionCita;

	@Column(name="TipoRegistroHorario")
	private Integer tipoRegistroHorario;

	@Column(name="TipoUso")
	private Integer tipoUso;

	@Column(name="UsuarioCreacion")
	private String usuarioCreacion;

	@Column(name="UsuarioModificacion")
	private String usuarioModificacion;
	
	@Column(name="yearFechaInicioHorario")
	private Integer yearFechaInicioHorario;
	
	@Column(name="monthFechaInicioHorario")
	private Integer monthFechaInicioHorario;
	
	@Column(name="dayFechaInicioHorario")
	private Integer dayFechaInicioHorario;
	
	@Column(name="yearFechaFinHorario")
	private Integer yearFechaFinHorario;
	
	@Column(name="monthFechaFinHorario")
	private Integer monthFechaFinHorario;
	
	@Column(name="dayFechaFinHorario")
	private Integer dayFechaFinHorario;
	
	@Column(name="yearFechaInicio")
	private Integer yearFechaInicio;
	
	@Column(name="monthFechaInicio")
	private Integer monthFechaInicio;
	
	@Column(name="dayFechaInicio")
	private Integer dayFechaInicio;
	
	@Column(name="yearFechaFin")
	private Integer yearFechaFin;
	
	@Column(name="monthFechaFin")
	private Integer monthFechaFin;
	
	@Column(name="dayFechaFin")
	private Integer dayFechaFin;
	
	@Column(name="ApellidoMaterno")
	private String apellidoMaterno;

	@Column(name="ApellidoPaterno")
	private String apellidoPaterno;
	
	@Column(name="Nombres")
	private String nombres;
	
	@Column(name="NombreCompleto")
	private String nombreCompleto;
	
	@Column(name="Documento")
	private String documento;
	
	@Column(name="codigoEspecialidad")
	private String codigoEspecialidad;
	
	@Column(name="nombreEspecialidad")
	private String nombreEspecialidad;
	
	@Column(name="descripcionEspecialidad")
	private String descripcionEspecialidad;
	
	@Column(name="TipoTurno")
	private String tipoTurno;
	
	@Column(name="descripcionTurno")
	private String descripcionTurno;
	
	@Column(name="codigoConsultorio")
	private String codigoConsultorio;
	
	@Column(name="nombreConsultorio")
	private String nombreConsultorio;
	
	@Column(name="descripcionConsultorio")
	private String descripcionConsultorio;
	
	@Column(name="idUbicacion")
	private Integer idUbicacion;
	
	@Column(name="poolConsultorio")
	private Integer poolConsultorio;
	
	@Column(name="estadoConsultorio")
	private Integer estadoConsultorio;
	
	// NUEVOS ATRIBUTOS
	@Column(name="IdGrupoAtencion")
	private Integer idGrupoAtencion;
	
	@Column(name="IdTipoAtencion")
	private Integer idTipoAtencion;
	
	@Column(name="codigoGrupoAtencion")
	private String codigoGrupoAtencion;
	
	@Column(name="nombreGrupoAtencion")
	private String nombreGrupoAtencion;
	
	@Column(name="descripcionGrupoAtencion")
	private String descripcionGrupoAtencion;
	
	@Column(name="estadoGrupoAtencion")
	private Integer estadoGrupoAtencion;
	
	@Column(name="indicadorEspecialidadGrupoAtencion")
	private Integer indicadorEspecialidadGrupoAtencion;
	
	@Column(name="almacenCodigoGrupoAtencion")
	private String almacenCodigoGrupoAtencion;

	public VwHorarioMedico() {
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaFinHorario() {
		return this.fechaFinHorario;
	}

	public void setFechaFinHorario(Date fechaFinHorario) {
		this.fechaFinHorario = fechaFinHorario;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaInicioHorario() {
		return this.fechaInicioHorario;
	}

	public void setFechaInicioHorario(Date fechaInicioHorario) {
		this.fechaInicioHorario = fechaInicioHorario;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
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

	public Integer getIdGrupoAtencionCompartido() {
		return this.idGrupoAtencionCompartido;
	}

	public void setIdGrupoAtencionCompartido(Integer idGrupoAtencionCompartido) {
		this.idGrupoAtencionCompartido = idGrupoAtencionCompartido;
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

	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public Integer getIdTurno() {
		return this.idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public Integer getIndicadorCitaMultiple() {
		return this.indicadorCitaMultiple;
	}

	public void setIndicadorCitaMultiple(Integer indicadorCitaMultiple) {
		this.indicadorCitaMultiple = indicadorCitaMultiple;
	}

	public Integer getIndicadorCompartido() {
		return this.indicadorCompartido;
	}

	public void setIndicadorCompartido(Integer indicadorCompartido) {
		this.indicadorCompartido = indicadorCompartido;
	}

	public Integer getIndicadorDomingo() {
		return this.indicadorDomingo;
	}

	public void setIndicadorDomingo(Integer indicadorDomingo) {
		this.indicadorDomingo = indicadorDomingo;
	}

	public Integer getIndicadorJueves() {
		return this.indicadorJueves;
	}

	public void setIndicadorJueves(Integer indicadorJueves) {
		this.indicadorJueves = indicadorJueves;
	}

	public Integer getIndicadorLunes() {
		return this.indicadorLunes;
	}

	public void setIndicadorLunes(Integer indicadorLunes) {
		this.indicadorLunes = indicadorLunes;
	}

	public Integer getIndicadorMartes() {
		return this.indicadorMartes;
	}

	public void setIndicadorMartes(Integer indicadorMartes) {
		this.indicadorMartes = indicadorMartes;
	}

	public Integer getIndicadorMiercoles() {
		return this.indicadorMiercoles;
	}

	public void setIndicadorMiercoles(Integer indicadorMiercoles) {
		this.indicadorMiercoles = indicadorMiercoles;
	}

	public Integer getIndicadorSabado() {
		return this.indicadorSabado;
	}

	public void setIndicadorSabado(Integer indicadorSabado) {
		this.indicadorSabado = indicadorSabado;
	}

	public Integer getIndicadorViernes() {
		return this.indicadorViernes;
	}

	public void setIndicadorViernes(Integer indicadorViernes) {
		this.indicadorViernes = indicadorViernes;
	}

	public Integer getMedico() {
		return this.medico;
	}

	public void setMedico(Integer medico) {
		this.medico = medico;
	}

	public Integer getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Double getTiempoPromedioAtencion() {
		return this.tiempoPromedioAtencion;
	}

	public void setTiempoPromedioAtencion(Double tiempoPromedioAtencion) {
		this.tiempoPromedioAtencion = tiempoPromedioAtencion;
	}

	public Integer getTipoGeneracionCita() {
		return this.tipoGeneracionCita;
	}

	public void setTipoGeneracionCita(Integer tipoGeneracionCita) {
		this.tipoGeneracionCita = tipoGeneracionCita;
	}

	public Integer getTipoRegistroHorario() {
		return this.tipoRegistroHorario;
	}

	public void setTipoRegistroHorario(Integer tipoRegistroHorario) {
		this.tipoRegistroHorario = tipoRegistroHorario;
	}

	public Integer getTipoUso() {
		return this.tipoUso;
	}

	public void setTipoUso(Integer tipoUso) {
		this.tipoUso = tipoUso;
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






	/** ATRIBUTOS TRANSIENT **/
	
	
	@Transient
	private List<Integer> listTipoRegistroHorario;
	
	@Transient
	private Integer yearParaBuscar;
	
	@Transient
	private Integer monthParaBuscar;
	
	@Transient
	private Integer dayParaBuscar;
	
	@Transient
	private String tituloEvento;
	
	@Transient
	private String toolTipFecha;
	
	@Transient
	private String toolTipTurno;
	
	@Transient
	private String toolTipHorario;
	
	@Transient
	private String toolTipPool;
	
	@Transient
	private String descripcionEvento;
	
	@Transient
	private boolean citaAsignada = false;
	
	@Transient
	private Integer idCita;
	
	@Transient
	private String toolTipHoraCita;
	
	@Transient
	private String nombrePaciente;
	
	
	@Transient
	public List<Integer> getListTipoRegistroHorario() {
		return listTipoRegistroHorario;
	}
	
	public void setListTipoRegistroHorario(List<Integer> listTipoRegistroHorario) {
		this.listTipoRegistroHorario = listTipoRegistroHorario;
	}
	
	@Transient
	public Integer getYearParaBuscar() {
		return yearParaBuscar;
	}
	
	public void setYearParaBuscar(Integer yearParaBuscar) {
		this.yearParaBuscar = yearParaBuscar;
	}
	
	@Transient
	public Integer getMonthParaBuscar() {
		return monthParaBuscar;
	}
	
	public void setMonthParaBuscar(Integer monthParaBuscar) {
		this.monthParaBuscar = monthParaBuscar;
	}
	
	@Transient
	public Integer getDayParaBuscar() {
		return dayParaBuscar;
	}
	
	public void setDayParaBuscar(Integer dayParaBuscar) {
		this.dayParaBuscar = dayParaBuscar;
	}
	
	@Transient
	public String getTituloEvento() {
		return tituloEvento;
	}
	
	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}
	
	@Transient
	public String getDescripcionEvento() {
		return descripcionEvento;
	}
	
	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public String getToolTipFecha() {
		return toolTipFecha;
	}

	public void setToolTipFecha(String toolTipFecha) {
		this.toolTipFecha = toolTipFecha;
	}

	public String getToolTipTurno() {
		return toolTipTurno;
	}

	public void setToolTipTurno(String toolTipTurno) {
		this.toolTipTurno = toolTipTurno;
	}

	public String getToolTipHorario() {
		return toolTipHorario;
	}

	public void setToolTipHorario(String toolTipHorario) {
		this.toolTipHorario = toolTipHorario;
	}

	public String getToolTipPool() {
		return toolTipPool;
	}

	public void setToolTipPool(String toolTipPool) {
		this.toolTipPool = toolTipPool;
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
	
	public String getToolTipHoraCita() {
		return toolTipHoraCita;
	}
	
	public void setToolTipHoraCita(String toolTipHoraCita) {
		this.toolTipHoraCita = toolTipHoraCita;
	}
	
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	

	@Override
	public String toString() {
		String result = "VwHorarioMedico: "+idHorario+" "+TimeCommons.imprimirSoloFecha(fechaInicio)+" - "+TimeCommons.imprimirSoloFecha(fechaFin)+" | ";
		result = result + TimeCommons.imprimirSoloHora(horaInicio)+" - "+TimeCommons.imprimirSoloHora(horaFin)+" | ";
		return result;
	}
	
	
	
}