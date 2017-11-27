package pe.royalsystems.springerp.model.domain;

import java.text.DecimalFormat;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SS_HC_FavoritoCodigoId")
public class SsHcFavoritoCodigoId implements java.io.Serializable {

	private SsHcFavoritoCodigoIdId id;
	private String version;
	private Integer indicadorCodigoId;
	private String valorTexto;
	private Integer valorId;
	private String accion;
	private Integer estado;
	private Long valorDecimal;
	private Date valorFecha;

	public SsHcFavoritoCodigoId() {
	}

	public SsHcFavoritoCodigoId(SsHcFavoritoCodigoIdId id) {
		this.id = id;
	}

	public SsHcFavoritoCodigoId(SsHcFavoritoCodigoIdId id, Integer indicadorCodigoId, String valorTexto,
			Integer valorId, String accion, Integer estado, Long valorDecimal, Date valorFecha) {
		this.id = id;
		this.indicadorCodigoId = indicadorCodigoId;
		this.valorTexto = valorTexto;
		this.valorId = valorId;
		this.accion = accion;
		this.estado = estado;
		this.valorDecimal = valorDecimal;
		this.valorFecha = valorFecha;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idFavorito", column = @Column(name = "IdFavorito", nullable = false) ),
			@AttributeOverride(name = "campoCodigoId", column = @Column(name = "CampoCodigoId", nullable = false) ) })
	public SsHcFavoritoCodigoIdId getId() {
		return this.id;
	}

	public void setId(SsHcFavoritoCodigoIdId id) {
		this.id = id;
	}

	@Column(name = "Version", length = 25)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "IndicadorCodigoId")
	public Integer getIndicadorCodigoId() {
		return this.indicadorCodigoId;
	}

	public void setIndicadorCodigoId(Integer indicadorCodigoId) {
		this.indicadorCodigoId = indicadorCodigoId;
	}

	@Column(name = "ValorTexto", length = 300)
	public String getValorTexto() {
		return this.valorTexto;
	}

	public void setValorTexto(String valorTexto) {
		this.valorTexto = valorTexto;
	}

	@Column(name = "ValorId")
	public Integer getValorId() {
		return this.valorId;
	}

	public void setValorId(Integer valorId) {
		this.valorId = valorId;
	}

	@Column(name = "Accion", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "ValorDecimal", precision = 10, scale = 0)
	public Long getValorDecimal() {
		return this.valorDecimal;
	}

	public void setValorDecimal(Long valorDecimal) {
		this.valorDecimal = valorDecimal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ValorFecha", length = 23)
	public Date getValorFecha() {
		return this.valorFecha;
	}

	public void setValorFecha(Date valorFecha) {
		this.valorFecha = valorFecha;
	}

}
