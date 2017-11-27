package pe.royalsystems.springerp.model.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.TimeCommons;
import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.CitaMedicaDao;
import pe.royalsystems.springerp.model.domain.SsCcCita;
import pe.royalsystems.springerp.model.domain.vista.VwCitaMedica;

@Repository
public class CitaMedicaDaoImpl extends AbstractDaoImpl<SsCcCita, Integer> implements CitaMedicaDao {

	protected CitaMedicaDaoImpl() {
		super(SsCcCita.class);
	}
	
	@Override
	public VwCitaMedica obtenerPorId(Integer idCita){
		Criteria cq = createCriteria(VwCitaMedica.class);
		cq.add(Restrictions.eq("idCita", idCita));
		return (VwCitaMedica) cq.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SsCcCita> obtenerPorIdsHorario(List<Integer> idsHorario, int estado, Date fechaInicioBusqueda){
		Criteria cq = createCriteria();
		cq.add(Restrictions.in("idHorario", idsHorario));
		cq.add(Restrictions.eq("estado", estado));
		if(fechaInicioBusqueda != null){
			cq.add(Restrictions.ge("fechaCita", fechaInicioBusqueda));
		}
		cq.addOrder(Order.asc("fechaCita"));
		return (List<SsCcCita>) cq.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SsCcCita> listarSSccCitasMedicas(SsCcCita filtro){
		Criteria cq = createCriteria();
		if(UtilesCommons.noEsNulo(filtro.getIdMedico())){
			cq.add(Restrictions.eq("idMedico", filtro.getIdMedico()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdHorario())){
			cq.add(Restrictions.eq("idHorario", filtro.getIdHorario()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdPaciente())){
			cq.add(Restrictions.eq("idPaciente", filtro.getIdPaciente()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstado())){
			cq.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstadoDocumento())){
			cq.add(Restrictions.eq("estadoDocumento", filtro.getEstadoDocumento()));
		}
		if(filtro.getFechaInicioBusqueda() != null && filtro.getFechaFinBusqueda() != null){
			cq.add(Restrictions.between("fechaCita", filtro.getFechaInicioBusqueda(), filtro.getFechaFinBusqueda()));
		}
		setPaginable(filtro, cq);
		setOrdenableAsc(filtro, cq);
		return (List<SsCcCita>) cq.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VwCitaMedica> listarVwCitasMedicas(VwCitaMedica filtro) {
		Criteria cq = createCriteria(VwCitaMedica.class);
		setFiltrosVwCitasMedicas(filtro, cq);
		setFiltrosAdicionales(filtro, cq);
		setPaginable(filtro, cq);
		setOrdenable(cq, ORDER_DESC, "fechaCita");
		return (List<VwCitaMedica>) cq.list();
	}
	
	public int contarVwCitasMedicas(VwCitaMedica filtro){
		Criteria cq = createCriteria(VwCitaMedica.class);
		setFiltrosVwCitasMedicas(filtro, cq);
		setFiltrosAdicionales(filtro, cq);
		cq.setProjection(Projections.rowCount());
		Object result = cq.uniqueResult();
		if(result == null){
			return 0;
		}else{
			return Integer.parseInt(result.toString());
		}
	}
	
	public int contarNumeroCitasPorDia(VwCitaMedica filtro){
		Criteria cq = createCriteria(VwCitaMedica.class);
		setFiltrosVwCitasMedicas(filtro, cq);
		if(filtro.getFechaInicioBusqueda() != null && filtro.getFechaFinBusqueda() != null){
			cq.add(Restrictions.between("fechaCreacion", filtro.getFechaInicioBusqueda(), filtro.getFechaFinBusqueda()));
		}
		cq.setProjection(Projections.rowCount());
		Object result = cq.uniqueResult();
		if(result == null){
			return 0;
		}else{
			return Integer.parseInt(result.toString());
		}
	}
	
	public int contarNumeroCitasPorDia(SsCcCita filtro){
		Criteria cq = createCriteria();
		if(UtilesCommons.noEsVacio(filtro.getIdPaciente())){
			cq.add(Restrictions.eq("idPaciente", filtro.getIdPaciente()));
		}
		if(UtilesCommons.noEsVacio(filtro.getUsuarioCreacion())){
			cq.add(Restrictions.eq("usuarioCreacion", filtro.getUsuarioCreacion()));
		}
		if(UtilesCommons.noEsNulo(filtro.getIdMedico())){
			cq.add(Restrictions.eq("idMedico", filtro.getIdMedico()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdHorario())){
			cq.add(Restrictions.eq("idHorario", filtro.getIdHorario()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstado())){
			cq.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdServicio())){
			cq.add(Restrictions.eq("idServicio", filtro.getIdServicio()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdEspecialidad())){
			cq.add(Restrictions.eq("idEspecialidad", filtro.getIdEspecialidad()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIndicadorWeb())){
			cq.add(Restrictions.eq("indicadorWeb", filtro.getIndicadorWeb()));
		}
		if(filtro.getFechaInicioBusqueda() != null && filtro.getFechaFinBusqueda() != null){
			cq.add(Restrictions.between("fechaCreacion", filtro.getFechaInicioBusqueda(), filtro.getFechaFinBusqueda()));
		}
		
		cq.setProjection(Projections.rowCount());
		Object result = cq.uniqueResult();
		if(result == null){
			return 0;
		}else{
			return Integer.parseInt(result.toString());
		}
	}

	
	public void setFiltrosVwCitasMedicas(VwCitaMedica filtro, Criteria cq){
		if(UtilesCommons.noEsNulo(filtro.getIdMedico())){
			cq.add(Restrictions.eq("idMedico", filtro.getIdMedico()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdHorario())){
			cq.add(Restrictions.eq("idHorario", filtro.getIdHorario()));
		}
		if(UtilesCommons.noEsVacio(filtro.getCitaEstado())){
			cq.add(Restrictions.eq("citaEstado", filtro.getCitaEstado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdPaciente())){
			cq.add(Restrictions.eq("idPaciente", filtro.getIdPaciente()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdServicio())){
			cq.add(Restrictions.eq("idServicio", filtro.getIdServicio()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdTipoAtencion())){
			cq.add(Restrictions.eq("idTipoAtencion", filtro.getIdTipoAtencion()));
		}
		if(UtilesCommons.noEsVacio(filtro.getListTipoRegistroHorario())){
			cq.add(Restrictions.in("horarioTipoRegistroHorario", filtro.getListTipoRegistroHorario()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdTurno())){
			cq.add(Restrictions.ne("idTurno", filtro.getIdTurno()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdServicio())){
			cq.add(Restrictions.eq("idServicio", filtro.getIdServicio()));
		}
		if(UtilesCommons.noEsVacio(filtro.getCitaEstado())){
			cq.add(Restrictions.eq("citaEstado", filtro.getCitaEstado()));
		}
	}
	
	public void setFiltrosAdicionales(VwCitaMedica filtro, Criteria cq){
		if(UtilesCommons.noEsVacio(filtro.getEspecialidadNombre())){
			cq.add(Restrictions.ilike("especialidadNombre", filtro.getEspecialidadNombre(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.noEsVacio(filtro.getMedicoNombreCompleto())){
			cq.add(Restrictions.ilike("medicoNombreCompleto", filtro.getMedicoNombreCompleto(), MatchMode.ANYWHERE));
		}
		if(filtro.getFechaInicioBusqueda() != null){
			cq.add(Restrictions.ge("fechaCita", TimeCommons.getSoloFechaInicial(filtro.getFechaInicioBusqueda()).toDate()));
		}
		if(filtro.getFechaFinBusqueda() != null){
			cq.add(Restrictions.le("fechaCita", TimeCommons.getSoloFechaFinal(filtro.getFechaFinBusqueda()).toDate()));
		}
		
	}
}
