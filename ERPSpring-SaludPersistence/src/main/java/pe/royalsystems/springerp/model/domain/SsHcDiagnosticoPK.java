package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 10/05/2017.
 */
public class SsHcDiagnosticoPK implements Serializable {
    private String unidadReplicacion;
    private Long idEpisodioAtencion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Integer secuencia;

    @Column(name = "UnidadReplicacion")
    @Id
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    @Column(name = "IdEpisodioAtencion")
    @Id
    public Long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(Long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    @Column(name = "IdPaciente")
    @Id
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Column(name = "EpisodioClinico")
    @Id
    public Integer getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(Integer episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Column(name = "Secuencia")
    @Id
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcDiagnosticoPK that = (SsHcDiagnosticoPK) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (secuencia != that.secuencia) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;

        return true;
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
