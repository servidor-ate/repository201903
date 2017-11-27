package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsTipoTrabajadorDao;
import pe.royalsystems.springerp.model.domain.SsTipoTrabajador;

@Repository
public class SsTipoTrabajadorDaoImpl extends AbstractDaoImpl<SsTipoTrabajador, String>implements SsTipoTrabajadorDao {

	protected SsTipoTrabajadorDaoImpl() {
		super(SsTipoTrabajador.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SsTipoTrabajador retornarSsTipoTrabajadorXid(SsTipoTrabajador objSsTipoTrabajador) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsTipoTrabajador.class);

			if (objSsTipoTrabajador.getTipoTrabajador() != null) {
				criteria.add(Restrictions.eq("tipoTrabajador", objSsTipoTrabajador.getTipoTrabajador()));
			}

			return (SsTipoTrabajador) criteria.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<SsTipoTrabajador> listaComboSsTipoTrabjador(SsTipoTrabajador objSsTipoTrabajador) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SsTipoTrabajador.class);
			
			if (objSsTipoTrabajador.getEstado()!=null) {
				criteria.add(Restrictions.eq("estado", objSsTipoTrabajador.getEstado()));
			}
			return criteria.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
