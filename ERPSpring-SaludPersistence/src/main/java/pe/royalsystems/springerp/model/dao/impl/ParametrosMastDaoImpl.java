package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.ParametrosMastDao;
import pe.royalsystems.springerp.model.domain.ParametrosMast;
import pe.royalsystems.springerp.model.domain.ParametrosMastId;

@Repository
public class ParametrosMastDaoImpl extends AbstractDaoImpl<ParametrosMast, ParametrosMastId>  implements ParametrosMastDao {

	protected ParametrosMastDaoImpl() {
		super(ParametrosMast.class);		
	}

	@Override
	public ParametrosMast obtenerPorId(ParametrosMastId id) {
		Object result = findById(id);
		return (result!=null?(ParametrosMast)result:null);
	}

	@Override
	public List<ParametrosMast> listarElementos(ParametrosMast objDao, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(ParametrosMast.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getAplicacionCodigo())) {
			criteria.add(Restrictions.eq("id.aplicacionCodigo",objDao.getId().getAplicacionCodigo() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getCompaniaCodigo())) {
			criteria.add(Restrictions.eq("id.companiaCodigo",objDao.getId().getCompaniaCodigo() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getParametroClave())) {
			criteria.add(Restrictions.eq("id.parametroClave",objDao.getId().getParametroClave() ));
		}
	
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}	
		if (UtilesCommons.noEsVacio(objDao.getDescripcion())) {
			criteria.add(Restrictions.like("descripcion", objDao.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
		}
	
	
		if(paginable){			
			criteria.setFirstResult(objDao.getInicio());
    		criteria.setMaxResults(objDao.getNumeroFilas());
    		criteria.setFetchSize(objDao.getNumeroFilas());
		}
				
		return  criteria.list();
	}

	@Override
	public int contarTotal(ParametrosMast objDao) {
		Criteria criteria = getCurrentSession().createCriteria(ParametrosMast.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getAplicacionCodigo())) {
			criteria.add(Restrictions.eq("id.aplicacionCodigo",objDao.getId().getAplicacionCodigo() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getCompaniaCodigo())) {
			criteria.add(Restrictions.eq("id.companiaCodigo",objDao.getId().getCompaniaCodigo() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getParametroClave())) {
			criteria.add(Restrictions.eq("id.parametroClave",objDao.getId().getParametroClave() ));
		}
	
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}	
		if (UtilesCommons.noEsVacio(objDao.getDescripcion())) {
			criteria.add(Restrictions.like("descripcion", objDao.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
		}
		Object result =  criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));
	}

	@Override
	public int guardar(ParametrosMast objDao) {
		save(objDao);
		return 1;
	}

	@Override
	public int actualizar(ParametrosMast objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(ParametrosMast objDao) {
		delete(objDao);
		return 1;
	}

}
