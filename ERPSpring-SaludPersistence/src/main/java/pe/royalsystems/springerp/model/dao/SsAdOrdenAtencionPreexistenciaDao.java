package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionPreexistencia;

public interface SsAdOrdenAtencionPreexistenciaDao extends AbstractDao<SsAdOrdenAtencionPreexistencia, String>{

	public List<SsAdOrdenAtencionPreexistencia> listarTratamientosActivos(SsAdOrdenAtencionPreexistencia  objSsAdOrdenAtencionPreexistencia);
	
}

