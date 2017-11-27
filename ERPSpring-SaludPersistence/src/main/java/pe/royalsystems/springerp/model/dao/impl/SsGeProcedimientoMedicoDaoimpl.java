package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsGeProcedimientoMedicoDao;
import pe.royalsystems.springerp.model.domain.SsGeProcedimientoMedico;

import java.util.List;

@Repository
public class SsGeProcedimientoMedicoDaoimpl extends AbstractDaoImpl<SsGeProcedimientoMedico, Integer> implements SsGeProcedimientoMedicoDao{

	protected SsGeProcedimientoMedicoDaoimpl() {
		super(SsGeProcedimientoMedico.class);		
	}


	@Override
	public int contadorDeTotales(SsGeProcedimientoMedico objSsGeProcedimientoMedico) {
		// TODO Auto-generated method stub
		try {
			
			String query1 = "";
			query1 = "select COUNT(d) from SsGeProcedimientoMedico d where d.tipofolder = '"+1+"' ";
             if (objSsGeProcedimientoMedico.getNombre()!=null) {
            	 query1 = query1 +"and ( upper(d.nombre) like '%"+objSsGeProcedimientoMedico.getNombre().toUpperCase()+"%' )";
			 }
             if (objSsGeProcedimientoMedico.getCodigoProcedimiento()!=null) {
            	 query1 = query1 +"and ( upper(d.codigoProcedimiento) like '%"+objSsGeProcedimientoMedico.getCodigoProcedimiento().toUpperCase()+"%' )";
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
	public List<SsGeProcedimientoMedico> listar(SsGeProcedimientoMedico objSsGeProcedimientoMedico,boolean paginable) {
		Criteria criteria = getCurrentSession().createCriteria(SsGeProcedimientoMedico.class);
		if(UtilesCommons.noEsVacio(objSsGeProcedimientoMedico.getIdProcedimiento())){
			criteria.add(Restrictions.eq("idProcedimiento", objSsGeProcedimientoMedico.getIdProcedimiento()));
		}
		if(UtilesCommons.noEsVacio(objSsGeProcedimientoMedico.getIdProcedimientoPadre())){
			criteria.add(Restrictions.eq("idProcedimientoPadre", objSsGeProcedimientoMedico.getIdProcedimientoPadre()));
		}
		if(UtilesCommons.noEsVacio(objSsGeProcedimientoMedico.getCodigoProcedimiento())){
			criteria.add(Restrictions.like("codigoProcedimiento", objSsGeProcedimientoMedico.getCodigoProcedimiento(), MatchMode.ANYWHERE).ignoreCase());
		}
		if(UtilesCommons.noEsVacio(objSsGeProcedimientoMedico.getNombre())){
			criteria.add(Restrictions.like("nombre", objSsGeProcedimientoMedico.getNombre(),MatchMode.ANYWHERE).ignoreCase());
		}
		if(UtilesCommons.noEsVacio(objSsGeProcedimientoMedico.getEstado())){
			criteria.add(Restrictions.eq("estado", objSsGeProcedimientoMedico.getEstado()));
		}	if(UtilesCommons.noEsVacio(objSsGeProcedimientoMedico.getTipofolder())){
			criteria.add(Restrictions.eq("tipofolder", objSsGeProcedimientoMedico.getTipofolder()));
		}
		if(paginable){
			criteria.setFirstResult(objSsGeProcedimientoMedico.getInicio());
			criteria.setMaxResults(objSsGeProcedimientoMedico.getNumeroFilas());			
		}
		List<SsGeProcedimientoMedico> listaRetorno = criteria.list();
		return listaRetorno;
	}

	@Override
	public SsGeProcedimientoMedico buscar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos) {
		return null;
	}

	@Override
	public int contadorTotales(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos) {
		return 0;
	}

	@Override
	public int guardar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos) {
		save(objSsGeProcedimientoMedicoDos);
		return 1;
	}

	@Override
	public int actualizar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos) {
		update(objSsGeProcedimientoMedicoDos);
		return 1;
	}
	
	@Override
	public int eliminar(SsGeProcedimientoMedico objSsGeProcedimientoMedicoDos) {
		delete(objSsGeProcedimientoMedicoDos);
		return 1;
	}


	@Override
	public List<SsGeProcedimientoMedico> listarSsGeProcedimientoMedicoPaginacion(int inicio, int numeroFilas,
			SsGeProcedimientoMedico objSsGeProcedimientoMedico) {
		// TODO Auto-generated method stub
		try {

			String query1 = "";
			query1 = "from SsGeProcedimientoMedico d where d.tipofolder = '"+1+"' ";
             if (objSsGeProcedimientoMedico.getNombre()!=null) {
            	 query1 = query1 +"and ( upper(d.nombre) like '%"+objSsGeProcedimientoMedico.getNombre().toUpperCase()+"%' )";
			 }
             if (objSsGeProcedimientoMedico.getCodigoProcedimiento()!=null) {
            	 query1 = query1 +"and ( upper(d.codigoProcedimiento) like '%"+objSsGeProcedimientoMedico.getCodigoProcedimiento().toUpperCase()+"%' )";
			}
			
			Query query = getCurrentSession().createQuery(query1);
			query.setFirstResult(inicio);
			query.setMaxResults(numeroFilas);

			List<SsGeProcedimientoMedico> listaRetorno = (List<SsGeProcedimientoMedico>) query.list();
			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}




}
