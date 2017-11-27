package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SS_AD_OrdenAtencionDetalle database table.
 * 
 */
@Embeddable
public class SsAdOrdenAtencionDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private Integer idOrdenAtencion;
	private Integer linea;

	public SsAdOrdenAtencionDetallePK() {
	}

	@Column(name="IdOrdenAtencion")
	public Integer getIdOrdenAtencion() {
		return this.idOrdenAtencion;
	}
	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}

	@Column(name="Linea")
	public Integer getLinea() {
		return this.linea;
	}
	public void setLinea(Integer linea) {
		this.linea = linea;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SsAdOrdenAtencionDetallePK)) {
			return false;
		}
		SsAdOrdenAtencionDetallePK castOther = (SsAdOrdenAtencionDetallePK)other;
		return 
			(this.idOrdenAtencion == castOther.idOrdenAtencion)
			&& (this.linea == castOther.linea);
	}

	public int hashCode() {
		final Integer prime = 31;
		int hash = 17;
		hash = hash * prime + this.idOrdenAtencion;
		hash = hash * prime + this.linea;
		
		return hash;
	}
}