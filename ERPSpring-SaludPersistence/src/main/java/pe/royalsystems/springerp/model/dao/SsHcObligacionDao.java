package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcObligacion;

public interface SsHcObligacionDao {
	public SsHcObligacion obtenerPorId(Integer id);	
	public List<SsHcObligacion> listarElementos(SsHcObligacion objDao,boolean paginable); 			
	public int contarTotal(SsHcObligacion objDao);
	
	public int guardar(SsHcObligacion objDao);
	public int actualizar(SsHcObligacion objDao);
	public int eliminar(SsHcObligacion objDao);
}
