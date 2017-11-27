package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsHcExamenSolicitadoInformeDao;
import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitadoInforme;
import pe.royalsystems.springerp.model.domain.SsHcExamenSolicitadoInformePK;

@Repository
public class SsHcExamenSolicitadoInformeDaoImpl extends AbstractDaoImpl<SsHcExamenSolicitadoInforme, SsHcExamenSolicitadoInformePK> implements SsHcExamenSolicitadoInformeDao{

	protected SsHcExamenSolicitadoInformeDaoImpl() {
		super(SsHcExamenSolicitadoInforme.class);		
	}

	@Override
	public SsHcExamenSolicitadoInforme obtenerPorId(SsHcExamenSolicitadoInformePK id) {		
		Object result = findById(id);
		return result!=null?(SsHcExamenSolicitadoInforme)result:null;
	}

	@Override
	public List<SsHcExamenSolicitadoInforme> listarElementos(SsHcExamenSolicitadoInforme objDao, boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcExamenSolicitadoInforme.class);
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
		if (UtilesCommons.noEsVacio(objDao.getId().getSecuencia())) {
			criteria.add(Restrictions.eq("id.secuencia",objDao.getId().getSecuencia() ));
		}		
		if (UtilesCommons.noEsVacio(objDao.getNombre())) {
			criteria.add(Restrictions.like("nombre", objDao.getNombre(), MatchMode.ANYWHERE).ignoreCase());
		}		
		if(paginable){			
			criteria.setFirstResult(objDao.getInicio());
    		criteria.setMaxResults(objDao.getNumeroFilas());
    		criteria.setFetchSize(objDao.getNumeroFilas());
		}
				
		return  criteria.list();
	}

	@Override
	public int contarTotal(SsHcExamenSolicitadoInforme objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcExamenSolicitadoInforme.class);
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
		if (UtilesCommons.noEsVacio(objDao.getId().getSecuencia())) {
			criteria.add(Restrictions.eq("id.secuencia",objDao.getId().getSecuencia() ));
		}		
		if (UtilesCommons.noEsVacio(objDao.getNombre())) {
			criteria.add(Restrictions.like("nombre", objDao.getNombre(), MatchMode.ANYWHERE).ignoreCase());
		}
		
		Object result = criteria.uniqueResult();
		return Integer.parseInt((result!=null?result.toString():"0"));
	}

	@Override
	public int guardar(SsHcExamenSolicitadoInforme objDao) {
		int secuencia = 0;
		if (objDao.getId().getUnidadReplicacion()!=null
				&& objDao.getId().getIdPaciente()!=null
				&& objDao.getId().getEpisodioClinico()!=null
				&& objDao.getId().getIdEpisodioAtencion()!=null
				&& objDao.getId().getSecuencia()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcExamenSolicitadoInforme.class);
			
			criteria.add(Restrictions.eq("id.unidadReplicacion", objDao.getId().getUnidadReplicacion()));
			criteria.add(Restrictions.eq("id.idPaciente", objDao.getId().getIdPaciente()));
			criteria.add(Restrictions.eq("id.episodioClinico", objDao.getId().getEpisodioClinico()));
			criteria.add(Restrictions.eq("id.idEpisodioAtencion", objDao.getId().getIdEpisodioAtencion()));
			criteria.add(Restrictions.eq("id.secuencia", objDao.getId().getSecuencia()));
			criteria.setProjection(Projections.max("id.secuenciaInforme"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			secuencia++;
			objDao.getId().setSecuenciaInforme(secuencia );
			save(objDao);
		}
		return secuencia;
	}

	@Override
	public int actualizar(SsHcExamenSolicitadoInforme objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsHcExamenSolicitadoInforme objDao) {
		delete(objDao);
		return 1;
	}

}
