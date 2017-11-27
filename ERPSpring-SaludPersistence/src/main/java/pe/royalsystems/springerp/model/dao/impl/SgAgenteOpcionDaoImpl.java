package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SgAgenteOpcionDao;
import pe.royalsystems.springerp.model.domain.SgAgenteOpcion;

@Repository
public class SgAgenteOpcionDaoImpl extends AbstractDaoImpl<SgAgenteOpcion, String> implements SgAgenteOpcionDao{

	protected SgAgenteOpcionDaoImpl() {
		super(SgAgenteOpcion.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int guardarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion) {
		// TODO Auto-generated method stub
		try {
			
			save(objSgAgenteOpcion);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion) {
		// TODO Auto-generated method stub
		try {
			delete(objSgAgenteOpcion);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public SgAgenteOpcion buscarSgAgenteOpcionID(SgAgenteOpcion objSgAgenteOpcion) {
		// TODO Auto-generated method stub
		try {
			
			SgAgenteOpcion sgAgenteOpcionRetorno;
			
			Criteria criteria = getCurrentSession().createCriteria(SgAgenteOpcion.class);
			criteria.add(Restrictions.eq("idAgente", objSgAgenteOpcion.getIdAgente()));
			criteria.add(Restrictions.eq("idOpcion", objSgAgenteOpcion.getIdOpcion()));
			
			sgAgenteOpcionRetorno = (SgAgenteOpcion) criteria.uniqueResult();
			
			return sgAgenteOpcionRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
