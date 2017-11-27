package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGePaciente;

public interface SsGePacienteDao extends AbstractDao<SsGePaciente, Integer> {
	public SsGePaciente obtenerPorId(Integer primaryKey);
	public List<SsGePaciente> listarElementosPag(SsGePaciente objDao);
	public List<SsGePaciente> listarElementos(SsGePaciente objDao); 			
	public int contarTotal(SsGePaciente objDao);
	
	public int guardar(SsGePaciente objDao);
	public int actualizar(SsGePaciente objDao);
	public int eliminar(SsGePaciente objDao);

}
