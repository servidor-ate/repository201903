package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.RmActividadDao;
import pe.royalsystems.springerp.model.domain.RmActividad;

@Repository
public class RmActividadDaoImpl extends AbstractDaoImpl<RmActividad, String>implements RmActividadDao {

	protected RmActividadDaoImpl() {
		super(RmActividad.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<RmActividad> listarRmActividadPaginacion(RmActividad objRmActividad) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(RmActividad.class);

			if (objRmActividad.getActividad()!=null) {
				criteria.add(Restrictions.eq("actividad", objRmActividad.getActividad()));
			}
			if (objRmActividad.getDescripcion()!=null) {
				criteria.add(Restrictions.like("descripcion", objRmActividad.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			criteria.setFirstResult(objRmActividad.getInicio());
			criteria.setMaxResults(objRmActividad.getNumeroFilas());

			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(RmActividad objRmActividad) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(RmActividad.class);

			if (objRmActividad.getActividad()!=null) {
				criteria.add(Restrictions.eq("actividad", objRmActividad.getActividad()));
			}
			if (objRmActividad.getDescripcion()!=null) {
				criteria.add(Restrictions.like("descripcion", objRmActividad.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			criteria.setProjection(Projections.rowCount());

			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarRmActividad(RmActividad objRmActividad) {
		// TODO Auto-generated method stub
		try {
			saveOrUpdate(objRmActividad);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarRmActividad(RmActividad objRmActividad) {
		// TODO Auto-generated method stub
		try {
			delete(objRmActividad);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public RmActividad obtenerRmActividadID(RmActividad objRmActividad) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(RmActividad.class);
			criteria.add(Restrictions.eq("actividad",objRmActividad.getActividad()));			
			return (RmActividad) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
