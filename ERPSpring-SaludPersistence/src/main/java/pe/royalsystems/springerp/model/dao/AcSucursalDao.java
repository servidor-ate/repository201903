package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.AcSucursal;


public interface AcSucursalDao {
	public AcSucursal obtenerPorId(String id);	
	public List<AcSucursal> listarElementos(AcSucursal objDao,boolean paginable); 			
	public int contarTotal(AcSucursal objDao);
	
	public int guardar(AcSucursal objDao);
	public int actualizar(AcSucursal objDao);
	public int eliminar(AcSucursal objDao);
}
