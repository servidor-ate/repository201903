package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.WhClaseSubFamiliaDao;
import pe.royalsystems.springerp.model.domain.WhClaseSubFamilia;

@Repository
public class WhClaseSubFamiliaDaoImpl extends AbstractDaoImpl<WhClaseSubFamilia, String> implements WhClaseSubFamiliaDao{

	protected WhClaseSubFamiliaDaoImpl() {
		super(WhClaseSubFamilia.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<WhClaseSubFamilia> listarWhClaseSubFamiliaPaginacion(int inicio, int numeroFilas,
			WhClaseSubFamilia objWhClaseSubFamilia) {
		// TODO Auto-generated method stub
		try {

			String query1 = "";
			query1 = "from WhClaseSubFamilia d where d.estado in('A','I') ";
             if (objWhClaseSubFamilia.getDescripcionLocal()!=null) {
            	 query1 = query1 +"and ( upper(d.descripcionLocal) like '%"+objWhClaseSubFamilia.getDescripcionLocal().toUpperCase()+"%' )";
			 }
             if (objWhClaseSubFamilia.getId().getSubFamilia()!=null) {
            	 query1 = query1 +"and ( upper(d.id.subFamilia) like '%"+objWhClaseSubFamilia.getId().getSubFamilia().toUpperCase()+"%' )";
			}
             if (objWhClaseSubFamilia.getId().getFamilia()!=null) {
            	 query1 = query1 +"and ( upper(d.id.familia) like '%"+objWhClaseSubFamilia.getId().getFamilia().toUpperCase()+"%' )";
			}
             if (objWhClaseSubFamilia.getId().getLinea()!=null) {
            	 query1 = query1 +"and ( upper(d.id.linea) like '%"+objWhClaseSubFamilia.getId().getLinea().toUpperCase()+"%' )";
			}
			
           
             
			Query query = getCurrentSession().createQuery(query1);
			query.setFirstResult(inicio);
			query.setMaxResults(numeroFilas);

			List<WhClaseSubFamilia> listaRetorno = (List<WhClaseSubFamilia>) query.list();
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public int contadorDeTotales(WhClaseSubFamilia objWhClaseSubFamilia) {
		// TODO Auto-generated method stub
		try {
			
			String query1 = "";
			query1 = "select COUNT(d) from WhClaseSubFamilia d where d.estado in('A','I') ";
             if (objWhClaseSubFamilia.getDescripcionLocal()!=null) {
            	 query1 = query1 +"and ( upper(d.descripcionLocal) like '%"+objWhClaseSubFamilia.getDescripcionLocal().toUpperCase()+"%' )";
			 }
             if (objWhClaseSubFamilia.getId().getSubFamilia()!=null) {
            	 query1 = query1 +"and ( upper(d.id.subFamilia) like '%"+objWhClaseSubFamilia.getId().getSubFamilia().toUpperCase()+"%' )";
			}
             if (objWhClaseSubFamilia.getId().getFamilia()!=null) {
            	 query1 = query1 +"and ( upper(d.id.familia) like '%"+objWhClaseSubFamilia.getId().getFamilia().toUpperCase()+"%' )";
			}
             if (objWhClaseSubFamilia.getId().getLinea()!=null) {
            	 query1 = query1 +"and ( upper(d.id.linea) like '%"+objWhClaseSubFamilia.getId().getLinea().toUpperCase()+"%' )";
			}
			
           
			
			Query query = getCurrentSession().createQuery(query1);

			Long result = (Long) query.list().get(0);

			return result.intValue();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public WhClaseSubFamilia obterenerWhClaseSubFamiliaID(WhClaseSubFamilia objWhClaseSubFamilia) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(WhClaseSubFamilia.class);
			if (objWhClaseSubFamilia.getId().getLinea()!=null) {
				criteria.add(Restrictions.eq("id.linea", objWhClaseSubFamilia.getId().getLinea()));
			}
			if (objWhClaseSubFamilia.getId().getFamilia()!=null) {
				criteria.add(Restrictions.eq("id.familia", objWhClaseSubFamilia.getId().getFamilia()));
			}
			if (objWhClaseSubFamilia.getId().getSubFamilia()!=null) {
				criteria.add(Restrictions.eq("id.subFamilia", objWhClaseSubFamilia.getId().getSubFamilia()));
			}

			return (WhClaseSubFamilia) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
