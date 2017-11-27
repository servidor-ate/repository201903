package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.EmpleadoDao;
import pe.royalsystems.springerp.model.domain.Empleadomast;
import pe.royalsystems.springerp.model.domain.vista.VwEmpleado;

@Repository
public class EmpleadoDaoImpl extends AbstractDaoImpl<Empleadomast, Integer> implements EmpleadoDao {

	protected EmpleadoDaoImpl() {
		super(Empleadomast.class);
	}
	
	@Override
	public VwEmpleado obtenerPorId(Integer idEmpleado){
		Criteria cq = createCriteria(VwEmpleado.class);
		cq.add(Restrictions.eq("empleado", idEmpleado));
		return (VwEmpleado) cq.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VwEmpleado> listarVwEmpleados(VwEmpleado filtro) {
		Criteria criteria = getCurrentSession().createCriteria(VwEmpleado.class);
		if(UtilesCommons.noEsVacio(filtro.getNombreCompleto())){
			criteria.add(Restrictions.ilike("nombreCompleto", filtro.getNombreCompleto(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.esPositivo(filtro.getEmpleado())){
			criteria.add(Restrictions.eq("empleado", filtro.getEmpleado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getTipoPersona())){
			criteria.add(Restrictions.eq("tipoPersona", filtro.getTipoPersona()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstado())){
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getListInteger())){
			criteria.add(Restrictions.in("empleado", filtro.getListInteger()));
		}
		setPaginable(filtro, criteria);
		setOrdenableAsc(filtro, criteria);
		return (List<VwEmpleado>) criteria.list();
	}

}
