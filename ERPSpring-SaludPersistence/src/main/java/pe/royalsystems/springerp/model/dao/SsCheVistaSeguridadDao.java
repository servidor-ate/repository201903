package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsCheVistaSeguridad;

import java.util.List;

public interface SsCheVistaSeguridadDao extends AbstractDao<SsCheVistaSeguridad, String> {
	
    List<SsCheVistaSeguridad> listandoTreeMenuOpciones(SsCheVistaSeguridad objSsCheVistaSeguridad);
    	
	List<SsCheVistaSeguridad> listandoTreeMenuOpcionesHistoriaClinica(SsCheVistaSeguridad objSsCheVistaSeguridad);
	
	List<SsCheVistaSeguridad>listandoNodosHijosHistoriaClinica(SsCheVistaSeguridad objSsCheVistaSeguridad);
}
