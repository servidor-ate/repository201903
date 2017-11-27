package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.DiaFeriadoDao;
import pe.royalsystems.springerp.model.domain.GE_DiaFeriado;

@Repository
public class DiaFeriadoDaoImpl extends AbstractDaoImpl<GE_DiaFeriado, Integer> implements DiaFeriadoDao {
	
	protected DiaFeriadoDaoImpl(){
		super(GE_DiaFeriado.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<GE_DiaFeriado> listarGeDiaFeriado(GE_DiaFeriado filtro) {
		Criteria cq = createCriteria();
		if(filtro.getFechaInicioBusqueda() != null && filtro.getFechaFinBusqueda() != null){
			cq.add(Restrictions.between("fecha", filtro.getFechaInicioBusqueda(), filtro.getFechaFinBusqueda()));
		}
		if(UtilesCommons.esPositivo(filtro.getEstado())){
			cq.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		return (List<GE_DiaFeriado>) cq.list();
	}

}
