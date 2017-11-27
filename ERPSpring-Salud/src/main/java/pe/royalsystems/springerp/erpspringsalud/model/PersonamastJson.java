package pe.royalsystems.springerp.erpspringsalud.model;
// default package
// Generated Sep 28, 2015 2:18:16 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;

@JsonIgnoreProperties( value = { 
		/**Campos a ignorar*/	
		"uri"
		,"paginable"
	})
@JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
public class PersonamastJson extends EntidadJson  {

	private Integer persona;
	private String origen;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	private String nombreCompleto;
	private String busqueda;
	private String grupoEmpresarial;
	private String tipoDocumento;
	private String documento;
	private String codigoBarras;
	private String esCliente;
	private String esProveedor;
	private String esEmpleado;
	private String esOtro;
	private String tipoPersona;
	private Date fechaNacimiento;
	private String ciudadNacimiento;
	private String sexo;
	private String nacionalidad;
	private String estadoCivil;
	private String nivelInstruccion;
	private String direccion;
	private String codigoPostal;
	private String provincia;
	private String departamento;
	private String telefono;
	private String fax;
	private String documentoFiscal;
	private String documentoIdentidad;
	private String carnetExtranjeria;
	private String documentoMilitarFa;
	private String tipoBrevete;
	private String brevete;
	private String pasaporte;
	private String nombreEmergencia;
	private String direccionEmergencia;
	private String telefonoEmergencia;
	private String bancoMonedaLocal;
	private String tipoCuentaLocal;
	private String cuentaMonedaLocal;
	private String bancoMonedaExtranjera;
	private String tipoCuentaExtranjera;
	private String cuentaMonedaExtranjera;
	private String personaAnt;
	private String correoElectronico;
	private String clasePersonaCodigo;
	private String personaClasificacion;
	private String enfermedadGraveFlag;
	private Date ingresoFechaRegistro;
	private String ingresoAplicacionCodigo;
	private String ingresoUsuario;
	private String pymeflag;
	private String estado;
	private String ultimoUsuario;
	private Date ultimaFechaModif;
	private String tipoPersonaUsuario;
	private String direccionReferencia;
	private String celular;
	private String parentescoEmergencia;
	private String celularEmergencia;
	private String lugarNacimiento;
	private String suspensionFonaviFlag;
	private String flagRepetido;
	private String codDiscamec;
	private Date fecIniDiscamec;
	private Date fecFinDiscamec;
	private String codLicArma;
	private String marcaArma;
	private String serieArma;
	private Date inicioArma;
	private Date vencimientoArma;
	private String seguroDiscamec;
	private String correlativoSctr;
	private String cuentaMonedaExtranjeraTmp;
	private String cuentaMonedaLocalTmp;
	private String flagActualizacion;
	private String tarjetadeCredito;
	private String pais;
	private String esPaciente;
	private String esEmpresa;
	private Integer personaOld;
	private Integer personanew;
	private String cmp;
	private String sunatnacionalidad;
	private String sunatvia;
	private String sunatzona;
	private String sunatubigeo;
	private String sunatdomiciliado;
	private Integer indicadorAutogenerado;
	private String rutaFirma;
	private String tipoDocumentoIdentidad;
	private Integer idPersonaUnificado;
	private Integer idpersonaOk;
	private Integer edad;
	private String rangoEtario;
	private Integer tipoMedico;
	private Integer correcion;
	private Integer idEmpresaAnteriorUnificacion;
	private Date breveteFecvcto;
	private Date carnetextranjeriaFecvcto;
	private String estadoBk;
	private String estadoBks;
	private Integer indicadorVinculada;
	private String paisEmisor;
	private String codigoLdn;
	private String sunatConvenio;
	private Integer indicadorRegistroManual;
	private Integer indicadorFallecido;
	private Integer indicadorSinCorreo;
	private String accion;

	public PersonamastJson() {
	}

	public PersonamastJson(Integer persona, String origen, String tipoDocumento, String documento) {
		this.persona = persona;
		this.origen = origen;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}

