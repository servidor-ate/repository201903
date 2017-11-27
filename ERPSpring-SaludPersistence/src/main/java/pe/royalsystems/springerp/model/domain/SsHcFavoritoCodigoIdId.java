package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SsHcFavoritoCodigoIdId implements java.io.Serializable {

	private int idFavorito;
	private int campoCodigoId;

	public SsHcFavoritoCodigoIdId() {
	}

	public SsHcFavoritoCodigoIdId(int idFavorito, int campoCodigoId) {
		this.idFavorito = idFavorito;
		this.campoCodigoId = campoCodigoId;
	}

	@Column(name = "IdFavorito", nullable = false)
	public int getIdFavorito() {
		return this.idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	@Column(name = "CampoCodigoId", nullable = false)
	public int getCampoCodigoId() {
		return this.campoCodigoId;
	}

	public void setCampoCodigoId(int campoCodigoId) {
		this.campoCodigoId = campoCodigoId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SsHcFavoritoCodigoIdId))
			return false;
		SsHcFavoritoCodigoIdId castOther = (SsHcFavoritoCodigoIdId) other;

		return (this.getIdFavorito() == castOther.getIdFavorito())
				&& (this.getCampoCodigoId() == castOther.getCampoCodigoId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFavorito();
		result = 37 * result + this.getCampoCodigoId();
		return result;
	}

}
