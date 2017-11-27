package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsHcMedicamento;

public interface SsHcMedicamentoDao extends AbstractDao<SsHcMedicamento, String>{

	public SsHcMedicamento obtenerSsHcMedicamentoID(SsHcMedicamento objSsHcMedicamento);
	
	public int guardar(SsHcMedicamento objSsHcMedicamento);
	public int actualizar(SsHcMedicamento objSsHcMedicamento);
	public int eliminar(SsHcMedicamento objSsHcMedicamento);
	
	public List<SsHcMedicamento> listarSsHcMedicamento(SsHcMedicamento objssHcMedicamento);
	
	
			
}
