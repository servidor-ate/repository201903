package pe.royalsystems.springerp.model.dao.impl;

import static pe.royalsystems.springerp.commons.UtilesCommons.noEsVacio;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.model.PaginaModel;
import pe.royalsystems.springerp.model.dao.CorrelativosMastDao;
import pe.royalsystems.springerp.model.dao.impl.AbstractDaoImpl;
import pe.royalsystems.springerp.model.domain.CorrelativosMast;
import pe.royalsystems.springerp.model.domain.CorrelativosMastPK;

@Repository
public class CorrelativosMastDaoImpl extends AbstractDaoImpl<CorrelativosMast, CorrelativosMastPK> implements CorrelativosMastDao {
	
	protected CorrelativosMastDaoImpl() {
		super(CorrelativosMast.class);
	}

	@Override
	public int obtenerNumCorrelativo(CorrelativosMast filtro) {
		Criteria criteria = createCriteria(CorrelativosMast.class);
		int numcorrelativo = (obtenerMaxCorrelativo(criteria, filtro)+1);		
		return numcorrelativo;
	}
	@Override
	public CorrelativosMast obtenerRegistro(CorrelativosMast filtro) {
		Criteria criteria = createCriteria(CorrelativosMast.class);
		filtrar(criteria, filtro);
		setOrdenableAsc(filtro, criteria);
		return (CorrelativosMast) criteria.uniqueResult();
	}

	public int obtenerMaxCorrelativo(Criteria criteria, CorrelativosMast filtro){
		filtrar(criteria, filtro);
		criteria.setProjection(Projections.max("correlativoNumero"));
		Object result = criteria.uniqueResult();
		if(result == null){
			return 0;
		}else{
			return Integer.parseInt(result.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CorrelativosMast> Listar(CorrelativosMast filtro) {
		Criteria criteria = createCriteria(CorrelativosMast.class);
		filtrar(criteria, filtro);				
		setOrdenableAsc(filtro, criteria);		
		return (List<CorrelativosMast>) criteria.list();
	}


	@SuppressWarnings("unchecked")
	@Override
	public PaginaModel<CorrelativosMast> ListarPaginado(CorrelativosMast filtro) {
		Criteria cqList = createCriteria(CorrelativosMast.class);
		Criteria cqCount = createCriteria(CorrelativosMast.class);
		
		filtrar(cqList, filtro);
		filtrar(cqCount, filtro);
		
		setPaginable(filtro, cqList);
		List<CorrelativosMast> list = (List<CorrelativosMast>) cqList.list();
		
		cqCount.setProjection(Projections.rowCount());
		Object result = cqCount.uniqueResult();
		int total = (result == null ? 0 : Integer.parseInt(result.toString()));
		
		return PaginaModel.crearPagina(list, total);
	}
	
	public void filtrar(Criteria criteria, CorrelativosMast filtro){
		if(noEsVacio(filtro.getId().getCompaniaCodigo())){
			criteria.add(Restrictions.eq("id.companiaCodigo", filtro.getId().getCompaniaCodigo()));
		}
		if(noEsVacio(filtro.getId().getTipoComprobante())){
			criteria.add(Restrictions.eq("id.tipoComprobante", filtro.getId().getTipoComprobante()));
		}
		if(noEsVacio(filtro.getId().getSerie())){
			criteria.add(Restrictions.eq("id.serie", filtro.getId().getSerie()));
		}
		if(noEsVacio(filtro.getId().getUnidadReplicacion())){
			criteria.add(Restrictions.eq("id.unidadReplicacion", filtro.getId().getUnidadReplicacion()));
		}
		
		if(noEsVacio(filtro.getDescripcion())){
			criteria.add(Restrictions.like("descripcion", filtro.getDescripcion(), MatchMode.ANYWHERE).ignoreCase());
		}
		if(filtro.getCorrelativoNumero()!= null && filtro.getCorrelativoNumero() > 0){
			criteria.add(Restrictions.eq("correlativoNumero", filtro.getCorrelativoNumero()));
		}
		if(filtro.getCorrelativoDesde()!= null && filtro.getCorrelativoDesde() > 0){
			criteria.add(Restrictions.eq("correlativoDesde", filtro.getCorrelativoDesde()));
		}
		if(filtro.getCorrelativoHasta()!= null && filtro.getCorrelativoHasta() > 0){
			criteria.add(Restrictions.eq("correlativoHasta", filtro.getCorrelativoHasta()));
		}		
		if(noEsVacio(filtro.getAlmacenCodigo())){
			criteria.add(Restrictions.like("almacenCodigo", filtro.getAlmacenCodigo(), MatchMode.ANYWHERE).ignoreCase());
		}		
		if(noEsVacio(filtro.getEstado())){
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}

		if(noEsVacio(filtro.getImpresora())){
			criteria.add(Restrictions.eq("impresora", filtro.getImpresora()));
		}
	}

	//Transaccional
	@Override
	public int guardar(CorrelativosMast objDao) {
		save(objDao);
		return 1;
	}

	@Override
	public int actualizar(CorrelativosMast objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(CorrelativosMast objDao) {
		delete(objDao);
		return 1;
	}	
	
}
