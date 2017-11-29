package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsCcFavoritoDao;
import pe.royalsystems.springerp.model.domain.SsCcFavorito;

@Repository
public class SsCcFavoritoDaoImpl  extends AbstractDaoImpl<SsCcFavorito, Integer> implements SsCcFavoritoDao {

	protected SsCcFavoritoDaoImpl() {
		super(SsCcFavorito.class);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SsCcFavorito> listarElementos(SsCcFavorito filtro, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsCcFavorito.class);
		
		if (UtilesCommons.noEsVacio(filtro.getCodigoTablaFavorito())) {
			criteria.add(Restrictions.eq("codigoTablaFavorito", filtro.getCodigoTablaFavorito()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getTipoFavorito())) {
			criteria.add(Restrictions.eq("tipoFavorito", filtro.getTipoFavorito()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getIdAgente())) {
			criteria.add(Restrictions.eq("idAgente", filtro.getIdAgente()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getEstado())) {
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getDescripcion())) {
			criteria.add(Restrictions.like("descripcion", filtro.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		filtro.setPaginable(paginable);
		setPaginable(filtro, criteria);
		setOrdenableAsc(filtro, criteria);
		setOrdenableDesc(filtro, criteria);
		
		return  criteria.list();
	}

	@Override
	public int contarElementos(SsCcFavorito filtro) {
		Criteria criteria = getCurrentSession().createCriteria(SsCcFavorito.class);
		
		if (UtilesCommons.noEsVacio(filtro.getCodigoTablaFavorito())) {
			criteria.add(Restrictions.eq("codigoTablaFavorito", filtro.getCodigoTablaFavorito()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getTipoFavorito())) {
			criteria.add(Restrictions.eq("tipoFavorito", filtro.getTipoFavorito()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getIdAgente())) {
			criteria.add(Restrictions.eq("idAgente", filtro.getIdAgente()));
		}
		if (UtilesCommons.noEsVacio(filtro.getEstado())) {
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getDescripcion())) {
			criteria.add(Restrictions.like("descripcion", filtro.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
		}
		Object result = criteria.uniqueResult();		
		return Integer.parseInt(result!=null?result.toString():"0");	
	}


	@Override
	public int guardar(SsCcFavorito objDao) {
		int id = 0;		
		Criteria criteria = getCurrentSession().createCriteria(SsCcFavorito.class);
		criteria.setProjection(Projections.max("idFavorito"));
		Object result = criteria.uniqueResult() ;
		if (result != null){
			id = (int) result;
		}
		id++;
		objDao.setIdFavorito(id);
		save(objDao);
		return id;
	}

	@Override
	public int actualizar(SsCcFavorito objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsCcFavorito objDao) {
		delete(objDao);
		return 1;
	}

}
