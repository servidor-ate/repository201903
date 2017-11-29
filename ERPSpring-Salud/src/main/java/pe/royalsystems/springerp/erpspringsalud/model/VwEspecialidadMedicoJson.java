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
		,"bool_1"
		,"int_1"
		,"int_2"
		,"string1"
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
	
	/**Added favoritos*/
	private boolean indicaFavorito;	
	private Integer idFavorito;
	private Integer favoritoSecuencia;
	private String iconoFavorito;
	
	/**Added Auxiliares*/
	private boolean bool_1;	
	private Integer int_1;
	private Integer int_2;
	private String string1;
	
	
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

	public boolean isIndicaFavorito() {
		return indicaFavorito;
	}

	public void setIndicaFavorito(boolean indicaFavorito) {
		this.indicaFavorito = indicaFavorito;
	}

	public Integer getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(Integer idFavorito) {
		this.idFavorito = idFavorito;
	}

	public Integer getFavoritoSecuencia() {
		return favoritoSecuencia;
	}

	public void setFavoritoSecuencia(Integer favoritoSecuencia) {
		this.favoritoSecuencia = favoritoSecuencia;
	}

	public String getIconoFavorito() {
		return iconoFavorito;
	}

	public void setIconoFavorito(String iconoFavorito) {
		this.iconoFavorito = iconoFavorito;
	}

	public boolean isBool_1() {
		return bool_1;
	}

	public void setBool_1(boolean bool_1) {
		this.bool_1 = bool_1;
	}

	public Integer getInt_1() {
		return int_1;
	}

	public void setInt_1(Integer int_1) {
		this.int_1 = int_1;
	}

	public Integer getInt_2() {
		return int_2;
	}

	public void setInt_2(Integer int_2) {
		this.int_2 = int_2;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

}