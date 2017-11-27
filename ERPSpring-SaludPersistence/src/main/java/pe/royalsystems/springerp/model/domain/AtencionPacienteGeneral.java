/**
 * VW_ATENCIONPACIENTE_GENERAL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pe.royalsystems.springerp.model.domain;

import java.util.Date;

public class AtencionPacienteGeneral extends Entidad implements java.io.Serializable {
    private java.lang.String tipoListado;

    private java.lang.String citaTipo;

    private java.util.Calendar citaFecha;

    private java.util.Calendar citaHora;
    
    private Date citaFechaDate;
    
    private Date citaHoraDate;

    private java.lang.String origen;

    private java.lang.String nombreEspecialidad;

    private java.lang.String tipoPacienteNombre;

    private java.lang.String codigoOA;

    private java.util.Calendar fechaInicio;
    
    private Date fechaInicioDate;

    private java.lang.String cama;

    private java.lang.String tipoOrdenAtencionNombre;

    private java.lang.String codigoHC;

    private java.lang.String codigoHCAnterior;

    private java.lang.String pacienteNombre;

    private java.lang.String medicoNombre;

    private int idOrdenAtencion;

    private int lineaOrdenAtencion;

    private int idHospitalizacion;

    private int lineaHospitalizacion;

    private java.lang.Integer idConsultaExterna;

    private java.lang.Integer idProcedimiento;

    private java.lang.Integer modalidad;

    private java.lang.Integer indicadorSeguro;

    private java.lang.Integer idCita;

    private java.lang.Integer idPaciente;

    private java.lang.Integer tipoPaciente;

    private java.lang.Integer tipoAtencion;

    private java.lang.Integer idEspecialidad;

    private java.lang.Integer idEmpresaAseguradora;

    private java.lang.Integer tipoOrdenAtencion;

    private java.lang.String componente;

    private java.lang.String componenteNombre;

    private java.lang.String compania;

    private java.lang.String sucursal;

    private java.lang.Integer idMedico;

    private int indicadorCirugia;

    private int indicadorExamenPrincipal;

    private java.lang.String personaAnt;

    private java.lang.String sexo;

    private java.util.Calendar fechaNacimiento;
    
    private Date fechaNacimientoDate;

    private java.lang.String estadoCivil;

    private java.lang.String nivelInstruccion;

    private java.lang.String direccion;

    private java.lang.String tipoDocumento;

    private java.lang.String documento;

    private java.lang.String apellidoPaterno;

    private java.lang.String apellidoMaterno;

    private java.lang.String nombres;

    private java.lang.String lugarNacimiento;

    private java.lang.String codigoPostal;

    private java.lang.String provincia;

    private java.lang.String departamento;

    private java.lang.String telefono;

    private java.lang.String correoElectronico;

    private java.lang.String esPaciente;

    private java.lang.String esEmpresa;

    private java.lang.String pais;

    private java.lang.String estadoPersona;

    private java.util.Calendar fechaCierreEpiClinico;
    
    private Date fechaCierreEpiClinicoDate;

    private java.lang.Integer estadoEpiClinico;

    private java.lang.String unidadReplicacion;

    private java.lang.String unidadReplicacionEC;

    private java.lang.Long idEpisodioAtencion;

    private java.lang.Integer episodioClinico;

    private java.lang.Integer idEstablecimientoSalud;

    private java.lang.Integer idUnidadServicio;

    private java.lang.Integer idPersonalSalud;

    private java.lang.Integer episodioAtencion;

    private java.util.Calendar fechaRegistro;
    
    private Date fechaRegistroDate;

    private java.util.Calendar fechaAtencion;
    
    private Date fechaAtencionDate;

    private java.lang.Integer estadoEpiAtencion;
    
    private java.lang.String estadoAtencion;

    private java.lang.String usuarioCreacion;

    private java.lang.String usuarioModificacion;

    private java.util.Calendar fechaCreacion;
    
    private Date fechaCreacionDate;

    private java.util.Calendar fechaModificacion;
    
    private Date fechaModificacionDate;

    private java.lang.String accion;

    private java.lang.String version;

    private java.util.Calendar fechaFin;
    
    private Date fechaFinDate;

    private java.util.Calendar fechaOrden;

    private java.lang.Integer comentarios;

    private java.lang.Integer observaciones;

    public java.lang.String getTipoListado() {
		return tipoListado;
	}

	public void setTipoListado(java.lang.String tipoListado) {
		this.tipoListado = tipoListado;
	}

	public java.lang.String getCitaTipo() {
		return citaTipo;
	}

	public void setCitaTipo(java.lang.String citaTipo) {
		this.citaTipo = citaTipo;
	}

	public java.util.Calendar getCitaFecha() {
		return citaFecha;
	}

	public void setCitaFecha(java.util.Calendar citaFecha) {
		this.citaFecha = citaFecha;
	}

	public java.util.Calendar getCitaHora() {
		return citaHora;
	}

	public void setCitaHora(java.util.Calendar citaHora) {
		this.citaHora = citaHora;
	}

	public java.lang.String getOrigen() {
		return origen;
	}

	public void setOrigen(java.lang.String origen) {
		this.origen = origen;
	}

	public java.lang.String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(java.lang.String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public java.lang.String getTipoPacienteNombre() {
		return tipoPacienteNombre;
	}

	public void setTipoPacienteNombre(java.lang.String tipoPacienteNombre) {
		this.tipoPacienteNombre = tipoPacienteNombre;
	}

	public java.lang.String getCodigoOA() {
		return codigoOA;
	}

	public void setCodigoOA(java.lang.String codigoOA) {
		this.codigoOA = codigoOA;
	}

	public java.util.Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(java.util.Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public java.lang.String getCama() {
		return cama;
	}

	public void setCama(java.lang.String cama) {
		this.cama = cama;
	}

	public java.lang.String getTipoOrdenAtencionNombre() {
		return tipoOrdenAtencionNombre;
	}

	public void setTipoOrdenAtencionNombre(java.lang.String tipoOrdenAtencionNombre) {
		this.tipoOrdenAtencionNombre = tipoOrdenAtencionNombre;
	}

	public java.lang.String getCodigoHC() {
		return codigoHC;
	}

	public void setCodigoHC(java.lang.String codigoHC) {
		this.codigoHC = codigoHC;
	}

	public java.lang.String getCodigoHCAnterior() {
		return codigoHCAnterior;
	}

	public void setCodigoHCAnterior(java.lang.String codigoHCAnterior) {
		this.codigoHCAnterior = codigoHCAnterior;
	}

	public java.lang.String getPacienteNombre() {
		return pacienteNombre;
	}

	public void setPacienteNombre(java.lang.String pacienteNombre) {
		this.pacienteNombre = pacienteNombre;
	}

	public java.lang.String getMedicoNombre() {
		return medicoNombre;
	}

	public void setMedicoNombre(java.lang.String medicoNombre) {
		this.medicoNombre = medicoNombre;
	}

	public int getIdOrdenAtencion() {
		return idOrdenAtencion;
	}

	public void setIdOrdenAtencion(int idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}

	public int getLineaOrdenAtencion() {
		return lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(int lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}

	public int getIdHospitalizacion() {
		return idHospitalizacion;
	}

	public void setIdHospitalizacion(int idHospitalizacion) {
		this.idHospitalizacion = idHospitalizacion;
	}

	public int getLineaHospitalizacion() {
		return lineaHospitalizacion;
	}

	public void setLineaHospitalizacion(int lineaHospitalizacion) {
		this.lineaHospitalizacion = lineaHospitalizacion;
	}

	public java.lang.Integer getIdConsultaExterna() {
		return idConsultaExterna;
	}

	public void setIdConsultaExterna(java.lang.Integer idConsultaExterna) {
		this.idConsultaExterna = idConsultaExterna;
	}

	public java.lang.Integer getIdProcedimiento() {
		return idProcedimiento;
	}

	public void setIdProcedimiento(java.lang.Integer idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public java.lang.Integer getModalidad() {
		return modalidad;
	}

	public void setModalidad(java.lang.Integer modalidad) {
		this.modalidad = modalidad;
	}

	public java.lang.Integer getIndicadorSeguro() {
		return indicadorSeguro;
	}

	public void setIndicadorSeguro(java.lang.Integer indicadorSeguro) {
		this.indicadorSeguro = indicadorSeguro;
	}

	public java.lang.Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(java.lang.Integer idCita) {
		this.idCita = idCita;
	}

	public java.lang.Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(java.lang.Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public java.lang.Integer getTipoPaciente() {
		return tipoPaciente;
	}

	public void setTipoPaciente(java.lang.Integer tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

	public java.lang.Integer getTipoAtencion() {
		return tipoAtencion;
	}

	public void setTipoAtencion(java.lang.Integer tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}

	public java.lang.Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(java.lang.Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public java.lang.Integer getIdEmpresaAseguradora() {
		return idEmpresaAseguradora;
	}

	public void setIdEmpresaAseguradora(java.lang.Integer idEmpresaAseguradora) {
		this.idEmpresaAseguradora = idEmpresaAseguradora;
	}

	public java.lang.Integer getTipoOrdenAtencion() {
		return tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(java.lang.Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
	}

	public java.lang.String getComponente() {
		return componente;
	}

	public void setComponente(java.lang.String componente) {
		this.componente = componente;
	}

	public java.lang.String getComponenteNombre() {
		return componenteNombre;
	}

	public void setComponenteNombre(java.lang.String componenteNombre) {
		this.componenteNombre = componenteNombre;
	}

	public java.lang.String getCompania() {
		return compania;
	}

	public void setCompania(java.lang.String compania) {
		this.compania = compania;
	}

	public java.lang.String getSucursal() {
		return sucursal;
	}

	public void setSucursal(java.lang.String sucursal) {
		this.sucursal = sucursal;
	}

	public java.lang.Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(java.lang.Integer idMedico) {
		this.idMedico = idMedico;
	}

	public int getIndicadorCirugia() {
		return indicadorCirugia;
	}

	public void setIndicadorCirugia(int indicadorCirugia) {
		this.indicadorCirugia = indicadorCirugia;
	}

	public int getIndicadorExamenPrincipal() {
		return indicadorExamenPrincipal;
	}

	public void setIndicadorExamenPrincipal(int indicadorExamenPrincipal) {
		this.indicadorExamenPrincipal = indicadorExamenPrincipal;
	}

	public java.lang.String getPersonaAnt() {
		return personaAnt;
	}

	public void setPersonaAnt(java.lang.String personaAnt) {
		this.personaAnt = personaAnt;
	}

	public java.lang.String getSexo() {
		return sexo;
	}

	public void setSexo(java.lang.String sexo) {
		this.sexo = sexo;
	}

	public java.util.Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public java.lang.String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(java.lang.String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public java.lang.String getNivelInstruccion() {
		return nivelInstruccion;
	}

	public void setNivelInstruccion(java.lang.String nivelInstruccion) {
		this.nivelInstruccion = nivelInstruccion;
	}

	public java.lang.String getDireccion() {
		return direccion;
	}

	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	public java.lang.String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(java.lang.String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public java.lang.String getDocumento() {
		return documento;
	}

	public void setDocumento(java.lang.String documento) {
		this.documento = documento;
	}

	public java.lang.String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(java.lang.String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public java.lang.String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(java.lang.String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public java.lang.String getNombres() {
		return nombres;
	}

	public void setNombres(java.lang.String nombres) {
		this.nombres = nombres;
	}

	public java.lang.String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(java.lang.String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public java.lang.String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(java.lang.String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public java.lang.String getProvincia() {
		return provincia;
	}

	public void setProvincia(java.lang.String provincia) {
		this.provincia = provincia;
	}

	public java.lang.String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(java.lang.String departamento) {
		this.departamento = departamento;
	}

	public java.lang.String getTelefono() {
		return telefono;
	}

	public void setTelefono(java.lang.String telefono) {
		this.telefono = telefono;
	}

	public java.lang.String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(java.lang.String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public java.lang.String getEsPaciente() {
		return esPaciente;
	}

	public void setEsPaciente(java.lang.String esPaciente) {
		this.esPaciente = esPaciente;
	}

	public java.lang.String getEsEmpresa() {
		return esEmpresa;
	}

	public void setEsEmpresa(java.lang.String esEmpresa) {
		this.esEmpresa = esEmpresa;
	}

	public java.lang.String getPais() {
		return pais;
	}

	public void setPais(java.lang.String pais) {
		this.pais = pais;
	}

	public java.lang.String getEstadoPersona() {
		return estadoPersona;
	}

	public void setEstadoPersona(java.lang.String estadoPersona) {
		this.estadoPersona = estadoPersona;
	}

	public java.util.Calendar getFechaCierreEpiClinico() {
		return fechaCierreEpiClinico;
	}

	public void setFechaCierreEpiClinico(java.util.Calendar fechaCierreEpiClinico) {
		this.fechaCierreEpiClinico = fechaCierreEpiClinico;
	}

	public java.lang.Integer getEstadoEpiClinico() {
		return estadoEpiClinico;
	}

	public void setEstadoEpiClinico(java.lang.Integer estadoEpiClinico) {
		this.estadoEpiClinico = estadoEpiClinico;
	}

	public java.lang.String getUnidadReplicacion() {
		return unidadReplicacion;
	}

	public void setUnidadReplicacion(java.lang.String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}

	public java.lang.String getUnidadReplicacionEC() {
		return unidadReplicacionEC;
	}

	public void setUnidadReplicacionEC(java.lang.String unidadReplicacionEC) {
		this.unidadReplicacionEC = unidadReplicacionEC;
	}

	public java.lang.Long getIdEpisodioAtencion() {
		return idEpisodioAtencion;
	}

	public void setIdEpisodioAtencion(java.lang.Long idEpisodioAtencion) {
		this.idEpisodioAtencion = idEpisodioAtencion;
	}

	public java.lang.Integer getEpisodioClinico() {
		return episodioClinico;
	}

	public void setEpisodioClinico(java.lang.Integer episodioClinico) {
		this.episodioClinico = episodioClinico;
	}

	public java.lang.Integer getIdEstablecimientoSalud() {
		return idEstablecimientoSalud;
	}

	public void setIdEstablecimientoSalud(java.lang.Integer idEstablecimientoSalud) {
		this.idEstablecimientoSalud = idEstablecimientoSalud;
	}

	public java.lang.Integer getIdUnidadServicio() {
		return idUnidadServicio;
	}

	public void setIdUnidadServicio(java.lang.Integer idUnidadServicio) {
		this.idUnidadServicio = idUnidadServicio;
	}

	public java.lang.Integer getIdPersonalSalud() {
		return idPersonalSalud;
	}

	public void setIdPersonalSalud(java.lang.Integer idPersonalSalud) {
		this.idPersonalSalud = idPersonalSalud;
	}

	public java.lang.Integer getEpisodioAtencion() {
		return episodioAtencion;
	}

	public void setEpisodioAtencion(java.lang.Integer episodioAtencion) {
		this.episodioAtencion = episodioAtencion;
	}

	public java.util.Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(java.util.Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public java.util.Calendar getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(java.util.Calendar fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public java.lang.Integer getEstadoEpiAtencion() {
		return estadoEpiAtencion;
	}

	public void setEstadoEpiAtencion(java.lang.Integer estadoEpiAtencion) {
		this.estadoEpiAtencion = estadoEpiAtencion;
	}

	public java.lang.String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(java.lang.String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public java.lang.String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(java.lang.String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public java.util.Calendar getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(java.util.Calendar fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public java.util.Calendar getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(java.util.Calendar fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public java.lang.String getAccion() {
		return accion;
	}

	public void setAccion(java.lang.String accion) {
		this.accion = accion;
	}

	public java.lang.String getVersion() {
		return version;
	}

	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	public java.util.Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(java.util.Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	public java.util.Calendar getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(java.util.Calendar fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public java.lang.Integer getComentarios() {
		return comentarios;
	}

	public void setComentarios(java.lang.Integer comentarios) {
		this.comentarios = comentarios;
	}

	public java.lang.Integer getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(java.lang.Integer observaciones) {
		this.observaciones = observaciones;
	}

	public java.lang.Integer getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(java.lang.Integer diagnostico) {
		this.diagnostico = diagnostico;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getNumeroFila() {
		return numeroFila;
	}

	public void setNumeroFila(int numeroFila) {
		this.numeroFila = numeroFila;
	}

	public Date getCitaFechaDate() {
			
		return citaFechaDate;
	}

	public void setCitaFechaDate(Date citaFechaDate) {
		this.citaFechaDate = citaFechaDate;
	}

	public Date getCitaHoraDate() {
		
		return citaHoraDate;
	}

	public void setCitaHoraDate(Date citaHoraDate) {
		this.citaHoraDate = citaHoraDate;
	}

	public Date getFechaFinDate() {
		
			return fechaFinDate;
	}

	public void setFechaFinDate(Date fechaFinDate) {
		this.fechaFinDate = fechaFinDate;
	}

	public Date getFechaInicioDate() {
		
		
		return fechaInicioDate;
	}

	public void setFechaInicioDate(Date fechaInicioDate) {
		this.fechaInicioDate = fechaInicioDate;
	}

	
	public java.lang.String getEstadoAtencion() {
		return estadoAtencion;
	}

	public void setEstadoAtencion(java.lang.String estadoAtencion) {
		this.estadoAtencion = estadoAtencion;
	}

	public Date getFechaNacimientoDate() {
		return fechaNacimientoDate;
	}

	public void setFechaNacimientoDate(Date fechaNacimientoDate) {
		this.fechaNacimientoDate = fechaNacimientoDate;
	}

	public Date getFechaCierreEpiClinicoDate() {
		return fechaCierreEpiClinicoDate;
	}

	public void setFechaCierreEpiClinicoDate(Date fechaCierreEpiClinicoDate) {
		this.fechaCierreEpiClinicoDate = fechaCierreEpiClinicoDate;
	}

	public Date getFechaRegistroDate() {
		return fechaRegistroDate;
	}

	public void setFechaRegistroDate(Date fechaRegistroDate) {
		this.fechaRegistroDate = fechaRegistroDate;
	}

	public Date getFechaAtencionDate() {
		return fechaAtencionDate;
	}

	public void setFechaAtencionDate(Date fechaAtencionDate) {
		this.fechaAtencionDate = fechaAtencionDate;
	}

	public Date getFechaCreacionDate() {
		return fechaCreacionDate;
	}

	public void setFechaCreacionDate(Date fechaCreacionDate) {
		this.fechaCreacionDate = fechaCreacionDate;
	}

	public Date getFechaModificacionDate() {
		return fechaModificacionDate;
	}

	public void setFechaModificacionDate(Date fechaModificacionDate) {
		this.fechaModificacionDate = fechaModificacionDate;
	}

	private java.lang.Integer diagnostico;

    private int contador;

    private int numeroFila;

  

}
