package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mamania on 16/05/2017.
 */
@Entity
@Table(name = "SS_HC_Obligacion")
public class SsHcObligacion  extends Entidad implements java.io.Serializable {
    private Integer oblobligacionid;
    private String compania;
    private String sucursal;
    private Integer persona;
    private String oblflagtipopersona;
    private String oblperiodocobranza;
    private Date oblfechaemision;
    private Date oblfechavencimiento;
    private Date oblfechacobranza;
    private Integer oblpagoxbancoflag;
    private BigDecimal oblcmora;
    private BigDecimal oblcdescuento;
    private BigDecimal oblcmontototal;
    private Integer oblcnrocuota;
    private String monedadocumento;
    private String tipodocumento;
    private String numerodocumento;
    private Integer seriedocumento;
    private Integer lineadocumento;
    private String cuentabancaria;
    private Integer oblcusuariocreacion;
    private Date oblcfechacreacion;
    private String oblcipcreacion;
    private Integer oblcultimousuario;
    private Date oblcultimafechamodif;
    private String oblcultimoip;
    private Integer oblcestado;

    private BigDecimal oblcmontopagado;
    
    
    private String unidadReplicacion;
    private Integer idCita;
    private String codigoOA;
    private Integer idOrdenAtencion;
    private Integer lineaOrdenAtencion;
    

    
    
    @Id
    @Column(name = "Oblobligacionid")
    public Integer getOblobligacionid() {
        return oblobligacionid;
    }

    public void setOblobligacionid(Integer oblobligacionid) {
        this.oblobligacionid = oblobligacionid;
    }

    @Basic
    @Column(name = "Compania")
    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Basic
    @Column(name = "Sucursal")
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Basic
    @Column(name = "Persona")
    public Integer getPersona() {
        return persona;
    }

    public void setPersona(Integer persona) {
        this.persona = persona;
    }

    @Basic
    @Column(name = "Oblflagtipopersona")
    public String getOblflagtipopersona() {
        return oblflagtipopersona;
    }

    public void setOblflagtipopersona(String oblflagtipopersona) {
        this.oblflagtipopersona = oblflagtipopersona;
    }

    @Basic
    @Column(name = "Oblperiodocobranza")
    public String getOblperiodocobranza() {
        return oblperiodocobranza;
    }

    public void setOblperiodocobranza(String oblperiodocobranza) {
        this.oblperiodocobranza = oblperiodocobranza;
    }

    @Basic
    @Column(name = "Oblfechaemision")
    public Date getOblfechaemision() {
        return oblfechaemision;
    }

    public void setOblfechaemision(Date oblfechaemision) {
        this.oblfechaemision = oblfechaemision;
    }

    @Basic
    @Column(name = "Oblfechavencimiento")
    public Date getOblfechavencimiento() {
        return oblfechavencimiento;
    }

    public void setOblfechavencimiento(Date oblfechavencimiento) {
        this.oblfechavencimiento = oblfechavencimiento;
    }

    @Basic
    @Column(name = "Oblfechacobranza")
    public Date getOblfechacobranza() {
        return oblfechacobranza;
    }

    public void setOblfechacobranza(Date oblfechacobranza) {
        this.oblfechacobranza = oblfechacobranza;
    }

    @Basic
    @Column(name = "Oblpagoxbancoflag")
    public Integer getOblpagoxbancoflag() {
        return oblpagoxbancoflag;
    }

    public void setOblpagoxbancoflag(Integer oblpagoxbancoflag) {
        this.oblpagoxbancoflag = oblpagoxbancoflag;
    }

    @Basic
    @Column(name = "Oblcmora")
    public BigDecimal getOblcmora() {
        return oblcmora;
    }

    public void setOblcmora(BigDecimal oblcmora) {
        this.oblcmora = oblcmora;
    }

    @Basic
    @Column(name = "Oblcdescuento")
    public BigDecimal getOblcdescuento() {
        return oblcdescuento;
    }

    public void setOblcdescuento(BigDecimal oblcdescuento) {
        this.oblcdescuento = oblcdescuento;
    }

    @Basic
    @Column(name = "Oblcmontototal")
    public BigDecimal getOblcmontototal() {
        return oblcmontototal;
    }

    public void setOblcmontototal(BigDecimal oblcmontototal) {
        this.oblcmontototal = oblcmontototal;
    }

    @Basic
    @Column(name = "Oblcnrocuota")
    public Integer getOblcnrocuota() {
        return oblcnrocuota;
    }

