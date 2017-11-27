package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 30/09/2015.
 */
public class SsHcEpisodioAtencionMasterPK implements Serializable {
    private String unidadReplicacion;

    @Column(name = "UnidadReplicacion", nullable = false, insertable = true, updatable = true, length = 4)
    @Id
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    private Integer idPaciente;

    @Column(name = "IdPaciente", nullable = false, insertable = true, updatable = true)
    @Id
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    private Integer episodioClinico;

    @Column(name = "EpisodioClinico", nullable = false, insertable = true, updatable = true)
    @Id
    public Integer getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(Integer episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    private Long episodioAtencion;

    @Column(name = "EpisodioAtencion", nullable = false, insertable = true, updatable = true)
    @Id
    public Long getEpisodioAtencion() {
        return episodioAtencion;
    }

    public void setEpisodioAtencion(Long episodioAtencion) {
        this.episodioAtencion = episodioAtencion;
    }


}
