package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SgModuloId implements java.io.Serializable {

	private String sistema;
	private String modulo;

	public SgModuloId() {
	}

	public SgModuloId(String sistema, String modulo) {
		this.sistema = sistema;
		this.modulo = modulo;
	}

	@Column(name = "Sistema", nullable = false, length = 4)
	public String getSistema() {
		return this.sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	@Column(name = "Modulo", nullable = false, length = 2)
	public String getModulo() {
		return this.modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgModuloId))
			return false;
		SgModuloId castOther = (SgModuloId) other;

		return ((this.getSistema() == castOther.getSistema()) || (this.getSistema() != null
				&& castOther.getSistema() != null && this.getSistema().equals(castOther.getSistema())))
				&& ((this.getModulo() == castOther.getModulo()) || (this.getModulo() != null
						&& castOther.getModulo() != null && this.getModulo().equals(castOther.getModulo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSistema() == null ? 0 : this.getSistema().hashCode());
		result = 37 * result + (getModulo() == null ? 0 : this.getModulo().hashCode());
		return result;
	}

}
