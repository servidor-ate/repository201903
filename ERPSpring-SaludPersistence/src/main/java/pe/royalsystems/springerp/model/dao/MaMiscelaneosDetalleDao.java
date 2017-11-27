package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.MaMiscelaneosDetalle;

public interface MaMiscelaneosDetalleDao extends AbstractDao<MaMiscelaneosDetalle, String>{
	
	public MaMiscelaneosDetalle obtenerPorId(MaMiscelaneosDetalle objDao);
	public List<MaMiscelaneosDetalle> listarElementosPag(MaMiscelaneosDetalle objDao);
	public List<MaMiscelaneosDetalle> listarElementos(MaMiscelaneosDetalle objDao); 			
	public int contarTotal(MaMiscelaneosDetalle objDao);
	
	public int guardar(MaMiscelaneosDetalle objDao);
	public int actualizar(MaMiscelaneosDetalle objDao);
	public int eliminar(MaMiscelaneosDetalle objDao);
	
	public List<MaMiscelaneosDetalle> listarMaMiscelanesoDetalleStore(MaMiscelaneosDetalle maMiscelaneosDetalle) ;
	

}
