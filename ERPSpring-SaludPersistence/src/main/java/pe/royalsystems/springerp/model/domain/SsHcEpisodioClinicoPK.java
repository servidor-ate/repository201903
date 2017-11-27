package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by realsystems on 29/08/2015.
 */
public class SsHcEpisodioClinicoPK implements Serializable {
    private String unidadReplicacion;
    private int idPaciente;
    private int episodioClinico;

    @Column(name = "UnidadReplicacion", nullable = false, insertable = true, updatable = true, length = 4)
    @Id
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    @Column(name = "IdPaciente", nullable = false, insertable = true, updatable = true)
    @Id
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Column(name = "EpisodioClinico", nullable = false, insertable = true, updatable = true)
    @Id
    public int getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(int episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcEpisodioClinicoPK that = (SsHcEpisodioClinicoPK) o;

        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        return result;
    }
}
