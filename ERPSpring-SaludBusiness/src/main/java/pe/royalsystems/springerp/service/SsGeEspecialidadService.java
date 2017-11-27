package pe.royalsystems.springerp.service;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;

public interface SsGeEspecialidadService {

	public List<SsGeEspecialidad> listarTablaSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad);

	public SsGeEspecialidad buscarSsGeEspecialidadID(SsGeEspecialidad ssGeEspecialidad);

	public int contadorDeTotales(SsGeEspecialidad ssGeEspecialidad);

	public int eliminarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad);

	public int guardarSsGeEspecialidad(SsGeEspecialidad ssGeEspecialidad);

}
