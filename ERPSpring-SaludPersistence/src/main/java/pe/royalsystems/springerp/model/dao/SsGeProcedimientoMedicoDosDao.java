package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeProcedimientoMedicoDos;

public interface SsGeProcedimientoMedicoDosDao extends AbstractDao<SsGeProcedimientoMedicoDos, String>{
	
	public List<SsGeProcedimientoMedicoDos> listarSsGeProcedimientoMedicoDos(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos);
		
	public SsGeProcedimientoMedicoDos buscarSsGeProcedimientoMedicoDosID (SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos);
	
	public int contadorTotales(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos);
	
	public int guardarSsGeProcedimientoMedicoDos(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos);
	
	public int eliminarSsGeProcedimientoMedicoDos(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos);
	
}
