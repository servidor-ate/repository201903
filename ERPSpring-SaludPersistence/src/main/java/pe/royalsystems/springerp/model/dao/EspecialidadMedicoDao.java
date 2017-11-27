package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsGeEspecialidadMedico;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;

public interface EspecialidadMedicoDao extends AbstractDao<SsGeEspecialidadMedico, Integer> {

	
	public List<VwEspecialidadMedico> listarVwEspecialidadMedico(VwEspecialidadMedico filtro);
}
