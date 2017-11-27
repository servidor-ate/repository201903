package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsGeProcedimientoMedico;


import java.util.List;

public interface SsGeProcedimientoMedicoDao extends AbstractDao<SsGeProcedimientoMedico, Integer>{

	List<SsGeProcedimientoMedico> listarSsGeProcedimientoMedicoPaginacion(int inicio, int numeroFilas, SsGeProcedimientoMedico objSsGeProcedimientoMedico);
	
	
	public List<SsGeProcedimientoMedico> listar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos,boolean paginable);
	int contadorDeTotales(SsGeProcedimientoMedico objSsGeProcedimientoMedico);
	
	public SsGeProcedimientoMedico buscar (SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos);
	
	public int contadorTotales(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos);
	public int guardar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos);
	public int actualizar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos);
	public int eliminar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos);

}
