package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcObligaciondetalle;
import pe.royalsystems.springerp.model.domain.SsHcObligaciondetallePK;

public interface SsHcObligaciondetalleDao  {
	public SsHcObligaciondetalle obtenerPorId(SsHcObligaciondetallePK id);	
	public List<SsHcObligaciondetalle> listarElementos(SsHcObligaciondetalle objDao,boolean paginable); 			
	public int contarTotal(SsHcObligaciondetalle objDao);
	
	public int guardar(SsHcObligaciondetalle objDao);
	public int actualizar(SsHcObligaciondetalle objDao);
	public int eliminar(SsHcObligaciondetalle objDao);
}
