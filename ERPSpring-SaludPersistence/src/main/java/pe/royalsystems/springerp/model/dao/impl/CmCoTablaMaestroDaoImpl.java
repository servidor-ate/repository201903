package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.CmCoTablaMaestroDao;
import pe.royalsystems.springerp.model.domain.CmCoTablaMaestro;
import pe.royalsystems.springerp.model.domain.CmCoTablaMaestroDetalle;

import java.util.List;

@Repository
public class CmCoTablaMaestroDaoImpl extends AbstractDaoImpl<CmCoTablaMaestro, String> implements CmCoTablaMaestroDao {

    protected CmCoTablaMaestroDaoImpl() {
        super(CmCoTablaMaestro.class);
    }

    @Override
    public int GuardarCmCoTablaMaestro(CmCoTablaMaestro cmCoTablaMaestro) {
        saveOrUpdate(cmCoTablaMaestro);
        return 0;
    }

    @Override
    public CmCoTablaMaestro BuscarCmCoTablaMaestro(CmCoTablaMaestro cmCoTablaMaestro) {
        Criteria criteria = getCurrentSession().createCriteria(CmCoTablaMaestro.class);
        /*criteria.add(Restrictions.eq("unidadReplicacion", cmCoTablaMaestro.getUnidadReplicacion()));
        criteria.add(Restrictions.eq("episodioClinico", cmCoTablaMaestro.getEpisodioClinico()));
        criteria.add(Restrictions.eq("idEpisodioAtencion", cmCoTablaMaestro.getIdEpisodioAtencion()));
        criteria.add(Restrictions.eq("idPaciente", cmCoTablaMaestro.getIdPaciente()));*/
        return (CmCoTablaMaestro) criteria.uniqueResult();
    }

    @Override
    public List<CmCoTablaMaestro> ListarCmCoTablaMaestro(CmCoTablaMaestro cmCoTablaMaestro) {
        Criteria criteria = getCurrentSession().createCriteria(CmCoTablaMaestro.class);
        criteria.add(Restrictions.eq("codigoTabla", cmCoTablaMaestro.getCodigoTabla()));
        CmCoTablaMaestro objTemp = (CmCoTablaMaestro) criteria.uniqueResult();
        if (objTemp != null) {
            int id = objTemp.getIdTablaMaestro();
            System.out.print("Llego Informa" + cmCoTablaMaestro.getIdTablaMaestro());

        criteria = getCurrentSession().createCriteria(CmCoTablaMaestroDetalle.class);
        criteria.add(Restrictions.eq("idTablaMaestro", objTemp.getIdTablaMaestro()));
        List<CmCoTablaMaestroDetalle> objTemps = criteria.list();
        if (objTemps != null) {
            System.out.print("-->" + objTemps.size());
            }
        }
        return null;

    }
}



 /*Criteria criteria = getCurrentSession().createCriteria(CmCoTablaMaestro.class, "aliasOfCmCoTablaMaestro")
               // .add(Restrictions.eq("aliasOfTableA.columnAA", "AAA"))
               // .createCriteria("aliasOfTableA.tableBId" , "aliasOfTableB")
               // .add(Restrictions.eq("aliasOfTableB.columnBB", "BBB"))
               // .createCriteria("aliasOfTableA.tableCId" , "aliasOfTableC")
               // .add(Restrictions.eq("aliasOfTableC.columnCC", "CCC"))
                .setProjection(Projections.projectionList()
                                .add( Projections.property("aliasOfCmCoTablaMaestro.idTablaMaestro") )
                                .add( Projections.property("aliasOfCmCoTablaMaestroDetalle.idTablaMaestro")));
                                //.add( Projections.property("aliasOfTableC.columnC") )

        String hql = "select distinct c from CmCoTablaMaestro c join inner CmCoTablaMaestroDetalle  b on  "+
                "c.idTablaMaestro = b.idTablaMaestro";

        Query query = getCurrentSession().createQuery(hql);

             return query.list();*/