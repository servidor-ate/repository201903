package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.RmProyectoUsuarioDao;
import pe.royalsystems.springerp.model.domain.RmProyectoUsuario;

@Repository
public class RmProyectoUsuarioDaoImpl extends AbstractDaoImpl<RmProyectoUsuario, String>
		implements RmProyectoUsuarioDao {

	protected RmProyectoUsuarioDaoImpl() {
		super(RmProyectoUsuario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<RmProyectoUsuario> listarRmProyectoUsuarioPaginacion(RmProyectoUsuario objRmProyectoUsuario) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoUsuario.class);

			if (objRmProyectoUsuario.getId().getCentroCosto()!=null) {
				criteria.add(Restrictions.eq("id.centroCosto", objRmProyectoUsuario.getId().getCentroCosto()));
			}
			if (objRmProyectoUsuario.getId().getProyecto()!=null) {
				criteria.add(Restrictions.eq("id.proyecto", objRmProyectoUsuario.getId().getProyecto()));
			}
			if (objRmProyectoUsuario.getId().getUsuario()!=null) {
				criteria.add(Restrictions.eq("id.usuario", objRmProyectoUsuario.getId().getUsuario()));
			}
			if (objRmProyectoUsuario.getId().getUsuarioSupervisor()!=null) {
				criteria.add(Restrictions.eq("id.usuarioSupervisor", objRmProyectoUsuario.getId().getUsuarioSupervisor()));
			}
			criteria.setFirstResult(objRmProyectoUsuario.getInicio());
			criteria.setMaxResults(objRmProyectoUsuario.getNumeroFilas());
			
			return criteria.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(RmProyectoUsuario objRmProyectoUsuario) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(RmProyectoUsuario.class);

			if (objRmProyectoUsuario.getId().getCentroCosto()!=null) {
				criteria.add(Restrictions.eq("id.centroCosto", objRmProyectoUsuario.getId().getCentroCosto()));
			}
			if (objRmProyectoUsuario.getId().getProyecto()!=null) {
				criteria.add(Restrictions.eq("id.proyecto", objRmProyectoUsuario.getId().getProyecto()));
			}
			if (objRmProyectoUsuario.getId().getUsuario()!=null) {
				criteria.add(Restrictions.eq("id.usuario", objRmProyectoUsuario.getId().getUsuario()));
			}
			if (objRmProyectoUsuario.getId().getUsuarioSupervisor()!=null) {
				criteria.add(Restrictions.eq("id.usuarioSupervisor", objRmProyectoUsuario.getId().getUsuarioSupervisor()));
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
	public int guardarRmProyectoUsuario(RmProyectoUsuario objRmProyectoUsuario) {
		// TODO Auto-generated method stub
		try {
			saveOrUpdate(objRmProyectoUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarRmProyectoUsuario(RmProyectoUsuario objRmProyectoUsuario) {
		// TODO Auto-generated method stub
		try {
			
			delete(objRmProyectoUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public RmProyectoUsuario obtenerRmProyectoUsuarioID(RmProyectoUsuario objRmProyectoUsuario) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(RmProyectoUsuario.class);
			criteria.add(Restrictions.idEq(objRmProyectoUsuario.getId()));
			return (RmProyectoUsuario) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
