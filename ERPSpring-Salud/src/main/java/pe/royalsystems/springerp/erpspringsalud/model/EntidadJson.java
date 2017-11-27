package pe.royalsystems.springerp.erpspringsalud.model;

import java.io.Serializable;

public class EntidadJson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uri;
	
	private Integer contadorTotal;
	private Integer inicio;
	private Integer numeroFilas;	
	private boolean paginable = false;// INDICA SI LA CONSULTA SERA PAGINADA


	public String getUri() {
		return uri;
	}


	public void setUri(String uri) {
		this.uri = uri;
	}


	public Integer getContadorTotal() {
		return contadorTotal;
	}


	public void setContadorTotal(Integer contadorTotal) {
		this.contadorTotal = contadorTotal;
	}


	public Integer getInicio() {
		return inicio;
	}


	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}


	public Integer getNumeroFilas() {
		return numeroFilas;
	}


	public void setNumeroFilas(Integer numeroFilas) {
		this.numeroFilas = numeroFilas;
	}


	public boolean isPaginable() {
		return paginable;
	}


	public void setPaginable(boolean paginable) {
		this.paginable = paginable;
	}
	
	
}
