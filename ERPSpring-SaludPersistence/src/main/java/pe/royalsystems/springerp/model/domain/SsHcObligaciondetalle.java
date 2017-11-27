package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mamania on 16/05/2017.
 */
@Entity
@Table(name = "SS_HC_Obligaciondetalle")
@IdClass(SsHcObligaciondetallePK.class)
public class SsHcObligaciondetalle  extends Entidad {
    private Integer secuencia;
    private Integer oblobligacionid;
    private String itemservicioflag;
    private String itemcodigo;
    private String itemdescripcion;
    private Integer oblcantidad;
    private BigDecimal oblmonto;
    private BigDecimal oblmora;
    private BigDecimal obldescuento;
    private Integer oblusuariocreacion;
    private Date oblfechacreacion;
    private String oblipcreacion;
    private Integer oblultimousuario;
    private Date oblultimafechamodif;
    private String oblultimoip;
    private Integer oblestado;

    @Id
    @Column(name = "Secuencia")
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Id
    @Column(name = "Oblobligacionid")
    public Integer getOblobligacionid() {
        return oblobligacionid;
    }

    public void setOblobligacionid(Integer oblobligacionid) {
        this.oblobligacionid = oblobligacionid;
    }

    @Basic
    @Column(name = "Itemservicioflag")
    public String getItemservicioflag() {
        return itemservicioflag;
    }

    public void setItemservicioflag(String itemservicioflag) {
        this.itemservicioflag = itemservicioflag;
    }

    @Basic
    @Column(name = "Itemcodigo")
    public String getItemcodigo() {
        return itemcodigo;
    }

    public void setItemcodigo(String itemcodigo) {
        this.itemcodigo = itemcodigo;
    }

    @Basic
    @Column(name = "Itemdescripcion")
    public String getItemdescripcion() {
        return itemdescripcion;
    }

    public void setItemdescripcion(String itemdescripcion) {
        this.itemdescripcion = itemdescripcion;
    }

    @Basic
    @Column(name = "Oblcantidad")
    public Integer getOblcantidad() {
        return oblcantidad;
    }

    public void setOblcantidad(Integer oblcantidad) {
        this.oblcantidad = oblcantidad;
    }

    @Basic
    @Column(name = "Oblmonto")
    public BigDecimal getOblmonto() {
        return oblmonto;
    }

    public void setOblmonto(BigDecimal oblmonto) {
        this.oblmonto = oblmonto;
    }

    @Basic
    @Column(name = "Oblmora")
    public BigDecimal getOblmora() {
        return oblmora;
    }

    public void setOblmora(BigDecimal oblmora) {
        this.oblmora = oblmora;
    }

    @Basic
    @Column(name = "Obldescuento")
    public BigDecimal getObldescuento() {
        return obldescuento;
    }

    public void setObldescuento(BigDecimal obldescuento) {
        this.obldescuento = obldescuento;
    }

    @Basic
    @Column(name = "Oblusuariocreacion")
    public Integer getOblusuariocreacion() {
        return oblusuariocreacion;
    }

    public void setOblusuariocreacion(Integer oblusuariocreacion) {
        this.oblusuariocreacion = oblusuariocreacion;
    }

    @Basic
    @Column(name = "Oblfechacreacion")
    public Date getOblfechacreacion() {
        return oblfechacreacion;
    }

    public void setOblfechacreacion(Date oblfechacreacion) {
        this.oblfechacreacion = oblfechacreacion;
    }

    @Basic
    @Column(name = "Oblipcreacion")
    public String getOblipcreacion() {
        return oblipcreacion;
    }

    public void setOblipcreacion(String oblipcreacion) {
        this.oblipcreacion = oblipcreacion;
    }

    @Basic
    @Column(name = "Oblultimousuario")
    public Integer getOblultimousuario() {
        return oblultimousuario;
    }

    public void setOblultimousuario(Integer oblultimousuario) {
        this.oblultimousuario = oblultimousuario;
    }

    @Basic
    @Column(name = "Oblultimafechamodif")
    public Date getOblultimafechamodif() {
        return oblultimafechamodif;
    }

    public void setOblultimafechamodif(Date oblultimafechamodif) {
        this.oblultimafechamodif = oblultimafechamodif;
    }

    @Basic
    @Column(name = "Oblultimoip")
    public String getOblultimoip() {
        return oblultimoip;
    }

    public void setOblultimoip(String oblultimoip) {
        this.oblultimoip = oblultimoip;
    }

    @Basic
    @Column(name = "Oblestado")
    public Integer getOblestado() {
        return oblestado;
    }

    public void setOblestado(Integer oblestado) {
        this.oblestado = oblestado;
    }

  

  
}
