package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VwFavoritosId implements java.io.Serializable {

	private int idFavorito;
	private Integer numeroFavorito;
	private String mnemotecnico;
	private String descripcion;
	private String descripcionExtranjera;
	private Integer idAgente;
	private Integer idFavoritoTabla;
	private Integer estado;
	private String accion;
	private String version;
	private String nombreTabla;
	private String descripTabla;
	private String codigoAgente;
	private String nombre;
	private Integer tipoFavorito;

	public VwFavoritosId() {
	}

	public VwFavoritosId(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	public VwFavoritosId(int idFavorito, Integer numeroFavorito, String mnemotecnico, String descripcion,
			String descripcionExtranjera, Integer idAgente, Integer idFavoritoTabla, Integer estado, String accion,
			String version, String nombreTabla, String descripTabla, String codigoAgente, String nombre,
			Integer tipoFavorito) {
		this.idFavorito = idFavorito;
		this.numeroFavorito = numeroFavorito;
		this.mnemotecnico = mnemotecnico;
		this.descripcion = descripcion;
		this.descripcionExtranjera = descripcionExtranjera;
		this.idAgente = idAgente;
		this.idFavoritoTabla = idFavoritoTabla;
		this.estado = estado;
		this.accion = accion;
		this.version = version;
		this.nombreTabla = nombreTabla;
		this.descripTabla = descripTabla;
		this.codigoAgente = codigoAgente;
		this.nombre = nombre;
		this.tipoFavorito = tipoFavorito;
	}

	@Column(name = "IdFavorito", nullable = false)
	public int getIdFavorito() {
		return this.idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	@Column(name = "NumeroFavorito")
	public Integer getNumeroFavorito() {
		return this.numeroFavorito;
	}

	public void setNumeroFavorito(Integer numeroFavorito) {
		this.numeroFavorito = numeroFavorito;
	}

	@Column(name = "Mnemotecnico", length = 15)
	public String getMnemotecnico() {
		return this.mnemotecnico;
	}

	public void setMnemotecnico(String mnemotecnico) {
		this.mnemotecnico = mnemotecnico;
	}

	@Column(name = "Descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "DescripcionExtranjera", length = 100)
	public String getDescripcionExtranjera() {
		return this.descripcionExtranjera;
	}

	public void setDescripcionExtranjera(String descripcionExtranjera) {
		this.descripcionExtranjera = descripcionExtranjera;
	}

	@Column(name = "IdAgente")
	public Integer getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

	@Column(name = "IdFavoritoTabla")
	public Integer getIdFavoritoTabla() {
		return this.idFavoritoTabla;
	}

	public void setIdFavoritoTabla(Integer idFavoritoTabla) {
		this.idFavoritoTabla = idFavoritoTabla;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "Accion", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "Version", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "NombreTabla", length = 128)
	public String getNombreTabla() {
		return this.nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	@Column(name = "DescripTabla", length = 100)
	public String getDescripTabla() {
		return this.descripTabla;
	}

	public void setDescripTabla(String descripTabla) {
		this.descripTabla = descripTabla;
	}

	@Column(name = "CodigoAgente", length = 15)
	public String getCodigoAgente() {
		return this.codigoAgente;
	}

	public void setCodigoAgente(String codigoAgente) {
		this.codigoAgente = codigoAgente;
	}

	@Column(name = "Nombre", length = 60)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "TipoFavorito")
	public Integer getTipoFavorito() {
		return this.tipoFavorito;
	}

	public void setTipoFavorito(Integer tipoFavorito) {
		this.tipoFavorito = tipoFavorito;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwFavoritosId))
			return false;
		VwFavoritosId castOther = (VwFavoritosId) other;

		return (this.getIdFavorito() == castOther.getIdFavorito())
				&& ((this.getNumeroFavorito() == castOther.getNumeroFavorito())
						|| (this.getNumeroFavorito() != null && castOther.getNumeroFavorito() != null
								&& this.getNumeroFavorito().equals(castOther.getNumeroFavorito())))
				&& ((this.getMnemotecnico() == castOther.getMnemotecnico())
						|| (this.getMnemotecnico() != null && castOther.getMnemotecnico() != null
								&& this.getMnemotecnico().equals(castOther.getMnemotecnico())))
				&& ((this.getDescripcion() == castOther.getDescripcion())
						|| (this.getDescripcion() != null && castOther.getDescripcion() != null
								&& this.getDescripcion().equals(castOther.getDescripcion())))
				&& ((this.getDescripcionExtranjera() == castOther.getDescripcionExtranjera())
						|| (this.getDescripcionExtranjera() != null && castOther.getDescripcionExtranjera() != null
								&& this.getDescripcionExtranjera().equals(castOther.getDescripcionExtranjera())))
				&& ((this.getIdAgente() == castOther.getIdAgente()) || (this.getIdAgente() != null
						&& castOther.getIdAgente() != null && this.getIdAgente().equals(castOther.getIdAgente())))
				&& ((this.getIdFavoritoTabla() == castOther.getIdFavoritoTabla())
						|| (this.getIdFavoritoTabla() != null && castOther.getIdFavoritoTabla() != null
								&& this.getIdFavoritoTabla().equals(castOther.getIdFavoritoTabla())))
				&& ((this.getEstado() == castOther.getEstado()) || (this.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado().equals(castOther.getEstado())))
				&& ((this.getAccion() == castOther.getAccion()) || (this.getAccion() != null
						&& castOther.getAccion() != null && this.getAccion().equals(castOther.getAccion())))
				&& ((this.getVersion() == castOther.getVersion()) || (this.getVersion() != null
						&& castOther.getVersion() != null && this.getVersion().equals(castOther.getVersion())))
				&& ((this.getNombreTabla() == castOther.getNombreTabla())
						|| (this.getNombreTabla() != null && castOther.getNombreTabla() != null
								&& this.getNombreTabla().equals(castOther.getNombreTabla())))
				&& ((this.getDescripTabla() == castOther.getDescripTabla())
						|| (this.getDescripTabla() != null && castOther.getDescripTabla() != null
								&& this.getDescripTabla().equals(castOther.getDescripTabla())))
				&& ((this.getCodigoAgente() == castOther.getCodigoAgente())
						|| (this.getCodigoAgente() != null && castOther.getCodigoAgente() != null
								&& this.getCodigoAgente().equals(castOther.getCodigoAgente())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getTipoFavorito() == castOther.getTipoFavorito())
						|| (this.getTipoFavorito() != null && castOther.getTipoFavorito() != null
								&& this.getTipoFavorito().equals(castOther.getTipoFavorito())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFavorito();
		result = 37 * result + (getNumeroFavorito() == null ? 0 : this.getNumeroFavorito().hashCode());
		result = 37 * result + (getMnemotecnico() == null ? 0 : this.getMnemotecnico().hashCode());
		result = 37 * result + (getDescripcion() == null ? 0 : this.getDescripcion().hashCode());
		result = 37 * result + (getDescripcionExtranjera() == null ? 0 : this.getDescripcionExtranjera().hashCode());
		result = 37 * result + (getIdAgente() == null ? 0 : this.getIdAgente().hashCode());
		result = 37 * result + (getIdFavoritoTabla() == null ? 0 : this.getIdFavoritoTabla().hashCode());
		result = 37 * result + (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result + (getAccion() == null ? 0 : this.getAccion().hashCode());
		result = 37 * result + (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37 * result + (getNombreTabla() == null ? 0 : this.getNombreTabla().hashCode());
		result = 37 * result + (getDescripTabla() == null ? 0 : this.getDescripTabla().hashCode());
		result = 37 * result + (getCodigoAgente() == null ? 0 : this.getCodigoAgente().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getTipoFavorito() == null ? 0 : this.getTipoFavorito().hashCode());
		return result;
	}

}

