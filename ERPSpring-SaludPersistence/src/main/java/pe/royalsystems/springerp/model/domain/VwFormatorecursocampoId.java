package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class VwFormatorecursocampoId implements java.io.Serializable {

	private int idFormato;
	private String codigoFormato;
	private String descripcionFormato;
	private int secuenciaCampo;
	private String descripFormatoCampo;
	private String formula;
	private int idFavoritoTabla;
	private String descripcionTabla;
	private String descripTablaCampo;
	private Integer estado;
	private String accion;

	public VwFormatorecursocampoId() {
	}

	public VwFormatorecursocampoId(int idFormato, String codigoFormato, int secuenciaCampo, int idFavoritoTabla) {
		this.idFormato = idFormato;
		this.codigoFormato = codigoFormato;
		this.secuenciaCampo = secuenciaCampo;
		this.idFavoritoTabla = idFavoritoTabla;
	}

	public VwFormatorecursocampoId(int idFormato, String codigoFormato, String descripcionFormato, int secuenciaCampo,
			String descripFormatoCampo, String formula, int idFavoritoTabla, String descripcionTabla,
			String descripTablaCampo, Integer estado, String accion) {
		this.idFormato = idFormato;
		this.codigoFormato = codigoFormato;
		this.descripcionFormato = descripcionFormato;
		this.secuenciaCampo = secuenciaCampo;
		this.descripFormatoCampo = descripFormatoCampo;
		this.formula = formula;
		this.idFavoritoTabla = idFavoritoTabla;
		this.descripcionTabla = descripcionTabla;
		this.descripTablaCampo = descripTablaCampo;
		this.estado = estado;
		this.accion = accion;
	}

	@Column(name = "IdFormato", nullable = false)
	public int getIdFormato() {
		return this.idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	@Column(name = "CodigoFormato", nullable = false, length = 20)
	public String getCodigoFormato() {
		return this.codigoFormato;
	}

	public void setCodigoFormato(String codigoFormato) {
		this.codigoFormato = codigoFormato;
	}

	@Column(name = "DescripcionFormato", length = 100)
	public String getDescripcionFormato() {
		return this.descripcionFormato;
	}

	public void setDescripcionFormato(String descripcionFormato) {
		this.descripcionFormato = descripcionFormato;
	}

	@Column(name = "SecuenciaCampo", nullable = false)
	public int getSecuenciaCampo() {
		return this.secuenciaCampo;
	}

	public void setSecuenciaCampo(int secuenciaCampo) {
		this.secuenciaCampo = secuenciaCampo;
	}

	@Column(name = "DescripFormatoCampo", length = 100)
	public String getDescripFormatoCampo() {
		return this.descripFormatoCampo;
	}

	public void setDescripFormatoCampo(String descripFormatoCampo) {
		this.descripFormatoCampo = descripFormatoCampo;
	}

	@Column(name = "Formula", length = 500)
	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	@Column(name = "IdFavoritoTabla", nullable = false)
	public int getIdFavoritoTabla() {
		return this.idFavoritoTabla;
	}

	public void setIdFavoritoTabla(int idFavoritoTabla) {
		this.idFavoritoTabla = idFavoritoTabla;
	}

	@Column(name = "DescripcionTabla", length = 100)
	public String getDescripcionTabla() {
		return this.descripcionTabla;
	}

	public void setDescripcionTabla(String descripcionTabla) {
		this.descripcionTabla = descripcionTabla;
	}

	@Column(name = "DescripTablaCampo", length = 128)
	public String getDescripTablaCampo() {
		return this.descripTablaCampo;
	}

	public void setDescripTablaCampo(String descripTablaCampo) {
		this.descripTablaCampo = descripTablaCampo;
	}

	@Column(name = "Estado")
	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Column(name = "Accion", length = 25)
	public String getAccion() {
		return this.accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwFormatorecursocampoId))
			return false;
		VwFormatorecursocampoId castOther = (VwFormatorecursocampoId) other;

		return (this.getIdFormato() == castOther.getIdFormato())
				&& ((this.getCodigoFormato() == castOther.getCodigoFormato())
						|| (this.getCodigoFormato() != null && castOther.getCodigoFormato() != null
								&& this.getCodigoFormato().equals(castOther.getCodigoFormato())))
				&& ((this.getDescripcionFormato() == castOther.getDescripcionFormato())
						|| (this.getDescripcionFormato() != null && castOther.getDescripcionFormato() != null
								&& this.getDescripcionFormato().equals(castOther.getDescripcionFormato())))
				&& (this.getSecuenciaCampo() == castOther.getSecuenciaCampo())
				&& ((this.getDescripFormatoCampo() == castOther.getDescripFormatoCampo())
						|| (this.getDescripFormatoCampo() != null && castOther.getDescripFormatoCampo() != null
								&& this.getDescripFormatoCampo().equals(castOther.getDescripFormatoCampo())))
				&& ((this.getFormula() == castOther.getFormula()) || (this.getFormula() != null
						&& castOther.getFormula() != null && this.getFormula().equals(castOther.getFormula())))
				&& (this.getIdFavoritoTabla() == castOther.getIdFavoritoTabla())
				&& ((this.getDescripcionTabla() == castOther.getDescripcionTabla())
						|| (this.getDescripcionTabla() != null && castOther.getDescripcionTabla() != null
								&& this.getDescripcionTabla().equals(castOther.getDescripcionTabla())))
				&& ((this.getDescripTablaCampo() == castOther.getDescripTablaCampo())
						|| (this.getDescripTablaCampo() != null && castOther.getDescripTablaCampo() != null
								&& this.getDescripTablaCampo().equals(castOther.getDescripTablaCampo())))
				&& ((this.getEstado() == castOther.getEstado()) || (this.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado().equals(castOther.getEstado())))
				&& ((this.getAccion() == castOther.getAccion()) || (this.getAccion() != null
						&& castOther.getAccion() != null && this.getAccion().equals(castOther.getAccion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFormato();
		result = 37 * result + (getCodigoFormato() == null ? 0 : this.getCodigoFormato().hashCode());
		result = 37 * result + (getDescripcionFormato() == null ? 0 : this.getDescripcionFormato().hashCode());
		result = 37 * result + this.getSecuenciaCampo();
		result = 37 * result + (getDescripFormatoCampo() == null ? 0 : this.getDescripFormatoCampo().hashCode());
		result = 37 * result + (getFormula() == null ? 0 : this.getFormula().hashCode());
		result = 37 * result + this.getIdFavoritoTabla();
		result = 37 * result + (getDescripcionTabla() == null ? 0 : this.getDescripcionTabla().hashCode());
		result = 37 * result + (getDescripTablaCampo() == null ? 0 : this.getDescripTablaCampo().hashCode());
		result = 37 * result + (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result + (getAccion() == null ? 0 : this.getAccion().hashCode());
		return result;
	}

}
