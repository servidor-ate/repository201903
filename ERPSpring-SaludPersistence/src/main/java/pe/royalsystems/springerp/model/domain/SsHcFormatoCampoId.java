package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SsHcFormatoCampoId implements java.io.Serializable {

	private int idFormato;
	private int secuenciaCampo;

	public SsHcFormatoCampoId() {
	}

	public SsHcFormatoCampoId(int idFormato, int secuenciaCampo) {
		this.idFormato = idFormato;
		this.secuenciaCampo = secuenciaCampo;
	}

	@Column(name = "IdFormato", nullable = false)
	public int getIdFormato() {
		return this.idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	@Column(name = "SecuenciaCampo", nullable = false)
	public int getSecuenciaCampo() {
		return this.secuenciaCampo;
	}

	public void setSecuenciaCampo(int secuenciaCampo) {
		this.secuenciaCampo = secuenciaCampo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SsHcFormatoCampoId))
			return false;
		SsHcFormatoCampoId castOther = (SsHcFormatoCampoId) other;

		return (this.getIdFormato() == castOther.getIdFormato())
				&& (this.getSecuenciaCampo() == castOther.getSecuenciaCampo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFormato();
		result = 37 * result + this.getSecuenciaCampo();
		return result;
	}

}
