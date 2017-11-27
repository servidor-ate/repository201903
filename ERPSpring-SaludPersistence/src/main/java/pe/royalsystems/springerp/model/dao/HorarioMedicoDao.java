package pe.royalsystems.springerp.model.dao;

import java.util.Date;
import java.util.List;

import pe.royalsystems.springerp.model.domain.SsCcHorario;
import pe.royalsystems.springerp.model.domain.vista.VwHorarioMedico;

public interface HorarioMedicoDao extends AbstractDao<SsCcHorario, Integer> {
	
	public List<VwHorarioMedico> buscarFechaInicio(VwHorarioMedico filtro);
	
	public Date buscarHoraMinima(VwHorarioMedico filtro);
	
	public Date buscarHoraMaxima(VwHorarioMedico filtro);

	public List<VwHorarioMedico> listarVwHorarioMedico(VwHorarioMedico filtro);
	
	
	public List<Integer> listarMedicosEnHorario();
	
	public List<Integer> listarEspecialidadesEnHorario();
}
