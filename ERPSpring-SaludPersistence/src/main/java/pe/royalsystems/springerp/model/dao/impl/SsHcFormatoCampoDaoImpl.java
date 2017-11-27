package pe.royalsystems.springerp.model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcFormatoCampoDao;
import pe.royalsystems.springerp.model.domain.SsHcFormatoCampo;

@Repository
public class SsHcFormatoCampoDaoImpl extends AbstractDaoImpl<SsHcFormatoCampo, String>implements SsHcFormatoCampoDao {

	protected SsHcFormatoCampoDaoImpl() {
		super(SsHcFormatoCampo.class);
	}

	@Override
	public List<SsHcFormatoCampo> listarSsHcFormatoCampo(SsHcFormatoCampo ssHcFormatoCampo) {
		try {
			String queryLogica = "from SsHcFormatoCampo d inner join d.ssHcFormato ";

			if (ssHcFormatoCampo.getSsHcFormato() != null && ssHcFormatoCampo.getSsHcFormato().getIdFormato() != 0
					&& ssHcFormatoCampo.getId().getSecuenciaCampo() != 0) {

				queryLogica = queryLogica + "where d.ssHcFormato.idFormato = "
						+ ssHcFormatoCampo.getSsHcFormato().getIdFormato() + " and secuenciaCampo = "
						+ ssHcFormatoCampo.getId().getSecuenciaCampo();
			}
			Query query = getCurrentSession().createQuery(queryLogica);
			query.setFirstResult(ssHcFormatoCampo.getInicio());
			query.setMaxResults(ssHcFormatoCampo.getNumeroFilas());
			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SsHcFormatoCampo> listaRetorno = new ArrayList<SsHcFormatoCampo>();

			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				SsHcFormatoCampo objSsHcFormatoCampo = new SsHcFormatoCampo();

				if (obj[0] != null) {
					objSsHcFormatoCampo = (SsHcFormatoCampo) obj[0];

				}

				listaRetorno.add(objSsHcFormatoCampo);

			}

			return listaRetorno;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcFormatoCampo buscarSsHcFormatoCampoID(SsHcFormatoCampo ssHcFormatoCampo) {
		try {
			String queryLogica = "from SsHcFormatoCampo d inner join d.ssHcFormato";

			if (ssHcFormatoCampo.getSsHcFormato() != null && ssHcFormatoCampo.getSsHcFormato().getIdFormato() != 0
					&& ssHcFormatoCampo.getId().getSecuenciaCampo() != 0) {

				queryLogica = queryLogica + " where d.ssHcFormato.idFormato = "
						+ ssHcFormatoCampo.getSsHcFormato().getIdFormato() + " and secuenciaCampo = "
						+ ssHcFormatoCampo.getId().getSecuenciaCampo();
			}

			Query query = getCurrentSession().createQuery(queryLogica);
			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SsHcFormatoCampo> ssHcFormatoCampoRetorno = new ArrayList<SsHcFormatoCampo>();
			SsHcFormatoCampo objssHcFormatoCampo = null;
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				objssHcFormatoCampo = new SsHcFormatoCampo();
				query.setFirstResult(objssHcFormatoCampo.getInicio());
				query.setMaxResults(objssHcFormatoCampo.getNumeroFilas());
				if (obj[0] != null) {
					objssHcFormatoCampo = (SsHcFormatoCampo) obj[0];

				}

				// ssHcFormatoCampoRetorno.add(objssHcFormatoCampo);

			}
			/*
			 * SsHcFormatoCampo ssHcFormatoCampoRetorno;
			 * 
			 * Criteria criteria =
			 * getCurrentSession().createCriteria(SsHcFormatoCampo.class);
			 * criteria.add(Restrictions.eq("id.idFormato",
			 * ssHcFormatoCampo.getId().getIdFormato()));
			 * criteria.add(Restrictions.eq("id.secuenciaCampo",
			 * ssHcFormatoCampo.getId().getSecuenciaCampo()));
			 * 
			 * ssHcFormatoCampoRetorno = (SsHcFormatoCampo)
			 * criteria.uniqueResult();
			 */
			return objssHcFormatoCampo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsHcFormatoCampo ssHcFormatoCampo) {
		try {
			String queryLogica = "";
			queryLogica = "select count(d) from SsHcFormatoCampo d inner join d.ssHcFormato";

			if (ssHcFormatoCampo.getSsHcFormato() != null && ssHcFormatoCampo.getSsHcFormato().getIdFormato() != 0
					&& ssHcFormatoCampo.getId().getSecuenciaCampo() != 0) {

				queryLogica = queryLogica + " where d.ssHcFormato.idFormato = "
						+ ssHcFormatoCampo.getSsHcFormato().getIdFormato() + " and secuenciaCampo = "
						+ ssHcFormatoCampo.getId().getSecuenciaCampo();
			}
			Query query = getCurrentSession().createQuery(queryLogica);
			query.setMaxResults(ssHcFormatoCampo.getNumeroFilas());
			Long result = (Long) query.list().get(0);

			return result.intValue();

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	@Override
	public int guardarSsHcFormatoCampo(SsHcFormatoCampo ssHcFormatoCampo) {
		int ePisodio = 0;
		if (ssHcFormatoCampo.getId().getIdFormato() == 0 && ssHcFormatoCampo.getId().getSecuenciaCampo() == 0) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcFormatoCampo.class);
			criteria.setProjection(Projections.max("id.idFormato"));
			if (criteria.uniqueResult() != null)
				ePisodio = (int) criteria.uniqueResult();
			ssHcFormatoCampo.getId().setIdFormato(ePisodio + 1);
		}
		saveOrUpdate(ssHcFormatoCampo);
		return ePisodio;
	}

	@Override
	public int eliminarSsHcFormatoCampo(SsHcFormatoCampo ssHcFormatoCampo) {
		try {
			delete(ssHcFormatoCampo);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
