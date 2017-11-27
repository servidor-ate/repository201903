package pe.royalsystems.springerp.model.domain.vista;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import pe.royalsystems.springerp.model.domain.Entidad;


/**
 * The persistent class for the VW_ATENCIONPACIENTE_TSALUD database table.
 * 
 */
@Entity
@Table(name="VW_ATENCIONPACIENTE_TSALUD")

public class VwAtencionpacienteTsalud extends Entidad {
	private static final Long serialVersionUID = 1L;
	private String accion;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private Date citaFecha;
	private Date citaHora;
	private String codigoHC;
	private String codigoHCAnterior;
	private String codigoOA;
	private String codigoPostal;
	private Integer contador;
	private String correoElectronico;
	private String departamento;
	private String direccion;
	private String documento;
	private Long episodioAtencion;
	private Integer episodioClinico;
	private String esEmpresa;
	private String esPaciente;
	private String estadoCivil;
	private Integer estadoEpiAtencion;
	private Integer estadoEpiClinico;
	private String estadoPersona;
	private Date fechaAtencion;
	private Date fechaCierreEpiClinico;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private Date fechaNacimiento;
	private Date fechaOrden;
	private Date fechaRegistro;
	private Long idEpisodioAtencion;
	private Integer idEspecialidad;
	private Integer idEstablecimientoSalud;
	private Integer idHospitalizacion;
	private Integer idOrdenAtencion;
	private Integer idPaciente;
	private Integer idPersonalSalud;
	private Integer idProcedimiento;
	private Integer idUnidadServicio;
	private Integer indicadorCirugia;
	private Integer indicadorExamenPrincipal;
	private Integer lineaHospitalizacion;
	private Integer lineaOrdenAtencion;
	private String lugarNacimiento;
	private String nivelInstruccion;
	private String nombreEspecialidad;
	private Long numeroFila;
	private String origen;
	private String pacienteNombre;
	private String pais;
	private String personaAnt;
	private String provincia;
	private String sexo;
	private String telefono;
	private Integer tipoAtencion;
	private String tipoDocumento;
	private String tipoListado;
	private Integer tipoOrdenAtencion;
	private Integer tipoPaciente;
	private String tipoPacienteNombre;
	private String unidadReplicacion;
	private String unidadReplicacionEC;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private String version;
	
	private Integer idCita;
	private Integer idHorario;
	private BigDecimal duracionPromedio;
	private Integer tipoCita;
	
	
	
	public VwAtencionpacienteTsalud() {
	}


