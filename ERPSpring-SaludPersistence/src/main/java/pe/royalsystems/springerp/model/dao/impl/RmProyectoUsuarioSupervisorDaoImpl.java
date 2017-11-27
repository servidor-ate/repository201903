package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.RmProyectoUsuarioSupervisorDao;
import pe.royalsystems.springerp.model.domain.RmProyectoUsuarioSupervisor;

@Repository
public class RmProyectoUsuarioSupervisorDaoImpl extends AbstractDaoImpl<RmProyectoUsuarioSupervisor, String> implements RmProyectoUsuarioSupervisorDao{

	protected RmProyectoUsuarioSupervisorDaoImpl() {
		super(RmProyectoUsuarioSupervisor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<RmProyectoUsuarioSupervisor> listarRmProyectoUsuarioSupervisorPaginacion(
			RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoUsuarioSupervisor.class);
			if (objRmProyectoUsuarioSupervisor.getId().getCentroCosto()!=null) {
				criteria.add(Restrictions.eq("id.centroCosto", objRmProyectoUsuarioSupervisor.getId().getCentroCosto()));
			}
			if (objRmProyectoUsuarioSupervisor.getId().getProyecto()!=null) {
				criteria.add(Restrictions.eq("id.proyecto", objRmProyectoUsuarioSupervisor.getId().getProyecto()));
			}
			if (objRmProyectoUsuarioSupervisor.getId().getUsuarioSupervisor()!=null) {
				criteria.add(Restrictions.eq("id.usuarioSupervisor", objRmProyectoUsuarioSupervisor.getId().getUsuarioSupervisor()));
			}
			criteria.setFirstResult(objRmProyectoUsuarioSupervisor.getInicio());
			criteria.setMaxResults(objRmProyectoUsuarioSupervisor.getNumeroFilas());
			
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoUsuarioSupervisor.class);
			if (objRmProyectoUsuarioSupervisor.getId().getCentroCosto()!=null) {
				criteria.add(Restrictions.eq("id.centroCosto", objRmProyectoUsuarioSupervisor.getId().getCentroCosto()));
			}
			if (objRmProyectoUsuarioSupervisor.getId().getProyecto()!=null) {
				criteria.add(Restrictions.eq("id.proyecto", objRmProyectoUsuarioSupervisor.getId().getProyecto()));
			}
			if (objRmProyectoUsuarioSupervisor.getId().getUsuarioSupervisor()!=null) {
				criteria.add(Restrictions.eq("id.usuarioSupervisor", objRmProyectoUsuarioSupervisor.getId().getUsuarioSupervisor()));
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
	public int guardarRmProyectoUsuarioSupervisor(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor) {
		// TODO Auto-generated method stub
		try {
			saveOrUpdate(objRmProyectoUsuarioSupervisor);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarRmProyectoUsuarioSupervisor(RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor) {
		// TODO Auto-generated method stub
		try {
			delete(objRmProyectoUsuarioSupervisor);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public RmProyectoUsuarioSupervisor obtenerRmProyectoUsuarioSupervisorID(
			RmProyectoUsuarioSupervisor objRmProyectoUsuarioSupervisor) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoUsuarioSupervisor.class);
			criteria.add(Restrictions.idEq(objRmProyectoUsuarioSupervisor.getId()));
			return (RmProyectoUsuarioSupervisor) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
