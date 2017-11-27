package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MAMANIA on 30/08/2015.
 */
@Entity
@Table(name = "SS_HC_Anamnesis_EA_Sintoma")
@IdClass(SsHcAnamnesisEaSintomaPK.class)
public class SsHcAnamnesisEaSintoma extends Entidad implements Serializable {
    private String unidadReplicacion;
    private long idEpisodioAtencion;
    private int idPaciente;
    private int episodioClinico;
    private int secuencia;
    private Integer idCiap2;
    private String accion;
    private String version;

    @Id
    @Column(name = "UnidadReplicacion")
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    @Id
    @Column(name = "IdEpisodioAtencion")
    public long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    @Id
    @Column(name = "IdPaciente")
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Id
    @Column(name = "EpisodioClinico")
    public int getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(int episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Id
    @Column(name = "Secuencia")
    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    @Basic
    @Column(name = "IdCIAP2")
    public Integer getIdCiap2() {
        return idCiap2;
    }

    public void setIdCiap2(Integer idCiap2) {
        this.idCiap2 = idCiap2;
    }

    @Basic
    @Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcAnamnesisEaSintoma that = (SsHcAnamnesisEaSintoma) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (secuencia != that.secuencia) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;
        if (idCiap2 != null ? !idCiap2.equals(that.idCiap2) : that.idCiap2 != null) return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
        return !(version != null ? !version.equals(that.version) : that.version != null);

    }

    @Override
    public int hashCode() {
        int result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + (int) (idEpisodioAtencion ^ (idEpisodioAtencion >>> 32));
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        result = 31 * result + secuencia;
        result = 31 * result + (idCiap2 != null ? idCiap2.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
