package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsHcExamenSolicitadoDao;
import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitado;
import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitadoPK;

@Repository
public class SsHcExamenSolicitadoDaoImpl extends AbstractDaoImpl<SsHcExamenSolicitado, SsHcExamenSolicitadoPK> implements SsHcExamenSolicitadoDao{

	protected SsHcExamenSolicitadoDaoImpl() {
		super(SsHcExamenSolicitado.class);		
	}

	@Override
	public SsHcExamenSolicitado obtenerPorId(SsHcExamenSolicitadoPK id) {		
		Object result = findById(id);
		return result!=null?(SsHcExamenSolicitado)result:null;
	}

	@Override
	public List<SsHcExamenSolicitado> listarElementos(SsHcExamenSolicitado objDao, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcExamenSolicitado.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("id.unidadReplicacion",objDao.getId().getUnidadReplicacion() ));
		}
		if (objDao.getId().getIdPaciente() != null) {
			criteria.add(Restrictions.eq("id.idPaciente",objDao.getId().getIdPaciente() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getEpisodioClinico())) {
			criteria.add(Restrictions.eq("id.episodioClinico",objDao.getId().getEpisodioClinico() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getIdEpisodioAtencion())) {
			criteria.add(Restrictions.eq("id.idEpisodioAtencion",objDao.getId().getIdEpisodioAtencion() ));
		}
		
		if (UtilesCommons.noEsVacio(objDao.getIdProcedimiento())) {
			criteria.add(Restrictions.eq("idProcedimiento",objDao.getIdProcedimiento()));
		}	
		if (UtilesCommons.noEsVacio(objDao.getCodigoComponente())) {
			criteria.add(Restrictions.eq("codigoComponente",objDao.getCodigoComponente()));
		}
		if(paginable){			
			criteria.setFirstResult(objDao.getInicio());
    		criteria.setMaxResults(objDao.getNumeroFilas());
    		criteria.setFetchSize(objDao.getNumeroFilas());
		}
				
		return  criteria.list();
	}

	@Override
	public int contarTotal(SsHcExamenSolicitado objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcExamenSolicitado.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("id.unidadReplicacion",objDao.getId().getUnidadReplicacion() ));
		}
		if (objDao.getId().getIdPaciente() != null) {
			criteria.add(Restrictions.eq("id.idPaciente",objDao.getId().getIdPaciente() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getEpisodioClinico())) {
			criteria.add(Restrictions.eq("id.episodioClinico",objDao.getId().getEpisodioClinico() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getId().getIdEpisodioAtencion())) {
			criteria.add(Restrictions.eq("id.idEpisodioAtencion",objDao.getId().getIdEpisodioAtencion() ));
		}	
		if (UtilesCommons.noEsVacio(objDao.getIdProcedimiento())) {
			criteria.add(Restrictions.eq("idProcedimiento",objDao.getIdProcedimiento()));
		}	
		if (UtilesCommons.noEsVacio(objDao.getCodigoComponente())) {
			criteria.add(Restrictions.eq("codigoComponente",objDao.getCodigoComponente()));
		}
		criteria.setProjection(Projections.rowCount());
		Object result = criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));
	}

	@Override
	public int guardar(SsHcExamenSolicitado objDao) {
		int secuencia = 0;
		if (objDao.getId().getUnidadReplicacion()!=null
				&& objDao.getId().getIdPaciente()!=null
				&& objDao.getId().getEpisodioClinico()!=null
				&& objDao.getId().getIdEpisodioAtencion()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcExamenSolicitado.class);
			
			criteria.add(Restrictions.eq("id.unidadReplicacion", objDao.getId().getUnidadReplicacion()));
			criteria.add(Restrictions.eq("id.idPaciente", objDao.getId().getIdPaciente()));
			criteria.add(Restrictions.eq("id.episodioClinico", objDao.getId().getEpisodioClinico()));
			criteria.add(Restrictions.eq("id.idEpisodioAtencion", objDao.getId().getIdEpisodioAtencion()));
			criteria.setProjection(Projections.max("id.secuencia"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			secuencia++;
			objDao.getId().setSecuencia(secuencia );
			save(objDao);
		}
		return secuencia;
	}

	@Override
	public int actualizar(SsHcExamenSolicitado objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsHcExamenSolicitado objDao) {
		delete(objDao);
		return 1;
	}

}
