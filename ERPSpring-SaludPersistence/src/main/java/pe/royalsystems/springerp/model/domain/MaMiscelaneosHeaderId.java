package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MaMiscelaneosHeaderId implements java.io.Serializable {

	private String aplicacionCodigo;
	private String codigoTabla;
	private String compania;

	public MaMiscelaneosHeaderId() {
	}

	public MaMiscelaneosHeaderId(String aplicacionCodigo, String codigoTabla, String compania) {
		this.aplicacionCodigo = aplicacionCodigo;
		this.codigoTabla = codigoTabla;
		this.compania = compania;
	}

	@Column(name = "AplicacionCodigo", nullable = false, length = 2)
	public String getAplicacionCodigo() {
		return this.aplicacionCodigo;
	}

	public void setAplicacionCodigo(String aplicacionCodigo) {
		this.aplicacionCodigo = aplicacionCodigo;
	}

	@Column(name = "CodigoTabla", nullable = false, length = 10)
	public String getCodigoTabla() {
		return this.codigoTabla;
	}

	public void setCodigoTabla(String codigoTabla) {
		this.codigoTabla = codigoTabla;
	}

	@Column(name = "Compania", nullable = false, length = 6)
	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaMiscelaneosHeaderId))
			return false;
		MaMiscelaneosHeaderId castOther = (MaMiscelaneosHeaderId) other;

		return ((this.getAplicacionCodigo() == castOther.getAplicacionCodigo())
				|| (this.getAplicacionCodigo() != null && castOther.getAplicacionCodigo() != null
						&& this.getAplicacionCodigo().equals(castOther.getAplicacionCodigo())))
				&& ((this.getCodigoTabla() == castOther.getCodigoTabla())
						|| (this.getCodigoTabla() != null && castOther.getCodigoTabla() != null
								&& this.getCodigoTabla().equals(castOther.getCodigoTabla())))
				&& ((this.getCompania() == castOther.getCompania()) || (this.getCompania() != null
						&& castOther.getCompania() != null && this.getCompania().equals(castOther.getCompania())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAplicacionCodigo() == null ? 0 : this.getAplicacionCodigo().hashCode());
		result = 37 * result + (getCodigoTabla() == null ? 0 : this.getCodigoTabla().hashCode());
		result = 37 * result + (getCompania() == null ? 0 : this.getCompania().hashCode());
		return result;
	}

}
