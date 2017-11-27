package pe.royalsystems.springerp.erpspringsalud.model;

import pe.royalsystems.springerp.erpspringsalud.util.JsonViewCustom;

@JsonViewCustom(JsonViewInterfaces.ViewGeneral.class)
public class OpearacionResultJson {

	private boolean ok;
	private String codigoResultado;	
	private String idResultado;	
	
	private String codigoError;	
	private String codigoOperacion;	
	private String mensajeOperacion;	
	private boolean envioCorreoOperacion;			
	
	public OpearacionResultJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public String getCodigoResultado() {
		return codigoResultado;
	}
	public void setCodigoResultado(String codigoResultado) {
		this.codigoResultado = codigoResultado;
	}
	public String getIdResultado() {
		return idResultado;
	}
	public void setIdResultado(String idResultado) {
		this.idResultado = idResultado;
	}
	public String getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}
	public String getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	public String getMensajeOperacion() {
		return mensajeOperacion;
	}
	public void setMensajeOperacion(String mensajeOperacion) {
		this.mensajeOperacion = mensajeOperacion;
	}
	public boolean isEnvioCorreoOperacion() {
		return envioCorreoOperacion;
	}
	public void setEnvioCorreoOperacion(boolean envioCorreoOperacion) {
		this.envioCorreoOperacion = envioCorreoOperacion;
	}



}
