package pe.royalsystems.springerp.model.dao.impl;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcAnamnesisEaSintomaDao;
import pe.royalsystems.springerp.model.domain.SsHcAnamnesisEaSintoma;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioClinico;

import java.util.List;

@Repository
public class SsHcAnamnesisEaSintomaDaoImpl extends AbstractDaoImpl<SsHcAnamnesisEaSintoma, String> implements SsHcAnamnesisEaSintomaDao {

    protected SsHcAnamnesisEaSintomaDaoImpl() {
        super(SsHcAnamnesisEaSintoma.class);
    }


    @Override
    public int GuardarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa) {
        save(ssHcAnamnesisEa);
        return 1;
    }

    public int UpdateSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa) {
        update(ssHcAnamnesisEa);
        /*Session session=getCurrentSession().getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(ssHcAnamnesisEa);
            session.getTransaction().commit();
            session.close();
            return 1;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
            System.out.println("Real " +e.getMessage());
            return 0;
        }*/
        return 1;
    }

    @Override
    public int EliminarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEaSintoma) {
       delete(ssHcAnamnesisEaSintoma);
        /*try {
            Session session=getCurrentSession().getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(ssHcAnamnesisEaSintoma);
            session.getTransaction().commit();
            session.close();
            return 1;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("Real " +e.getMessage());
            return 0;
        }*/

        return 1;
    }

    @Override
    public SsHcAnamnesisEaSintoma BuscarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisEaSintoma.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisEa.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisEa.getIdPaciente()));
        criteria.add(Restrictions.eq("secuencia", ssHcAnamnesisEa.getSecuencia()));
        return (SsHcAnamnesisEaSintoma) criteria.uniqueResult();
    }

    public int MaxSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa) {
        int secuencias = 0;
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisEaSintoma.class);
        criteria.setProjection(Projections.max("secuencia"));
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisEa.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisEa.getIdPaciente()));
        if (criteria.uniqueResult()!=null) secuencias = (int)criteria.uniqueResult();
        return secuencias;
    }
    public List<SsHcAnamnesisEaSintoma> ListarSsHcAnamnesisEaSintoma(SsHcAnamnesisEaSintoma ssHcAnamnesisEa) {
        Criteria criteria = getCurrentSession().createCriteria(SsHcAnamnesisEaSintoma.class);
        criteria.add(Restrictions.eq("unidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", ssHcAnamnesisEa.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", ssHcAnamnesisEa.getIdPaciente()));
        return criteria.list();
    }
}

  /*
        try {
            Query query = getCurrentSession().createQuery("delete from SsHcAnamnesisEaSintoma where "+
                    " unidadReplicacion = :punidadReplicacion "+
                    " and idPaciente  = :pidPaciente "+
                    " and episodioClinico  = :pepisodioClinico "+
                    " and idEpisodioAtencion  = :pidEpisodioAtencion "+
                    " and secuencia  = :psecuencia ");
            query.setString("punidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion());
            query.setInteger("pidPaciente", ssHcAnamnesisEa.getIdPaciente());
            query.setInteger("pepisodioClinico", ssHcAnamnesisEa.getEpisodioClinico());
            query.setLong("pidEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion());
            query.setInteger("psecuencia", ssHcAnamnesisEa.getSecuencia());
            query.executeUpdate();
            // getCurrentSession().delete(ssHcAnamnesisEa);
        } finally {

        }
       // delete(ssHcAnamnesisEa);
        return 1;*/
/*
       String HlString = "insert into SsHcAnamnesisEaSintoma(unidadReplicacion, idEpisodioAtencion,idPaciente, episodioClinico, secuencia, idCiap2 )" +
                "values(:punidadReplicacion, :pidEpisodioAtencion, :pidPaciente, :pepisodioClinico, :psecuencia  :pidCiap2) ";
        Query query = getCurrentSession().createSQLQuery(HlString);
                query.setString("punidadReplicacion", ssHcAnamnesisEa.getUnidadReplicacion());
                query.setInteger("pidPaciente", ssHcAnamnesisEa.getIdPaciente());
                query.setInteger("pepisodioClinico", ssHcAnamnesisEa.getEpisodioClinico());
                query.setLong("pidEpisodioAtencion", ssHcAnamnesisEa.getIdEpisodioAtencion());
                query.setInteger("psecuencia", ssHcAnamnesisEa.getSecuencia());
                query.executeUpdate();
         save(ssHcAnamnesisEa);*/