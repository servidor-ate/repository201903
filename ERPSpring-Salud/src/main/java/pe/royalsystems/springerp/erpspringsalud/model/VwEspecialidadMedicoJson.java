package pe.royalsystems.springerp.erpspringsalud.model;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;



/**
 * The persistent class for the VW_ESPECIALIDAD_MEDICO database table.
 * 
 */
@JsonIgnoreProperties( value = { 
		/**Campos a ignorar*/	
		"uri"
		,"paginable"
	})
@JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
public class VwEspecialidadMedicoJson extends EntidadJson {
	private static final long serialVersionUID = 1L;
	
	private String apellidoMaterno;	
	private String apellidoPaterno;	
	private String codigo;	
	private String descripcion;	
	private String direccion;	
	private String documento;
	private Integer empleado;	
	private String estadoCivil;
	private Integer estadoEspecialidad;
	private Integer estadoEspecialidadMedico;

	private String estadoPersona;	
	private Date fechaNacimiento;	
	private Integer idEmpresaMedico;	
	private Integer idEspecialidad;
	private Integer idEspecialidadEmpleado;
	private Integer idMedico;	
	private String nacionalidad;	
	private String nombre;	
	private String nombreCompleto;	
	private String nombres;
	private Integer persona;	
	private String sexo;
	
	private String tipoDocumento;	
	private String tipoPersona;

	public VwEspecialidadMedicoJson() {
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

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
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