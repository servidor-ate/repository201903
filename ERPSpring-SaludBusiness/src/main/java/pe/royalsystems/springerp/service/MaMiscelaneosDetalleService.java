package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.MaMiscelaneosDetalle;

import java.util.List;

public interface MaMiscelaneosDetalleService {


	public MaMiscelaneosDetalle obtenerPorId(MaMiscelaneosDetalle objDao);
	public List<MaMiscelaneosDetalle> listarElementosPag(MaMiscelaneosDetalle objDao);
	public List<MaMiscelaneosDetalle> listarElementos(MaMiscelaneosDetalle objDao);
	public List<MaMiscelaneosDetalle> listarMaMiscelaneosDetalle(MaMiscelaneosDetalle objDao);

	public int contarTotal(MaMiscelaneosDetalle objDao);
	
	public int guardar(MaMiscelaneosDetalle objDao);
	public int actualizar(MaMiscelaneosDetalle objDao);
	public int eliminar(MaMiscelaneosDetalle objDao);
	
	List<MaMiscelaneosDetalle> listarMaMiscelanesoDetalleStore(MaMiscelaneosDetalle maMiscelaneosDetalle);	
	
}