	public PersonamastJson(Integer persona, String origen, String apellidoPaterno, String apellidoMaterno, String nombres,
			String nombreCompleto, String busqueda, String grupoEmpresarial, String tipoDocumento, String documento,
			String codigoBarras, String esCliente, String esProveedor, String esEmpleado, String esOtro,
			String tipoPersona, Date fechaNacimiento, String ciudadNacimiento, String sexo, String nacionalidad,
			String estadoCivil, String nivelInstruccion, String direccion, String codigoPostal, String provincia,
			String departamento, String telefono, String fax, String documentoFiscal, String documentoIdentidad,
			String carnetExtranjeria, String documentoMilitarFa, String tipoBrevete, String brevete,
			String pasaporte, String nombreEmergencia, String direccionEmergencia, String telefonoEmergencia,
			String bancoMonedaLocal, String tipoCuentaLocal, String cuentaMonedaLocal, String bancoMonedaExtranjera,
			String tipoCuentaExtranjera, String cuentaMonedaExtranjera, String personaAnt, String correoElectronico,
			String clasePersonaCodigo, String personaClasificacion, String enfermedadGraveFlag,
			Date ingresoFechaRegistro, String ingresoAplicacionCodigo, String ingresoUsuario, String pymeflag,
			String estado, String ultimoUsuario, Date ultimaFechaModif, String tipoPersonaUsuario,
			String direccionReferencia, String celular, String parentescoEmergencia, String celularEmergencia,
			String lugarNacimiento, String suspensionFonaviFlag, String flagRepetido, String codDiscamec,
			Date fecIniDiscamec, Date fecFinDiscamec, String codLicArma, String marcaArma, String serieArma,
			Date inicioArma, Date vencimientoArma, String seguroDiscamec, String correlativoSctr,
			String cuentaMonedaExtranjeraTmp, String cuentaMonedaLocalTmp, String flagActualizacion,
			String tarjetadeCredito, String pais, String esPaciente, String esEmpresa, Integer personaOld,
			Integer personanew, String cmp, String sunatnacionalidad, String sunatvia, String sunatzona,
			String sunatubigeo, String sunatdomiciliado, Integer indicadorAutogenerado, String rutaFirma,
			String tipoDocumentoIdentidad, Integer idPersonaUnificado, Integer idpersonaOk, Integer edad,
			String rangoEtario, Integer tipoMedico, Integer correcion, Integer idEmpresaAnteriorUnificacion,
			Date breveteFecvcto, Date carnetextranjeriaFecvcto, String estadoBk, String estadoBks,
			Integer indicadorVinculada, String paisEmisor, String codigoLdn, String sunatConvenio,
			Integer indicadorRegistroManual, Integer indicadorFallecido, Integer indicadorSinCorreo, String accion) {
		this.persona = persona;
		this.origen = origen;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombres = nombres;
		this.nombreCompleto = nombreCompleto;
		this.busqueda = busqueda;
		this.grupoEmpresarial = grupoEmpresarial;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.codigoBarras = codigoBarras;
		this.esCliente = esCliente;
		this.esProveedor = esProveedor;
		this.esEmpleado = esEmpleado;
		this.esOtro = esOtro;
		this.tipoPersona = tipoPersona;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
		this.estadoCivil = estadoCivil;
		this.nivelInstruccion = nivelInstruccion;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.departamento = departamento;
		this.telefono = telefono;
		this.fax = fax;
		this.documentoFiscal = documentoFiscal;
		this.documentoIdentidad = documentoIdentidad;
		this.carnetExtranjeria = carnetExtranjeria;
		this.documentoMilitarFa = documentoMilitarFa;
		this.tipoBrevete = tipoBrevete;
		this.brevete = brevete;
		this.pasaporte = pasaporte;
		this.nombreEmergencia = nombreEmergencia;
		this.direccionEmergencia = direccionEmergencia;
		this.telefonoEmergencia = telefonoEmergencia;
		this.bancoMonedaLocal = bancoMonedaLocal;
		this.tipoCuentaLocal = tipoCuentaLocal;
		this.cuentaMonedaLocal = cuentaMonedaLocal;
		this.bancoMonedaExtranjera = bancoMonedaExtranjera;
		this.tipoCuentaExtranjera = tipoCuentaExtranjera;
		this.cuentaMonedaExtranjera = cuentaMonedaExtranjera;
		this.personaAnt = personaAnt;
		this.correoElectronico = correoElectronico;
		this.clasePersonaCodigo = clasePersonaCodigo;
		this.personaClasificacion = personaClasificacion;
		this.enfermedadGraveFlag = enfermedadGraveFlag;
		this.ingresoFechaRegistro = ingresoFechaRegistro;
		this.ingresoAplicacionCodigo = ingresoAplicacionCodigo;
		this.ingresoUsuario = ingresoUsuario;
		this.pymeflag = pymeflag;
		this.estado = estado;
		this.ultimoUsuario = ultimoUsuario;
		this.ultimaFechaModif = ultimaFechaModif;
		this.tipoPersonaUsuario = tipoPersonaUsuario;
		this.direccionReferencia = direccionReferencia;
		this.celular = celular;
		this.parentescoEmergencia = parentescoEmergencia;
		this.celularEmergencia = celularEmergencia;
		this.lugarNacimiento = lugarNacimiento;
		this.suspensionFonaviFlag = suspensionFonaviFlag;
		this.flagRepetido = flagRepetido;
		this.codDiscamec = codDiscamec;
		this.fecIniDiscamec = fecIniDiscamec;
		this.fecFinDiscamec = fecFinDiscamec;
		this.codLicArma = codLicArma;
		this.marcaArma = marcaArma;
		this.serieArma = serieArma;
		this.inicioArma = inicioArma;
		this.vencimientoArma = vencimientoArma;
		this.seguroDiscamec = seguroDiscamec;
		this.correlativoSctr = correlativoSctr;
		this.cuentaMonedaExtranjeraTmp = cuentaMonedaExtranjeraTmp;
		this.cuentaMonedaLocalTmp = cuentaMonedaLocalTmp;
		this.flagActualizacion = flagActualizacion;
		this.tarjetadeCredito = tarjetadeCredito;
		this.pais = pais;
		this.esPaciente = esPaciente;
		this.esEmpresa = esEmpresa;
		this.personaOld = personaOld;
		this.personanew = personanew;
		this.cmp = cmp;
		this.sunatnacionalidad = sunatnacionalidad;
		this.sunatvia = sunatvia;
		this.sunatzona = sunatzona;
		this.sunatubigeo = sunatubigeo;
		this.sunatdomiciliado = sunatdomiciliado;
		this.indicadorAutogenerado = indicadorAutogenerado;
		this.rutaFirma = rutaFirma;
		this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
		this.idPersonaUnificado = idPersonaUnificado;
		this.idpersonaOk = idpersonaOk;
		this.edad = edad;
		this.rangoEtario = rangoEtario;
		this.tipoMedico = tipoMedico;
		this.correcion = correcion;
		this.idEmpresaAnteriorUnificacion = idEmpresaAnteriorUnificacion;
		this.breveteFecvcto = breveteFecvcto;
		this.carnetextranjeriaFecvcto = carnetextranjeriaFecvcto;
		this.estadoBk = estadoBk;
		this.estadoBks = estadoBks;
		this.indicadorVinculada = indicadorVinculada;
		this.paisEmisor = paisEmisor;
		this.codigoLdn = codigoLdn;
		this.sunatConvenio = sunatConvenio;
		this.indicadorRegistroManual = indicadorRegistroManual;
		this.indicadorFallecido = indicadorFallecido;
		this.indicadorSinCorreo = indicadorSinCorreo;
		this.accion = accion;
	}

