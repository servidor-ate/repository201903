package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;

public interface EspecialidadDao extends AbstractDao<SsGeEspecialidad, Integer> {

	public List<SsGeEspecialidad> listarEspecialidades(SsGeEspecialidad filtro);
}
