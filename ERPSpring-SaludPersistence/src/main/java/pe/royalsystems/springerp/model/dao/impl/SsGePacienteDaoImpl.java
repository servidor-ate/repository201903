package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsGePacienteDao;
import pe.royalsystems.springerp.model.domain.SsGePaciente;

@Repository
public class SsGePacienteDaoImpl extends AbstractDaoImpl<SsGePaciente, Integer>implements SsGePacienteDao {

	protected SsGePacienteDaoImpl() {
		super(SsGePaciente.class);	
	}

	@Override
	public SsGePaciente obtenerPorId(Integer primaryKey) {
		Object result  = findById(primaryKey);
		return result!=null?(SsGePaciente)result:null;
	}

	@Override
	public List<SsGePaciente> listarElementosPag(SsGePaciente objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsGePaciente.class);
		if (objDao.getIdPaciente() != 0) {
			criteria.add(Restrictions.eq("idPaciente", objDao.getIdPaciente()));
		}
		if (objDao.getDescripcion() != null) {
			criteria.add(Restrictions.like("descripcion", objDao.getDescripcion()));
		}
		if (objDao.getEstado() != null) {
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
		criteria.setFirstResult(objDao.getInicio());
		criteria.setMaxResults(objDao.getNumeroFilas());
		List<SsGePaciente> listaRetorno = criteria.list();
		return listaRetorno;
	}

	@Override
	public List<SsGePaciente> listarElementos(SsGePaciente objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsGePaciente.class);
		
		if (objDao.getIdPaciente() != 0) {
			criteria.add(Restrictions.eq("idPaciente", objDao.getIdPaciente()));
		}
		if (objDao.getDescripcion() != null) {
			criteria.add(Restrictions.like("descripcion", objDao.getDescripcion()));
		}
		if (objDao.getEstado() != null) {
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
					
		return  criteria.list();
	}

	@Override
	public int contarTotal(SsGePaciente objDao) {
		Criteria criteria = getCurrentSession().createCriteria(SsGePaciente.class);
		criteria.setProjection(Projections.rowCount());

		if (objDao.getIdPaciente() != 0) {
			criteria.add(Restrictions.eq("idPaciente", objDao.getIdPaciente()));
		}
		if (objDao.getDescripcion() != null) {
			criteria.add(Restrictions.like("descripcion", objDao.getDescripcion()));
		}
		if (objDao.getEstado() != null) {
			criteria.add(Restrictions.eq("estado", objDao.getEstado()));
		}
		Object result = criteria.uniqueResult(); 
		
		return Integer.parseInt(result!=null?result.toString():"0");
	}

	@Override
	public int guardar(SsGePaciente objDao) {
		
		save(objDao);
		return 1;
	}

	@Override
	public int actualizar(SsGePaciente objDao) {
		update(objDao);
		return 1;
	}

	@Override
	public int eliminar(SsGePaciente objDao) {
		delete(objDao);
		return 1;
	}
}
