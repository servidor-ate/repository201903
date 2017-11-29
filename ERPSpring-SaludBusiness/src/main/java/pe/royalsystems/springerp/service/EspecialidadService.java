package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;

import java.util.Date;
import java.util.List;

public interface EspecialidadService {

	public List<SsGeEspecialidad> listarEspecialidades(SsGeEspecialidad filtro);
	
	public List<VwEspecialidadMedico> listarVwEspecialidadMedico(VwEspecialidadMedico filtro);
	
	public List<VwEspecialidadMedico> listarMedicosPorEspecialidadEnHorario(VwEspecialidadMedico filtro);
	
	public List<VwEspecialidadMedico> listarEspecialidadesPorMedicoEnHorario(VwEspecialidadMedico filtro);

    List<VwEspecialidadMedico> listarVwEspecialidadMedicoFavoritos(VwEspecialidadMedico filtro,
                                                                   Integer idAgente, String codTablaFavorito,
                                                                   boolean indicaCruceHorarios, Date horarioFechaInicio, Date horarioFechaFin);

	List<VwEspecialidadMedico> listarVwEspecialidadMedicoConHorarios(VwEspecialidadMedico filtro,
																	 Date horarioFechaInicio, Date horarioFechaFin);

	List<SsGeEspecialidad> listarEspecialidadesFavoritos(SsGeEspecialidad filtro, Integer idAgente);
}
