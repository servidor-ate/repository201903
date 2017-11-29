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
public class FavoritoDetalleJson  extends EntidadJson {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -7759474247047858984L;

	private Integer idFavorito;
	private Integer secuencia;
	
	private String codigoTablaFavorito;
	private String descripcion;	
	private Integer idAgente;
	private String tipoFavorito;
	
	private Date fechaCreacion;
	private String tipoIdentificador;
	private String usuarioCreacion;
	private String valorCodigo;
	private Integer valorId;
	private String valorTexto1;
	private String valorTexto2;
	private String valorTexto3;
	private String valorTexto4;
	private String valorTexto5;	
	private String estado;

	//private SsCcFavorito ssCcFavorito;
	
	
	
	public Integer getIdFavorito() {
		return idFavorito;
	}
	public void setIdFavorito(Integer idFavorito) {
		this.idFavorito = idFavorito;
	}
	public Integer getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}
	public String getCodigoTablaFavorito() {
		return codigoTablaFavorito;
	}
	public void setCodigoTablaFavorito(String codigoTablaFavorito) {
		this.codigoTablaFavorito = codigoTablaFavorito;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}
	public String getTipoFavorito() {
		return tipoFavorito;
	}
	public void setTipoFavorito(String tipoFavorito) {
		this.tipoFavorito = tipoFavorito;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getTipoIdentificador() {
		return tipoIdentificador;
	}
	public void setTipoIdentificador(String tipoIdentificador) {
		this.tipoIdentificador = tipoIdentificador;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getValorCodigo() {
		return valorCodigo;
	}
	public void setValorCodigo(String valorCodigo) {
		this.valorCodigo = valorCodigo;
	}
	public Integer getValorId() {
		return valorId;
	}
	public void setValorId(Integer valorId) {
		this.valorId = valorId;
	}
	public String getValorTexto1() {
		return valorTexto1;
	}
	public void setValorTexto1(String valorTexto1) {
		this.valorTexto1 = valorTexto1;
	}
	public String getValorTexto2() {
		return valorTexto2;
	}
	public void setValorTexto2(String valorTexto2) {
		this.valorTexto2 = valorTexto2;
	}
	public String getValorTexto3() {
		return valorTexto3;
	}
	public void setValorTexto3(String valorTexto3) {
		this.valorTexto3 = valorTexto3;
	}
	public String getValorTexto4() {
		return valorTexto4;
	}
	public void setValorTexto4(String valorTexto4) {
		this.valorTexto4 = valorTexto4;
	}
	public String getValorTexto5() {
		return valorTexto5;
	}
	public void setValorTexto5(String valorTexto5) {
		this.valorTexto5 = valorTexto5;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
