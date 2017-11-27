package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created by mamania on 06/12/2016.
 */
@Entity
@Table(name="CorrelativosMast")
public class CorrelativosMast extends Entidad {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CorrelativosMastPK id;
    private String descripcion;
    private Integer correlativoNumero;
    private Integer correlativoDesde;
    private Integer correlativoHasta;
    private String almacenCodigo;
    private String estado;
    private String ultimoUsuario;
    private Date ultimaFechaModif;
    
    private String impresora;
    /*
    private String impresoraFlag;
    
    private String datawindowObjeto;
    private String feFlag;
    private String feTipoComprobanteRef;
    private String feEnvio;
    */
    
    public CorrelativosMast() {
		id = new CorrelativosMastPK();
	}

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "CorrelativoNumero")
    public Integer getCorrelativoNumero() {
        return correlativoNumero;
    }

    public void setCorrelativoNumero(Integer correlativoNumero) {
        this.correlativoNumero = correlativoNumero;
    }

    @Basic
    @Column(name = "CorrelativoDesde")
    public Integer getCorrelativoDesde() {
        return correlativoDesde;
    }

    public void setCorrelativoDesde(Integer correlativoDesde) {
        this.correlativoDesde = correlativoDesde;
    }

    @Basic
    @Column(name = "CorrelativoHasta")
    public Integer getCorrelativoHasta() {
        return correlativoHasta;
    }

    public void setCorrelativoHasta(Integer correlativoHasta) {
        this.correlativoHasta = correlativoHasta;
    }

    @Basic
    @Column(name = "AlmacenCodigo")
    public String getAlmacenCodigo() {
        return almacenCodigo;
    }

    public void setAlmacenCodigo(String almacenCodigo) {
        this.almacenCodigo = almacenCodigo;
    }

    @Basic
    @Column(name = "Estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "UltimoUsuario")
    public String getUltimoUsuario() {
        return ultimoUsuario;
    }

    public void setUltimoUsuario(String ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }

    @Basic
    @Column(name = "UltimaFechaModif")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUltimaFechaModif() {
        return ultimaFechaModif;
    }

    public void setUltimaFechaModif(Date ultimaFechaModif) {
        this.ultimaFechaModif = ultimaFechaModif;
    }

    @Basic
    @Column(name = "Impresora")
    public String getImpresora() {
        return impresora;
    }

    public void setImpresora(String impresora) {
        this.impresora = impresora;
    }
    /*
    @Basic
    @Column(name = "ImpresoraFlag")
    public String getImpresoraFlag() {
        return impresoraFlag;
    }

    public void setImpresoraFlag(String impresoraFlag) {
        this.impresoraFlag = impresoraFlag;
    }



    @Basic
    @Column(name = "DatawindowObjeto")
    public String getDatawindowObjeto() {
        return datawindowObjeto;
    }

    public void setDatawindowObjeto(String datawindowObjeto) {
        this.datawindowObjeto = datawindowObjeto;
    }

    @Basic
    @Column(name = "FEFlag")
    public String getFeFlag() {
        return feFlag;
    }

    public void setFeFlag(String feFlag) {
        this.feFlag = feFlag;
    }

    @Basic
    @Column(name = "FETipoComprobanteRef")
    public String getFeTipoComprobanteRef() {
        return feTipoComprobanteRef;
    }

    public void setFeTipoComprobanteRef(String feTipoComprobanteRef) {
        this.feTipoComprobanteRef = feTipoComprobanteRef;
    }

    @Basic
    @Column(name = "FEEnvio")
    public String getFeEnvio() {
        return feEnvio;
    }

    public void setFeEnvio(String feEnvio) {
        this.feEnvio = feEnvio;
    }
	*/
	public CorrelativosMastPK getId() {
		return id;
	}

	public void setId(CorrelativosMastPK id) {
		this.id = id;
	}

    

}