	@Column(name="Accion")
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}


	@Column(name="ApellidoMaterno")
	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	@Column(name="ApellidoPaterno")
	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	@Column(name="CitaFecha")
	public Date getCitaFecha() {
		return this.citaFecha;
	}

	public void setCitaFecha(Date citaFecha) {
		this.citaFecha = citaFecha;
	}


	@Column(name="CitaHora")
	public Date getCitaHora() {
		return this.citaHora;
	}

	public void setCitaHora(Date citaHora) {
		this.citaHora = citaHora;
	}


	@Column(name="CodigoHC")
	public String getCodigoHC() {
		return this.codigoHC;
	}

	public void setCodigoHC(String codigoHC) {
		this.codigoHC = codigoHC;
	}


	@Column(name="CodigoHCAnterior")
	public String getCodigoHCAnterior() {
		return this.codigoHCAnterior;
	}

	public void setCodigoHCAnterior(String codigoHCAnterior) {
		this.codigoHCAnterior = codigoHCAnterior;
	}


	@Column(name="CodigoOA")
	public String getCodigoOA() {
		return this.codigoOA;
	}

	public void setCodigoOA(String codigoOA) {
		this.codigoOA = codigoOA;
	}


	@Column(name="CodigoPostal")
	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	@Column(name="Contador")
	public Integer getContador() {
		return this.contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}


	@Column(name="CorreoElectronico")
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	@Column(name="Departamento")
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Column(name="Direccion")
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Column(name="Documento")
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}


	@Column(name="EpisodioAtencion")
	public Long getEpisodioAtencion() {
		return this.episodioAtencion;
	}

	public void setEpisodioAtencion(Long episodioAtencion) {
		this.episodioAtencion = episodioAtencion;
	}


	@Column(name="EpisodioClinico")
	public Integer getEpisodioClinico() {
		return this.episodioClinico;
	}

	public void setEpisodioClinico(Integer episodioClinico) {
		this.episodioClinico = episodioClinico;
	}


	@Column(name="EsEmpresa")
	public String getEsEmpresa() {
		return this.esEmpresa;
	}

	public void setEsEmpresa(String esEmpresa) {
		this.esEmpresa = esEmpresa;
	}


	@Column(name="EsPaciente")
	public String getEsPaciente() {
		return this.esPaciente;
	}

	public void setEsPaciente(String esPaciente) {
		this.esPaciente = esPaciente;
	}


	@Column(name="EstadoCivil")
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	@Column(name="EstadoEpiAtencion")
	public Integer getEstadoEpiAtencion() {
		return this.estadoEpiAtencion;
	}

	public void setEstadoEpiAtencion(Integer estadoEpiAtencion) {
		this.estadoEpiAtencion = estadoEpiAtencion;
	}


	@Column(name="EstadoEpiClinico")
	public Integer getEstadoEpiClinico() {
		return this.estadoEpiClinico;
	}

	public void setEstadoEpiClinico(Integer estadoEpiClinico) {
		this.estadoEpiClinico = estadoEpiClinico;
	}


	@Column(name="EstadoPersona")
	public String getEstadoPersona() {
		return this.estadoPersona;
	}

	public void setEstadoPersona(String estadoPersona) {
		this.estadoPersona = estadoPersona;
	}


	@Column(name="FechaAtencion")
	public Date getFechaAtencion() {
		return this.fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}


	@Column(name="FechaCierreEpiClinico")
	public Date getFechaCierreEpiClinico() {
		return this.fechaCierreEpiClinico;
	}

	public void setFechaCierreEpiClinico(Date fechaCierreEpiClinico) {
		this.fechaCierreEpiClinico = fechaCierreEpiClinico;
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


	@Column(name="FechaNacimiento")
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Column(name="FechaOrden")
	public Date getFechaOrden() {
		return this.fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}


	@Column(name="FechaRegistro")
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	@Column(name="IdEpisodioAtencion")
	public Long getIdEpisodioAtencion() {
		return this.idEpisodioAtencion;
	}

	public void setIdEpisodioAtencion(Long idEpisodioAtencion) {
		this.idEpisodioAtencion = idEpisodioAtencion;
	}


	@Column(name="IdEspecialidad")
	public Integer getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}


	@Column(name="IdEstablecimientoSalud")
	public Integer getIdEstablecimientoSalud() {
		return this.idEstablecimientoSalud;
	}

	public void setIdEstablecimientoSalud(Integer idEstablecimientoSalud) {
		this.idEstablecimientoSalud = idEstablecimientoSalud;
	}


	@Column(name="IdHospitalizacion")
	public Integer getIdHospitalizacion() {
		return this.idHospitalizacion;
	}

	public void setIdHospitalizacion(Integer idHospitalizacion) {
		this.idHospitalizacion = idHospitalizacion;
	}


	@Column(name="IdOrdenAtencion")
	public Integer getIdOrdenAtencion() {
		return this.idOrdenAtencion;
	}

	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}


	@Column(name="IdPaciente")
	public Integer getIdPaciente() {
		return this.idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}


	@Column(name="IdPersonalSalud")
	public Integer getIdPersonalSalud() {
		return this.idPersonalSalud;
	}

	public void setIdPersonalSalud(Integer idPersonalSalud) {
		this.idPersonalSalud = idPersonalSalud;
	}


	@Column(name="IdProcedimiento")
	public Integer getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(Integer idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}


	@Column(name="IdUnidadServicio")
	public Integer getIdUnidadServicio() {
		return this.idUnidadServicio;
	}

	public void setIdUnidadServicio(Integer idUnidadServicio) {
		this.idUnidadServicio = idUnidadServicio;
	}


	@Column(name="IndicadorCirugia")
	public Integer getIndicadorCirugia() {
		return this.indicadorCirugia;
	}

	public void setIndicadorCirugia(Integer indicadorCirugia) {
		this.indicadorCirugia = indicadorCirugia;
	}


	@Column(name="IndicadorExamenPrincipal")
	public Integer getIndicadorExamenPrincipal() {
		return this.indicadorExamenPrincipal;
	}

	public void setIndicadorExamenPrincipal(Integer indicadorExamenPrincipal) {
		this.indicadorExamenPrincipal = indicadorExamenPrincipal;
	}


	@Column(name="LineaHospitalizacion")
	public Integer getLineaHospitalizacion() {
		return this.lineaHospitalizacion;
	}

	public void setLineaHospitalizacion(Integer lineaHospitalizacion) {
		this.lineaHospitalizacion = lineaHospitalizacion;
	}


	@Column(name="LineaOrdenAtencion")
	public Integer getLineaOrdenAtencion() {
		return this.lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}


	@Column(name="LugarNacimiento")
	public String getLugarNacimiento() {
		return this.lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}


	@Column(name="NivelInstruccion")
	public String getNivelInstruccion() {
		return this.nivelInstruccion;
	}

	public void setNivelInstruccion(String nivelInstruccion) {
		this.nivelInstruccion = nivelInstruccion;
	}


	@Column(name="NombreEspecialidad")
	public String getNombreEspecialidad() {
		return this.nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}


	@Id
	@Column(name="NumeroFila")
	public Long getNumeroFila() {
		return this.numeroFila;
	}

	public void setNumeroFila(Long numeroFila) {
		this.numeroFila = numeroFila;
	}


	@Column(name="Origen")
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}


	@Column(name="PacienteNombre")
	public String getPacienteNombre() {
		return this.pacienteNombre;
	}

	public void setPacienteNombre(String pacienteNombre) {
		this.pacienteNombre = pacienteNombre;
	}


	@Column(name="Pais")
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


	@Column(name="PersonaAnt")
	public String getPersonaAnt() {
		return this.personaAnt;
	}

	public void setPersonaAnt(String personaAnt) {
		this.personaAnt = personaAnt;
	}


	@Column(name="Provincia")
	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	@Column(name="Sexo")
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Column(name="Telefono")
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Column(name="TipoAtencion")
	public Integer getTipoAtencion() {
		return this.tipoAtencion;
	}

	public void setTipoAtencion(Integer tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}


	@Column(name="TipoDocumento")
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getTipoListado() {
		return this.tipoListado;
	}

	public void setTipoListado(String tipoListado) {
		this.tipoListado = tipoListado;
	}


	@Column(name="TipoOrdenAtencion")
	public Integer getTipoOrdenAtencion() {
		return this.tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
	}


	@Column(name="TipoPaciente")
	public Integer getTipoPaciente() {
		return this.tipoPaciente;
	}

	public void setTipoPaciente(Integer tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}


	@Column(name="TipoPacienteNombre")
	public String getTipoPacienteNombre() {
		return this.tipoPacienteNombre;
	}

	public void setTipoPacienteNombre(String tipoPacienteNombre) {
		this.tipoPacienteNombre = tipoPacienteNombre;
	}


	@Column(name="UnidadReplicacion")
	public String getUnidadReplicacion() {
		return this.unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}


	@Column(name="UnidadReplicacionEC")
	public String getUnidadReplicacionEC() {
		return this.unidadReplicacionEC;
	}

	public void setUnidadReplicacionEC(String unidadReplicacionEC) {
		this.unidadReplicacionEC = unidadReplicacionEC;
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


	@Column(name="Version")
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	
	@Column(name="IdCita")
	public Integer getIdCita() {
		return idCita;
	}


	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}


	@Column(name="IdHorario")
	public Integer getIdHorario() {
		return idHorario;
	}


	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	
	@Column(name="DuracionPromedio")
	public BigDecimal getDuracionPromedio() {
		return duracionPromedio;
	}


	public void setDuracionPromedio(BigDecimal duracionPromedio) {
		this.duracionPromedio = duracionPromedio;
	}
	
	@Column(name="TipoCita")
	public Integer getTipoCita() {
		return tipoCita;
	}


	public void setTipoCita(Integer tipoCita) {
		this.tipoCita = tipoCita;
	}

	
	
}