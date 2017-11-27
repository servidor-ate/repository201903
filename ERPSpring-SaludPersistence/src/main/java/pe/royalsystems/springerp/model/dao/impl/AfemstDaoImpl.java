package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.AfemstDao;
import pe.royalsystems.springerp.model.domain.Afemst;
import pe.royalsystems.springerp.model.domain.Afemst;

import java.util.List;

@Repository
public class AfemstDaoImpl extends AbstractDaoImpl<Afemst, String>implements AfemstDao {

	

	protected AfemstDaoImpl() {
		super(Afemst.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Afemst> listarAfemstPaginacion(Afemst objAfemst) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(Afemst.class);
			if (objAfemst.getAfe()!=null) {
			
				criteria.add(Restrictions.like("afe", objAfemst.getAfe(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			if (objAfemst.getLocalname()!=null) {

				criteria.add(Restrictions.like("localname", objAfemst.getLocalname(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			criteria.setFirstResult(objAfemst.getInicio());
			criteria.setMaxResults(objAfemst.getNumeroFilas());
			
			return criteria.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Afemst> AfemstListar(Afemst objAfemst) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(Afemst.class);
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(Afemst objAfemst) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(Afemst.class);
			if (objAfemst.getAfe()!=null) {
				
				criteria.add(Restrictions.like("afe", objAfemst.getAfe(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			if (objAfemst.getLocalname()!=null) {

				criteria.add(Restrictions.like("localname", objAfemst.getLocalname(),MatchMode.ANYWHERE).ignoreCase());
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
	public int guardarAfemst(Afemst objAfemst) {
		try {
			saveOrUpdate(objAfemst);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarAfemst(Afemst objAfemst) {
		try {
			
			delete(objAfemst);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Afemst obtenerAfemstID(Afemst objAfemst) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(Afemst.class);
			criteria.add(Restrictions.eq("afe", objAfemst.getAfe()));
			return (Afemst) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
