package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SgOpcionDao;
import pe.royalsystems.springerp.model.domain.SgOpcion;

@Repository
public class SgOpcionDaoImpl extends AbstractDaoImpl<SgOpcion, Integer> implements SgOpcionDao{

	protected SgOpcionDaoImpl() {
		super(SgOpcion.class);		
	}

	@Override
	public int guardarSgOpcion(SgOpcion objsgOpcion) {
		int ePisodio=0;
		Criteria criteria = getCurrentSession().createCriteria(SgOpcion.class);
		criteria.setProjection(Projections.max("idOpcion"));
		if (criteria.uniqueResult()!=null) 
		ePisodio = (int) criteria.uniqueResult();	
		ePisodio = ePisodio +1;
		objsgOpcion.setIdOpcion(ePisodio);
		save(objsgOpcion);
		return ePisodio;
	}

	@Override
	public int eliminarSgOpcion(SgOpcion objSgOpcion) {
		delete(objSgOpcion);
		return 1;
	}

	@Override
	public SgOpcion obtenerSgOpcionID(Integer id) {
		Object result = findById(id);
		return result!=null?(SgOpcion)result:null;
	}

	@Override
	public int actualizarSgOpcion(SgOpcion objsgOpcion) {
		update(objsgOpcion);
		return 1;
	}

}
