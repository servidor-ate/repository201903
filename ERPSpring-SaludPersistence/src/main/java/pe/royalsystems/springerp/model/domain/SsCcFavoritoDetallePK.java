package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SS_CC_FavoritoDetalle database table.
 * 
 */
@Embeddable
public class SsCcFavoritoDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private Integer idFavorito;
	private Integer secuencia;

	public SsCcFavoritoDetallePK() {
	}

	@Column(name="IdFavorito")
	public Integer getIdFavorito() {
		return this.idFavorito;
	}
	public void setIdFavorito(Integer idFavorito) {
		this.idFavorito = idFavorito;
	}

	@Column(name="Secuencia")
	public Integer getSecuencia() {
		return this.secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SsCcFavoritoDetallePK)) {
			return false;
		}
		SsCcFavoritoDetallePK castOther = (SsCcFavoritoDetallePK)other;
		return 
			(this.idFavorito == castOther.idFavorito)
			&& (this.secuencia == castOther.secuencia);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idFavorito;
		hash = hash * prime + this.secuencia;
		
		return hash;
	}
}