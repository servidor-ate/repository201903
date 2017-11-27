package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsHcExamenFisicoTriajeDao;
import pe.royalsystems.springerp.model.domain.SsHcExamenFisicoTriaje;
import pe.royalsystems.springerp.model.domain.SsHcExamenFisicoTriajeId;


@Repository
public class SsHcExamenFisicoTriajeDaoImpl extends AbstractDaoImpl<SsHcExamenFisicoTriaje, SsHcExamenFisicoTriajeId> implements SsHcExamenFisicoTriajeDao{

	protected SsHcExamenFisicoTriajeDaoImpl() {
		super(SsHcExamenFisicoTriaje.class);
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<SsHcExamenFisicoTriaje> listar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje) {	
		try {			
			Criteria criteria = getCurrentSession().createCriteria(SsHcExamenFisicoTriaje.class);
			if(UtilesCommons.noEsVacio(objSsHcExamenFisicoTriaje.getId().getUnidadReplicacion())){
				criteria.add(Restrictions.eq("id.unidadReplicacion", objSsHcExamenFisicoTriaje.getId().getUnidadReplicacion()));
			}
			if(objSsHcExamenFisicoTriaje.getId().getIdPaciente()!=null){
				criteria.add(Restrictions.eq("id.episodioClinico", objSsHcExamenFisicoTriaje.getId().getEpisodioClinico()));
			}
			if(UtilesCommons.noEsVacio(objSsHcExamenFisicoTriaje.getId().getEpisodioClinico())){
				criteria.add(Restrictions.eq("id.episodioClinico", objSsHcExamenFisicoTriaje.getId().getEpisodioClinico()));
			}

			if(UtilesCommons.noEsVacio(objSsHcExamenFisicoTriaje.getId().getIdEpisodioAtencion())){
				criteria.add(Restrictions.eq("id.idEpisodioAtencion", objSsHcExamenFisicoTriaje.getId().getIdEpisodioAtencion()));
			}
			
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SsHcExamenFisicoTriaje obtenerPorID(SsHcExamenFisicoTriajeId id) {
		Object result = findById(id);
		return result!=null?(SsHcExamenFisicoTriaje)result:null;
		
	}



	@Override
	public int guardar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje) {
		save(objSsHcExamenFisicoTriaje);
		return 1;
	}
	

	@Override
	public int actualizar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje) {
		update(objSsHcExamenFisicoTriaje);
		return 1;
	}

	@Override
	public int eliminar(SsHcExamenFisicoTriaje objSsHcExamenFisicoTriaje) {
		delete(objSsHcExamenFisicoTriaje);
		return 1;
	}
}
