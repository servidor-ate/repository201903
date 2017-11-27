package pe.royalsystems.springerp.model.dao.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.HorarioMedicoDao;
import pe.royalsystems.springerp.model.domain.SsCcHorario;
import pe.royalsystems.springerp.model.domain.vista.VwHorarioMedico;
import pe.royalsystems.springerp.model.util.Constant;

@Repository
public class HorarioMedicoDaoImpl extends AbstractDaoImpl<SsCcHorario, Integer> implements HorarioMedicoDao {

	protected HorarioMedicoDaoImpl() {
		super(SsCcHorario.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<VwHorarioMedico> buscarFechaInicio(VwHorarioMedico filtro){
		Criteria cq = createCriteria(VwHorarioMedico.class);
		setFiltroHorario(filtro, cq);
		if(filtro.getFechaBusqueda() != null){
			Criterion critInf = Restrictions.le("fechaInicio", filtro.getFechaBusqueda());
			Criterion critSup = Restrictions.ge("fechaFin", filtro.getFechaBusqueda());
			cq.add(Restrictions.and(critInf, critSup));
		}
		cq.addOrder(Order.asc("fechaInicio"));
		cq.addOrder(Order.desc("horaFin"));
		cq.addOrder(Order.desc("indicadorLunes"));
		cq.addOrder(Order.desc("indicadorMartes"));
		cq.addOrder(Order.desc("indicadorMiercoles"));
		cq.addOrder(Order.desc("indicadorJueves"));
		cq.addOrder(Order.desc("indicadorViernes"));
		cq.addOrder(Order.desc("indicadorSabado"));
		cq.addOrder(Order.desc("indicadorDomingo"));
		
		List<VwHorarioMedico> list = (List<VwHorarioMedico>)cq.list();
//		cq.setMaxResults(1);
//		cq.setFetchSize(1);
//		Object result = cq.uniqueResult();
//		List<VwHorarioMedico> list;
//		if(result == null){
//			list = null;
//		}else{
//			VwHorarioMedico object = (VwHorarioMedico) cq.uniqueResult();
//			list = Arrays.asList(object);
//		}
		return list;
	}
	
	public Date buscarHoraMinima(VwHorarioMedico filtro){
		Criteria cq = createCriteria(VwHorarioMedico.class);
		setFiltroHorario(filtro, cq);
		cq.setProjection(Projections.min("horaInicio"));
		Object result = cq.uniqueResult();
		if(result == null){
			return null;
		}else{
			return (Date) result;
		}
	}
	
	public Date buscarHoraMaxima(VwHorarioMedico filtro){
		Criteria cq = createCriteria(VwHorarioMedico.class);
		setFiltroHorario(filtro, cq);
		cq.setProjection(Projections.max("horaFin"));
		Object result = cq.uniqueResult();
		if(result == null){
			return null;
		}else{
			return (Date) result;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VwHorarioMedico> listarVwHorarioMedico(VwHorarioMedico filtro) {
		Criteria cq = createCriteria(VwHorarioMedico.class);
		setFiltroHorario(filtro, cq);
		setFiltroFechas(filtro, cq);
		setPaginable(filtro, cq);
		setOrdenable(cq, ORDER_ASC, "fechaInicio", "horaInicio");
		return (List<VwHorarioMedico>) cq.list();
	}
	
	public void setFiltroHorario(VwHorarioMedico filtro, Criteria cq){
		if(UtilesCommons.noEsNulo(filtro.getIdHorario())){
			cq.add(Restrictions.eq("idHorario", filtro.getIdHorario()));
		}
		if(UtilesCommons.noEsNulo(filtro.getMedico())){
			cq.add(Restrictions.eq("medico", filtro.getMedico()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdConsultorio())){
			cq.add(Restrictions.eq("idConsultorio", filtro.getIdConsultorio()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdEspecialidad())){
			cq.add(Restrictions.eq("idEspecialidad", filtro.getIdEspecialidad()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstado())){
			cq.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getListTipoRegistroHorario())){
			cq.add(Restrictions.in("tipoRegistroHorario", filtro.getListTipoRegistroHorario()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdTurno())){
			cq.add(Restrictions.ne("idTurno", filtro.getIdTurno()));
		}
		if(UtilesCommons.noEsVacio(filtro.getIdServicio())){
			cq.add(Restrictions.eq("idServicio", filtro.getIdServicio()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstadoConsultorio())){
			cq.add(Restrictions.eq("estadoConsultorio", filtro.getEstadoConsultorio()));
		}
	}
	
	public void setFiltroFechas(VwHorarioMedico filtro, Criteria cq){
		if(filtro.getFechaInicio() != null && filtro.getFechaFin() != null){
			Criterion filtroInicio = Restrictions.ge("fechaInicio", filtro.getFechaInicio());
			Criterion filtroFin = Restrictions.le("fechaFin", filtro.getFechaFin());
			cq.add(Restrictions.and(filtroInicio, filtroFin));
		}
	}
	
	public void setFiltroFechasHorario(VwHorarioMedico filtro, Criteria cq){
		if(UtilesCommons.sonPositivos(filtro.getYearFechaInicioHorario(), filtro.getYearFechaFinHorario())){
			if(filtro.getYearFechaInicioHorario().compareTo(filtro.getYearFechaFinHorario()) == 0){
				filtro.setYearParaBuscar(filtro.getYearFechaInicioHorario());
				Criterion yearBuscarInicial = Restrictions.le("yearFechaInicioHorario", filtro.getYearParaBuscar());
				Criterion yearBuscarFinal   = Restrictions.ge("yearFechaFinHorario", filtro.getYearParaBuscar());
				cq.add(Restrictions.and(yearBuscarInicial, yearBuscarFinal));
			}else{
				Criterion yearBuscarInicial = Restrictions.le("yearFechaInicioHorario", filtro.getYearFechaInicioHorario());
				Criterion yearBuscarFinal   = Restrictions.ge("yearFechaFinHorario", filtro.getYearFechaFinHorario());
				cq.add(Restrictions.and(yearBuscarInicial, yearBuscarFinal));
			}
		}
		
		if(UtilesCommons.sonPositivos(filtro.getMonthFechaInicioHorario(), filtro.getMonthFechaFinHorario())){
			if(filtro.getMonthFechaInicioHorario().compareTo(filtro.getMonthFechaFinHorario()) == 0){
				filtro.setMonthParaBuscar(filtro.getMonthFechaInicioHorario());
				Criterion monthBuscarInicial = Restrictions.le("monthFechaInicioHorario", filtro.getMonthParaBuscar());
				Criterion monthBuscarFinal   = Restrictions.ge("monthFechaFinHorario", filtro.getMonthParaBuscar());
				cq.add(Restrictions.and(monthBuscarInicial, monthBuscarFinal));
			}else{
				Criterion monthBuscarInicial = Restrictions.le("monthFechaInicioHorario", filtro.getMonthFechaInicioHorario());
				Criterion monthBuscarFinal   = Restrictions.ge("monthFechaFinHorario", filtro.getMonthFechaFinHorario());
				cq.add(Restrictions.and(monthBuscarInicial, monthBuscarFinal));
			}
		}
		
		if(UtilesCommons.sonPositivos(filtro.getDayFechaInicioHorario(), filtro.getDayFechaFinHorario())){
			if(filtro.getDayFechaInicioHorario().compareTo(filtro.getDayFechaFinHorario()) == 0){
				filtro.setDayParaBuscar(filtro.getDayFechaInicioHorario());
				Criterion dayBuscarInicial = Restrictions.le("dayFechaInicioHorario", filtro.getDayParaBuscar());
				Criterion dayBuscarFinal   = Restrictions.ge("dayFechaFinHorario", filtro.getDayParaBuscar());
				cq.add(Restrictions.and(dayBuscarInicial, dayBuscarFinal));
			}else{
				Criterion dayBuscarInicial = Restrictions.le("dayFechaInicioHorario", filtro.getDayFechaInicioHorario());
				Criterion dayBuscarFinal   = Restrictions.ge("dayFechaFinHorario", filtro.getDayFechaFinHorario());
				cq.add(Restrictions.and(dayBuscarInicial, dayBuscarFinal));
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> listarMedicosEnHorario() {
		Criteria cq = createCriteria();
//		cq.add(Restrictions.eq("estado", Constant.INT_ACTIVO));
		cq.setProjection(Projections.distinct(Projections.property("medico")));
		return (List<Integer>) cq.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> listarEspecialidadesEnHorario() {
		Criteria cq = createCriteria();
		cq.add(Restrictions.eq("estado", Constant.INT_ACTIVO));
		cq.setProjection(Projections.distinct(Projections.property("idEspecialidad")));
		return (List<Integer>) cq.list();
	}

}
