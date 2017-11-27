package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsTipoTrabajador;

public interface SsTipoTrabajadorDao extends AbstractDao<SsTipoTrabajador, String>{

	public SsTipoTrabajador retornarSsTipoTrabajadorXid(SsTipoTrabajador objSsTipoTrabajador);
	
	public List<SsTipoTrabajador> listaComboSsTipoTrabjador(SsTipoTrabajador objSsTipoTrabajador);
	
}
