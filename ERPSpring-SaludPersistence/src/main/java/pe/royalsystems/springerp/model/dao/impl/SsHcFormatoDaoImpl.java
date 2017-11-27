package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.commons.model.PaginaModel;
import pe.royalsystems.springerp.model.dao.SsHcFormatoDao;
import pe.royalsystems.springerp.model.domain.SsHcFormato;

import java.util.List;

import static pe.royalsystems.springerp.commons.UtilesCommons.noEsVacio;

@Repository
public class SsHcFormatoDaoImpl extends AbstractDaoImpl<SsHcFormato, String> implements SsHcFormatoDao{

	protected SsHcFormatoDaoImpl() {
		super(SsHcFormato.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcFormato> listarSsHcFormato(SsHcFormato objssHcFormato) {
		// TODO Auto-generated method stub
		try {	
			Criteria criteria = getCurrentSession().createCriteria(SsHcFormato.class);
			
			if (objssHcFormato.getIdFormato() != 0) {
				criteria.add(Restrictions.eq("idFormato", objssHcFormato.getIdFormato()));
			}
			
			if (objssHcFormato.getCodigoFormato()!=null) {
				criteria.add(Restrictions.like("codigoFormato",objssHcFormato.getCodigoFormato(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objssHcFormato.getCodigoFormatoPadre()!=null) {
				criteria.add(Restrictions.like("codigoFormatoPadre", objssHcFormato.getCodigoFormatoPadre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objssHcFormato.getDescripcion()!=null) {
				criteria.add(Restrictions.like("descripcion", objssHcFormato.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objssHcFormato.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objssHcFormato.getEstado()));
			}
			if (objssHcFormato.getTipoFormato()!=null) {
				criteria.add(Restrictions.eq("tipoFormato", objssHcFormato.getTipoFormato()));
			}
			
			criteria.setFirstResult(objssHcFormato.getInicio());
			criteria.setMaxResults(objssHcFormato.getNumeroFilas());
			
			List<SsHcFormato> listaRetorno = criteria.list();
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcFormato buscarSsHcFormatoID(SsHcFormato objssHcFormato) {
		// TODO Auto-generated method stub
		try {
			System.out.println("objssHcFormato.getIdFormato() DAO = "+objssHcFormato.getIdFormato());
			SsHcFormato ssHcFormatoRetorno;		
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcFormato.class);
			criteria.add(Restrictions.eq("idFormato", objssHcFormato.getIdFormato()));
			
			ssHcFormatoRetorno = (SsHcFormato) criteria.uniqueResult();
			
			return ssHcFormatoRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesRegistrosSsHcFormato(SsHcFormato objssHcFormato) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcFormato.class);
			criteria.setProjection(Projections.rowCount());
			
			if (objssHcFormato.getIdFormato() != 0) {
				criteria.add(Restrictions.eq("idFormato", objssHcFormato.getIdFormato()));
			}
			
			if (objssHcFormato.getCodigoFormato()!=null) {
				criteria.add(Restrictions.like("codigoFormato",objssHcFormato.getCodigoFormato(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objssHcFormato.getCodigoFormatoPadre()!=null) {
				criteria.add(Restrictions.like("codigoFormatoPadre", objssHcFormato.getCodigoFormatoPadre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objssHcFormato.getDescripcion()!=null) {
				criteria.add(Restrictions.like("descripcion", objssHcFormato.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objssHcFormato.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objssHcFormato.getEstado()));
			}
			if (objssHcFormato.getTipoFormato()!=null) {
				criteria.add(Restrictions.eq("tipoFormato", objssHcFormato.getTipoFormato()));
			}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsHcFormato(SsHcFormato objssHcFormato) {
		// TODO Auto-generated method stub
		try {
			
		int ePisodio=0;
		if (objssHcFormato.getIdFormato()==0)
		{
			Criteria criteria = getCurrentSession().createCriteria(SsHcFormato.class);
			criteria.setProjection(Projections.max("idFormato"));
			if (criteria.uniqueResult()!=null) ePisodio = (int) criteria.uniqueResult();
			objssHcFormato.setIdFormato(ePisodio + 1);
		}
			saveOrUpdate(objssHcFormato);
			return 1;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return 0;
		}
	}

	@Override
	public int eliminarSsHcFormato(SsHcFormato objssHcFormato) {
		// TODO Auto-generated method stub
		try {
			System.out.println("eliminar DAO = "+objssHcFormato.getIdFormato());
			delete(objssHcFormato);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public PaginaModel<SsHcFormato> listarPaginado(SsHcFormato filtro) {
		Criteria cqList = createCriteria(SsHcFormato.class);
		Criteria cqCount = createCriteria(SsHcFormato.class);
		filtro.setPaginable(true);

		filtrar(cqList, filtro);
		filtrar(cqCount, filtro);

		setOrdenableDesc(filtro, cqList);
		setPaginable(filtro, cqList);
		List<SsHcFormato> list = (List<SsHcFormato>) cqList.list();
		cqCount.setProjection(Projections.rowCount());
		Object result = cqCount.uniqueResult();
		int total = (result == null ? 0 : Integer.parseInt(result.toString()));
		return PaginaModel.crearPagina(list, total);
	}
	public void filtrar(Criteria cqList, SsHcFormato filtro){

		if(noEsVacio(filtro.getCodigoFormato())){
			cqList.add(Restrictions.eq("codigoFormato", filtro.getCodigoFormato()));
		}
		if(noEsVacio(filtro.getDescripcion())){
			cqList.add(Restrictions.eq("descripcion", filtro.getDescripcion()));
		}
		//if( filtro.getId().getFechaCambio() != null){
		//	cqList.add(Restrictions.ge("id.fechaCambio", filtro.getId().getFechaCambio()));
		//}

	}

}
