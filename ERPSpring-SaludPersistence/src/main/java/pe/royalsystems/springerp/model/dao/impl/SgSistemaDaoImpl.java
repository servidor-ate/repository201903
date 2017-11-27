package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SgSistemaDao;
import pe.royalsystems.springerp.model.domain.SgSistema;

@Repository
public class SgSistemaDaoImpl extends AbstractDaoImpl<SgSistema, String> implements SgSistemaDao{

	protected SgSistemaDaoImpl() {
		super(SgSistema.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SgSistema> listaSgSistemaCombo(SgSistema objSgSistema) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SgSistema.class);
			if (objSgSistema.getEstado()!=0) {
				criteria.add(Restrictions.eq("estado", objSgSistema.getEstado()));
			}
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
