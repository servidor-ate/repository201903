package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by mamania on 23/11/2015.
 */
@Entity
@javax.persistence.Table(name = "SS_GE_ComponentePrestacion")
public class SsGeComponentePrestacion extends Entidad{
    private String componente;

    @Id
    @javax.persistence.Column(name = "Componente")
    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    private String codigoSegus;

    @Basic
    @javax.persistence.Column(name = "CodigoSegus")
    public String getCodigoSegus() {
        return codigoSegus;
    }

    public void setCodigoSegus(String codigoSegus) {
        this.codigoSegus = codigoSegus;
    }

    private String codigoNuevo;

    @Basic
    @javax.persistence.Column(name = "CodigoNuevo")
    public String getCodigoNuevo() {
        return codigoNuevo;
    }

    public void setCodigoNuevo(String codigoNuevo) {
        this.codigoNuevo = codigoNuevo;
    }

    private Integer unidadMedida;

    @Basic
    @javax.persistence.Column(name = "UnidadMedida")
    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    private BigDecimal valorMedida;

    @Basic
    @javax.persistence.Column(name = "ValorMedida")
    public BigDecimal getValorMedida() {
        return valorMedida;
    }

    public void setValorMedida(BigDecimal valorMedida) {
        this.valorMedida = valorMedida;
    }

    private BigDecimal cantidadAsistentes;

