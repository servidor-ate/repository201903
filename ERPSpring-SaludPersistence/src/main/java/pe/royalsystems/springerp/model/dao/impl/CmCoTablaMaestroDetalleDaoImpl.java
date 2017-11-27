package pe.royalsystems.springerp.model.dao.impl;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.CmCoTablaMaestroDetalleDao;
import pe.royalsystems.springerp.model.domain.CmCoTablaMaestro;
import pe.royalsystems.springerp.model.domain.CmCoTablaMaestroDetalle;
import pe.royalsystems.springerp.model.domain.vista.VwTablamaestrodetalle;

import java.util.List;

@Repository
public class CmCoTablaMaestroDetalleDaoImpl extends AbstractDaoImpl<CmCoTablaMaestroDetalle, String> implements CmCoTablaMaestroDetalleDao {

	protected CmCoTablaMaestroDetalleDaoImpl() {
		super(CmCoTablaMaestroDetalle.class);		
	}

	@Override
	public CmCoTablaMaestroDetalle obtenerPorId(Integer primaryKey01, Integer primaryKey02) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmCoTablaMaestroDetalle> listarElementosPag(CmCoTablaMaestroDetalle objDao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmCoTablaMaestroDetalle> listarElementos(CmCoTablaMaestroDetalle objDao) {
        List<CmCoTablaMaestroDetalle> objTemps=null;
        Criteria criteria = getCurrentSession().createCriteria(CmCoTablaMaestro.class);
        criteria.add(Restrictions.eq("codigoTabla", objDao.getCodigo()));
        CmCoTablaMaestro objTemp = (CmCoTablaMaestro) criteria.uniqueResult();
        if (objTemp != null) {
            criteria = getCurrentSession().createCriteria(CmCoTablaMaestroDetalle.class);
            criteria.add(Restrictions.eq("idTablaMaestro", objTemp.getIdTablaMaestro()));
            objTemps = criteria.list();
        }
        return objTemps;		
	}

	@Override
	public int contarTotal(CmCoTablaMaestroDetalle objDao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int guardar(CmCoTablaMaestroDetalle objDao) {
		save(objDao);
		return 0;
	}

	@Override
	public int actualizar(CmCoTablaMaestroDetalle objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(CmCoTablaMaestroDetalle objDao) {
		delete(objDao); 
		return 1;
	}

	@Override
	public List<VwTablamaestrodetalle> listarElementos(VwTablamaestrodetalle objDao) {
		Criteria criteria = getCurrentSession().createCriteria(VwTablamaestrodetalle.class);
			
		if (objDao.getCodigoTabla()!= null && !objDao.getCodigoTabla().isEmpty()) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("codigoTabla", objDao.getCodigoTabla()));
		}
		if (objDao.getEstadoMaestroDet()!= null &&  "0".equals(objDao.getEstadoMaestroDet()+"")) {
			//System.out.println("String persona"+ personamast.getEstado());
			criteria.add(Restrictions.eq("estadoMaestroDet", objDao.getEstadoMaestroDet()));
		}
		return (List<VwTablamaestrodetalle>) criteria.list();
	}


}



 /*Criteria criteria = getCurrentSession().createCriteria(CmCoTablaMaestroDetalle.class, "aliasOfCmCoTablaMaestroDetalle")
               // .add(Restrictions.eq("aliasOfTableA.columnAA", "AAA"))
               // .createCriteria("aliasOfTableA.tableBId" , "aliasOfTableB")
               // .add(Restrictions.eq("aliasOfTableB.columnBB", "BBB"))
               // .createCriteria("aliasOfTableA.tableCId" , "aliasOfTableC")
               // .add(Restrictions.eq("aliasOfTableC.columnCC", "CCC"))
                .setProjection(Projections.projectionList()
                                .add( Projections.property("aliasOfCmCoTablaMaestroDetalle.idTablaMaestro") )
                                .add( Projections.property("aliasOfCmCoTablaMaestroDetalleDetalle.idTablaMaestro")));
                                //.add( Projections.property("aliasOfTableC.columnC") )

        String hql = "select distinct c from CmCoTablaMaestroDetalle c join inner CmCoTablaMaestroDetalleDetalle  b on  "+
                "c.idTablaMaestro = b.idTablaMaestro";

        Query query = getCurrentSession().createQuery(hql);

             return query.list();*/