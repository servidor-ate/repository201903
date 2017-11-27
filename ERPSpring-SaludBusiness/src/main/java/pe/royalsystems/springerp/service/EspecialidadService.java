package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;

import java.util.List;

public interface EspecialidadService {

	public List<SsGeEspecialidad> listarEspecialidades(SsGeEspecialidad filtro);
	
	public List<VwEspecialidadMedico> listarVwEspecialidadMedico(VwEspecialidadMedico filtro);
	
	public List<VwEspecialidadMedico> listarMedicosPorEspecialidadEnHorario(VwEspecialidadMedico filtro);
	
	public List<VwEspecialidadMedico> listarEspecialidadesPorMedicoEnHorario(VwEspecialidadMedico filtro);
}
