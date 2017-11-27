package pe.royalsystems.springerp.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_FORMATORECURSOCAMPO")
public class VwFormatorecursocampo implements java.io.Serializable {

	private VwFormatorecursocampoId id;

	public VwFormatorecursocampo() {
	}

	public VwFormatorecursocampo(VwFormatorecursocampoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idFormato", column = @Column(name = "IdFormato", nullable = false) ),
			@AttributeOverride(name = "codigoFormato", column = @Column(name = "CodigoFormato", nullable = false, length = 20) ),
			@AttributeOverride(name = "descripcionFormato", column = @Column(name = "DescripcionFormato", length = 100) ),
			@AttributeOverride(name = "secuenciaCampo", column = @Column(name = "SecuenciaCampo", nullable = false) ),
			@AttributeOverride(name = "descripFormatoCampo", column = @Column(name = "DescripFormatoCampo", length = 100) ),
			@AttributeOverride(name = "formula", column = @Column(name = "Formula", length = 500) ),
			@AttributeOverride(name = "idFavoritoTabla", column = @Column(name = "IdFavoritoTabla", nullable = false) ),
			@AttributeOverride(name = "descripcionTabla", column = @Column(name = "DescripcionTabla", length = 100) ),
			@AttributeOverride(name = "descripTablaCampo", column = @Column(name = "DescripTablaCampo", length = 128) ),
			@AttributeOverride(name = "estado", column = @Column(name = "Estado") ),
			@AttributeOverride(name = "accion", column = @Column(name = "Accion", length = 25) ) })
	public VwFormatorecursocampoId getId() {
		return this.id;
	}

	public void setId(VwFormatorecursocampoId id) {
		this.id = id;
	}

}
