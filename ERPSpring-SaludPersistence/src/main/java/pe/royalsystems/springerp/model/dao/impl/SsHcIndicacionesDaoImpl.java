package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcIndicacionesDao;
import pe.royalsystems.springerp.model.domain.SsHcIndicaciones;
import pe.royalsystems.springerp.model.domain.SsHcIndicacionesId;


@Repository
public class SsHcIndicacionesDaoImpl extends AbstractDaoImpl<SsHcIndicaciones, SsHcIndicacionesId>implements SsHcIndicacionesDao {

	protected SsHcIndicacionesDaoImpl() {
		super(SsHcIndicaciones.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcIndicaciones> listaSsHcIndicaciones(SsHcIndicaciones objSsHcIndicaciones) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcIndicaciones.class);
			if (objSsHcIndicaciones.getId().getEpisodioClinico()!=0) {
				criteria.add(Restrictions.eq("id.episodioClinico", objSsHcIndicaciones.getId().getEpisodioClinico()));
			}
			if (objSsHcIndicaciones.getId().getIdEpisodioAtencion()!=0) {
				criteria.add(Restrictions.eq("id.idEpisodioAtencion", objSsHcIndicaciones.getId().getIdEpisodioAtencion()));
			}
			if (objSsHcIndicaciones.getId().getIdPaciente()!=0) {
				criteria.add(Restrictions.eq("id.idPaciente", objSsHcIndicaciones.getId().getIdPaciente()));
			}
			if (objSsHcIndicaciones.getId().getSecuenciaMedicamento()!=0) {
				criteria.add(Restrictions.eq("id.secuenciaMedicamento", objSsHcIndicaciones.getId().getSecuenciaMedicamento()));
			}
			return null;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int guardar(SsHcIndicaciones objDao) {
		int secuencia = 0;
		if (objDao.getId().getUnidadReplicacion()!=null
				&& objDao.getId().getIdPaciente()!=null
				&& objDao.getId().getEpisodioClinico()!=null
				&& objDao.getId().getIdEpisodioAtencion()!=null
				&& objDao.getId().getSecuenciaMedicamento()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcIndicaciones.class);
			
			criteria.add(Restrictions.eq("id.unidadReplicacion", objDao.getId().getUnidadReplicacion()));
			criteria.add(Restrictions.eq("id.idPaciente", objDao.getId().getIdPaciente()));
			criteria.add(Restrictions.eq("id.episodioClinico", objDao.getId().getEpisodioClinico()));
			criteria.add(Restrictions.eq("id.idEpisodioAtencion", objDao.getId().getIdEpisodioAtencion()));
			criteria.add(Restrictions.eq("id.secuenciaMedicamento", objDao.getId().getSecuenciaMedicamento()));
			criteria.setProjection(Projections.max("id.secuencia"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			
			objDao.getId().setSecuencia(secuencia + 1);
			save(objDao);
		}
		return secuencia;			
	}

	@Override
	public int actualizar(SsHcIndicaciones objsHcIndicaciones) {
		update(objsHcIndicaciones);
		return 1;
	}

	
	@Override
	public int eliminar(SsHcIndicaciones objsHcIndicaciones) {
		delete(objsHcIndicaciones);
		return 1;
	}

}
