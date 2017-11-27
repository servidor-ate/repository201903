package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcAnamnesisApDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAp;

@Repository
public class SsHcAnamnesisApDaoImpl extends AbstractDaoImpl<SsHcAnamnesisAp, String> implements SsHcAnamnesisApDao{

	protected SsHcAnamnesisApDaoImpl() {
		super(SsHcAnamnesisAp.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcAnamnesisAp> listarSsHcAnamnesisApXPaciente(SsHcAnamnesisAp objSsHcAnamnesisAp) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAp.class);
			criteria.add(Restrictions.eq("id.idPaciente", objSsHcAnamnesisAp.getId().getIdPaciente()));						
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
