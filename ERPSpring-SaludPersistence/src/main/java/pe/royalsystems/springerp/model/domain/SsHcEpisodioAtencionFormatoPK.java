package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 27/04/2017.
 */
public class SsHcEpisodioAtencionFormatoPK implements Serializable {
    private String unidadReplicacion;
    private long idEpisodioAtencion;
    private int idPaciente;
    private int episodioClinico;
    private int idTransacciones;
    private String idDocumento;

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
    public long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    @Column(name = "IdPaciente")
    @Id
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Column(name = "EpisodioClinico")
    @Id
    public int getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(int episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Column(name = "IdTransacciones")
    @Id
    public int getIdTransacciones() {
        return idTransacciones;
    }

    public void setIdTransacciones(int idTransacciones) {
        this.idTransacciones = idTransacciones;
    }

    @Column(name = "IdDocumento")
    @Id
    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcEpisodioAtencionFormatoPK that = (SsHcEpisodioAtencionFormatoPK) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (idTransacciones != that.idTransacciones) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;
        if (idDocumento != null ? !idDocumento.equals(that.idDocumento) : that.idDocumento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + (int) (idEpisodioAtencion ^ (idEpisodioAtencion >>> 32));
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        result = 31 * result + idTransacciones;
        result = 31 * result + (idDocumento != null ? idDocumento.hashCode() : 0);
        return result;
    }
}
