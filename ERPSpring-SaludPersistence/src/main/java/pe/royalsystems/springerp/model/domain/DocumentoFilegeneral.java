package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 
 * 
 */
//@Entity
//@Table(name="SA_DOCUMENTOGENERAL")
public class DocumentoFilegeneral extends Entidad {
	private static final long serialVersionUID = 1L;

	//@Id
	private Integer docalid;

	private Integer docalclase;

	private String docalcorrelativo;

	private Integer docalestado;

	
	private Date docalfecha;

	@Temporal(TemporalType.TIMESTAMP)
	private Date docalfechacreacion;

	private String docalflagalfresco;

	private String docalipcreacion;

	private String docalnombredoc;

	private String docalpath;

	private String docaltipodoc;

	@Temporal(TemporalType.TIMESTAMP)
	private Date docalultimafechamodif;

	private String docalultimoip;

	private Integer docalultimousuario;

	private Integer docalusuariocreacion;

	private String docaluuid;
	
	private String docaltipocontenido;

	public DocumentoFilegeneral() {
	}

	public Integer getDocalid() {
		return this.docalid;
	}

	public void setDocalid(Integer docalid) {
		this.docalid = docalid;
	}

	public Integer getDocalclase() {
		return this.docalclase;
	}

	public void setDocalclase(Integer docalclase) {
		this.docalclase = docalclase;
	}

	public String getDocalcorrelativo() {
		return this.docalcorrelativo;
	}

	public void setDocalcorrelativo(String docalcorrelativo) {
		this.docalcorrelativo = docalcorrelativo;
	}

	public Integer getDocalestado() {
		return this.docalestado;
	}

	public void setDocalestado(Integer docalestado) {
		this.docalestado = docalestado;
	}

	public Date getDocalfecha() {
		return this.docalfecha;
	}

	public void setDocalfecha(Date docalfecha) {
		this.docalfecha = docalfecha;
	}

	public Date getDocalfechacreacion() {
		return this.docalfechacreacion;
	}

	public void setDocalfechacreacion(Date docalfechacreacion) {
		this.docalfechacreacion = docalfechacreacion;
	}

	public String getDocalflagalfresco() {
		return this.docalflagalfresco;
	}

	public void setDocalflagalfresco(String docalflagalfresco) {
		this.docalflagalfresco = docalflagalfresco;
	}

	public String getDocalipcreacion() {
		return this.docalipcreacion;
	}

	public void setDocalipcreacion(String docalipcreacion) {
		this.docalipcreacion = docalipcreacion;
	}

	public String getDocalnombredoc() {
		return this.docalnombredoc;
	}

	public void setDocalnombredoc(String docalnombredoc) {
		this.docalnombredoc = docalnombredoc;
	}

	public String getDocalpath() {
		return this.docalpath;
	}

	public void setDocalpath(String docalpath) {
		this.docalpath = docalpath;
	}

	public String getDocaltipodoc() {
		return this.docaltipodoc;
	}

	public void setDocaltipodoc(String docaltipodoc) {
		this.docaltipodoc = docaltipodoc;
	}

	public Date getDocalultimafechamodif() {
		return this.docalultimafechamodif;
	}

	public void setDocalultimafechamodif(Date docalultimafechamodif) {
		this.docalultimafechamodif = docalultimafechamodif;
	}

	public String getDocalultimoip() {
		return this.docalultimoip;
	}

	public void setDocalultimoip(String docalultimoip) {
		this.docalultimoip = docalultimoip;
	}

	public Integer getDocalultimousuario() {
		return this.docalultimousuario;
	}

	public void setDocalultimousuario(Integer docalultimousuario) {
		this.docalultimousuario = docalultimousuario;
	}

	public Integer getDocalusuariocreacion() {
		return this.docalusuariocreacion;
	}

	public void setDocalusuariocreacion(Integer docalusuariocreacion) {
		this.docalusuariocreacion = docalusuariocreacion;
	}

	public String getDocaluuid() {
		return this.docaluuid;
	}

	public void setDocaluuid(String docaluuid) {
		this.docaluuid = docaluuid;
	}

	public String getDocaltipocontenido() {
		return docaltipocontenido;
	}
	
	public void setDocaltipocontenido(String docaltipocontenido) {
		this.docaltipocontenido = docaltipocontenido;
	}
}