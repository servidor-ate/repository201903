package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.AtencionPacienteGeneral;
import pe.royalsystems.springerp.model.domain.VwAtencionpacienteGeneral;

public interface VwAtencionpacienteGeneralDao extends AbstractDao<VwAtencionpacienteGeneral, String>{

	List<VwAtencionpacienteGeneral> listVwAtencionpacienteGeneral(VwAtencionpacienteGeneral vwAtencionpacienteGeneral);
	
	public List<AtencionPacienteGeneral> listaVwAtencionpacienteGeneral_2(AtencionPacienteGeneral atencionpacienteGeneral);
	
	public int contadorTotales(AtencionPacienteGeneral vwAtencionpacienteGeneral);
	
}
