package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcFavoritoDao;
import pe.royalsystems.springerp.model.domain.SsHcFavorito;

@Repository
public class SsHcFavoritoDaoImpl extends AbstractDaoImpl<SsHcFavorito, String> implements SsHcFavoritoDao{

	protected SsHcFavoritoDaoImpl() {
		super(SsHcFavorito.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int guardarSsHcFavorito(SsHcFavorito objssHcFavorito) {
		// TODO Auto-generated method stub
		try {
			save(objssHcFavorito);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsHcFavoritoDeAgente(SsHcFavorito objssHcFavorito) {
		// TODO Auto-generated method stub
		try {

			Query query = getCurrentSession().createQuery("delete from SsHcFavorito d "
					+ "where d.sgAgente.idAgente = "+objssHcFavorito.getSgAgente().getIdAgente());
			query.executeUpdate();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public SsHcFavorito buscarSsHcFavoritoID(SsHcFavorito objssHcFavorito) {
		// TODO Auto-generated method stub
		try {
			SsHcFavorito ssHcFavoritoRetorno;
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcFavorito.class);
			criteria.add(Restrictions.eq("idFavorito", objssHcFavorito.getIdFavorito()));
			
			ssHcFavoritoRetorno = (SsHcFavorito) criteria.uniqueResult();
			
			return ssHcFavoritoRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