    public void setOblcnrocuota(Integer oblcnrocuota) {
        this.oblcnrocuota = oblcnrocuota;
    }

    @Basic
    @Column(name = "Monedadocumento")
    public String getMonedadocumento() {
        return monedadocumento;
    }

    public void setMonedadocumento(String monedadocumento) {
        this.monedadocumento = monedadocumento;
    }

    @Basic
    @Column(name = "Tipodocumento")
    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    @Basic
    @Column(name = "Numerodocumento")
    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    @Basic
    @Column(name = "Seriedocumento")
    public Integer getSeriedocumento() {
        return seriedocumento;
    }

    public void setSeriedocumento(Integer seriedocumento) {
        this.seriedocumento = seriedocumento;
    }

    @Basic
    @Column(name = "Lineadocumento")
    public Integer getLineadocumento() {
        return lineadocumento;
    }

    public void setLineadocumento(Integer lineadocumento) {
        this.lineadocumento = lineadocumento;
    }

    @Basic
    @Column(name = "Cuentabancaria")
    public String getCuentabancaria() {
        return cuentabancaria;
    }

    public void setCuentabancaria(String cuentabancaria) {
        this.cuentabancaria = cuentabancaria;
    }

    @Basic
    @Column(name = "Oblcusuariocreacion")
    public Integer getOblcusuariocreacion() {
        return oblcusuariocreacion;
    }

    public void setOblcusuariocreacion(Integer oblcusuariocreacion) {
        this.oblcusuariocreacion = oblcusuariocreacion;
    }

    @Basic
    @Column(name = "Oblcfechacreacion")
    public Date getOblcfechacreacion() {
        return oblcfechacreacion;
    }

    public void setOblcfechacreacion(Date oblcfechacreacion) {
        this.oblcfechacreacion = oblcfechacreacion;
    }

    @Basic
    @Column(name = "Oblcipcreacion")
    public String getOblcipcreacion() {
        return oblcipcreacion;
    }

    public void setOblcipcreacion(String oblcipcreacion) {
        this.oblcipcreacion = oblcipcreacion;
    }

    @Basic
    @Column(name = "Oblcultimousuario")
    public Integer getOblcultimousuario() {
        return oblcultimousuario;
    }

    public void setOblcultimousuario(Integer oblcultimousuario) {
        this.oblcultimousuario = oblcultimousuario;
    }

    @Basic
    @Column(name = "Oblcultimafechamodif")
    public Date getOblcultimafechamodif() {
        return oblcultimafechamodif;
    }

    public void setOblcultimafechamodif(Date oblcultimafechamodif) {
        this.oblcultimafechamodif = oblcultimafechamodif;
    }

    @Basic
    @Column(name = "Oblcultimoip")
    public String getOblcultimoip() {
        return oblcultimoip;
    }

    public void setOblcultimoip(String oblcultimoip) {
        this.oblcultimoip = oblcultimoip;
    }

    @Basic
    @Column(name = "Oblcestado")
    public Integer getOblcestado() {
        return oblcestado;
    }

    public void setOblcestado(Integer oblcestado) {
        this.oblcestado = oblcestado;
    }

    

    @Column(name = "UnidadReplicacion")
	public String getUnidadReplicacion() {
		return unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}


    @Column(name = "IdCita")
	public Integer getIdCita() {
		return idCita;
	}


	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}
    
   
    @Column(name = "CodigoOA")
	public String getCodigoOA() {
		return codigoOA;
	}

	public void setCodigoOA(String codigoOA) {
		this.codigoOA = codigoOA;
	}
    
    
    @Column(name = "IdOrdenAtencion")
	public Integer getIdOrdenAtencion() {
		return idOrdenAtencion;
	}

	public void setIdOrdenAtencion(Integer idOrdenAtencion) {
		this.idOrdenAtencion = idOrdenAtencion;
	}
    
    
    @Column(name = "LineaOrdenAtencion")
	public Integer getLineaOrdenAtencion() {
		return lineaOrdenAtencion;
	}

	public void setLineaOrdenAtencion(Integer lineaOrdenAtencion) {
		this.lineaOrdenAtencion = lineaOrdenAtencion;
	}

	@Column(name = "Oblcmontopagado")
	public BigDecimal getOblcmontopagado() {
		return oblcmontopagado;
	}

	public void setOblcmontopagado(BigDecimal oblcmontopagado) {
		this.oblcmontopagado = oblcmontopagado;
	}


   
}
