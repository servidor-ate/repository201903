package pe.royalsystems.springerp.model.domain.vista;

import javax.persistence.*;
import pe.royalsystems.springerp.model.domain.Entidad;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the VW_ITEM_MEDICAMENTOS database table.
 * 
 */
@Entity
@Table(name="VW_ITEM_MEDICAMENTOS")
public class VwItemMedicamento extends Entidad {
	private static final long serialVersionUID = 1L;
	private String afectoImpuestoVentasFlag;
	private String centrocosto;
	private String codigoBarras;
	private String color;
	private String cuentaVentas;
	private String dciMed;
	private String descripcionCompleta;
	private String descripcionFamilia;
	private String descripcionLinea;
	private String descripcionSubFamilia;
	private String disponibleVentaFlag;
	private String estado;
	private String familia;
	private String filaCodigo;
	private String itemTipo;
	private String linea;
	private String marcaCodigo;
	private String modelo;
	private String monedaCodigo;
	private String nombreDciMed;
	private BigDecimal precioCosto;
	private BigDecimal precioUnitarioDolares;
	private BigDecimal precioUnitarioLocal;
	private String subFamilia;
	private String tipo;
	private Date ultimaFecha;
	private String ultimoUsuario;
	private String unidadCodigo;
	private String unidadReplicacion;

	private Integer idUnidadMedida;
	private String descripcionUnidadMedidad;
	

	public VwItemMedicamento() {
	}


	@Column(name="AfectoImpuestoVentasFlag")
	public String getAfectoImpuestoVentasFlag() {
		return this.afectoImpuestoVentasFlag;
	}

	public void setAfectoImpuestoVentasFlag(String afectoImpuestoVentasFlag) {
		this.afectoImpuestoVentasFlag = afectoImpuestoVentasFlag;
	}


	@Column(name="Centrocosto")
	public String getCentrocosto() {
		return this.centrocosto;
	}

	public void setCentrocosto(String centrocosto) {
		this.centrocosto = centrocosto;
	}


	@Column(name="CodigoBarras")
	public String getCodigoBarras() {
		return this.codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	@Column(name="Color")
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Column(name="CuentaVentas")
	public String getCuentaVentas() {
		return this.cuentaVentas;
	}

	public void setCuentaVentas(String cuentaVentas) {
		this.cuentaVentas = cuentaVentas;
	}


	@Column(name="DCI_MED")
	public String getDciMed() {
		return this.dciMed;
	}

	public void setDciMed(String dciMed) {
		this.dciMed = dciMed;
	}


	@Column(name="DescripcionCompleta")
	public String getDescripcionCompleta() {
		return this.descripcionCompleta;
	}

	public void setDescripcionCompleta(String descripcionCompleta) {
		this.descripcionCompleta = descripcionCompleta;
	}


	@Column(name="DescripcionFamilia")
	public String getDescripcionFamilia() {
		return this.descripcionFamilia;
	}

	public void setDescripcionFamilia(String descripcionFamilia) {
		this.descripcionFamilia = descripcionFamilia;
	}


	@Column(name="DescripcionLinea")
	public String getDescripcionLinea() {
		return this.descripcionLinea;
	}

	public void setDescripcionLinea(String descripcionLinea) {
		this.descripcionLinea = descripcionLinea;
	}


	@Column(name="DescripcionSubFamilia")
	public String getDescripcionSubFamilia() {
		return this.descripcionSubFamilia;
	}

	public void setDescripcionSubFamilia(String descripcionSubFamilia) {
		this.descripcionSubFamilia = descripcionSubFamilia;
	}


	@Column(name="DisponibleVentaFlag")
	public String getDisponibleVentaFlag() {
		return this.disponibleVentaFlag;
	}

	public void setDisponibleVentaFlag(String disponibleVentaFlag) {
		this.disponibleVentaFlag = disponibleVentaFlag;
	}


	@Column(name="Estado")
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Column(name="Familia")
	public String getFamilia() {
		return this.familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}


	@Id
	@Column(name="FILA_CODIGO")
	public String getFilaCodigo() {
		return this.filaCodigo;
	}

	public void setFilaCodigo(String filaCodigo) {
		this.filaCodigo = filaCodigo;
	}


	public String getItemTipo() {
		return this.itemTipo;
	}

	public void setItemTipo(String itemTipo) {
		this.itemTipo = itemTipo;
	}


	@Column(name="Linea")
	public String getLinea() {
		return this.linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}


	@Column(name="MarcaCodigo")
	public String getMarcaCodigo() {
		return this.marcaCodigo;
	}

	public void setMarcaCodigo(String marcaCodigo) {
		this.marcaCodigo = marcaCodigo;
	}


	@Column(name="Modelo")
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Column(name="MonedaCodigo")
	public String getMonedaCodigo() {
		return this.monedaCodigo;
	}

	public void setMonedaCodigo(String monedaCodigo) {
		this.monedaCodigo = monedaCodigo;
	}


	@Column(name="NOMBRE_DCI_MED")
	public String getNombreDciMed() {
		return this.nombreDciMed;
	}

	public void setNombreDciMed(String nombreDciMed) {
		this.nombreDciMed = nombreDciMed;
	}


	@Column(name="PrecioCosto")
	public BigDecimal getPrecioCosto() {
		return this.precioCosto;
	}

	public void setPrecioCosto(BigDecimal precioCosto) {
		this.precioCosto = precioCosto;
	}


	@Column(name="PrecioUnitarioDolares")
	public BigDecimal getPrecioUnitarioDolares() {
		return this.precioUnitarioDolares;
	}

	public void setPrecioUnitarioDolares(BigDecimal precioUnitarioDolares) {
		this.precioUnitarioDolares = precioUnitarioDolares;
	}


	@Column(name="PrecioUnitarioLocal")
	public BigDecimal getPrecioUnitarioLocal() {
		return this.precioUnitarioLocal;
	}

	public void setPrecioUnitarioLocal(BigDecimal precioUnitarioLocal) {
		this.precioUnitarioLocal = precioUnitarioLocal;
	}


	@Column(name="SubFamilia")
	public String getSubFamilia() {
		return this.subFamilia;
	}

	public void setSubFamilia(String subFamilia) {
		this.subFamilia = subFamilia;
	}


	@Column(name="Tipo")
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Column(name="UltimaFecha")
	public Date getUltimaFecha() {
		return this.ultimaFecha;
	}

	public void setUltimaFecha(Date ultimaFecha) {
		this.ultimaFecha = ultimaFecha;
	}


	@Column(name="UltimoUsuario")
	public String getUltimoUsuario() {
		return this.ultimoUsuario;
	}

	public void setUltimoUsuario(String ultimoUsuario) {
		this.ultimoUsuario = ultimoUsuario;
	}


	@Column(name="UnidadCodigo")
	public String getUnidadCodigo() {
		return this.unidadCodigo;
	}

	public void setUnidadCodigo(String unidadCodigo) {
		this.unidadCodigo = unidadCodigo;
	}


	@Column(name="UnidadReplicacion")
	public String getUnidadReplicacion() {
		return this.unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}

	
	
	
	@Column(name="IdUnidadMedida")
	public Integer getIdUnidadMedida() {
		return idUnidadMedida;
	}


	public void setIdUnidadMedida(Integer idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}
	
	
	@Column(name="DescripcionUnidadMedidad")
	public String getDescripcionUnidadMedidad() {
		return descripcionUnidadMedidad;
	}


	public void setDescripcionUnidadMedidad(String descripcionUnidadMedidad) {
		this.descripcionUnidadMedidad = descripcionUnidadMedidad;
	}

}