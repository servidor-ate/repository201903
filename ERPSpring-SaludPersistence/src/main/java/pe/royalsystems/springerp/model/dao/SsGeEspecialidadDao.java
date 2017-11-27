package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;

public interface SsGeEspecialidadDao extends AbstractDao<SsGeEspecialidad, String> {

	public List<SsGeEspecialidad> listarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad);

	public SsGeEspecialidad buscarSsGeEspecialidadID(SsGeEspecialidad ssGeEspecialidad);

	public int contadorDeTotales(SsGeEspecialidad ssGeEspecialidad);

	public int eliminarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad);

	public int guardarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad);

}
