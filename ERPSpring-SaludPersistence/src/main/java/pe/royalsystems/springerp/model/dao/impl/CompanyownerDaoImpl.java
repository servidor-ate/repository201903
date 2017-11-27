package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.CompanyownerDao;
import pe.royalsystems.springerp.model.domain.Companyowner;

@Repository
public class CompanyownerDaoImpl extends AbstractDaoImpl<Companyowner, String>implements CompanyownerDao {

	protected CompanyownerDaoImpl() {
		super(Companyowner.class);
	}

	@Override
	public List<Companyowner> listarCompanyownerPaginacion(Companyowner objcompanyowner,boolean paginable ) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(Companyowner.class);
			if (objcompanyowner.getCompanyowner() != null) {
				criteria.add(Restrictions.like("companyowner", objcompanyowner.getCompanyowner(), MatchMode.ANYWHERE)
						.ignoreCase());
			}

			if (objcompanyowner.getDescription() != null) {
				criteria.add(Restrictions.like("description", objcompanyowner.getDescription(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			if(paginable){
				criteria.setFirstResult(objcompanyowner.getInicio());
				criteria.setMaxResults(objcompanyowner.getNumeroFilas());
			}
			

			return criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Companyowner buscarCompanyownerID(Companyowner objcompanyowner) {
		try {
			Criteria criteria = getCurrentSession().createCriteria(Companyowner.class);

			if (objcompanyowner.getCompanyowner() != null) {
				criteria.add(Restrictions.eq("companyowner", objcompanyowner.getCompanyowner()));
			}

			return (Companyowner) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesRegistrosCompanyowner(Companyowner objcompanyowner) {
		try {

			Criteria criteria = getCurrentSession().createCriteria(Companyowner.class);
			if (objcompanyowner.getCompanyowner() != null) {
				criteria.add(Restrictions.like("companyowner", objcompanyowner.getCompanyowner(), MatchMode.ANYWHERE)
						.ignoreCase());
			}

			if (objcompanyowner.getDescription() != null) {
				criteria.add(Restrictions.like("description", objcompanyowner.getDescription(), MatchMode.ANYWHERE)
						.ignoreCase());
			}

			criteria.setProjection(Projections.rowCount());

			return Integer.parseInt(criteria.uniqueResult().toString());

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarCompanyowner(Companyowner companyowner) {
		try {
			delete(companyowner);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarCompanyowner(Companyowner companyowner) {
		int ePisodio = 0;
		if (companyowner.getCompanyowner() == "") {
			Criteria criteria = getCurrentSession().createCriteria(Companyowner.class);
			criteria.setProjection(Projections.max("companyowner"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			companyowner.setCompanyowner(""+ePisodio + 1);
		}
		saveOrUpdate(companyowner);
		return ePisodio;
	}

}
