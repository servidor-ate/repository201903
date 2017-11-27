package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsHcEpisodioAtencionDao;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencion;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionId;

import java.util.List;

@Repository
public class SsHcEpisodioAtencionDaoImpl extends AbstractDaoImpl<SsHcEpisodioAtencion, SsHcEpisodioAtencionId>
		implements SsHcEpisodioAtencionDao {

	protected SsHcEpisodioAtencionDaoImpl() {
		super(SsHcEpisodioAtencion.class);
	}


	@Override
	public SsHcEpisodioAtencion obtenerPorId(SsHcEpisodioAtencionId id) {
		Object obj = findById(id);		
		return (obj!=null ? (SsHcEpisodioAtencion)obj:null);
	}

	@Override
	public List<SsHcEpisodioAtencion> listarElementosPag(SsHcEpisodioAtencion objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioAtencion.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("unidadReplicacion",objDao.getId().getUnidadReplicacion() ));
		}
		if (objDao.getId().getIdPaciente() != 0) {
			criteria.add(Restrictions.eq("idPaciente",objDao.getId().getIdPaciente() ));
		}
		if (objDao.getId().getEpisodioClinico() != 0) {
			criteria.add(Restrictions.eq("episodioClinico",objDao.getId().getEpisodioClinico() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}				
		criteria.setFirstResult(objDao.getInicio());
		criteria.setMaxResults(objDao.getNumeroFilas());
				
		return  criteria.list();
	}

	@Override
	public List<SsHcEpisodioAtencion> listarElementos(SsHcEpisodioAtencion objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioAtencion.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("unidadReplicacion",objDao.getId().getUnidadReplicacion() ));
		}
		if (objDao.getId().getIdPaciente() != 0) {
			criteria.add(Restrictions.eq("idPaciente",objDao.getId().getIdPaciente() ));
		}
		if (objDao.getId().getEpisodioClinico() != 0) {
			criteria.add(Restrictions.eq("episodioClinico",objDao.getId().getEpisodioClinico() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}				
		
		return  criteria.list();	
		
	}

	@Override
	public int contarTotal(SsHcEpisodioAtencion objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioAtencion.class);
		
		if (UtilesCommons.noEsVacio(objDao.getId().getUnidadReplicacion())) {
			criteria.add(Restrictions.eq("unidadReplicacion",objDao.getId().getUnidadReplicacion() ));
		}
		if (objDao.getId().getIdPaciente() != 0) {
			criteria.add(Restrictions.eq("idPaciente",objDao.getId().getIdPaciente() ));
		}
		if (objDao.getId().getEpisodioClinico() != 0) {
			criteria.add(Restrictions.eq("episodioClinico",objDao.getId().getEpisodioClinico() ));
		}
		if (UtilesCommons.noEsVacio(objDao.getEstado())) {
			criteria.add(Restrictions.eq("estado",objDao.getEstado()));
		}
		Object objResult = criteria.uniqueResult();
			
		return Integer.parseInt(objResult!=null?objResult.toString():"0");
	}

	@Override
	public long actualizar(SsHcEpisodioAtencion objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public long guardar(SsHcEpisodioAtencion objSsHcEpisodioAtencion) {
		long secuencia = 0;
		if (objSsHcEpisodioAtencion.getId().getUnidadReplicacion()!=null
				&& objSsHcEpisodioAtencion.getId().getIdPaciente()!=null
				&& objSsHcEpisodioAtencion.getId().getEpisodioClinico()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioAtencion.class);
			
			criteria.add(Restrictions.eq("id.unidadReplicacion", objSsHcEpisodioAtencion.getId().getUnidadReplicacion()));
			criteria.add(Restrictions.eq("id.idPaciente", objSsHcEpisodioAtencion.getId().getIdPaciente()));
			criteria.add(Restrictions.eq("id.episodioClinico", objSsHcEpisodioAtencion.getId().getEpisodioClinico()));
			criteria.setProjection(Projections.max("id.idEpisodioAtencion"));
			
			if (criteria.uniqueResult() != null) {
				secuencia = Integer.parseInt(criteria.uniqueResult().toString()) +1;
			}else {
				secuencia = 1;
			}
			objSsHcEpisodioAtencion.getId().setIdEpisodioAtencion(secuencia);
			save(objSsHcEpisodioAtencion);
		}
		
		return secuencia;
	}

	@Override
	public long eliminar(SsHcEpisodioAtencion objDao) {
		delete(objDao);
		return 1;
	}

}
