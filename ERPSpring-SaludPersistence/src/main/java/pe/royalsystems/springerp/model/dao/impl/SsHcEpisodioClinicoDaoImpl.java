package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcEpisodioAtencionDao;
import pe.royalsystems.springerp.model.dao.SsHcEpisodioClinicoDao;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencion;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioClinico;
import pe.royalsystems.springerp.model.domain.SsHcIndicaciones;

import java.util.List;

@Repository
public class SsHcEpisodioClinicoDaoImpl extends AbstractDaoImpl<SsHcEpisodioClinico, String> implements SsHcEpisodioClinicoDao {

    protected SsHcEpisodioClinicoDaoImpl() {
        super(SsHcEpisodioClinico.class);
    }

    @Override
    public void saveUser(SsHcEpisodioClinico objEpisodio) {
        int ePisodio=0;
        Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioClinico.class);
        criteria.setProjection(Projections.max("episodioClinico"));
        criteria.add(Restrictions.eq("unidadReplicacion", objEpisodio.getUnidadReplicacion()));
        //criteria.add(Restrictions.eq("episodioClinico", objEpisodio.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idPaciente", objEpisodio.getIdPaciente()));
        ePisodio = (int) criteria.uniqueResult();
        System.out.println("row -> " +criteria.uniqueResult());
        objEpisodio.setEpisodioClinico(ePisodio+1);
        saveOrUpdate(objEpisodio);
    }

    @Override
    public List<SsHcEpisodioClinico> findUsers(String userName) {
        return findByCriteria(Restrictions.like("codigoOA", userName, MatchMode.START));
    }
    @Override
    public List<SsHcEpisodioClinico> findUsers(int episodio) {
        //
        //crit.add(Restrictions.eq("id", id);
        //Restrictions.eq( "age", new Integer(0) ),
        //
        return findByCriteria(Restrictions.eq("episodioClinico", episodio));
    }

	@Override
	public int eliminarSsHcEpisodioClinico(SsHcEpisodioClinico objSsHcEpisodioClinico) {
		// TODO Auto-generated method stub
		try {
			delete(objSsHcEpisodioClinico);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int existeSsHcEpisodioClinicoPorOrdenATencion(SsHcEpisodioClinico objSsHcEpisodioClinico) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioClinico.class);
			criteria.setProjection(Projections.rowCount());
			criteria.add(Restrictions.eq("idOrdenAtencion", objSsHcEpisodioClinico.getIdOrdenAtencion()));
			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardar(SsHcEpisodioClinico objSsHcEpisodioClinico) {							
			int secuencia = 0;
			if (objSsHcEpisodioClinico.getUnidadReplicacion()!=null &&  objSsHcEpisodioClinico.getIdPaciente()!=null) {
				Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioClinico.class);
				criteria.add(Restrictions.eq("unidadReplicacion", objSsHcEpisodioClinico.getUnidadReplicacion()));
				criteria.add(Restrictions.eq("idPaciente", objSsHcEpisodioClinico.getIdPaciente()));
				criteria.setProjection(Projections.max("episodioClinico"));				
				Object result = criteria.uniqueResult();
				if (result == null) {
					secuencia = 1;
				}else {
					secuencia = Integer.parseInt(result.toString()) +1;
				}
				objSsHcEpisodioClinico.setEpisodioClinico(secuencia);												
				save(objSsHcEpisodioClinico);		
		}
		return secuencia;
	}

	@Override
	public SsHcEpisodioClinico obtenerSsHcEpisodioClinicoPorOrdenATencion(SsHcEpisodioClinico objSsHcEpisodioClinico) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioClinico.class);
			criteria.add(Restrictions.eq("idOrdenAtencion", objSsHcEpisodioClinico.getIdOrdenAtencion()));
			return (SsHcEpisodioClinico) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
