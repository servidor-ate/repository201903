package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.VEpisodioAtencionesDao;
import pe.royalsystems.springerp.model.domain.Personamast;
import pe.royalsystems.springerp.model.domain.SgAgente;
import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencion;
import pe.royalsystems.springerp.model.domain.VEpisodioAtenciones;

@Repository
public class VEpisodioAtencionesDaoImpl extends AbstractDaoImpl<VEpisodioAtenciones, String>
		implements VEpisodioAtencionesDao {

	protected VEpisodioAtencionesDaoImpl() {
		super(VEpisodioAtenciones.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<VEpisodioAtenciones> listarVEpisodioAtenciones(VEpisodioAtenciones objVEpisodioAtenciones) {
		// TODO Auto-generated method stub
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.episodioClinico"));
			
			DetachedCriteria criteria1 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.unidadReplicacion"));
			
			DetachedCriteria criteria2 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.idPaciente"));
			
			DetachedCriteria criteria3 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.idEpisodioAtencion"));
			
			DetachedCriteria criteria4 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("idOrdenAtencion"));
	
			
					
			Criteria criteriaArea = getCurrentSession().createCriteria(VEpisodioAtenciones.class)
					.add(Restrictions.or(
					  Property.forName("id.episodioClinico").in(criteria),
					  Property.forName("id.unidadReplicacion").in(criteria1),
					  Property.forName("id.idPaciente").in(criteria2),
					  Property.forName("id.idEpisodioAtencion").in(criteria3),
					  Property.forName("idOrdenAtencion").in(criteria4)
					));
			criteriaArea.setFirstResult(objVEpisodioAtenciones.getInicio());
			criteriaArea.setMaxResults(objVEpisodioAtenciones.getNumeroFilas());
			
			if (objVEpisodioAtenciones.getPersona()!=0) {
				criteriaArea.add(Restrictions.eq("persona",objVEpisodioAtenciones.getPersona()));
			}
			if (objVEpisodioAtenciones.getId().getIdPaciente()!=0) {
				criteriaArea.add(Restrictions.eq("id.idPaciente",objVEpisodioAtenciones.getId().getIdPaciente()));
			}
			if (objVEpisodioAtenciones.getEstadoEpisodioAten()!=null) {
				criteriaArea.add(Restrictions.eq("estadoEpisodioAten",objVEpisodioAtenciones.getEstadoEpisodioAten()));
			}
			if (objVEpisodioAtenciones.getIdOrdenAtencion()!=null) {
				criteriaArea.add(Restrictions.eq("idOrdenAtencion",objVEpisodioAtenciones.getIdOrdenAtencion()));
			}
			if (objVEpisodioAtenciones.getAccion()!=null) {
				criteriaArea.add(Restrictions.eq("accion",objVEpisodioAtenciones.getAccion()));
			}
			if (objVEpisodioAtenciones.getNombreCompleto()!=null) {
				criteriaArea.add(Restrictions.like("nombreCompleto", objVEpisodioAtenciones.getNombreCompleto(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			return criteriaArea.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesVEpisodioAtenciones(VEpisodioAtenciones objVEpisodioAtenciones) {
		// TODO Auto-generated method stub
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.episodioClinico"));
			
			DetachedCriteria criteria1 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.unidadReplicacion"));
			
			DetachedCriteria criteria2 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.idPaciente"));
			
			DetachedCriteria criteria3 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("id.idEpisodioAtencion"));
			
			DetachedCriteria criteria4 = DetachedCriteria.forClass(SsHcEpisodioAtencion.class)
					.setProjection(Property.forName("idOrdenAtencion"));
			
					
			Criteria criteriaArea = getCurrentSession().createCriteria(VEpisodioAtenciones.class)
					.add(Restrictions.or(
					  Property.forName("id.episodioClinico").in(criteria),
					  Property.forName("id.unidadReplicacion").in(criteria1),
					  Property.forName("id.idPaciente").in(criteria2),
					  Property.forName("id.idEpisodioAtencion").in(criteria3),
					  Property.forName("idOrdenAtencion").in(criteria4)
					));
			criteriaArea.setProjection(Projections.rowCount());
			
			if (objVEpisodioAtenciones.getPersona()!=0) {
				criteriaArea.add(Restrictions.eq("persona",objVEpisodioAtenciones.getPersona()));
			}
			if (objVEpisodioAtenciones.getId().getIdPaciente()!=0) {
				criteriaArea.add(Restrictions.eq("id.idPaciente",objVEpisodioAtenciones.getId().getIdPaciente()));
			}
			if (objVEpisodioAtenciones.getEstadoEpisodioAten()!=null) {
				criteriaArea.add(Restrictions.eq("estadoEpisodioAten",objVEpisodioAtenciones.getEstadoEpisodioAten()));
			}
			if (objVEpisodioAtenciones.getIdOrdenAtencion()!=null) {
				criteriaArea.add(Restrictions.eq("idOrdenAtencion",objVEpisodioAtenciones.getIdOrdenAtencion()));
			}
			if (objVEpisodioAtenciones.getAccion()!=null) {
				criteriaArea.add(Restrictions.eq("accion",objVEpisodioAtenciones.getAccion()));
			}
			if (objVEpisodioAtenciones.getNombreCompleto()!=null) {
				criteriaArea.add(Restrictions.like("nombreCompleto", objVEpisodioAtenciones.getNombreCompleto(),MatchMode.ANYWHERE).ignoreCase());
			}
			
			return Integer.parseInt(criteriaArea.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
