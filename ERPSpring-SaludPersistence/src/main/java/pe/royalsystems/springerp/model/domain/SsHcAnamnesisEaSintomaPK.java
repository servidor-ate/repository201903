package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by MAMANIA on 30/08/2015.
 */
public class SsHcAnamnesisEaSintomaPK implements Serializable {
    private String unidadReplicacion;

    @Column(name = "UnidadReplicacion")
    @Id
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    private long idEpisodioAtencion;

    @Column(name = "IdEpisodioAtencion")
    @Id
    public long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    private int idPaciente;

    @Column(name = "IdPaciente")
    @Id
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    private int episodioClinico;

    @Column(name = "EpisodioClinico")
    @Id
    public int getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(int episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    private int secuencia;

    @Column(name = "Secuencia")
    @Id
    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcAnamnesisEaSintomaPK that = (SsHcAnamnesisEaSintomaPK) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (secuencia != that.secuencia) return false;
        return !(unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null);

    }

    @Override
    public int hashCode() {
        int result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + (int) (idEpisodioAtencion ^ (idEpisodioAtencion >>> 32));
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        result = 31 * result + secuencia;
        return result;
    }
}
