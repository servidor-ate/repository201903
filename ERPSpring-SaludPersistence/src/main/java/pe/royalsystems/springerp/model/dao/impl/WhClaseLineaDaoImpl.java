package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.WhClaseLineaDao;
import pe.royalsystems.springerp.model.domain.WhClaseLinea;

@Repository
public class WhClaseLineaDaoImpl extends AbstractDaoImpl<WhClaseLinea, String>implements WhClaseLineaDao {

	protected WhClaseLineaDaoImpl() {
		super(WhClaseLinea.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<WhClaseLinea> listaComboLinea(WhClaseLinea objWhClaseLinea) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(WhClaseLinea.class);

			if (objWhClaseLinea.getLinea() != null) {
				criteria.add(Restrictions.eq("linea", objWhClaseLinea.getLinea()));
			}

			return criteria.list();
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public WhClaseLinea obtenerWhClaseLineaID(WhClaseLinea objWhClaseLinea) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(WhClaseLinea.class);

			if (objWhClaseLinea.getLinea() != null) {
				criteria.add(Restrictions.eq("linea", objWhClaseLinea.getLinea()));
			}

			return (WhClaseLinea) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