	public Integer getPersona() {
		return persona;
	}

	public void setPersona(Integer persona) {
		this.persona = persona;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
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

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

	public String getGrupoEmpresarial() {
		return grupoEmpresarial;
	}

	public void setGrupoEmpresarial(String grupoEmpresarial) {
		this.grupoEmpresarial = grupoEmpresarial;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(String esCliente) {
		this.esCliente = esCliente;
	}

	public String getEsProveedor() {
		return esProveedor;
	}

	public void setEsProveedor(String esProveedor) {
		this.esProveedor = esProveedor;
	}

	public String getEsEmpleado() {
		return esEmpleado;
	}

	public void setEsEmpleado(String esEmpleado) {
		this.esEmpleado = esEmpleado;
	}

	public String getEsOtro() {
		return esOtro;
	}

	public void setEsOtro(String esOtro) {
		this.esOtro = esOtro;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNivelInstruccion() {
		return nivelInstruccion;
	}

	public void setNivelInstruccion(String nivelInstruccion) {
		this.nivelInstruccion = nivelInstruccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getDocumentoFiscal() {
		return documentoFiscal;
	}

	public void setDocumentoFiscal(String documentoFiscal) {
		this.documentoFiscal = documentoFiscal;
	}

	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}

	public String getCarnetExtranjeria() {
		return carnetExtranjeria;
	}

	public void setCarnetExtranjeria(String carnetExtranjeria) {
		this.carnetExtranjeria = carnetExtranjeria;
	}

	public String getDocumentoMilitarFa() {
		return documentoMilitarFa;
	}

	public void setDocumentoMilitarFa(String documentoMilitarFa) {
		this.documentoMilitarFa = documentoMilitarFa;
	}

	public String getTipoBrevete() {
		return tipoBrevete;
	}

	public void setTipoBrevete(String tipoBrevete) {
		this.tipoBrevete = tipoBrevete;
	}

	public String getBrevete() {
		return brevete;
	}

	public void setBrevete(String brevete) {
		this.brevete = brevete;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getNombreEmergencia() {
		return nombreEmergencia;
	}

	public void setNombreEmergencia(String nombreEmergencia) {
		this.nombreEmergencia = nombreEmergencia;
	}

	public String getDireccionEmergencia() {
		return direccionEmergencia;
	}

	public void setDireccionEmergencia(String direccionEmergencia) {
		this.direccionEmergencia = direccionEmergencia;
	}

	public String getTelefonoEmergencia() {
		return telefonoEmergencia;
	}

	public void setTelefonoEmergencia(String telefonoEmergencia) {
		this.telefonoEmergencia = telefonoEmergencia;
	}

	public String getBancoMonedaLocal() {
		return bancoMonedaLocal;
	}

	public void setBancoMonedaLocal(String bancoMonedaLocal) {
		this.bancoMonedaLocal = bancoMonedaLocal;
	}

	public String getTipoCuentaLocal() {
		return tipoCuentaLocal;
	}

	public void setTipoCuentaLocal(String tipoCuentaLocal) {
		this.tipoCuentaLocal = tipoCuentaLocal;
	}

	public String getCuentaMonedaLocal() {
		return cuentaMonedaLocal;
	}

	public void setCuentaMonedaLocal(String cuentaMonedaLocal) {
		this.cuentaMonedaLocal = cuentaMonedaLocal;
	}

	public String getBancoMonedaExtranjera() {
		return bancoMonedaExtranjera;
	}

	public void setBancoMonedaExtranjera(String bancoMonedaExtranjera) {
		this.bancoMonedaExtranjera = bancoMonedaExtranjera;
	}

	public String getTipoCuentaExtranjera() {
		return tipoCuentaExtranjera;
	}

	public void setTipoCuentaExtranjera(String tipoCuentaExtranjera) {
		this.tipoCuentaExtranjera = tipoCuentaExtranjera;
	}

	public String getCuentaMonedaExtranjera() {
		return cuentaMonedaExtranjera;
	}

	public void setCuentaMonedaExtranjera(String cuentaMonedaExtranjera) {
		this.cuentaMonedaExtranjera = cuentaMonedaExtranjera;
	}

	public String getPersonaAnt() {
		return personaAnt;
	}

	public void setPersonaAnt(String personaAnt) {
		this.personaAnt = personaAnt;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getClasePersonaCodigo() {
		return clasePersonaCodigo;
	}

	public void setClasePersonaCodigo(String clasePersonaCodigo) {
		this.clasePersonaCodigo = clasePersonaCodigo;
	}

	public String getPersonaClasificacion() {
		return personaClasificacion;
	}

	public void setPersonaClasificacion(String personaClasificacion) {
		this.personaClasificacion = personaClasificacion;
	}

	public String getEnfermedadGraveFlag() {
		return enfermedadGraveFlag;
	}

	public void setEnfermedadGraveFlag(String enfermedadGraveFlag) {
		this.enfermedadGraveFlag = enfermedadGraveFlag;
	}

	public Date getIngresoFechaRegistro() {
		return ingresoFechaRegistro;
	}

	public void setIngresoFechaRegistro(Date ingresoFechaRegistro) {
		this.ingresoFechaRegistro = ingresoFechaRegistro;
	}

	public String getIngresoAplicacionCodigo() {
		return ingresoAplicacionCodigo;
	}

	public void setIngresoAplicacionCodigo(String ingresoAplicacionCodigo) {
		this.ingresoAplicacionCodigo = ingresoAplicacionCodigo;
	}

	public String getIngresoUsuario() {
		return ingresoUsuario;
	}

	public void setIngresoUsuario(String ingresoUsuario) {
		this.ingresoUsuario = ingresoUsuario;
	}

	public String getPymeflag() {
		return pymeflag;
	}

	public void setPymeflag(String pymeflag) {
		this.pymeflag = pymeflag;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUltimoUsuario() {
		return ultimoUsuario;
	}

	public void setUltimoUsuario(String ultimoUsuario) {
		this.ultimoUsuario = ultimoUsuario;
	}

	public Date getUltimaFechaModif() {
		return ultimaFechaModif;
	}

	public void setUltimaFechaModif(Date ultimaFechaModif) {
		this.ultimaFechaModif = ultimaFechaModif;
	}

	public String getTipoPersonaUsuario() {
		return tipoPersonaUsuario;
	}

	public void setTipoPersonaUsuario(String tipoPersonaUsuario) {
		this.tipoPersonaUsuario = tipoPersonaUsuario;
	}

	public String getDireccionReferencia() {
		return direccionReferencia;
	}

	public void setDireccionReferencia(String direccionReferencia) {
		this.direccionReferencia = direccionReferencia;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getParentescoEmergencia() {
		return parentescoEmergencia;
	}

	public void setParentescoEmergencia(String parentescoEmergencia) {
		this.parentescoEmergencia = parentescoEmergencia;
	}

	public String getCelularEmergencia() {
		return celularEmergencia;
	}

	public void setCelularEmergencia(String celularEmergencia) {
		this.celularEmergencia = celularEmergencia;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getSuspensionFonaviFlag() {
		return suspensionFonaviFlag;
	}

	public void setSuspensionFonaviFlag(String suspensionFonaviFlag) {
		this.suspensionFonaviFlag = suspensionFonaviFlag;
	}

	public String getFlagRepetido() {
		return flagRepetido;
	}

	public void setFlagRepetido(String flagRepetido) {
		this.flagRepetido = flagRepetido;
	}

	public String getCodDiscamec() {
		return codDiscamec;
	}

	public void setCodDiscamec(String codDiscamec) {
		this.codDiscamec = codDiscamec;
	}

	public Date getFecIniDiscamec() {
		return fecIniDiscamec;
	}

	public void setFecIniDiscamec(Date fecIniDiscamec) {
		this.fecIniDiscamec = fecIniDiscamec;
	}

	public Date getFecFinDiscamec() {
		return fecFinDiscamec;
	}

	public void setFecFinDiscamec(Date fecFinDiscamec) {
		this.fecFinDiscamec = fecFinDiscamec;
	}

	public String getCodLicArma() {
		return codLicArma;
	}

	public void setCodLicArma(String codLicArma) {
		this.codLicArma = codLicArma;
	}

	public String getMarcaArma() {
		return marcaArma;
	}

	public void setMarcaArma(String marcaArma) {
		this.marcaArma = marcaArma;
	}

	public String getSerieArma() {
		return serieArma;
	}

	public void setSerieArma(String serieArma) {
		this.serieArma = serieArma;
	}

	public Date getInicioArma() {
		return inicioArma;
	}

	public void setInicioArma(Date inicioArma) {
		this.inicioArma = inicioArma;
	}

	public Date getVencimientoArma() {
		return vencimientoArma;
	}

	public void setVencimientoArma(Date vencimientoArma) {
		this.vencimientoArma = vencimientoArma;
	}

	public String getSeguroDiscamec() {
		return seguroDiscamec;
	}

	public void setSeguroDiscamec(String seguroDiscamec) {
		this.seguroDiscamec = seguroDiscamec;
	}

	public String getCorrelativoSctr() {
		return correlativoSctr;
	}

	public void setCorrelativoSctr(String correlativoSctr) {
		this.correlativoSctr = correlativoSctr;
	}

	public String getCuentaMonedaExtranjeraTmp() {
		return cuentaMonedaExtranjeraTmp;
	}

	public void setCuentaMonedaExtranjeraTmp(String cuentaMonedaExtranjeraTmp) {
		this.cuentaMonedaExtranjeraTmp = cuentaMonedaExtranjeraTmp;
	}

	public String getCuentaMonedaLocalTmp() {
		return cuentaMonedaLocalTmp;
	}

	public void setCuentaMonedaLocalTmp(String cuentaMonedaLocalTmp) {
		this.cuentaMonedaLocalTmp = cuentaMonedaLocalTmp;
	}

	public String getFlagActualizacion() {
		return flagActualizacion;
	}

	public void setFlagActualizacion(String flagActualizacion) {
		this.flagActualizacion = flagActualizacion;
	}

	public String getTarjetadeCredito() {
		return tarjetadeCredito;
	}

	public void setTarjetadeCredito(String tarjetadeCredito) {
		this.tarjetadeCredito = tarjetadeCredito;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEsPaciente() {
		return esPaciente;
	}

	public void setEsPaciente(String esPaciente) {
		this.esPaciente = esPaciente;
	}

	public String getEsEmpresa() {
		return esEmpresa;
	}

	public void setEsEmpresa(String esEmpresa) {
		this.esEmpresa = esEmpresa;
	}

	public Integer getPersonaOld() {
		return personaOld;
	}

	public void setPersonaOld(Integer personaOld) {
		this.personaOld = personaOld;
	}

	public Integer getPersonanew() {
		return personanew;
	}

	public void setPersonanew(Integer personanew) {
		this.personanew = personanew;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	public String getSunatnacionalidad() {
		return sunatnacionalidad;
	}

	public void setSunatnacionalidad(String sunatnacionalidad) {
		this.sunatnacionalidad = sunatnacionalidad;
	}

	public String getSunatvia() {
		return sunatvia;
	}

	public void setSunatvia(String sunatvia) {
		this.sunatvia = sunatvia;
	}

	public String getSunatzona() {
		return sunatzona;
	}

	public void setSunatzona(String sunatzona) {
		this.sunatzona = sunatzona;
	}

	public String getSunatubigeo() {
		return sunatubigeo;
	}

	public void setSunatubigeo(String sunatubigeo) {
		this.sunatubigeo = sunatubigeo;
	}

	public String getSunatdomiciliado() {
		return sunatdomiciliado;
	}

	public void setSunatdomiciliado(String sunatdomiciliado) {
		this.sunatdomiciliado = sunatdomiciliado;
	}

	public Integer getIndicadorAutogenerado() {
		return indicadorAutogenerado;
	}

	public void setIndicadorAutogenerado(Integer indicadorAutogenerado) {
		this.indicadorAutogenerado = indicadorAutogenerado;
	}

	public String getRutaFirma() {
		return rutaFirma;
	}

	public void setRutaFirma(String rutaFirma) {
		this.rutaFirma = rutaFirma;
	}

	public String getTipoDocumentoIdentidad() {
		return tipoDocumentoIdentidad;
	}

	public void setTipoDocumentoIdentidad(String tipoDocumentoIdentidad) {
		this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
	}

	public Integer getIdPersonaUnificado() {
		return idPersonaUnificado;
	}

	public void setIdPersonaUnificado(Integer idPersonaUnificado) {
		this.idPersonaUnificado = idPersonaUnificado;
	}

	public Integer getIdpersonaOk() {
		return idpersonaOk;
	}

	public void setIdpersonaOk(Integer idpersonaOk) {
		this.idpersonaOk = idpersonaOk;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRangoEtario() {
		return rangoEtario;
	}

	public void setRangoEtario(String rangoEtario) {
		this.rangoEtario = rangoEtario;
	}

	public Integer getTipoMedico() {
		return tipoMedico;
	}

	public void setTipoMedico(Integer tipoMedico) {
		this.tipoMedico = tipoMedico;
	}

	public Integer getCorrecion() {
		return correcion;
	}

	public void setCorrecion(Integer correcion) {
		this.correcion = correcion;
	}

	public Integer getIdEmpresaAnteriorUnificacion() {
		return idEmpresaAnteriorUnificacion;
	}

	public void setIdEmpresaAnteriorUnificacion(Integer idEmpresaAnteriorUnificacion) {
		this.idEmpresaAnteriorUnificacion = idEmpresaAnteriorUnificacion;
	}

	public Date getBreveteFecvcto() {
		return breveteFecvcto;
	}

	public void setBreveteFecvcto(Date breveteFecvcto) {
		this.breveteFecvcto = breveteFecvcto;
	}

	public Date getCarnetextranjeriaFecvcto() {
		return carnetextranjeriaFecvcto;
	}

	public void setCarnetextranjeriaFecvcto(Date carnetextranjeriaFecvcto) {
		this.carnetextranjeriaFecvcto = carnetextranjeriaFecvcto;
	}

	public String getEstadoBk() {
		return estadoBk;
	}

	public void setEstadoBk(String estadoBk) {
		this.estadoBk = estadoBk;
	}

	public String getEstadoBks() {
		return estadoBks;
	}

	public void setEstadoBks(String estadoBks) {
		this.estadoBks = estadoBks;
	}

	public Integer getIndicadorVinculada() {
		return indicadorVinculada;
	}

	public void setIndicadorVinculada(Integer indicadorVinculada) {
		this.indicadorVinculada = indicadorVinculada;
	}

	public String getPaisEmisor() {
		return paisEmisor;
	}

	public void setPaisEmisor(String paisEmisor) {
		this.paisEmisor = paisEmisor;
	}

	public String getCodigoLdn() {
		return codigoLdn;
	}

	public void setCodigoLdn(String codigoLdn) {
		this.codigoLdn = codigoLdn;
	}

	public String getSunatConvenio() {
		return sunatConvenio;
	}

	public void setSunatConvenio(String sunatConvenio) {
		this.sunatConvenio = sunatConvenio;
	}

	public Integer getIndicadorRegistroManual() {
		return indicadorRegistroManual;
	}

	public void setIndicadorRegistroManual(Integer indicadorRegistroManual) {
		this.indicadorRegistroManual = indicadorRegistroManual;
	}

	public Integer getIndicadorFallecido() {
		return indicadorFallecido;
	}

	public void setIndicadorFallecido(Integer indicadorFallecido) {
		this.indicadorFallecido = indicadorFallecido;
	}

	public Integer getIndicadorSinCorreo() {
		return indicadorSinCorreo;
	}

	public void setIndicadorSinCorreo(Integer indicadorSinCorreo) {
		this.indicadorSinCorreo = indicadorSinCorreo;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	
	
	
}
