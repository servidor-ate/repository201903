package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SS_HC_ExamenSolicitadoInforme database table.
 * 
 */
@Embeddable
public class SsHcExamenSolicitadoInformePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final Long serialVersionUID = 1L;
	private String unidadReplicacion;
	private Long idEpisodioAtencion;
	private Integer idPaciente;
	private Integer episodioClinico;
	private Integer secuencia;
	private Integer secuenciaInforme;

	public SsHcExamenSolicitadoInformePK() {
	}

	@Column(name="UnidadReplicacion")
	public String getUnidadReplicacion() {
		return this.unidadReplicacion;
	}
	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}

	@Column(name="IdEpisodioAtencion")
	public Long getIdEpisodioAtencion() {
		return this.idEpisodioAtencion;
	}
	public void setIdEpisodioAtencion(Long idEpisodioAtencion) {
		this.idEpisodioAtencion = idEpisodioAtencion;
	}

	@Column(name="IdPaciente")
	public Integer getIdPaciente() {
		return this.idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	@Column(name="EpisodioClinico")
	public Integer getEpisodioClinico() {
		return this.episodioClinico;
	}
	public void setEpisodioClinico(Integer episodioClinico) {
		this.episodioClinico = episodioClinico;
	}

	@Column(name="Secuencia")
	public Integer getSecuencia() {
		return this.secuencia;
	}
	public void setSecuencia(Integer secuencia) {
		this.secuencia = secuencia;
	}

	@Column(name="SecuenciaInforme")
	public Integer getSecuenciaInforme() {
		return this.secuenciaInforme;
	}
	public void setSecuenciaInforme(Integer secuenciaInforme) {
		this.secuenciaInforme = secuenciaInforme;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SsHcExamenSolicitadoInformePK)) {
			return false;
		}
		SsHcExamenSolicitadoInformePK castOther = (SsHcExamenSolicitadoInformePK)other;
		return 
			this.unidadReplicacion.equals(castOther.unidadReplicacion)
			&& (this.idEpisodioAtencion == castOther.idEpisodioAtencion)
			&& (this.idPaciente == castOther.idPaciente)
			&& (this.episodioClinico == castOther.episodioClinico)
			&& (this.secuencia == castOther.secuencia)
			&& (this.secuenciaInforme == castOther.secuenciaInforme);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.unidadReplicacion.hashCode();
		hash = hash * prime + ((int) (this.idEpisodioAtencion ^ (this.idEpisodioAtencion >>> 32)));
		hash = hash * prime + this.idPaciente;
		hash = hash * prime + this.episodioClinico;
		hash = hash * prime + this.secuencia;
		hash = hash * prime + this.secuenciaInforme;
		
		return hash;
	}
}