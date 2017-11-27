package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SgModuloDao;
import pe.royalsystems.springerp.model.domain.SgModulo;

import java.util.List;

@Repository
public class SgModuloDaoImpl extends AbstractDaoImpl<SgModulo, String> implements SgModuloDao {

	protected SgModuloDaoImpl() {
		super(SgModulo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SgModulo> listarSgModulo(SgModulo objsgModulo) {
		// TODO Auto-generated method stub
		try{
			Criteria criteria = getCurrentSession()
					.createCriteria(SgModulo.class);
			
			if (objsgModulo.getSistema() != null){
				criteria.add(Restrictions.eq("sistema", objsgModulo.getSistema()));
			}	
			if (objsgModulo.getModulo() != null){
				criteria.add(Restrictions.eq("modulo", objsgModulo.getModulo()));
			}	
			if (objsgModulo.getNombre() != null){
				criteria.add(Restrictions.like("nombre", objsgModulo.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgModulo.getDescripcion() != null){
				criteria.add(Restrictions.like("descripcion", objsgModulo.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgModulo.getPlataforma() != null){
				criteria.add(Restrictions.eq("plataforma", objsgModulo.getDescripcion()));
			}
			if (objsgModulo.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objsgModulo.getEstado()));
			}
			
			criteria.setFirstResult(objsgModulo.getInicio());
			criteria.setMaxResults(objsgModulo.getNumeroFilas());
			
			List<SgModulo> listaRetorno = criteria.list();
			
			return listaRetorno;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(SgModulo objsgModulo) {
		// TODO Auto-generated method stub
		try{

			Criteria criteria = getCurrentSession()
					.createCriteria(SgModulo.class);
			criteria.setProjection(Projections.rowCount());


			if (objsgModulo.getSistema() != null){
				criteria.add(Restrictions.eq("Sistema", objsgModulo.getSistema()));
			}	
			if (objsgModulo.getModulo() != null){
				criteria.add(Restrictions.eq("Modulo", objsgModulo.getModulo()));
			}	
			if (objsgModulo.getNombre() != null){
				criteria.add(Restrictions.like("Nombre", objsgModulo.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgModulo.getDescripcion() != null){
				criteria.add(Restrictions.like("Descripcion", objsgModulo.getDescripcion(),MatchMode.ANYWHERE).ignoreCase());
			}
			if (objsgModulo.getPlataforma() != null){
				criteria.add(Restrictions.eq("Plataforma", objsgModulo.getDescripcion()));
			}
			if (objsgModulo.getEstado()!=null) {
				criteria.add(Restrictions.eq("Estado", objsgModulo.getEstado()));
			}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSgModulo(SgModulo objsgModulo) {
		// TODO Auto-generated method stub
		try {
		int ePisodio=0;
		if(objsgModulo.getModulo()==null){
			Criteria criteria = getCurrentSession().createCriteria(SgModulo.class);
			criteria.setProjection(Projections.max("Orden"));
			if(criteria.uniqueResult()!=null) ePisodio = (int) criteria.uniqueResult();
			objsgModulo.setOrden(ePisodio + 1);
		}
		saveOrUpdate(objsgModulo);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSgModulo(SgModulo objsgModulo) {
		try {
			//System.out.println("eliminar DAO = "+objsgModulo());
			delete(objsgModulo);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public SgModulo buscarSgModuloID(SgModulo objsgModulo) {
		// TODO Auto-generated method stub
		try {
			//System.out.println("objsgModulo.getId() DAO = "+objsgModulo.getId());
			SgModulo sgModuloRetorno;		
			
			Criteria criteria = getCurrentSession().createCriteria(SgModulo.class);
			criteria.add(Restrictions.eq("Sistema", objsgModulo.getSistema()));
			criteria.add(Restrictions.eq("Modulo", objsgModulo.getModulo()));
			
			sgModuloRetorno = (SgModulo) criteria.uniqueResult();
			
			return sgModuloRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
