package pe.royalsystems.springerp.service;

import org.joda.time.DateTime;
import pe.royalsystems.springerp.model.domain.vista.VwHorarioMedico;

import java.util.List;

public interface HorarioMedicoService {

	public DateTime[] buscarFechaHoraLimites(VwHorarioMedico filtro);
	
	public List<VwHorarioMedico> listarVwHorarioMedico(VwHorarioMedico filtro);
}
