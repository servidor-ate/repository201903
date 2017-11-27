package pe.royalsystems.springerp.model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.WhClaseFamiliaDao;
import pe.royalsystems.springerp.model.domain.SsAdOrdenAtencionPreexistencia;
import pe.royalsystems.springerp.model.domain.WhClaseFamilia;

@Repository
public class WhClaseFamiliaDaoImpl extends AbstractDaoImpl<WhClaseFamilia, String> implements WhClaseFamiliaDao{

	protected WhClaseFamiliaDaoImpl() {
		super(WhClaseFamilia.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<WhClaseFamilia> listaWhClaseFamiliaCombo(WhClaseFamilia objWhClaseFamilia) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(WhClaseFamilia.class);
			
			if (objWhClaseFamilia.getId().getLinea()!=null) {
			
				criteria.add(Restrictions.eq("id.linea", objWhClaseFamilia.getId().getLinea()));
			}
			if (objWhClaseFamilia.getId().getFamilia()!=null) {
				criteria.add(Restrictions.eq("id.familia", objWhClaseFamilia.getId().getFamilia()));
			}
			
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public WhClaseFamilia obtenerwhClaseFamiliaID(WhClaseFamilia objWhClaseFamilia) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(WhClaseFamilia.class);
			if (objWhClaseFamilia.getId()!=null) {
				criteria.add(Restrictions.eq("id.linea", objWhClaseFamilia.getId().getLinea()));
				criteria.add(Restrictions.eq("id.familia", objWhClaseFamilia.getId().getFamilia()));
			}
			return (WhClaseFamilia) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
