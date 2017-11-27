package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SgGrupoDao;
import pe.royalsystems.springerp.model.domain.SgGrupo;

@Repository
public class SgGrupoDaoImpl extends AbstractDaoImpl<SgGrupo, String> implements SgGrupoDao{

	protected SgGrupoDaoImpl() {
		super(SgGrupo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SgGrupo> listarSgGrupo(SgGrupo objSgGrupo) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SgGrupo.class);
			
			if (objSgGrupo.getIdGrupo()!=0) {
				criteria.add(Restrictions.eq("idGrupo", objSgGrupo.getIdGrupo()));
			}
			
			if (objSgGrupo.getEstado()!=null && objSgGrupo.getEstado()!=0) {
				criteria.add(Restrictions.eq("estado", objSgGrupo.getEstado()));
			}
			if (objSgGrupo.getCodigoGrupo()!=null) {
				criteria.add(Restrictions.eq("codigoGrupo", objSgGrupo.getCodigoGrupo()));
			}
			if (objSgGrupo.getNombre() != null) {
				criteria.add(Restrictions.like("nombre", objSgGrupo.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}
			criteria.setFirstResult(objSgGrupo.getInicio());
			criteria.setMaxResults(objSgGrupo.getNumeroFilas());
			
			List<SgGrupo> listaRetorno = criteria.list();
			
			return listaRetorno;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesRegistrosSgGrupo(SgGrupo objSgGrupo) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(SgGrupo.class);
			criteria.setProjection(Projections.rowCount());

			if (objSgGrupo.getIdGrupo()!=0) {
				criteria.add(Restrictions.eq("idGrupo", objSgGrupo.getIdGrupo()));
			}
			
			if (objSgGrupo.getEstado()!=null && objSgGrupo.getEstado()!=0) {
				criteria.add(Restrictions.eq("estado", objSgGrupo.getEstado()));
			}
			if (objSgGrupo.getCodigoGrupo()!=null) {
				criteria.add(Restrictions.eq("codigoGrupo", objSgGrupo.getCodigoGrupo()));
			}
			if (objSgGrupo.getNombre() != null) {
				criteria.add(Restrictions.like("nombre", objSgGrupo.getNombre(),MatchMode.ANYWHERE).ignoreCase());
			}

			return Integer.parseInt(criteria.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
