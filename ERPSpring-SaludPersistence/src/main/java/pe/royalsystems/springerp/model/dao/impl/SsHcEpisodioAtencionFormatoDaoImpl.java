package pe.royalsystems.springerp.model.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.model.dao.SsHcEpisodioAtencionFormatoDao;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionFormato;

import java.util.List;

@Repository
public class SsHcEpisodioAtencionFormatoDaoImpl extends AbstractDaoImpl<SsHcEpisodioAtencionFormato, String> implements SsHcEpisodioAtencionFormatoDao{

	protected SsHcEpisodioAtencionFormatoDaoImpl() {
		super(SsHcEpisodioAtencionFormato.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsHcEpisodioAtencionFormato> listarSsHcEpisodioAtencionFormato(
			SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato) {
		// TODO Auto-generated method stub
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(Personamast.class)
					.setProjection(Property.forName("persona"));
				
			Criteria criteriaArea = getCurrentSession().createCriteria(SsHcEpisodioAtencionFormato.class)
					.add(Restrictions.or(
					  Property.forName("idPaciente").in(criteria)
					));
			criteriaArea.setFirstResult(objSsHcEpisodioAtencionFormato.getInicio());
			criteriaArea.setMaxResults(objSsHcEpisodioAtencionFormato.getNumeroFilas());
			
			if (objSsHcEpisodioAtencionFormato.getUnidadReplicacion()!=null) {
				criteriaArea.add(Restrictions.eq("unidadReplicacion",objSsHcEpisodioAtencionFormato.getUnidadReplicacion()));
			}
			if (objSsHcEpisodioAtencionFormato.getEpisodioClinico()!=0) {
				criteriaArea.add(Restrictions.eq("episodioClinico",objSsHcEpisodioAtencionFormato.getEpisodioClinico()));
			}
			if (objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()!=0) {
				criteriaArea.add(Restrictions.eq("idEpisodioAtencion",objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()));
			}
			if (objSsHcEpisodioAtencionFormato.getIdPaciente()!=0) {
				criteriaArea.add(Restrictions.eq("idPaciente",objSsHcEpisodioAtencionFormato.getIdPaciente()));
			}
			
			
			return criteriaArea.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorSsHcEpisodioAtencionFormato(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato) {
		// TODO Auto-generated method stub
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(Personamast.class)
					.setProjection(Property.forName("persona"));
				
			Criteria criteriaArea = getCurrentSession().createCriteria(SsHcEpisodioAtencionFormato.class)
					.add(Restrictions.or(
					  Property.forName("idPaciente").in(criteria)
					));
			criteriaArea.setProjection(Projections.rowCount());
			
			if (objSsHcEpisodioAtencionFormato.getUnidadReplicacion()!=null) {
				criteriaArea.add(Restrictions.eq("unidadReplicacion",objSsHcEpisodioAtencionFormato.getUnidadReplicacion()));
			}
			if (objSsHcEpisodioAtencionFormato.getEpisodioClinico()!=0) {
				criteriaArea.add(Restrictions.eq("episodioClinico",objSsHcEpisodioAtencionFormato.getEpisodioClinico()));
			}
			if (objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()!=0) {
				criteriaArea.add(Restrictions.eq("idEpisodioAtencion",objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()));
			}
			if (objSsHcEpisodioAtencionFormato.getIdPaciente()!=0) {
				criteriaArea.add(Restrictions.eq("idPaciente",objSsHcEpisodioAtencionFormato.getIdPaciente()));
			}
			
			
			return Integer.parseInt(criteriaArea.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public SsHcEpisodioAtencionFormato buscarEpisodioPaciente(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato) {
		Criteria criteriaArea = getCurrentSession().createCriteria(SsHcEpisodioAtencionFormato.class);
		if (objSsHcEpisodioAtencionFormato.getUnidadReplicacion()!=null) {
			criteriaArea.add(Restrictions.eq("unidadReplicacion",objSsHcEpisodioAtencionFormato.getUnidadReplicacion()));
		}
		if (objSsHcEpisodioAtencionFormato.getEpisodioClinico()!=0) {
			criteriaArea.add(Restrictions.eq("episodioClinico",objSsHcEpisodioAtencionFormato.getEpisodioClinico()));
		}
		if (objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()!=0) {
			criteriaArea.add(Restrictions.eq("dEpisodioAtencion",objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()));
		}
		if (objSsHcEpisodioAtencionFormato.getIdPaciente()!=0) {
			criteriaArea.add(Restrictions.eq("idPaciente",objSsHcEpisodioAtencionFormato.getIdPaciente()));
		}
		SsHcEpisodioAtencionFormato ssHcEpisodioAtencionFormato  ;
		ssHcEpisodioAtencionFormato = (SsHcEpisodioAtencionFormato) criteriaArea.uniqueResult();
		return ssHcEpisodioAtencionFormato;
	}
	@Override
	public SsHcEpisodioAtencionFormato atencionFormularioDinamico(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato) {
		Criteria criteriaArea = getCurrentSession().createCriteria(SsHcEpisodioAtencionFormato.class);
		if (objSsHcEpisodioAtencionFormato.getUnidadReplicacion()!=null) {
			criteriaArea.add(Restrictions.eq("unidadReplicacion",objSsHcEpisodioAtencionFormato.getUnidadReplicacion()));
		}
		if (objSsHcEpisodioAtencionFormato.getEpisodioClinico()!=0) {
			criteriaArea.add(Restrictions.eq("episodioClinico",objSsHcEpisodioAtencionFormato.getEpisodioClinico()));
		}
		if (objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()!=0) {
			criteriaArea.add(Restrictions.eq("idEpisodioAtencion",objSsHcEpisodioAtencionFormato.getIdEpisodioAtencion()));
		}
		if (objSsHcEpisodioAtencionFormato.getIdPaciente()!=0) {
			criteriaArea.add(Restrictions.eq("idPaciente",objSsHcEpisodioAtencionFormato.getIdPaciente()));
		}
		if (objSsHcEpisodioAtencionFormato.getIdOpcion()!=0) {
			criteriaArea.add(Restrictions.eq("idOpcion",objSsHcEpisodioAtencionFormato.getIdOpcion()));
		}
		SsHcEpisodioAtencionFormato ssHcEpisodioAtencionFormato  ;
		ssHcEpisodioAtencionFormato = (SsHcEpisodioAtencionFormato) criteriaArea.uniqueResult();
		return ssHcEpisodioAtencionFormato;
	}
	@Override
	public int guardar(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato) {

			int secuencia = 0;
			if (objSsHcEpisodioAtencionFormato.getIdTransacciones()== 0) {
				Criteria criteria = getCurrentSession().createCriteria(SsHcEpisodioAtencionFormato.class);
				criteria.setProjection(Projections.max("idTransacciones"));
				if (criteria.uniqueResult() != null) {
					secuencia = (int) criteria.uniqueResult();
				}
				objSsHcEpisodioAtencionFormato.setIdTransacciones(secuencia + 1);
			}
			saveOrUpdate(objSsHcEpisodioAtencionFormato);
			return secuencia;
	}
}
