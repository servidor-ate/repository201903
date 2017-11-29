package pe.royalsystems.springerp.model.domain;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


/**
 * The persistent class for the SS_CC_FavoritoDetalle database table.
 * 
 */
@Entity
@Table(name="SS_CC_FavoritoDetalle")
public class SsCcFavoritoDetalle extends Entidad{
	private static final long serialVersionUID = 1L;
	private SsCcFavoritoDetallePK id;
	private Date fechaCreacion;
	private String tipoIdentificador;
	private String usuarioCreacion;
	private String valorCodigo;
	private Integer valorId;
	private String valorTexto1;
	private String valorTexto2;
	private String valorTexto3;
	private String valorTexto4;
	private String valorTexto5;
	
	private String estado;

	private SsCcFavorito ssCcFavorito;
	
	public SsCcFavoritoDetalle() {
		id = new SsCcFavoritoDetallePK(); 
	}


	@EmbeddedId
	public SsCcFavoritoDetallePK getId() {
		return this.id;
	}

	public void setId(SsCcFavoritoDetallePK id) {
		this.id = id;
	}


	@Column(name="FechaCreacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="TipoIdentificador")
	public String getTipoIdentificador() {
		return this.tipoIdentificador;
	}

	public void setTipoIdentificador(String tipoIdentificador) {
		this.tipoIdentificador = tipoIdentificador;
	}


	@Column(name="UsuarioCreacion")
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}


	@Column(name="ValorCodigo")
	public String getValorCodigo() {
		return this.valorCodigo;
	}

	public void setValorCodigo(String valorCodigo) {
		this.valorCodigo = valorCodigo;
	}


	@Column(name="ValorId")
	public Integer getValorId() {
		return this.valorId;
	}

	public void setValorId(Integer valorId) {
		this.valorId = valorId;
	}


	@Column(name="ValorTexto1")
	public String getValorTexto1() {
		return this.valorTexto1;
	}

	public void setValorTexto1(String valorTexto1) {
		this.valorTexto1 = valorTexto1;
	}


	@Column(name="ValorTexto2")
	public String getValorTexto2() {
		return this.valorTexto2;
	}

	public void setValorTexto2(String valorTexto2) {
		this.valorTexto2 = valorTexto2;
	}


	@Column(name="ValorTexto3")
	public String getValorTexto3() {
		return this.valorTexto3;
	}

	public void setValorTexto3(String valorTexto3) {
		this.valorTexto3 = valorTexto3;
	}


	@Column(name="ValorTexto4")
	public String getValorTexto4() {
		return this.valorTexto4;
	}

	public void setValorTexto4(String valorTexto4) {
		this.valorTexto4 = valorTexto4;
	}


	@Column(name="ValorTexto5")
	public String getValorTexto5() {
		return this.valorTexto5;
	}

	public void setValorTexto5(String valorTexto5) {
		this.valorTexto5 = valorTexto5;
	}

	@Column(name="Estado")
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToOne
	@JoinColumns({
			@JoinColumn(name = "IdFavorito", referencedColumnName = "IdFavorito", insertable = false, updatable = false, nullable = true)
			})
	@NotFound(action = NotFoundAction.IGNORE)
	public SsCcFavorito getSsCcFavorito() {
		return ssCcFavorito;
	}


	public void setSsCcFavorito(SsCcFavorito ssCcFavorito) {
		this.ssCcFavorito = ssCcFavorito;
	}


}