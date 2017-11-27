package pe.royalsystems.springerp.model.domain.vista;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import pe.royalsystems.springerp.model.domain.Entidad;


/**
 * The persistent class for the VW_ESPECIALIDAD_MEDICO database table.
 * 
 */
@Entity
@Table(name="VW_ESPECIALIDAD_MEDICO")
public class VwEspecialidadMedico extends Entidad {
	private static final long serialVersionUID = 1L;

	@Column(name="ApellidoMaterno")
	private String apellidoMaterno;

	@Column(name="ApellidoPaterno")
	private String apellidoPaterno;

	@Column(name="Codigo")
	private String codigo;

	@Column(name="Descripcion")
	private String descripcion;

	@Column(name="Direccion")
	private String direccion;

	@Column(name="Documento")
	private String documento;

	@Column(name="Empleado")
	private Integer empleado;

	@Column(name="EstadoCivil")
	private String estadoCivil;

	private Integer estadoEspecialidad;

	private Integer estadoEspecialidadMedico;

	private String estadoPersona;

	@Column(name="FechaNacimiento")
	private Timestamp fechaNacimiento;

	@Column(name="IdEmpresaMedico")
	private Integer idEmpresaMedico;

	@Id
	@Column(name="IdEspecialidad")
	private Integer idEspecialidad;

	private Integer idEspecialidadEmpleado;

	@Id
	@Column(name="IdMedico")
	private Integer idMedico;

	@Column(name="Nacionalidad")
	private String nacionalidad;

	@Column(name="Nombre")
	private String nombre;

	@Column(name="NombreCompleto")
	private String nombreCompleto;

	@Column(name="Nombres")
	private String nombres;

	@Column(name="Persona")
	private Integer persona;

	@Column(name="Sexo")
	private String sexo;

	@Column(name="TipoDocumento")
	private String tipoDocumento;

	@Column(name="TipoPersona")
	private String tipoPersona;

	public VwEspecialidadMedico() {
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

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getEstadoEspecialidad() {
		return this.estadoEspecialidad;
	}

	public void setEstadoEspecialidad(Integer estadoEspecialidad) {
		this.estadoEspecialidad = estadoEspecialidad;
	}

	public Integer getEstadoEspecialidadMedico() {
		return this.estadoEspecialidadMedico;
	}

	public void setEstadoEspecialidadMedico(Integer estadoEspecialidadMedico) {
		this.estadoEspecialidadMedico = estadoEspecialidadMedico;
	}

	public String getEstadoPersona() {
		return this.estadoPersona;
	}

	public void setEstadoPersona(String estadoPersona) {
		this.estadoPersona = estadoPersona;
	}

	public Timestamp getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getIdEmpresaMedico() {
		return this.idEmpresaMedico;
	}

	public void setIdEmpresaMedico(Integer idEmpresaMedico) {
		this.idEmpresaMedico = idEmpresaMedico;
	}

	public Integer getIdEspecialidad() {
		return this.idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public Integer getIdEspecialidadEmpleado() {
		return this.idEspecialidadEmpleado;
	}

	public void setIdEspecialidadEmpleado(Integer idEspecialidadEmpleado) {
		this.idEspecialidadEmpleado = idEspecialidadEmpleado;
	}

	public Integer getIdMedico() {
		return this.idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Integer getPersona() {
		return this.persona;
	}

	public void setPersona(Integer persona) {
		this.persona = persona;
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

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

}