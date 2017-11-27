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
public class SgAgenteJson  extends EntidadJson {
	
   	/**
	 * 
	 */
	private static final long serialVersionUID = 3138043511303309013L;
	
	
	private Integer idAgente;
    private Integer idGrupo;
    private Integer idOrganizacion;
    private Integer tipoAgente;
    private String codigoAgente;
    private Integer idEmpleado;
    private Integer indicadorMultiple;
    private String clave;
    private Integer expiraClave;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaExpiracion;
    private String nombre;
    private String descripcion;
    private Integer estado;
    private String usuarioCreacion;
    
    private String accion;
    private String plataforma;
    private String tipotrabajador;
    private Integer idCodigo;
    
    
	public Integer getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}
	public Integer getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	public Integer getIdOrganizacion() {
		return idOrganizacion;
	}
	public void setIdOrganizacion(Integer idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}
	public Integer getTipoAgente() {
		return tipoAgente;
	}
	public void setTipoAgente(Integer tipoAgente) {
		this.tipoAgente = tipoAgente;
	}
	public String getCodigoAgente() {
		return codigoAgente;
	}
	public void setCodigoAgente(String codigoAgente) {
		this.codigoAgente = codigoAgente;
	}
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Integer getIndicadorMultiple() {
		return indicadorMultiple;
	}
	public void setIndicadorMultiple(Integer indicadorMultiple) {
		this.indicadorMultiple = indicadorMultiple;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getExpiraClave() {
		return expiraClave;
	}
	public void setExpiraClave(Integer expiraClave) {
		this.expiraClave = expiraClave;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getTipotrabajador() {
		return tipotrabajador;
	}
	public void setTipotrabajador(String tipotrabajador) {
		this.tipotrabajador = tipotrabajador;
	}
	public Integer getIdCodigo() {
		return idCodigo;
	}
	public void setIdCodigo(Integer idCodigo) {
		this.idCodigo = idCodigo;
	}


}
