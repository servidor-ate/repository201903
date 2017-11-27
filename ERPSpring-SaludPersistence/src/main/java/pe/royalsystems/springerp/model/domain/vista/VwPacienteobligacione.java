package pe.royalsystems.springerp.model.domain.vista;

import pe.royalsystems.springerp.model.domain.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the VW_PACIENTEOBLIGACIONES database table.
 * 
 */
@Entity
@Table(name="VW_PACIENTEOBLIGACIONES")
public class VwPacienteobligacione extends Entidad {
	private static final long serialVersionUID = 1L;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String codigoOA;
	private String compania;
	private String cuentabancaria;
	private String datosGenerales;
	private String documento;
	private BigDecimal duracionPromedio;
	private Integer especialidad;
	private String estadoCivil;
	private String expr1;
	private Date fechaCita;
	private Date fechaNacimiento;
	private String historiaClinica;
	private Integer idCita;
	private Integer idHorario;
	private Integer idMedico;
	private Integer idOrdenAtencion;
	private String itemcodigo;
	private String itemdescripcion;
	private String itemservicioflag;
	private Integer linea;
	private Integer lineadocumento;
	private Integer lineaOrdenAtencion;
	private String monedadocumento;
	private String nacionalidad;
	private String nombreCompleto;
	private String nombres;
	private String numerodocumento;
	private Integer oblcantidad;
	private BigDecimal oblcdescuento;
	private Integer oblcestado;
	private Date oblcfechacreacion;
	private String oblcipcreacion;
	private BigDecimal oblcmontototal;
	private BigDecimal oblcmora;
	private Integer oblcnrocuota;
	private Date oblcultimafechamodif;
	private String oblcultimoip;
	private Integer oblcultimousuario;
	private Integer oblcusuariocreacion;
	private BigDecimal obldescuento;
	private Integer oblestado;
	private Date oblfechacobranza;
	private Date oblfechaemision;
	private Date oblfechavencimiento;
	private String oblflagtipopersona;
	private String oblipcreacion;
	private BigDecimal oblmonto;
	private BigDecimal oblmora;
	private Integer oblobligacionid;
	private Integer oblpagoxbancoflag;
	private String oblperiodocobranza;
	private String paciente;
	private Integer persona;
	private Integer secuencia;
	private Integer seriedocumento;
	private String sexo;
	private String sucursal;
	private Integer tipoAtencion;
	private Integer tipoCita;
	private String tipodocumento;
	private Integer tipoOrdenAtencion;
	private String tipoPersona;
	private String unidadReplicacion;
	
	private BigDecimal oblcmontopagado;
	
	private String tipoDocumentoPersona;
	private String direccion;
	private String documentoFiscal;
	private String origenPersona;
	private String estadoPersona;
	private String tipoPaciente;
	
	private String correoElectronicoPersona;

	

	public VwPacienteobligacione() {
	}


	@Id
	@Column(name="Secuencia")
	public Integer getSecuencia() {
		return this.secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
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


	@Column(name="CodigoOA")
	public String getCodigoOA() {
		return this.codigoOA;
	}

	public void setCodigoOA(String codigoOA) {
		this.codigoOA = codigoOA;
	}


	@Column(name="Compania")
	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}


	@Column(name="Cuentabancaria")
	public String getCuentabancaria() {
		return this.cuentabancaria;
	}

	public void setCuentabancaria(String cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}


	@Column(name="DatosGenerales")
	public String getDatosGenerales() {
		return this.datosGenerales;
	}

	public void setDatosGenerales(String datosGenerales) {
		this.datosGenerales = datosGenerales;
	}


