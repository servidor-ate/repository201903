package pe.royalsystems.springerp.service;

import java.util.List;
import java.util.Map;

import pe.royalsystems.springerp.commons.model.PaginaModel;
import pe.royalsystems.springerp.commons.model.ResultTx;
import pe.royalsystems.springerp.model.domain.CoServicioClasificacion;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencion;
import pe.royalsystems.springerp.model.domain.SsCcCita;
import pe.royalsystems.springerp.model.domain.SsHcObligacion;
import pe.royalsystems.springerp.model.domain.vista.VwCitaMedica;
import pe.royalsystems.springerp.model.util.AuditoriaModel;

public interface CitaMedicaService {
	
	public VwCitaMedica obtenerPorId(Integer idCita);
	
	public Integer reservarCitaMedica(SsCcCita cita, AuditoriaModel auditoriaModel);
	
	public Integer reprogramarCitaMedica(Integer idCitaAnterior, SsCcCita nuevaCita, AuditoriaModel auditoriaModel);
	
	public List<VwCitaMedica> listarVwCitasMedicas(VwCitaMedica filtro);
	
	public List<SsCcCita> listarCitasMedicas(SsCcCita filtro);
	
	public Map<String, List<SsCcCita>> mapearCitasPorFecha(SsCcCita filtro);
	
	public Map<String, List<SsCcCita>> mapearCitasPorFecha(List<SsCcCita> listaCitas);
	
	public Personamast obtenerPaciente(Integer idCita);
	
	public PaginaModel<VwCitaMedica> listarVwCitasMedicasPaginadas(VwCitaMedica filtro);
	
	public ResultTx<SsAdOrdenAtencion> reservarCitaMedicaOA(SsCcCita cita, AuditoriaModel auditoriaModel, Integer numeroCorrelativoOA);
	public ResultTx<SsHcObligacion> reservarCitaMedicaObligaciones(SsCcCita cita, AuditoriaModel auditoriaModel,
                                                                   CoServicioClasificacion servicioPago);
	
	public ResultTx<SsHcObligacion>  reprogramarCitaMedicaObligaciones(Integer idCitaAnterior, SsCcCita nuevaCita,
                                                                       AuditoriaModel auditoriaModel, CoServicioClasificacion servicioPago);
	public Integer anularCitaMedica(Integer idCitaAnterior, AuditoriaModel auditoriaModel);
	
	public int enviarCorreoReservaCita(Integer idCita, String indica);		
	
}
