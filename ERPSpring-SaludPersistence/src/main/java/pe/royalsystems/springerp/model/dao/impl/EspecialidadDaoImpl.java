package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.EspecialidadDao;
import pe.royalsystems.springerp.model.domain.SsGeEspecialidad;


@Repository
public class EspecialidadDaoImpl extends AbstractDaoImpl<SsGeEspecialidad, Integer> implements EspecialidadDao {

	protected EspecialidadDaoImpl() {
		super(SsGeEspecialidad.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SsGeEspecialidad> listarEspecialidades(SsGeEspecialidad filtro) {
		Criteria criteria = getCurrentSession().createCriteria(SsGeEspecialidad.class);
		if(UtilesCommons.esPositivo(filtro.getEstado())){
			criteria.add(Restrictions.eq("estado", filtro.getEstado()));
		}
		if(UtilesCommons.noEsVacio(filtro.getDescripcion())){
			criteria.add(Restrictions.ilike("descripcion", filtro.getDescripcion(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.noEsVacio(filtro.getNombre())){
			criteria.add(Restrictions.ilike("nombre", filtro.getNombre(), MatchMode.ANYWHERE));
		}
		if(UtilesCommons.noEsVacio(filtro.getCodigo())){
			criteria.add(Restrictions.ilike("codigo", filtro.getCodigo(), MatchMode.ANYWHERE));
		}
		
		
		if("NO_IN_ESPECIALIDAD".equals(filtro.getNombreConsulta())){
			if(UtilesCommons.noEsVacio(filtro.getListInteger()) && UtilesCommons.noEsVacio(filtro.getAtributoList())){
				criteria.add(Restrictions.not(
						Restrictions.in(filtro.getAtributoList(), filtro.getListInteger())
						)
					);
			}			
		}else if("IN_ESPECIALIDAD".equals(filtro.getNombreConsulta())){								
			if(UtilesCommons.noEsVacio(filtro.getListInteger()) && UtilesCommons.noEsVacio(filtro.getAtributoList())){
				criteria.add(Restrictions.in(filtro.getAtributoList(), filtro.getListInteger()));
			}			
		}else{
			if(UtilesCommons.noEsVacio(filtro.getListInteger()) && UtilesCommons.noEsVacio(filtro.getAtributoList())){
				criteria.add(Restrictions.in(filtro.getAtributoList(), filtro.getListInteger()));
			}			
		}
		
		setPaginable(filtro, criteria);
		setOrdenableAsc(filtro, criteria);
		return (List<SsGeEspecialidad>) criteria.list();
	}

}