	@Column(name="Documento")
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}


	@Column(name="DuracionPromedio")
	public BigDecimal getDuracionPromedio() {
		return this.duracionPromedio;
	}

	public void setDuracionPromedio(BigDecimal duracionPromedio) {
		this.duracionPromedio = duracionPromedio;
	}


	@Column(name="Especialidad")
	public Integer getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(Integer especialidad) {
		this.especialidad = especialidad;
	}


	@Column(name="EstadoCivil")
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	@Column(name="Expr1")
	public String getExpr1() {
		return this.expr1;
	}

	public void setExpr1(String expr1) {
		this.expr1 = expr1;
	}


	@Column(name="FechaCita")
	public Date getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}


	@Column(name="FechaNacimiento")
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Column(name="HistoriaClinica")
	public String getHistoriaClinica() {
		return this.historiaClinica;
	}

	public void setHistoriaClinica(String historiaClinica) {
		this.historiaClinica = historiaClinica;
	}


	@Column(name="IdCita")
	public Integer getIdCita() {
		return this.idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}


	@Column(name="IdHorario")
	public Integer getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}


	@Column(name="IdMedico")
	public Integer getIdMedico() {
		return this.idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}


	@Column(name="IdOrdenAtencion")
	public Integer getIdOrdenAtencion() {
		return this.idOrdenAtencion;
	}

	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}


	@Column(name="Itemcodigo")
	public String getItemcodigo() {
		return this.itemcodigo;
	}

	public void setItemcodigo(String itemcodigo) {
		this.itemcodigo = itemcodigo;
	}


	@Column(name="Itemdescripcion")
	public String getItemdescripcion() {
		return this.itemdescripcion;
	}

	public void setItemdescripcion(String itemdescripcion) {
		this.itemdescripcion = itemdescripcion;
	}


	@Column(name="Itemservicioflag")
	public String getItemservicioflag() {
		return this.itemservicioflag;
	}

	public void setItemservicioflag(String itemservicioflag) {
		this.itemservicioflag = itemservicioflag;
	}


	@Column(name="Linea")
	public Integer getLinea() {
		return this.linea;
	}

	public void setLinea(Integer linea) {
		this.linea = linea;
	}


	@Column(name="Lineadocumento")
	public Integer getLineadocumento() {
		return this.lineadocumento;
	}

	public void setLineadocumento(Integer lineadocumento) {
		this.lineadocumento = lineadocumento;
	}


	@Column(name="LineaOrdenAtencion")
	public Integer getLineaOrdenAtencion() {
		return this.lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}


	@Column(name="Monedadocumento")
	public String getMonedadocumento() {
		return this.monedadocumento;
	}

	public void setMonedadocumento(String monedadocumento) {
		this.monedadocumento = monedadocumento;
	}


	@Column(name="Nacionalidad")
	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	@Column(name="NombreCompleto")
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	@Column(name="Nombres")
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	@Column(name="Numerodocumento")
	public String getNumerodocumento() {
		return this.numerodocumento;
	}

	public void setNumerodocumento(String numerodocumento) {
		this.numerodocumento = numerodocumento;
	}


	@Column(name="Oblcantidad")
	public Integer getOblcantidad() {
		return this.oblcantidad;
	}

	public void setOblcantidad(Integer oblcantidad) {
		this.oblcantidad = oblcantidad;
	}


	@Column(name="Oblcdescuento")
	public BigDecimal getOblcdescuento() {
		return this.oblcdescuento;
	}

	public void setOblcdescuento(BigDecimal oblcdescuento) {
		this.oblcdescuento = oblcdescuento;
	}


	@Column(name="Oblcestado")
	public Integer getOblcestado() {
		return this.oblcestado;
	}

	public void setOblcestado(Integer oblcestado) {
		this.oblcestado = oblcestado;
	}


	@Column(name="Oblcfechacreacion")
	public Date getOblcfechacreacion() {
		return this.oblcfechacreacion;
	}

	public void setOblcfechacreacion(Date oblcfechacreacion) {
		this.oblcfechacreacion = oblcfechacreacion;
	}


	@Column(name="Oblcipcreacion")
	public String getOblcipcreacion() {
		return this.oblcipcreacion;
	}

	public void setOblcipcreacion(String oblcipcreacion) {
		this.oblcipcreacion = oblcipcreacion;
	}


	@Column(name="Oblcmontototal")
	public BigDecimal getOblcmontototal() {
		return this.oblcmontototal;
	}

	public void setOblcmontototal(BigDecimal oblcmontototal) {
		this.oblcmontototal = oblcmontototal;
	}


	@Column(name="Oblcmora")
	public BigDecimal getOblcmora() {
		return this.oblcmora;
	}

	public void setOblcmora(BigDecimal oblcmora) {
		this.oblcmora = oblcmora;
	}


	@Column(name="Oblcnrocuota")
	public Integer getOblcnrocuota() {
		return this.oblcnrocuota;
	}

	public void setOblcnrocuota(Integer oblcnrocuota) {
		this.oblcnrocuota = oblcnrocuota;
	}


	@Column(name="Oblcultimafechamodif")
	public Date getOblcultimafechamodif() {
		return this.oblcultimafechamodif;
	}

	public void setOblcultimafechamodif(Date oblcultimafechamodif) {
		this.oblcultimafechamodif = oblcultimafechamodif;
	}


	@Column(name="Oblcultimoip")
	public String getOblcultimoip() {
		return this.oblcultimoip;
	}

	public void setOblcultimoip(String oblcultimoip) {
		this.oblcultimoip = oblcultimoip;
	}


	@Column(name="Oblcultimousuario")
	public Integer getOblcultimousuario() {
		return this.oblcultimousuario;
	}

	public void setOblcultimousuario(Integer oblcultimousuario) {
		this.oblcultimousuario = oblcultimousuario;
	}


	@Column(name="Oblcusuariocreacion")
	public Integer getOblcusuariocreacion() {
		return this.oblcusuariocreacion;
	}

	public void setOblcusuariocreacion(Integer oblcusuariocreacion) {
		this.oblcusuariocreacion = oblcusuariocreacion;
	}


	@Column(name="Obldescuento")
	public BigDecimal getObldescuento() {
		return this.obldescuento;
	}

	public void setObldescuento(BigDecimal obldescuento) {
		this.obldescuento = obldescuento;
	}


	@Column(name="Oblestado")
	public Integer getOblestado() {
		return this.oblestado;
	}

	public void setOblestado(Integer oblestado) {
		this.oblestado = oblestado;
	}


	@Column(name="Oblfechacobranza")
	public Date getOblfechacobranza() {
		return this.oblfechacobranza;
	}

	public void setOblfechacobranza(Date oblfechacobranza) {
		this.oblfechacobranza = oblfechacobranza;
	}


	@Column(name="Oblfechaemision")
	public Date getOblfechaemision() {
		return this.oblfechaemision;
	}

	public void setOblfechaemision(Date oblfechaemision) {
		this.oblfechaemision = oblfechaemision;
	}


	@Column(name="Oblfechavencimiento")
	public Date getOblfechavencimiento() {
		return this.oblfechavencimiento;
	}

	public void setOblfechavencimiento(Date oblfechavencimiento) {
		this.oblfechavencimiento = oblfechavencimiento;
	}


	@Column(name="Oblflagtipopersona")
	public String getOblflagtipopersona() {
		return this.oblflagtipopersona;
	}

	public void setOblflagtipopersona(String oblflagtipopersona) {
		this.oblflagtipopersona = oblflagtipopersona;
	}


	@Column(name="Oblipcreacion")
	public String getOblipcreacion() {
		return this.oblipcreacion;
	}

	public void setOblipcreacion(String oblipcreacion) {
		this.oblipcreacion = oblipcreacion;
	}


	@Column(name="Oblmonto")
	public BigDecimal getOblmonto() {
		return this.oblmonto;
	}

	public void setOblmonto(BigDecimal oblmonto) {
		this.oblmonto = oblmonto;
	}


	@Column(name="Oblmora")
	public BigDecimal getOblmora() {
		return this.oblmora;
	}

	public void setOblmora(BigDecimal oblmora) {
		this.oblmora = oblmora;
	}


	@Id
	@Column(name="Oblobligacionid")
	public Integer getOblobligacionid() {
		return this.oblobligacionid;
	}

	public void setOblobligacionid(Integer oblobligacionid) {
		this.oblobligacionid = oblobligacionid;
	}


	@Column(name="Oblpagoxbancoflag")
	public Integer getOblpagoxbancoflag() {
		return this.oblpagoxbancoflag;
	}

	public void setOblpagoxbancoflag(Integer oblpagoxbancoflag) {
		this.oblpagoxbancoflag = oblpagoxbancoflag;
	}


	@Column(name="Oblperiodocobranza")
	public String getOblperiodocobranza() {
		return this.oblperiodocobranza;
	}

	public void setOblperiodocobranza(String oblperiodocobranza) {
		this.oblperiodocobranza = oblperiodocobranza;
	}


	@Column(name="Paciente")
	public String getPaciente() {
		return this.paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}


	@Column(name="Persona")
	public Integer getPersona() {
		return this.persona;
	}

	public void setPersona(Integer persona) {
		this.persona = persona;
	}




	@Column(name="Seriedocumento")
	public Integer getSeriedocumento() {
		return this.seriedocumento;
	}

	public void setSeriedocumento(Integer seriedocumento) {
		this.seriedocumento = seriedocumento;
	}


	@Column(name="Sexo")
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Column(name="Sucursal")
	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	@Column(name="TipoAtencion")
	public Integer getTipoAtencion() {
		return this.tipoAtencion;
	}

	public void setTipoAtencion(Integer tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}


	@Column(name="TipoCita")
	public Integer getTipoCita() {
		return this.tipoCita;
	}

	public void setTipoCita(Integer tipoCita) {
		this.tipoCita = tipoCita;
	}


	@Column(name="Tipodocumento")
	public String getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}


	@Column(name="TipoOrdenAtencion")
	public Integer getTipoOrdenAtencion() {
		return this.tipoOrdenAtencion;
	}

	public void setTipoOrdenAtencion(Integer tipoOrdenAtencion) {
		this.tipoOrdenAtencion = tipoOrdenAtencion;
	}


	@Column(name="TipoPersona")
	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}


	@Column(name="UnidadReplicacion")
	public String getUnidadReplicacion() {
		return this.unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}
	
    
    
    @Column(name="Oblcmontopagado")
	public BigDecimal getOblcmontopagado() {
		return oblcmontopagado;
	}


	public void setOblcmontopagado(BigDecimal oblcmontopagado) {
		this.oblcmontopagado = oblcmontopagado;
	}


    
    
    @Column(name="TipoDocumentoPersona")
	public String getTipoDocumentoPersona() {
		return tipoDocumentoPersona;
	}


	public void setTipoDocumentoPersona(String tipoDocumentoPersona) {
		this.tipoDocumentoPersona = tipoDocumentoPersona;
	}


    
    
    @Column(name="Direccion")
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	

    
    
    @Column(name="DocumentoFiscal")
	public String getDocumentoFiscal() {
		return documentoFiscal;
	}


	public void setDocumentoFiscal(String documentoFiscal) {
		this.documentoFiscal = documentoFiscal;
	}
    
    
    @Column(name="OrigenPersona")
	public String getOrigenPersona() {
		return origenPersona;
	}


	public void setOrigenPersona(String origenPersona) {
		this.origenPersona = origenPersona;
	}


    
    @Column(name="EstadoPersona")
	public String getEstadoPersona() {
		return estadoPersona;
	}


	public void setEstadoPersona(String estadoPersona) {
		this.estadoPersona = estadoPersona;
	}

    
    @Column(name="TipoPaciente")
	public String getTipoPaciente() {
		return tipoPaciente;
	}


	public void setTipoPaciente(String tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

	
	@Column(name="CorreoElectronicoPersona")
	public String getCorreoElectronicoPersona() {
		return correoElectronicoPersona;
	}


	public void setCorreoElectronicoPersona(String correoElectronicoPersona) {
		this.correoElectronicoPersona = correoElectronicoPersona;
	}

	
	
}