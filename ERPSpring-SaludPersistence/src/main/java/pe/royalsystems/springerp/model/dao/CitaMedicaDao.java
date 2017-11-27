package pe.royalsystems.springerp.model.dao;

import java.util.Date;
import java.util.List;

import pe.royalsystems.springerp.model.domain.SsCcCita;
import pe.royalsystems.springerp.model.domain.vista.VwCitaMedica;

public interface CitaMedicaDao extends AbstractDao<SsCcCita, Integer> {
	
	public VwCitaMedica obtenerPorId(Integer idCita);
	
	public List<SsCcCita> obtenerPorIdsHorario(List<Integer> idsHorario, int estado, Date fechaInicioBusqueda);
	
	public List<SsCcCita> listarSSccCitasMedicas(SsCcCita filtro);
	
	public List<VwCitaMedica> listarVwCitasMedicas(VwCitaMedica filtro);
	
	public int contarVwCitasMedicas(VwCitaMedica filtro);
	
	public int contarNumeroCitasPorDia(VwCitaMedica filtro);
	
	public int contarNumeroCitasPorDia(SsCcCita filtro);
	
}
