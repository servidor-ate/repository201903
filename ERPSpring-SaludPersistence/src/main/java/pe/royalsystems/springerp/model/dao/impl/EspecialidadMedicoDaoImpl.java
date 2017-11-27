package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.EspecialidadMedicoDao;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidadMedico;
import pe.royalsystems.springerp.model.domain.vista.VwEspecialidadMedico;

@Repository
public class EspecialidadMedicoDaoImpl extends AbstractDaoImpl<SsGeEspecialidadMedico, Integer> implements EspecialidadMedicoDao {

	protected EspecialidadMedicoDaoImpl() {
		super(SsGeEspecialidadMedico.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VwEspecialidadMedico> listarVwEspecialidadMedico(VwEspecialidadMedico filtro) {
		Criteria cq = createCriteria(VwEspecialidadMedico.class);
		if(UtilesCommons.esPositivo(filtro.getIdEspecialidad())){
			cq.add(Restrictions.eq("idEspecialidad", filtro.getIdEspecialidad()));
		}
		if(UtilesCommons.esPositivo(filtro.getIdMedico())){
			cq.add(Restrictions.eq("idMedico", filtro.getIdMedico()));
		}
		if(UtilesCommons.esPositivo(filtro.getEstadoEspecialidad())){
			cq.add(Restrictions.eq("estadoEspecialidad", filtro.getEstadoEspecialidad()));
		}
		if(UtilesCommons.esPositivo(filtro.getEstadoEspecialidadMedico())){
			cq.add(Restrictions.eq("estadoEspecialidadMedico", filtro.getEstadoEspecialidadMedico()));
		}
		if(UtilesCommons.noEsVacio(filtro.getEstadoPersona())){
			cq.add(Restrictions.eq("estadoPersona", filtro.getEstadoPersona()));
		}
		if(UtilesCommons.noEsVacio(filtro.getNombreCompleto())){
			cq.add(Restrictions.ilike("nombreCompleto", filtro.getNombreCompleto(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.esPositivo(filtro.getEmpleado())){
			cq.add(Restrictions.eq("empleado", filtro.getEmpleado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getTipoPersona())){
			cq.add(Restrictions.eq("tipoPersona", filtro.getTipoPersona()));
		}
		if(UtilesCommons.noEsVacio(filtro.getDescripcion())){
			cq.add(Restrictions.ilike("descripcion", filtro.getDescripcion(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.noEsVacio(filtro.getCodigo())){
			cq.add(Restrictions.ilike("codigo", filtro.getCodigo(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.noEsVacio(filtro.getListInteger()) && UtilesCommons.noEsVacio(filtro.getAtributoList())){
			cq.add(Restrictions.in(filtro.getAtributoList(), filtro.getListInteger()));
		}
		setPaginable(filtro, cq);
		setOrdenableAsc(filtro, cq);
		return (List<VwEspecialidadMedico>) cq.list();
	}

}
