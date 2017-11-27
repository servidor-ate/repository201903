package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SySeguridadAutorizaciones;

public interface SySeguridadAutorizacionesDao extends AbstractDao<SySeguridadAutorizaciones, String>{
	
	public List<SySeguridadAutorizaciones> listarComboSySeguridadAutorizacionesCompania(SySeguridadAutorizaciones objSySeguridadAutorizaciones);
	
	public List<SySeguridadAutorizaciones> listarComboSySeguridadAutorizacionesSucursal(SySeguridadAutorizaciones objSySeguridadAutorizaciones);
	
	public List<SySeguridadAutorizaciones> listarComboSySeguridadAutorizacionesEstablecimiento(SySeguridadAutorizaciones objSySeguridadAutorizaciones);
	
}
