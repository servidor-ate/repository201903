package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsCcFavoritoDetalleDao;

import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetalle;
import pe.royalsystems.springerp.model.domain.SsCcFavoritoDetallePK;

@Repository
public class SsCcFavoritoDetalleDaoImpl extends AbstractDaoImpl<SsCcFavoritoDetalle, SsCcFavoritoDetallePK> implements SsCcFavoritoDetalleDao {

	protected SsCcFavoritoDetalleDaoImpl() {
		super(SsCcFavoritoDetalle.class);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SsCcFavoritoDetalle> listarElementos(SsCcFavoritoDetalle filtro, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsCcFavoritoDetalle.class);
		
		if (UtilesCommons.noEsVacio(filtro.getTipoIdentificador())) {
			criteria.add(Restrictions.eq("tipoIdentificador", filtro.getTipoIdentificador()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getId().getIdFavorito())) {
			criteria.add(Restrictions.eq("id.idFavorito", filtro.getId().getIdFavorito()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getValorId())) {
			criteria.add(Restrictions.eq("valorId", filtro.getValorId()));
		}
		if (UtilesCommons.noEsVacio(filtro.getValorCodigo())) {
			criteria.add(Restrictions.eq("valorCodigo", filtro.getValorCodigo()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getEstado())) {
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getValorTexto1())) {
			criteria.add(Restrictions.like("descripcion", filtro.getValorTexto1(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		if (filtro.getSsCcFavorito()!= null) {
			criteria.createCriteria("ssCcFavorito", "favorito");
			if (UtilesCommons.noEsVacio(filtro.getSsCcFavorito().getIdAgente())) {
				criteria.add(Restrictions.eq("favorito.idAgente", filtro.getSsCcFavorito().getIdAgente()));
			}			
			if (UtilesCommons.noEsVacio(filtro.getSsCcFavorito().getTipoFavorito())) {
				criteria.add(Restrictions.eq("favorito.tipoFavorito", filtro.getSsCcFavorito().getTipoFavorito()));
			}
			if (UtilesCommons.noEsVacio(filtro.getSsCcFavorito().getCodigoTablaFavorito())) {
				criteria.add(Restrictions.eq("favorito.codigoTablaFavorito", filtro.getSsCcFavorito().getCodigoTablaFavorito()));
			}						
		}
			
			
		filtro.setPaginable(paginable);
		setPaginable(filtro, criteria);
		setOrdenableAsc(filtro, criteria);
		setOrdenableDesc(filtro, criteria);
		
		return  criteria.list();
	}

	@Override
	public int contarElementos(SsCcFavoritoDetalle filtro) {
		Criteria criteria = getCurrentSession().createCriteria(SsCcFavoritoDetalle.class);
		
		if (UtilesCommons.noEsVacio(filtro.getTipoIdentificador())) {
			criteria.add(Restrictions.eq("tipoIdentificador", filtro.getTipoIdentificador()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getId().getIdFavorito())) {
			criteria.add(Restrictions.eq("id.idFavorito", filtro.getId().getIdFavorito()));
		}
		if (UtilesCommons.noEsVacio(filtro.getEstado())) {
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		
		if (UtilesCommons.noEsVacio(filtro.getValorTexto1())) {
			criteria.add(Restrictions.like("descripcion", filtro.getValorTexto1(),MatchMode.ANYWHERE).ignoreCase());
		}
		
		if (filtro.getSsCcFavorito()!= null) {
			criteria.createCriteria("ssCcFavorito", "favorito");
			if (UtilesCommons.noEsVacio(filtro.getSsCcFavorito().getIdAgente())) {
				criteria.add(Restrictions.eq("favorito.idAgente", filtro.getSsCcFavorito().getIdAgente()));
			}				
			if (UtilesCommons.noEsVacio(filtro.getSsCcFavorito().getTipoFavorito())) {
				criteria.add(Restrictions.eq("favorito.tipoFavorito", filtro.getSsCcFavorito().getTipoFavorito()));
			}
			if (UtilesCommons.noEsVacio(filtro.getSsCcFavorito().getCodigoTablaFavorito())) {
				criteria.add(Restrictions.eq("favorito.codigoTablaFavorito", filtro.getSsCcFavorito().getCodigoTablaFavorito()));
			}						
		}		
		Object result = criteria.uniqueResult();		
		return Integer.parseInt(result!=null?result.toString():"0");	
	}

	@Override
	public int guardar(SsCcFavoritoDetalle objDao) {
		int id = 0;		
		if(UtilesCommons.noEsVacio(objDao.getId().getIdFavorito())){
			Criteria criteria = getCurrentSession().createCriteria(SsCcFavoritoDetalle.class);
			criteria.add(Restrictions.eq("id.idFavorito", objDao.getId().getIdFavorito()));
			criteria.setProjection(Projections.max("id.secuencia"));
			Object result = criteria.uniqueResult() ;
			if (result != null){
				id = (int) result;
			}
			id++;
			objDao.getId().setSecuencia(id);
			save(objDao);			
		}

		return id;
	}

	@Override
	public int actualizar(SsCcFavoritoDetalle objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsCcFavoritoDetalle objDao) {
		delete(objDao);
		return 1;
	}

}
