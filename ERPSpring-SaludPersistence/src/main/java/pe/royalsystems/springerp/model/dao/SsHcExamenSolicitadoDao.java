package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitado;
import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitadoPK;

public interface SsHcExamenSolicitadoDao {
	public SsHcExamenSolicitado obtenerPorId(SsHcExamenSolicitadoPK id);	
	public List<SsHcExamenSolicitado> listarElementos(SsHcExamenSolicitado objDao,boolean paginable); 			
	public int contarTotal(SsHcExamenSolicitado objDao);
	
	public int guardar(SsHcExamenSolicitado objDao);
	public int actualizar(SsHcExamenSolicitado objDao);
	public int eliminar(SsHcExamenSolicitado objDao);
}
