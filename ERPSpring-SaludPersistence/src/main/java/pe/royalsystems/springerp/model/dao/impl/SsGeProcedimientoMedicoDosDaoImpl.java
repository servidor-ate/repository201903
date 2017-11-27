package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsGeProcedimientoMedicoDosDao;
import pe.royalsystems.springerp.model.domain.SsGeProcedimientoMedicoDos;

@Repository
public class SsGeProcedimientoMedicoDosDaoImpl extends AbstractDaoImpl<SsGeProcedimientoMedicoDos, String> implements SsGeProcedimientoMedicoDosDao{

	protected SsGeProcedimientoMedicoDosDaoImpl() {
		super(SsGeProcedimientoMedicoDos.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsGeProcedimientoMedicoDos> listarSsGeProcedimientoMedicoDos(
			SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsGeProcedimientoMedicoDos.class);
			
			if(objSsGeProcedimientoMedicoDos.getIdProcedimientoDos() != 0){
				criteria.add(Restrictions.eq("idProcedimientoDos", objSsGeProcedimientoMedicoDos.getIdProcedimientoDos()));
			}
			if(objSsGeProcedimientoMedicoDos.getIdProcedimientoDosPadre() != null){
				criteria.add(Restrictions.eq("idProcedimientoDosPadre", objSsGeProcedimientoMedicoDos.getIdProcedimientoDosPadre()));
			}
			if(objSsGeProcedimientoMedicoDos.getCodigoProcedimientoDos() != null){
				criteria.add(Restrictions.like("codigoProcedimientoDos", objSsGeProcedimientoMedicoDos.getCodigoProcedimientoDos(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objSsGeProcedimientoMedicoDos.getNombre() != null){
				criteria.add(Restrictions.like("nombre", objSsGeProcedimientoMedicoDos.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objSsGeProcedimientoMedicoDos.getEstado() != null){
				criteria.add(Restrictions.eq("estado", objSsGeProcedimientoMedicoDos.getEstado()));
			}
			
			criteria.setFirstResult(objSsGeProcedimientoMedicoDos.getInicio());
			criteria.setMaxResults(objSsGeProcedimientoMedicoDos.getNumeroFilas());
			
			List<SsGeProcedimientoMedicoDos> listaRetorno = criteria.list();
			
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsGeProcedimientoMedicoDos buscarSsGeProcedimientoMedicoDosID(
			SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos) {
		// TODO Auto-generated method stub
		try {
			System.out.println("objSsGeProcedimientoMedicoDos.getIdProcedimientoDos() DAO = " +objSsGeProcedimientoMedicoDos.getIdProcedimientoDos());
			SsGeProcedimientoMedicoDos ssGeProcedimientoMedicoDosRetorno;
			
			Criteria criteria = getCurrentSession().createCriteria(SsGeProcedimientoMedicoDos.class);
			criteria.add(Restrictions.eq("idProcedimientoDos", objSsGeProcedimientoMedicoDos.getIdProcedimientoDos()));
			
			ssGeProcedimientoMedicoDosRetorno = (SsGeProcedimientoMedicoDos) criteria.uniqueResult();
		
			return ssGeProcedimientoMedicoDosRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotales(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos) {
		// TODO Auto-generated method stub
		try {
			
			Criteria criteria = getCurrentSession().createCriteria(SsGeProcedimientoMedicoDos.class);
			criteria.setProjection(Projections.rowCount());
			
			if(objSsGeProcedimientoMedicoDos.getIdProcedimientoDos() != 0){
				criteria.add(Restrictions.eq("idProcedimientoDos", objSsGeProcedimientoMedicoDos.getIdProcedimientoDos()));
			}
			if(objSsGeProcedimientoMedicoDos.getIdProcedimientoDosPadre() != null){
				criteria.add(Restrictions.eq("idProcedimientoDosPadre", objSsGeProcedimientoMedicoDos.getIdProcedimientoDosPadre()));
			}
			if(objSsGeProcedimientoMedicoDos.getCodigoProcedimientoDos() != null){
				criteria.add(Restrictions.like("codigoProcedimientoDos", objSsGeProcedimientoMedicoDos.getCodigoProcedimientoDos(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objSsGeProcedimientoMedicoDos.getNombre() != null){
				criteria.add(Restrictions.like("nombre", objSsGeProcedimientoMedicoDos.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			if(objSsGeProcedimientoMedicoDos.getEstado() != null){
				criteria.add(Restrictions.eq("estado", objSsGeProcedimientoMedicoDos.getEstado()));
			}
			
			return Integer.parseInt(criteria.uniqueResult().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int guardarSsGeProcedimientoMedicoDos(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos) {
		// TODO Auto-generated method stub
		try {
			int ePisodio=0;
			if(objSsGeProcedimientoMedicoDos.getIdProcedimientoDos()==0){
				Criteria criteria = getCurrentSession().createCriteria(SsGeProcedimientoMedicoDos.class);
				criteria.setProjection(Projections.max("idProcedimientoDos"));
				if(criteria.uniqueResult()!=null) ePisodio = (int) criteria.uniqueResult();
				objSsGeProcedimientoMedicoDos.setIdProcedimientoDos(ePisodio + 1);
			}
			saveOrUpdate(objSsGeProcedimientoMedicoDos);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSsGeProcedimientoMedicoDos(SsGeProcedimientoMedicoDos objSsGeProcedimientoMedicoDos) {
		// TODO Auto-generated method stub
		try {
			System.out.println("eliminar DAO = "+objSsGeProcedimientoMedicoDos.getIdProcedimientoDos());
			delete(objSsGeProcedimientoMedicoDos);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	
}
