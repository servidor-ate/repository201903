package pe.royalsystems.springerp.model.domain.vista;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import pe.royalsystems.springerp.model.domain.Entidad;


/**
 * The persistent class for the VW_EMPLEADOS database table.
 * 
 */
@Entity
@Table(name="VW_EMPLEADOS")
public class VwEmpleado extends Entidad {
	private static final long serialVersionUID = 1L;

	@Column(name="ApellidoMaterno")
	private String apellidoMaterno;

	@Column(name="ApellidoPaterno")
	private String apellidoPaterno;

	@Column(name="CiudadNacimiento")
	private String ciudadNacimiento;

	@Column(name="Documento")
	private String documento;

	@Id
	@Column(name="Empleado")
	private Integer empleado;

	@Column(name="EsCliente")
	private String esCliente;

	@Column(name="EsEmpleado")
	private String esEmpleado;

	@Column(name="EsEmpresa")
	private String esEmpresa;

	@Column(name="EsOtro")
	private String esOtro;

	@Column(name="EsPaciente")
	private String esPaciente;

	@Column(name="EsProveedor")
	private String esProveedor;

	@Column(name="Estado")
	private String estado;

	@Column(name="FechaNacimiento")
	private Timestamp fechaNacimiento;

	@Column(name="IdEjecutivo")
	private Integer idEjecutivo;

	@Column(name="IdEspecialidad")
	private Integer idEspecialidad;

	@Column(name="IdGrupoAtencion")
	private Integer idGrupoAtencion;

	@Column(name="IdPersonaUnificado")
	private Integer idPersonaUnificado;

	@Column(name="IdServicio")
	private Integer idServicio;

	@Column(name="IdTipoAtencion")
	private Integer idTipoAtencion;

	@Column(name="Nacionalidad")
	private String nacionalidad;

	@Column(name="NombreCompleto")
	private String nombreCompleto;

	@Column(name="Nombres")
	private String nombres;

	@Column(name="Orden_Organigrama")
	private String orden_Organigrama;

	@Column(name="Origen")
	private String origen;

	@Column(name="Pais")
	private String pais;

	@Column(name="Posicion")
	private String posicion;

	@Column(name="Sexo")
	private String sexo;

	@Column(name="TipoDocumento")
	private String tipoDocumento;

	@Column(name="TipoDocumentoIdentidad")
	private String tipoDocumentoIdentidad;

	@Column(name="TipoMedico")
	private Integer tipoMedico;

	@Column(name="TipoPersona")
	private String tipoPersona;

	@Column(name="UnidadTrabajo")
	private String unidadTrabajo;

	public VwEmpleado() {
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getCiudadNacimiento() {
		return this.ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Integer empleado) {
		this.empleado = empleado;
	}

	public String getEsCliente() {
		return this.esCliente;
	}

	public void setEsCliente(String esCliente) {
		this.esCliente = esCliente;
	}

	public String getEsEmpleado() {
		return this.esEmpleado;
	}

	public void setEsEmpleado(String esEmpleado) {
		this.esEmpleado = esEmpleado;
	}

	public String getEsEmpresa() {
		return this.esEmpresa;
	}

	public void setEsEmpresa(String esEmpresa) {
		this.esEmpresa = esEmpresa;
	}

	public String getEsOtro() {
		return this.esOtro;
	}

	public void setEsOtro(String esOtro) {
		this.esOtro = esOtro;
	}

	public String getEsPaciente() {
		return this.esPaciente;
	}

	public void setEsPaciente(String esPaciente) {
		this.esPaciente = esPaciente;
	}

	public String getEsProveedor() {
		return this.esProveedor;
	}

	public void setEsProveedor(String esProveedor) {
		this.esProveedor = esProveedor;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getIdEjecutivo() {
		return this.idEjecutivo;
	}

	public void setIdEjecutivo(Integer idEjecutivo) {
		this.idEjecutivo = idEjecutivo;
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

	public Integer getIdPersonaUnificado() {
		return this.idPersonaUnificado;
	}

	public void setIdPersonaUnificado(Integer idPersonaUnificado) {
		this.idPersonaUnificado = idPersonaUnificado;
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

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getOrden_Organigrama() {
		return this.orden_Organigrama;
	}

	public void setOrden_Organigrama(String orden_Organigrama) {
		this.orden_Organigrama = orden_Organigrama;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumentoIdentidad() {
		return this.tipoDocumentoIdentidad;
	}

	public void setTipoDocumentoIdentidad(String tipoDocumentoIdentidad) {
		this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
	}

	public Integer getTipoMedico() {
		return this.tipoMedico;
	}

	public void setTipoMedico(Integer tipoMedico) {
		this.tipoMedico = tipoMedico;
	}

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getUnidadTrabajo() {
		return this.unidadTrabajo;
	}

	public void setUnidadTrabajo(String unidadTrabajo) {
		this.unidadTrabajo = unidadTrabajo;
	}

}