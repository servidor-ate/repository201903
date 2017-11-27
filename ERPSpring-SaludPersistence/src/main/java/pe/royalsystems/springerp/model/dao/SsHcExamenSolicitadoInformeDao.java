package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitadoInforme;
import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitadoInformePK;

public interface SsHcExamenSolicitadoInformeDao {
	public SsHcExamenSolicitadoInforme obtenerPorId(SsHcExamenSolicitadoInformePK id);	
	public List<SsHcExamenSolicitadoInforme> listarElementos(SsHcExamenSolicitadoInforme objDao,boolean paginable); 			
	public int contarTotal(SsHcExamenSolicitadoInforme objDao);
	
	public int guardar(SsHcExamenSolicitadoInforme objDao);
	public int actualizar(SsHcExamenSolicitadoInforme objDao);
	public int eliminar(SsHcExamenSolicitadoInforme objDao);
}
