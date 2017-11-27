package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mamania on 04/10/2016.
 */
@Entity
@Table(name = "SS_GE_EspecialidadMedico")
public class SsGeEspecialidadMedico extends Entidad{

	private static final long serialVersionUID = 1L;
	
	private Integer idEspecialidad;
    private Integer idMedico;
    private Integer tipoGeneracionCita;
    private BigDecimal tiempoPromedioAtencion;
    private Integer indicadorMaximoConsulta;
    private Integer valorMaximoConsulta;
    private String numeroRegistroEspecialidad;
    private Integer indicadorFormaPago;
    private Integer idEmpresaMedico;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;
    private Integer indicadorEmergencia;
    private Integer indicadorformapagoEme;
    private Integer idempresamedicoEme;

    @Id
    @Basic
    @Column(name = "IdEspecialidad")
    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Id
    @Basic
    @Column(name = "IdMedico")
    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    @Basic
    @Column(name = "TipoGeneracionCita")
    public Integer getTipoGeneracionCita() {
        return tipoGeneracionCita;
    }

    public void setTipoGeneracionCita(Integer tipoGeneracionCita) {
        this.tipoGeneracionCita = tipoGeneracionCita;
    }

    @Basic
    @Column(name = "TiempoPromedioAtencion")
    public BigDecimal getTiempoPromedioAtencion() {
        return tiempoPromedioAtencion;
    }

    public void setTiempoPromedioAtencion(BigDecimal tiempoPromedioAtencion) {
        this.tiempoPromedioAtencion = tiempoPromedioAtencion;
    }

    @Basic
    @Column(name = "IndicadorMaximoConsulta")
    public Integer getIndicadorMaximoConsulta() {
        return indicadorMaximoConsulta;
    }

    public void setIndicadorMaximoConsulta(Integer indicadorMaximoConsulta) {
        this.indicadorMaximoConsulta = indicadorMaximoConsulta;
    }

    @Basic
    @Column(name = "ValorMaximoConsulta")
    public Integer getValorMaximoConsulta() {
        return valorMaximoConsulta;
    }

    public void setValorMaximoConsulta(Integer valorMaximoConsulta) {
        this.valorMaximoConsulta = valorMaximoConsulta;
    }

    @Basic
    @Column(name = "NumeroRegistroEspecialidad")
    public String getNumeroRegistroEspecialidad() {
        return numeroRegistroEspecialidad;
    }

    public void setNumeroRegistroEspecialidad(String numeroRegistroEspecialidad) {
        this.numeroRegistroEspecialidad = numeroRegistroEspecialidad;
    }

    @Basic
    @Column(name = "IndicadorFormaPago")
    public Integer getIndicadorFormaPago() {
        return indicadorFormaPago;
    }

    public void setIndicadorFormaPago(Integer indicadorFormaPago) {
        this.indicadorFormaPago = indicadorFormaPago;
    }

    @Basic
    @Column(name = "IdEmpresaMedico")
    public Integer getIdEmpresaMedico() {
        return idEmpresaMedico;
    }

    public void setIdEmpresaMedico(Integer idEmpresaMedico) {
        this.idEmpresaMedico = idEmpresaMedico;
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
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
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
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Basic
    @Column(name = "IndicadorEmergencia")
    public Integer getIndicadorEmergencia() {
        return indicadorEmergencia;
    }

    public void setIndicadorEmergencia(Integer indicadorEmergencia) {
        this.indicadorEmergencia = indicadorEmergencia;
    }

    @Basic
    @Column(name = "indicadorformapagoEme")
    public Integer getIndicadorformapagoEme() {
        return indicadorformapagoEme;
    }

    public void setIndicadorformapagoEme(Integer indicadorformapagoEme) {
        this.indicadorformapagoEme = indicadorformapagoEme;
    }

    @Basic
    @Column(name = "idempresamedicoEme")
    public Integer getIdempresamedicoEme() {
        return idempresamedicoEme;
    }

    public void setIdempresamedicoEme(Integer idempresamedicoEme) {
        this.idempresamedicoEme = idempresamedicoEme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsGeEspecialidadMedico that = (SsGeEspecialidadMedico) o;

        if (idEspecialidad != that.idEspecialidad) return false;
        if (idMedico != that.idMedico) return false;
        if (tipoGeneracionCita != null ? !tipoGeneracionCita.equals(that.tipoGeneracionCita) : that.tipoGeneracionCita != null)
            return false;
        if (tiempoPromedioAtencion != null ? !tiempoPromedioAtencion.equals(that.tiempoPromedioAtencion) : that.tiempoPromedioAtencion != null)
            return false;
        if (indicadorMaximoConsulta != null ? !indicadorMaximoConsulta.equals(that.indicadorMaximoConsulta) : that.indicadorMaximoConsulta != null)
            return false;
        if (valorMaximoConsulta != null ? !valorMaximoConsulta.equals(that.valorMaximoConsulta) : that.valorMaximoConsulta != null)
            return false;
        if (numeroRegistroEspecialidad != null ? !numeroRegistroEspecialidad.equals(that.numeroRegistroEspecialidad) : that.numeroRegistroEspecialidad != null)
            return false;
        if (indicadorFormaPago != null ? !indicadorFormaPago.equals(that.indicadorFormaPago) : that.indicadorFormaPago != null)
            return false;
        if (idEmpresaMedico != null ? !idEmpresaMedico.equals(that.idEmpresaMedico) : that.idEmpresaMedico != null)
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
        if (indicadorEmergencia != null ? !indicadorEmergencia.equals(that.indicadorEmergencia) : that.indicadorEmergencia != null)
            return false;
        if (indicadorformapagoEme != null ? !indicadorformapagoEme.equals(that.indicadorformapagoEme) : that.indicadorformapagoEme != null)
            return false;
        if (idempresamedicoEme != null ? !idempresamedicoEme.equals(that.idempresamedicoEme) : that.idempresamedicoEme != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEspecialidad;
        result = 31 * result + idMedico;
        result = 31 * result + (tipoGeneracionCita != null ? tipoGeneracionCita.hashCode() : 0);
        result = 31 * result + (tiempoPromedioAtencion != null ? tiempoPromedioAtencion.hashCode() : 0);
        result = 31 * result + (indicadorMaximoConsulta != null ? indicadorMaximoConsulta.hashCode() : 0);
        result = 31 * result + (valorMaximoConsulta != null ? valorMaximoConsulta.hashCode() : 0);
        result = 31 * result + (numeroRegistroEspecialidad != null ? numeroRegistroEspecialidad.hashCode() : 0);
        result = 31 * result + (indicadorFormaPago != null ? indicadorFormaPago.hashCode() : 0);
        result = 31 * result + (idEmpresaMedico != null ? idEmpresaMedico.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (indicadorEmergencia != null ? indicadorEmergencia.hashCode() : 0);
        result = 31 * result + (indicadorformapagoEme != null ? indicadorformapagoEme.hashCode() : 0);
        result = 31 * result + (idempresamedicoEme != null ? idempresamedicoEme.hashCode() : 0);
        return result;
    }
}
