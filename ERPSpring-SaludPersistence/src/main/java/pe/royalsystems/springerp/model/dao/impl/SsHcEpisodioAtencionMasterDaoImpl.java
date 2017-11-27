package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcEpisodioAtencionMasterDao;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionMaster;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionMasterPK;
import pe.royalsystems.springerp.model.domain.SsHcIndicaciones;

@Repository
public class SsHcEpisodioAtencionMasterDaoImpl extends AbstractDaoImpl<SsHcEpisodioAtencionMaster, SsHcEpisodioAtencionMasterPK> implements SsHcEpisodioAtencionMasterDao{

	protected SsHcEpisodioAtencionMasterDaoImpl() {
		super(SsHcEpisodioAtencionMaster.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long guardar(SsHcEpisodioAtencionMaster objSsHcEpisodioAtencionMaster) {
			long secuencia = 0;
			if (objSsHcEpisodioAtencionMaster.getUnidadReplicacion()!=null 
					&& objSsHcEpisodioAtencionMaster.getIdPaciente()!=null
					&& objSsHcEpisodioAtencionMaster.getEpisodioClinico()!=null
					) {
				Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioAtencionMaster.class);
				
				criteria.add(Restrictions.eq("unidadReplicacion", objSsHcEpisodioAtencionMaster.getUnidadReplicacion()));
				criteria.add(Restrictions.eq("idPaciente", objSsHcEpisodioAtencionMaster.getIdPaciente()));
				criteria.add(Restrictions.eq("episodioClinico", objSsHcEpisodioAtencionMaster.getEpisodioClinico()));
				criteria.setProjection(Projections.max("episodioAtencion"));												
				if (criteria.uniqueResult() != null) {
					secuencia = Integer.parseInt(criteria.uniqueResult().toString()) + 1;
				}else {
					secuencia = 1;
				}
				objSsHcEpisodioAtencionMaster.setEpisodioAtencion(secuencia);
			}
			
			save(objSsHcEpisodioAtencionMaster);
			
			System.out.println("mirando lo que devolcio epsidioclinicodao = "+secuencia);
			return secuencia;
		
	}

	@Override
	public int eliminar(SsHcEpisodioAtencionMaster objssHcEpisodioAtencionMaster) {
		delete(objssHcEpisodioAtencionMaster);
		return 1;
	}

	@Override
	public int actualizar(SsHcEpisodioAtencionMaster objssHcEpisodioAtencionMaster) {
		update(objssHcEpisodioAtencionMaster);
		return 1;
	}

}
