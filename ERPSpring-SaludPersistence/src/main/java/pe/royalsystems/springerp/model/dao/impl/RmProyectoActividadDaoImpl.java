package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.RmProyectoActividadDao;
import pe.royalsystems.springerp.model.domain.RmProyectoActividad;

@Repository
public class RmProyectoActividadDaoImpl extends AbstractDaoImpl<RmProyectoActividad, String>
		implements RmProyectoActividadDao {

	protected RmProyectoActividadDaoImpl() {
		super(RmProyectoActividad.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<RmProyectoActividad> listarRmProyectoActividadPaginacion(RmProyectoActividad objRmProyectoActividad) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoActividad.class);

			if (objRmProyectoActividad.getId().getActividad()!=null) {
				criteria.add(Restrictions.eq("id.actividad", objRmProyectoActividad.getId().getActividad()));
			}
			if (objRmProyectoActividad.getId().getCentroCosto()!=null) {
				criteria.add(Restrictions.eq("id.centroCosto", objRmProyectoActividad.getId().getCentroCosto()));
			}
			if (objRmProyectoActividad.getId().getNumeroHoras()!=0) {
				criteria.add(Restrictions.eq("id.numeroHoras", objRmProyectoActividad.getId().getNumeroHoras()));
			}
			if (objRmProyectoActividad.getId().getProyecto()!=null) {
				criteria.add(Restrictions.eq("id.proyecto", objRmProyectoActividad.getId().getProyecto()));
			}
			if (objRmProyectoActividad.getId().getUsuarioSupervisor()!=null) {
				criteria.add(Restrictions.eq("id.usuarioSupervisor", objRmProyectoActividad.getId().getUsuarioSupervisor()));
			}
			
			criteria.setFirstResult(objRmProyectoActividad.getInicio());
			criteria.setMaxResults(objRmProyectoActividad.getNumeroFilas());
			
			return criteria.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(RmProyectoActividad objRmProyectoActividad) {
		// TODO Auto-generated method stub
		try {
			

			Criteria criteria = getCurrentSession().createCriteria(RmProyectoActividad.class);

			if (objRmProyectoActividad.getId().getActividad()!=null) {
				criteria.add(Restrictions.eq("id.actividad", objRmProyectoActividad.getId().getActividad()));
			}
			if (objRmProyectoActividad.getId().getCentroCosto()!=null) {
				criteria.add(Restrictions.eq("id.centroCosto", objRmProyectoActividad.getId().getCentroCosto()));
			}
			if (objRmProyectoActividad.getId().getNumeroHoras()!=0) {
				criteria.add(Restrictions.eq("id.numeroHoras", objRmProyectoActividad.getId().getNumeroHoras()));
			}
			if (objRmProyectoActividad.getId().getProyecto()!=null) {
				criteria.add(Restrictions.eq("id.proyecto", objRmProyectoActividad.getId().getProyecto()));
			}
			if (objRmProyectoActividad.getId().getUsuarioSupervisor()!=null) {
				criteria.add(Restrictions.eq("id.usuarioSupervisor", objRmProyectoActividad.getId().getUsuarioSupervisor()));
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
	public int guardarRmProyectoActividad(RmProyectoActividad objRmProyectoActividad) {
		// TODO Auto-generated method stub
		try {
			
			saveOrUpdate(objRmProyectoActividad);
			
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarRmProyectoActividad(RmProyectoActividad objRmProyectoActividad) {
		// TODO Auto-generated method stub
		try {
			
			delete(objRmProyectoActividad);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public RmProyectoActividad obtenerRmProyectoActividadID(RmProyectoActividad objRmProyectoActividad) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoActividad.class);
			criteria.add(Restrictions.idEq(objRmProyectoActividad.getId()));
			return (RmProyectoActividad) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
