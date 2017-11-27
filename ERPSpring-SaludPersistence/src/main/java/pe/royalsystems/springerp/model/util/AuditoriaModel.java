package pe.royalsystems.springerp.model.util;

import java.util.Date;

public class AuditoriaModel {

	private String usuarioAuditoria;
	private Integer idUsuarioAuditoria;
	
	private Date fechaAuditoria;
	private String ipAuditoria;
	private String macAuditoria;
	private String accionAuditoria;
	
	public AuditoriaModel() {
	}
	
	public String getUsuarioAuditoria() {
		return usuarioAuditoria;
	}
	public void setUsuarioAuditoria(String usuarioAuditoria) {
		this.usuarioAuditoria = usuarioAuditoria;
	}
	public Integer getIdUsuarioAuditoria() {
		return idUsuarioAuditoria;
	}
	public void setIdUsuarioAuditoria(Integer idUsuarioAuditoria) {
		this.idUsuarioAuditoria = idUsuarioAuditoria;
	}
	public Date getFechaAuditoria() {
		return fechaAuditoria;
	}
	public void setFechaAuditoria(Date fechaAuditoria) {
		this.fechaAuditoria = fechaAuditoria;
	}
	public String getIpAuditoria() {
		return ipAuditoria;
	}
	public void setIpAuditoria(String ipAuditoria) {
		this.ipAuditoria = ipAuditoria;
	}
	public String getMacAuditoria() {
		return macAuditoria;
	}
	public void setMacAuditoria(String macAuditoria) {
		this.macAuditoria = macAuditoria;
	}
	public String getAccionAuditoria() {
		return accionAuditoria;
	}
	public void setAccionAuditoria(String accionAuditoria) {
		this.accionAuditoria = accionAuditoria;
	}
	
	
}
