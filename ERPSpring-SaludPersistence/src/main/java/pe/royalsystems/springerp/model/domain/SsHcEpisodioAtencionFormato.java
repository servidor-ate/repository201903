package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by mamania on 27/04/2017.
 */
@Entity
@Table(name = "SS_HC_EpisodioAtencionFormato")
@IdClass(SsHcEpisodioAtencionFormatoPK.class)
public class SsHcEpisodioAtencionFormato  extends Entidad {
    private String unidadReplicacion;
    private long idEpisodioAtencion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Integer idTransacciones;
    private String idDocumento;
    private Integer idOpcion;
    private Integer idForm;
    private String conceptoFormulario;
    private Integer estado;
    private String usuarioCreacion;
    private  Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;

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
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Id
    @Column(name = "EpisodioClinico")
    public Integer getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(int episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Id
    @Column(name = "IdTransacciones")
    public Integer getIdTransacciones() {
        return idTransacciones;
    }

    public void setIdTransacciones(int idTransacciones) {
        this.idTransacciones = idTransacciones;
    }

    @Id
    @Column(name = "IdDocumento")
    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Basic
    @Column(name = "IdOpcion")
    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    @Basic
    @Column(name = "IdForm")
    public Integer getIdForm() {
        return idForm;
    }

    public void setIdForm(Integer idForm) {
        this.idForm = idForm;
    }

    @Basic
    @Column(name = "ConceptoFormulario")
    public String getConceptoFormulario() {
        return conceptoFormulario;
    }

    public void setConceptoFormulario(String conceptoFormulario) {
        this.conceptoFormulario = conceptoFormulario;
    }

    @Basic
    @Column(name = "Estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "UsuarioCreacion")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Basic
    @Column(name = "FechaCreacion")
    public  Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion( Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "UsuarioModificacion")
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Basic
    @Column(name = "FechaModificacion")
    public  Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion( Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsHcEpisodioAtencionFormato that = (SsHcEpisodioAtencionFormato) o;

        if (idEpisodioAtencion != that.idEpisodioAtencion) return false;
        if (idPaciente != that.idPaciente) return false;
        if (episodioClinico != that.episodioClinico) return false;
        if (idTransacciones != that.idTransacciones) return false;
        if (unidadReplicacion != null ? !unidadReplicacion.equals(that.unidadReplicacion) : that.unidadReplicacion != null)
            return false;
        if (idDocumento != null ? !idDocumento.equals(that.idDocumento) : that.idDocumento != null) return false;
        if (idOpcion != null ? !idOpcion.equals(that.idOpcion) : that.idOpcion != null) return false;
        if (idForm != null ? !idForm.equals(that.idForm) : that.idForm != null) return false;
        if (conceptoFormulario != null ? !conceptoFormulario.equals(that.conceptoFormulario) : that.conceptoFormulario != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (usuarioCreacion != null ? !usuarioCreacion.equals(that.usuarioCreacion) : that.usuarioCreacion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (usuarioModificacion != null ? !usuarioModificacion.equals(that.usuarioModificacion) : that.usuarioModificacion != null)
            return false;
        if (fechaModificacion != null ? !fechaModificacion.equals(that.fechaModificacion) : that.fechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        Integer result = unidadReplicacion != null ? unidadReplicacion.hashCode() : 0;
        result = 31 * result + (int) (idEpisodioAtencion ^ (idEpisodioAtencion >>> 32));
        result = 31 * result + idPaciente;
        result = 31 * result + episodioClinico;
        result = 31 * result + idTransacciones;
        result = 31 * result + (idDocumento != null ? idDocumento.hashCode() : 0);
        result = 31 * result + (idOpcion != null ? idOpcion.hashCode() : 0);
        result = 31 * result + (idForm != null ? idForm.hashCode() : 0);
        result = 31 * result + (conceptoFormulario != null ? conceptoFormulario.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        return result;
    }
}