    @Basic
    @javax.persistence.Column(name = "CantidadAsistentes")
    public BigDecimal getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(BigDecimal cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    private Integer instrumentistas;

    @Basic
    @javax.persistence.Column(name = "Instrumentistas")
    public Integer getInstrumentistas() {
        return instrumentistas;
    }

    public void setInstrumentistas(Integer instrumentistas) {
        this.instrumentistas = instrumentistas;
    }

    private BigDecimal diasHospitalizacion;

    @Basic
    @javax.persistence.Column(name = "DiasHospitalizacion")
    public BigDecimal getDiasHospitalizacion() {
        return diasHospitalizacion;
    }

    public void setDiasHospitalizacion(BigDecimal diasHospitalizacion) {
        this.diasHospitalizacion = diasHospitalizacion;
    }

    private Integer indicadorImpuesto;

    @Basic
    @javax.persistence.Column(name = "IndicadorImpuesto")
    public Integer getIndicadorImpuesto() {
        return indicadorImpuesto;
    }

    public void setIndicadorImpuesto(Integer indicadorImpuesto) {
        this.indicadorImpuesto = indicadorImpuesto;
    }

    private Integer indicadorReemplazo;

    @Basic
    @javax.persistence.Column(name = "IndicadorReemplazo")
    public Integer getIndicadorReemplazo() {
        return indicadorReemplazo;
    }

    public void setIndicadorReemplazo(Integer indicadorReemplazo) {
        this.indicadorReemplazo = indicadorReemplazo;
    }

    private Integer indicadorEps;

    @Basic
    @javax.persistence.Column(name = "IndicadorEps")
    public Integer getIndicadorEps() {
        return indicadorEps;
    }

    public void setIndicadorEps(Integer indicadorEps) {
        this.indicadorEps = indicadorEps;
    }

    private Integer indicadorCita;

    @Basic
    @javax.persistence.Column(name = "IndicadorCita")
    public Integer getIndicadorCita() {
        return indicadorCita;
    }

    public void setIndicadorCita(Integer indicadorCita) {
        this.indicadorCita = indicadorCita;
    }

    private String centroCosto;

    @Basic
    @javax.persistence.Column(name = "CentroCosto")
    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    private Integer formularioInforme;

    @Basic
    @javax.persistence.Column(name = "FormularioInforme")
    public Integer getFormularioInforme() {
        return formularioInforme;
    }

    public void setFormularioInforme(Integer formularioInforme) {
        this.formularioInforme = formularioInforme;
    }

    private Integer estado;

    @Basic
    @javax.persistence.Column(name = "Estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    private String usuarioCreacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioCreacion")
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    private Timestamp fechaCreacion;

    @Basic
    @javax.persistence.Column(name = "FechaCreacion")
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    private String usuarioModificacion;

    @Basic
    @javax.persistence.Column(name = "UsuarioModificacion")
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    private Timestamp fechaModificacion;

    @Basic
    @javax.persistence.Column(name = "FechaModificacion")
    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    private Integer formularioInformeAnastesiologo;

    @Basic
    @javax.persistence.Column(name = "FormularioInformeAnastesiologo")
    public Integer getFormularioInformeAnastesiologo() {
        return formularioInformeAnastesiologo;
    }

    public void setFormularioInformeAnastesiologo(Integer formularioInformeAnastesiologo) {
        this.formularioInformeAnastesiologo = formularioInformeAnastesiologo;
    }

    private Integer tipoPrestacion;

    @Basic
    @javax.persistence.Column(name = "TipoPrestacion")
    public Integer getTipoPrestacion() {
        return tipoPrestacion;
    }

    public void setTipoPrestacion(Integer tipoPrestacion) {
        this.tipoPrestacion = tipoPrestacion;
    }

    private BigDecimal tiempoEjecucionExamen;

    @Basic
    @javax.persistence.Column(name = "TiempoEjecucionExamen")
    public BigDecimal getTiempoEjecucionExamen() {
        return tiempoEjecucionExamen;
    }

    public void setTiempoEjecucionExamen(BigDecimal tiempoEjecucionExamen) {
        this.tiempoEjecucionExamen = tiempoEjecucionExamen;
    }

    private Integer indicadorHc;

    @Basic
    @javax.persistence.Column(name = "IndicadorHC")
    public Integer getIndicadorHc() {
        return indicadorHc;
    }

    public void setIndicadorHc(Integer indicadorHc) {
        this.indicadorHc = indicadorHc;
    }

    private Integer indicadorConsentimiento;

    @Basic
    @javax.persistence.Column(name = "IndicadorConsentimiento")
    public Integer getIndicadorConsentimiento() {
        return indicadorConsentimiento;
    }

    public void setIndicadorConsentimiento(Integer indicadorConsentimiento) {
        this.indicadorConsentimiento = indicadorConsentimiento;
    }

    private Integer idAreaLaboratorio;

    @Basic
    @javax.persistence.Column(name = "IdAreaLaboratorio")
    public Integer getIdAreaLaboratorio() {
        return idAreaLaboratorio;
    }

    public void setIdAreaLaboratorio(Integer idAreaLaboratorio) {
        this.idAreaLaboratorio = idAreaLaboratorio;
    }

    private Integer indicadorBs;

    @Basic
    @javax.persistence.Column(name = "IndicadorBS")
    public Integer getIndicadorBs() {
        return indicadorBs;
    }

    public void setIndicadorBs(Integer indicadorBs) {
        this.indicadorBs = indicadorBs;
    }

    private Integer indicadorAfectoEmergencia;

    @Basic
    @javax.persistence.Column(name = "IndicadorAfectoEmergencia")
    public Integer getIndicadorAfectoEmergencia() {
        return indicadorAfectoEmergencia;
    }

    public void setIndicadorAfectoEmergencia(Integer indicadorAfectoEmergencia) {
        this.indicadorAfectoEmergencia = indicadorAfectoEmergencia;
    }

    private Integer indicadorEmergenciaMultiple;

    @Basic
    @javax.persistence.Column(name = "IndicadorEmergenciaMultiple")
    public Integer getIndicadorEmergenciaMultiple() {
        return indicadorEmergenciaMultiple;
    }

    public void setIndicadorEmergenciaMultiple(Integer indicadorEmergenciaMultiple) {
        this.indicadorEmergenciaMultiple = indicadorEmergenciaMultiple;
    }

    private Integer indicadorPrecioManual;

    @Basic
    @javax.persistence.Column(name = "IndicadorPrecioManual")
    public Integer getIndicadorPrecioManual() {
        return indicadorPrecioManual;
    }

    public void setIndicadorPrecioManual(Integer indicadorPrecioManual) {
        this.indicadorPrecioManual = indicadorPrecioManual;
    }

    private String codigoGrupo;

    @Basic
    @javax.persistence.Column(name = "CodigoGrupo")
    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    private Integer indicadorIncluyeConsulta;

    @Basic
    @javax.persistence.Column(name = "IndicadorIncluyeConsulta")
    public Integer getIndicadorIncluyeConsulta() {
        return indicadorIncluyeConsulta;
    }

    public void setIndicadorIncluyeConsulta(Integer indicadorIncluyeConsulta) {
        this.indicadorIncluyeConsulta = indicadorIncluyeConsulta;
    }

    private Integer indicadorPrestacionPrincipal;

    @Basic
    @javax.persistence.Column(name = "IndicadorPrestacionPrincipal")
    public Integer getIndicadorPrestacionPrincipal() {
        return indicadorPrestacionPrincipal;
    }

    public void setIndicadorPrestacionPrincipal(Integer indicadorPrestacionPrincipal) {
        this.indicadorPrestacionPrincipal = indicadorPrestacionPrincipal;
    }

    private Integer indicadorRequierePersonal;

    @Basic
    @javax.persistence.Column(name = "IndicadorRequierePersonal")
    public Integer getIndicadorRequierePersonal() {
        return indicadorRequierePersonal;
    }

    public void setIndicadorRequierePersonal(Integer indicadorRequierePersonal) {
        this.indicadorRequierePersonal = indicadorRequierePersonal;
    }

    private Integer indicadorPaquete;

    @Basic
    @javax.persistence.Column(name = "IndicadorPaquete")
    public Integer getIndicadorPaquete() {
        return indicadorPaquete;
    }

    public void setIndicadorPaquete(Integer indicadorPaquete) {
        this.indicadorPaquete = indicadorPaquete;
    }

    private Integer clasificacionComponente;

    @Basic
    @javax.persistence.Column(name = "ClasificacionComponente")
    public Integer getClasificacionComponente() {
        return clasificacionComponente;
    }

    public void setClasificacionComponente(Integer clasificacionComponente) {
        this.clasificacionComponente = clasificacionComponente;
    }

    private Integer estadoBkPrecisa;

    @Basic
    @javax.persistence.Column(name = "EstadoBkPrecisa")
    public Integer getEstadoBkPrecisa() {
        return estadoBkPrecisa;
    }

    public void setEstadoBkPrecisa(Integer estadoBkPrecisa) {
        this.estadoBkPrecisa = estadoBkPrecisa;
    }

    private int indicadorPreQuirurgico;

    @Basic
    @javax.persistence.Column(name = "IndicadorPreQuirurgico")
    public int getIndicadorPreQuirurgico() {
        return indicadorPreQuirurgico;
    }

    public void setIndicadorPreQuirurgico(int indicadorPreQuirurgico) {
        this.indicadorPreQuirurgico = indicadorPreQuirurgico;
    }

    private Integer indicadorPaquetePart;

    @Basic
    @javax.persistence.Column(name = "IndicadorPaquetePart")
    public Integer getIndicadorPaquetePart() {
        return indicadorPaquetePart;
    }

    public void setIndicadorPaquetePart(Integer indicadorPaquetePart) {
        this.indicadorPaquetePart = indicadorPaquetePart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SsGeComponentePrestacion that = (SsGeComponentePrestacion) o;

        if (indicadorPreQuirurgico != that.indicadorPreQuirurgico) return false;
        if (componente != null ? !componente.equals(that.componente) : that.componente != null) return false;
        if (codigoSegus != null ? !codigoSegus.equals(that.codigoSegus) : that.codigoSegus != null) return false;
        if (codigoNuevo != null ? !codigoNuevo.equals(that.codigoNuevo) : that.codigoNuevo != null) return false;
        if (unidadMedida != null ? !unidadMedida.equals(that.unidadMedida) : that.unidadMedida != null) return false;
        if (valorMedida != null ? !valorMedida.equals(that.valorMedida) : that.valorMedida != null) return false;
        if (cantidadAsistentes != null ? !cantidadAsistentes.equals(that.cantidadAsistentes) : that.cantidadAsistentes != null)
            return false;
        if (instrumentistas != null ? !instrumentistas.equals(that.instrumentistas) : that.instrumentistas != null)
            return false;
        if (diasHospitalizacion != null ? !diasHospitalizacion.equals(that.diasHospitalizacion) : that.diasHospitalizacion != null)
            return false;
        if (indicadorImpuesto != null ? !indicadorImpuesto.equals(that.indicadorImpuesto) : that.indicadorImpuesto != null)
            return false;
        if (indicadorReemplazo != null ? !indicadorReemplazo.equals(that.indicadorReemplazo) : that.indicadorReemplazo != null)
            return false;
        if (indicadorEps != null ? !indicadorEps.equals(that.indicadorEps) : that.indicadorEps != null) return false;
        if (indicadorCita != null ? !indicadorCita.equals(that.indicadorCita) : that.indicadorCita != null)
            return false;
        if (centroCosto != null ? !centroCosto.equals(that.centroCosto) : that.centroCosto != null) return false;
        if (formularioInforme != null ? !formularioInforme.equals(that.formularioInforme) : that.formularioInforme != null)
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
        if (formularioInformeAnastesiologo != null ? !formularioInformeAnastesiologo.equals(that.formularioInformeAnastesiologo) : that.formularioInformeAnastesiologo != null)
            return false;
        if (tipoPrestacion != null ? !tipoPrestacion.equals(that.tipoPrestacion) : that.tipoPrestacion != null)
            return false;
        if (tiempoEjecucionExamen != null ? !tiempoEjecucionExamen.equals(that.tiempoEjecucionExamen) : that.tiempoEjecucionExamen != null)
            return false;
        if (indicadorHc != null ? !indicadorHc.equals(that.indicadorHc) : that.indicadorHc != null) return false;
        if (indicadorConsentimiento != null ? !indicadorConsentimiento.equals(that.indicadorConsentimiento) : that.indicadorConsentimiento != null)
            return false;
        if (idAreaLaboratorio != null ? !idAreaLaboratorio.equals(that.idAreaLaboratorio) : that.idAreaLaboratorio != null)
            return false;
        if (indicadorBs != null ? !indicadorBs.equals(that.indicadorBs) : that.indicadorBs != null) return false;
        if (indicadorAfectoEmergencia != null ? !indicadorAfectoEmergencia.equals(that.indicadorAfectoEmergencia) : that.indicadorAfectoEmergencia != null)
            return false;
        if (indicadorEmergenciaMultiple != null ? !indicadorEmergenciaMultiple.equals(that.indicadorEmergenciaMultiple) : that.indicadorEmergenciaMultiple != null)
            return false;
        if (indicadorPrecioManual != null ? !indicadorPrecioManual.equals(that.indicadorPrecioManual) : that.indicadorPrecioManual != null)
            return false;
        if (codigoGrupo != null ? !codigoGrupo.equals(that.codigoGrupo) : that.codigoGrupo != null) return false;
        if (indicadorIncluyeConsulta != null ? !indicadorIncluyeConsulta.equals(that.indicadorIncluyeConsulta) : that.indicadorIncluyeConsulta != null)
            return false;
        if (indicadorPrestacionPrincipal != null ? !indicadorPrestacionPrincipal.equals(that.indicadorPrestacionPrincipal) : that.indicadorPrestacionPrincipal != null)
            return false;
        if (indicadorRequierePersonal != null ? !indicadorRequierePersonal.equals(that.indicadorRequierePersonal) : that.indicadorRequierePersonal != null)
            return false;
        if (indicadorPaquete != null ? !indicadorPaquete.equals(that.indicadorPaquete) : that.indicadorPaquete != null)
            return false;
        if (clasificacionComponente != null ? !clasificacionComponente.equals(that.clasificacionComponente) : that.clasificacionComponente != null)
            return false;
        if (estadoBkPrecisa != null ? !estadoBkPrecisa.equals(that.estadoBkPrecisa) : that.estadoBkPrecisa != null)
            return false;
        if (indicadorPaquetePart != null ? !indicadorPaquetePart.equals(that.indicadorPaquetePart) : that.indicadorPaquetePart != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = componente != null ? componente.hashCode() : 0;
        result = 31 * result + (codigoSegus != null ? codigoSegus.hashCode() : 0);
        result = 31 * result + (codigoNuevo != null ? codigoNuevo.hashCode() : 0);
        result = 31 * result + (unidadMedida != null ? unidadMedida.hashCode() : 0);
        result = 31 * result + (valorMedida != null ? valorMedida.hashCode() : 0);
        result = 31 * result + (cantidadAsistentes != null ? cantidadAsistentes.hashCode() : 0);
        result = 31 * result + (instrumentistas != null ? instrumentistas.hashCode() : 0);
        result = 31 * result + (diasHospitalizacion != null ? diasHospitalizacion.hashCode() : 0);
        result = 31 * result + (indicadorImpuesto != null ? indicadorImpuesto.hashCode() : 0);
        result = 31 * result + (indicadorReemplazo != null ? indicadorReemplazo.hashCode() : 0);
        result = 31 * result + (indicadorEps != null ? indicadorEps.hashCode() : 0);
        result = 31 * result + (indicadorCita != null ? indicadorCita.hashCode() : 0);
        result = 31 * result + (centroCosto != null ? centroCosto.hashCode() : 0);
        result = 31 * result + (formularioInforme != null ? formularioInforme.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (usuarioCreacion != null ? usuarioCreacion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (usuarioModificacion != null ? usuarioModificacion.hashCode() : 0);
        result = 31 * result + (fechaModificacion != null ? fechaModificacion.hashCode() : 0);
        result = 31 * result + (formularioInformeAnastesiologo != null ? formularioInformeAnastesiologo.hashCode() : 0);
        result = 31 * result + (tipoPrestacion != null ? tipoPrestacion.hashCode() : 0);
        result = 31 * result + (tiempoEjecucionExamen != null ? tiempoEjecucionExamen.hashCode() : 0);
        result = 31 * result + (indicadorHc != null ? indicadorHc.hashCode() : 0);
        result = 31 * result + (indicadorConsentimiento != null ? indicadorConsentimiento.hashCode() : 0);
        result = 31 * result + (idAreaLaboratorio != null ? idAreaLaboratorio.hashCode() : 0);
        result = 31 * result + (indicadorBs != null ? indicadorBs.hashCode() : 0);
        result = 31 * result + (indicadorAfectoEmergencia != null ? indicadorAfectoEmergencia.hashCode() : 0);
        result = 31 * result + (indicadorEmergenciaMultiple != null ? indicadorEmergenciaMultiple.hashCode() : 0);
        result = 31 * result + (indicadorPrecioManual != null ? indicadorPrecioManual.hashCode() : 0);
        result = 31 * result + (codigoGrupo != null ? codigoGrupo.hashCode() : 0);
        result = 31 * result + (indicadorIncluyeConsulta != null ? indicadorIncluyeConsulta.hashCode() : 0);
        result = 31 * result + (indicadorPrestacionPrincipal != null ? indicadorPrestacionPrincipal.hashCode() : 0);
        result = 31 * result + (indicadorRequierePersonal != null ? indicadorRequierePersonal.hashCode() : 0);
        result = 31 * result + (indicadorPaquete != null ? indicadorPaquete.hashCode() : 0);
        result = 31 * result + (clasificacionComponente != null ? clasificacionComponente.hashCode() : 0);
        result = 31 * result + (estadoBkPrecisa != null ? estadoBkPrecisa.hashCode() : 0);
        result = 31 * result + indicadorPreQuirurgico;
        result = 31 * result + (indicadorPaquetePart != null ? indicadorPaquetePart.hashCode() : 0);
        return result;
    }
}
