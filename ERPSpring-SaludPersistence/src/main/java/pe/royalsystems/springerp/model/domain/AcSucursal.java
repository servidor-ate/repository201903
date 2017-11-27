package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the AC_Sucursal database table.
 * 
 */
@Entity
@Table(name = "AC_Sucursal")
public class AcSucursal extends Entidad {
	private static final long serialVersionUID = 1L;
	private String sucursal;
	private String accion;
	private String ciiu;
	private String compania;
	private String cuentaContableDefecto;
	private String descripcionIngles;
	private String descripcionLocal;
	private String direccionAdicional;
	private String direccionComun;
	private String estado;
	private String fax1;
	private String fax2;
	private Date fechaCreacion;
	private String logoSucursal;
	private String sucursalGrupo;
	private String telefono1;
	private String telefono2;
	private String telefono3;
	private Date ultimaFechaModif;
	private String ultimoUsuario;
	private String usuarioCreacion;

	public AcSucursal() {
	}


	@Id
	@Column(name="Sucursal")
	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	@Column(name="ACCION")
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}


	@Column(name="CIIU")
	public String getCiiu() {
		return this.ciiu;
	}

	public void setCiiu(String ciiu) {
		this.ciiu = ciiu;
	}


	@Column(name="Compania")
	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}


	@Column(name="CuentaContableDefecto")
	public String getCuentaContableDefecto() {
		return this.cuentaContableDefecto;
	}

	public void setCuentaContableDefecto(String cuentaContableDefecto) {
		this.cuentaContableDefecto = cuentaContableDefecto;
	}


	@Column(name="DescripcionIngles")
	public String getDescripcionIngles() {
		return this.descripcionIngles;
	}

	public void setDescripcionIngles(String descripcionIngles) {
		this.descripcionIngles = descripcionIngles;
	}


	@Column(name="DescripcionLocal")
	public String getDescripcionLocal() {
		return this.descripcionLocal;
	}

	public void setDescripcionLocal(String descripcionLocal) {
		this.descripcionLocal = descripcionLocal;
	}


	@Column(name="DireccionAdicional")
	public String getDireccionAdicional() {
		return this.direccionAdicional;
	}

	public void setDireccionAdicional(String direccionAdicional) {
		this.direccionAdicional = direccionAdicional;
	}


	@Column(name="DireccionComun")
	public String getDireccionComun() {
		return this.direccionComun;
	}

	public void setDireccionComun(String direccionComun) {
		this.direccionComun = direccionComun;
	}


	@Column(name="Estado")
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Column(name="Fax1")
	public String getFax1() {
		return this.fax1;
	}

	public void setFax1(String fax1) {
		this.fax1 = fax1;
	}


	@Column(name="Fax2")
	public String getFax2() {
		return this.fax2;
	}

	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}


	@Column(name="FechaCreacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="LogoSucursal")
	public String getLogoSucursal() {
		return this.logoSucursal;
	}

	public void setLogoSucursal(String logoSucursal) {
		this.logoSucursal = logoSucursal;
	}


	@Column(name="SucursalGrupo")
	public String getSucursalGrupo() {
		return this.sucursalGrupo;
	}

	public void setSucursalGrupo(String sucursalGrupo) {
		this.sucursalGrupo = sucursalGrupo;
	}


	@Column(name="Telefono1")
	public String getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}


	@Column(name="Telefono2")
	public String getTelefono2() {
		return this.telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}


	@Column(name="Telefono3")
	public String getTelefono3() {
		return this.telefono3;
	}

	public void setTelefono3(String telefono3) {
		this.telefono3 = telefono3;
	}


	@Column(name="UltimaFechaModif")
	public Date getUltimaFechaModif() {
		return this.ultimaFechaModif;
	}

	public void setUltimaFechaModif(Date ultimaFechaModif) {
		this.ultimaFechaModif = ultimaFechaModif;
	}


	@Column(name="UltimoUsuario")
	public String getUltimoUsuario() {
		return this.ultimoUsuario;
	}

	public void setUltimoUsuario(String ultimoUsuario) {
		this.ultimoUsuario = ultimoUsuario;
	}


	@Column(name="UsuarioCreacion")
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

}