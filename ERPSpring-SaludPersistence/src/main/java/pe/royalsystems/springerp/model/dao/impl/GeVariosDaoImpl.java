package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.GeVariosDao;
import pe.royalsystems.springerp.model.domain.GeVarios;

import java.util.List;

@Repository
public class GeVariosDaoImpl extends AbstractDaoImpl<GeVarios, String> implements GeVariosDao{

	protected GeVariosDaoImpl() {
		super(GeVarios.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<GeVarios> listarGeVariosCombo(GeVarios objGeVarios) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(GeVarios.class);
			criteria.add(Restrictions.eq("codigoTabla", objGeVarios.getCodigoTabla()));
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public GeVarios buscar(GeVarios objGeVarios) {
		Criteria criteria = getCurrentSession().createCriteria(GeVarios.class);
		criteria.add(Restrictions.eq("codigoTabla", objGeVarios.getCodigoTabla()));
		criteria.add(Restrictions.eq("secuencial", objGeVarios.getSecuencial()));
		return   (GeVarios) criteria.uniqueResult();
	}

}
