package pe.royalsystems.springerp.model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcNicDao;
import pe.royalsystems.springerp.model.domain.SsHcNic;

@Repository
public class SsHcNicDaoImpl extends AbstractDaoImpl<SsHcNic, String>implements SsHcNicDao {

	protected SsHcNicDaoImpl() {
		super(SsHcNic.class);
	}

	@Override
	public List<SsHcNic> listarSsHcNic(SsHcNic ssHcNic) {
		try {
			String queryLogica = "from SsHcNic";

			if (ssHcNic.getIdNic() != 0) {

				queryLogica = queryLogica;
			}
			Query query = getCurrentSession().createQuery(queryLogica);
			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SsHcNic> listaRetorno = new ArrayList<SsHcNic>();

			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				SsHcNic objFiltro = new SsHcNic();

				if (obj[0] != null) {
					objFiltro = (SsHcNic) obj[0];
				}
				listaRetorno.add(objFiltro);
			}
			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcNic buscarSsHcNicID(SsHcNic ssHcNic) {
		try {
			String queryLogica = "from SsHcNic";

			if (ssHcNic.getIdNic() != 0) {
				queryLogica = queryLogica;
			}

			Query query = getCurrentSession().createQuery(queryLogica);
			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SsHcNic> ssHcNicFiltro = new ArrayList<SsHcNic>();
			SsHcNic objBuscar = null;
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				objBuscar = new SsHcNic();
				query.setFirstResult(objBuscar.getInicio());
				query.setMaxResults(objBuscar.getNumeroFilas());
				if (obj[0] != null) {
					objBuscar = (SsHcNic) obj[0];
				}
			}
			return objBuscar;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsHcNic ssHcNic) {
		try {
			String queryLogica = "";
			queryLogica = "select count(d) from SsHcNic";

			if (ssHcNic.getIdNic() != 0) {

				queryLogica = queryLogica;
			}
			Query query = getCurrentSession().createQuery(queryLogica);

			Long result = (Long) query.list().get(0);

			return result.intValue();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsHcNic(SsHcNic ssHcNic) {
		int ePisodio = 0;
		if (ssHcNic.getIdNic() == 0) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcNic.class);
			criteria.setProjection(Projections.max("id.idNic"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			ssHcNic.setIdNic(ePisodio + 1);
		}
		saveOrUpdate(ssHcNic);
		return ePisodio;
	}

	@Override
	public int eliminarSsHcNic(SsHcNic ssHcNic) {
		try {
			delete(ssHcNic);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
