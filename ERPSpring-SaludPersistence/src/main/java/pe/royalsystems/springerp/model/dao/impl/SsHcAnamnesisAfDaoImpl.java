package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcAnamnesisAfDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisAf;

@Repository
public class SsHcAnamnesisAfDaoImpl extends AbstractDaoImpl<SsHcAnamnesisAf, String> implements SsHcAnamnesisAfDao{

	protected SsHcAnamnesisAfDaoImpl() {
		super(SsHcAnamnesisAf.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int guardarSsHcAnamnesisAf(SsHcAnamnesisAf objSsHcAnamnesisAf) {
		// TODO Auto-generated method stub
		try {
			saveOrUpdate(objSsHcAnamnesisAf);
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int elimnarSsHcAnamnesisAf(SsHcAnamnesisAf objSsHcAnamnesisAf) {
		// TODO Auto-generated method stub
		try {
			delete(objSsHcAnamnesisAf);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<SsHcAnamnesisAf> listarSsHcAnamnesisAf(SsHcAnamnesisAf objSsHcAnamnesisAf) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAf.class);	
			
			List<SsHcAnamnesisAf> listaRetorno = criteria.list();
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcAnamnesisAf obtenerSsHcAnamnesisAf_ID(SsHcAnamnesisAf objSsHcAnamnesisAf) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisAf.class);
			
			if (objSsHcAnamnesisAf.getId().getEpisodioClinico()!=0) {
				criteria.add(Restrictions.eq("id.episodioClinico", objSsHcAnamnesisAf.getId().getEpisodioClinico()));
			}
			if (objSsHcAnamnesisAf.getId().getIdEpisodioAtencion()!=0) {
				criteria.add(Restrictions.eq("id.idEpisodioAtencion", objSsHcAnamnesisAf.getId().getIdEpisodioAtencion()));
			}
			if (objSsHcAnamnesisAf.getId().getIdPaciente()!=0) {
				criteria.add(Restrictions.eq("id.idPaciente", objSsHcAnamnesisAf.getId().getIdPaciente()));
			}
			if (objSsHcAnamnesisAf.getId().getUnidadReplicacion()!=null) {
				criteria.add(Restrictions.eq("id.unidadReplicacion", objSsHcAnamnesisAf.getId().getUnidadReplicacion()));
			}
			
			return (SsHcAnamnesisAf) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
