package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.VwPersonapaciente;

public interface VwPersonapacienteDao extends AbstractDao<VwPersonapaciente, Integer> {

	
	public VwPersonapaciente obtenerPorId(Integer objDao);
	public List<VwPersonapaciente> listarElementosPag(VwPersonapaciente objDao);
	public List<VwPersonapaciente> listarElementos(VwPersonapaciente objDao); 			
	public int contarTotal(VwPersonapaciente objDao);
	
	public int guardar(VwPersonapaciente objDao);
	public int actualizar(VwPersonapaciente objDao);
	public int eliminar(VwPersonapaciente objDao);
	
	

}
