package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcMedicamentoDao;
import pe.royalsystems.springerp.model.domain.SsHcMedicamento;

@Repository
public class SsHcMedicamentoDaoImpl extends AbstractDaoImpl<SsHcMedicamento, String>implements SsHcMedicamentoDao {

	protected SsHcMedicamentoDaoImpl() {
		super(SsHcMedicamento.class);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public SsHcMedicamento obtenerSsHcMedicamentoID(SsHcMedicamento objSsHcMedicamento) {
		// TODO Auto-generated method stub

		try {
			Criteria criteria = getCurrentSession().createCriteria(SsHcMedicamento.class);
			criteria.add(Restrictions.idEq(objSsHcMedicamento));
			return (SsHcMedicamento) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int guardar(SsHcMedicamento objDao) {
		int secuencia = 0;
		if (objDao.getId().getUnidadReplicacion()!=null
				&& objDao.getId().getIdPaciente()!=null
				&& objDao.getId().getEpisodioClinico()!=null
				&& objDao.getId().getIdEpisodioAtencion()!=null
				) {
			Criteria criteria = getCurrentSession().createCriteria(SsHcMedicamento.class);
			
			criteria.add(Restrictions.eq("id.unidadReplicacion", objDao.getId().getUnidadReplicacion()));
			criteria.add(Restrictions.eq("id.idPaciente", objDao.getId().getIdPaciente()));
			criteria.add(Restrictions.eq("id.episodioClinico", objDao.getId().getEpisodioClinico()));
			criteria.add(Restrictions.eq("id.idEpisodioAtencion", objDao.getId().getIdEpisodioAtencion()));
			criteria.setProjection(Projections.max("id.secuencia"));
			
			Object object = criteria.uniqueResult();			
			secuencia = (int) (object!=null?object:0);
			secuencia++;
			objDao.getId().setSecuencia(secuencia );
			save(objDao);
		}
		return secuencia;
	}

	@Override
	public int eliminar(SsHcMedicamento objSsHcMedicamento) {
		delete(objSsHcMedicamento);
		return 1;
		
	}
	@Override
	public int actualizar(SsHcMedicamento objSsHcMedicamento) {
		update(objSsHcMedicamento);
		return 1;
		
	}
	
	@Override
	public List<SsHcMedicamento> listarSsHcMedicamento(SsHcMedicamento objssHcMedicamento) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from SsHcMedicamento m" 
					+ " where m.id.idPaciente = "+ objssHcMedicamento.getId().getIdPaciente();
			if (objssHcMedicamento.getId().getEpisodioClinico() != 0) {
				queryString = queryString + " and m.id.episodioClinico = "
						+ objssHcMedicamento.getId().getEpisodioClinico();
			}
			if (objssHcMedicamento.getId().getIdEpisodioAtencion() != 0) {
				queryString = queryString + " and m.id.idEpisodioAtencion = "
						+ objssHcMedicamento.getId().getIdEpisodioAtencion();
			}
			if (objssHcMedicamento.getTipoMedicamento() != null) {
				queryString = queryString + " and m.tipoMedicamento = " + objssHcMedicamento.getTipoMedicamento();
			}

			Query query = getCurrentSession().createQuery(queryString);

			List<SsHcMedicamento> listaRetorno = query.list();

			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
