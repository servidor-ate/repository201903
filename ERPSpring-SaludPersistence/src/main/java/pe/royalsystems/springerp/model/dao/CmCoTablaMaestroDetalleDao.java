package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.CmCoTablaMaestroDetalle;
import pe.royalsystems.springerp.model.domain.vista.VwTablamaestrodetalle;

import java.util.List;

public interface CmCoTablaMaestroDetalleDao extends AbstractDao<CmCoTablaMaestroDetalle, String> {
	public  CmCoTablaMaestroDetalle obtenerPorId(Integer primaryKey01,Integer primaryKey02);
	public List<CmCoTablaMaestroDetalle> listarElementosPag(CmCoTablaMaestroDetalle objDao);
	public List<CmCoTablaMaestroDetalle> listarElementos(CmCoTablaMaestroDetalle objDao); 			
	public int contarTotal(CmCoTablaMaestroDetalle objDao);
	
	public int guardar(CmCoTablaMaestroDetalle objDao);
	public int actualizar(CmCoTablaMaestroDetalle objDao);
	public int eliminar(CmCoTablaMaestroDetalle objDao);
	
	public List<VwTablamaestrodetalle> listarElementos(VwTablamaestrodetalle objDao);
}
