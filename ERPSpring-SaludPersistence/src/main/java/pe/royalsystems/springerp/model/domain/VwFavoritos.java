package pe.royalsystems.springerp.model.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "vw_favoritos")
public class VwFavoritos implements java.io.Serializable {

	private VwFavoritosId id;

	public VwFavoritos() {
	}

	public VwFavoritos(VwFavoritosId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idFavorito", column = @Column(name = "IdFavorito", nullable = false) ),
			@AttributeOverride(name = "numeroFavorito", column = @Column(name = "NumeroFavorito") ),
			@AttributeOverride(name = "mnemotecnico", column = @Column(name = "Mnemotecnico", length = 15) ),
			@AttributeOverride(name = "descripcion", column = @Column(name = "Descripcion", length = 100) ),
			@AttributeOverride(name = "descripcionExtranjera", column = @Column(name = "DescripcionExtranjera", length = 100) ),
			@AttributeOverride(name = "idAgente", column = @Column(name = "IdAgente") ),
			@AttributeOverride(name = "idFavoritoTabla", column = @Column(name = "IdFavoritoTabla") ),
			@AttributeOverride(name = "estado", column = @Column(name = "Estado") ),
			@AttributeOverride(name = "accion", column = @Column(name = "Accion", length = 25) ),
			@AttributeOverride(name = "version", column = @Column(name = "Version", length = 25) ),
			@AttributeOverride(name = "nombreTabla", column = @Column(name = "NombreTabla", length = 128) ),
			@AttributeOverride(name = "descripTabla", column = @Column(name = "DescripTabla", length = 100) ),
			@AttributeOverride(name = "codigoAgente", column = @Column(name = "CodigoAgente", length = 15) ),
			@AttributeOverride(name = "nombre", column = @Column(name = "Nombre", length = 60) ),
			@AttributeOverride(name = "tipoFavorito", column = @Column(name = "TipoFavorito") ) })
	public VwFavoritosId getId() {
		return this.id;
	}

	public void setId(VwFavoritosId id) {
		this.id = id;
	}

}