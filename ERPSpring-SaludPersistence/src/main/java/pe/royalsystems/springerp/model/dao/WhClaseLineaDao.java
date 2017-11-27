package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.WhClaseLinea;

public interface WhClaseLineaDao extends AbstractDao<WhClaseLinea, String>{
	
	public WhClaseLinea obtenerWhClaseLineaID(WhClaseLinea objWhClaseLinea);
	
	public List<WhClaseLinea> listaComboLinea(WhClaseLinea objWhClaseLinea);

}
