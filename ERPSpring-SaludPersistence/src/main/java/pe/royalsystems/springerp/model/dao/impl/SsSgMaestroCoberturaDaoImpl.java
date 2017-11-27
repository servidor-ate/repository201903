package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsSgMaestroCoberturaDao;
import pe.royalsystems.springerp.model.domain.SsSgMaestroCobertura;

@Repository
public class SsSgMaestroCoberturaDaoImpl extends AbstractDaoImpl<SsSgMaestroCobertura, String> implements SsSgMaestroCoberturaDao{

	protected SsSgMaestroCoberturaDaoImpl() {
		super(SsSgMaestroCobertura.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SsSgMaestroCobertura> listarSsSgMaestroCobertura(SsSgMaestroCobertura ssSgMaestroCobertura) {
		// TODO Auto-generated method stub

		try {

			Criteria crit = getCurrentSession().createCriteria(SsSgMaestroCobertura.class);
			if (ssSgMaestroCobertura.getTipoTabla()!=0) {
				crit.add(Restrictions.eq("tipoTabla", ssSgMaestroCobertura.getTipoTabla()));
			}
			if (ssSgMaestroCobertura.getEstado()!=0) {
				crit.add(Restrictions.eq("estado", ssSgMaestroCobertura.getEstado()));
			}
			if (ssSgMaestroCobertura.getIndicadorEmergencia()!=0) {
				crit.add(Restrictions.eq("indicadorEmergencia", ssSgMaestroCobertura.getIndicadorEmergencia()));
			}
			if (ssSgMaestroCobertura.getIndicadorHospitalario()!=0) {
				crit.add(Restrictions.eq("indicadorHospitalario", ssSgMaestroCobertura.getIndicadorHospitalario()));
			}
			if (ssSgMaestroCobertura.getIndicadorAmbulatorio() != 0) {
				crit.add(Restrictions.eq("indicadorAmbulatorio", ssSgMaestroCobertura.getIndicadorAmbulatorio()));
			}

			if (ssSgMaestroCobertura.getDescripcion() != null) {
				crit.add(Restrictions.like("descripcion", ssSgMaestroCobertura.getDescripcion(), MatchMode.ANYWHERE).ignoreCase());
			}
			if (ssSgMaestroCobertura.getIdCobertura() != 0) {
				crit.add(Restrictions.eq("idCobertura", ssSgMaestroCobertura.getIdCobertura()));
			}
			if (ssSgMaestroCobertura.getCodigoCobertura() != null) {
				crit.add(Restrictions.like("codigoCobertura", ssSgMaestroCobertura.getCodigoCobertura(), MatchMode.ANYWHERE).ignoreCase());
			}
			if (ssSgMaestroCobertura.getNombre() !=null) {
				crit.add(Restrictions.like("nombre", ssSgMaestroCobertura.getNombre(), MatchMode.ANYWHERE).ignoreCase());
			}

			crit.setFirstResult(ssSgMaestroCobertura.getInicio());
			crit.setMaxResults(ssSgMaestroCobertura.getNumeroFilas());
			List<SsSgMaestroCobertura> listaRetorno = crit.list();

			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public SsSgMaestroCobertura buscarSsSgMaestroCoberturaID(SsSgMaestroCobertura ssSgMaestroCobertura) {
		// TODO Auto-generated method stub
		try {
			return (SsSgMaestroCobertura) getCurrentSession().get(SsSgMaestroCobertura.class,
					ssSgMaestroCobertura.getIdCobertura());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorDeTotales(SsSgMaestroCobertura ssSgMaestroCobertura) {
		// TODO Auto-generated method stub
		try {
			Criteria crit = getCurrentSession().createCriteria(SsSgMaestroCobertura.class);
			crit.setProjection(Projections.rowCount());

			if (ssSgMaestroCobertura.getTipoTabla()!=0) {
				crit.add(Restrictions.eq("tipoTabla", ssSgMaestroCobertura.getTipoTabla()));
			}
			if (ssSgMaestroCobertura.getEstado()!=0) {
				crit.add(Restrictions.eq("estado", ssSgMaestroCobertura.getEstado()));
			}
			if (ssSgMaestroCobertura.getIndicadorEmergencia()!=0) {
				crit.add(Restrictions.eq("indicadorEmergencia", ssSgMaestroCobertura.getIndicadorEmergencia()));
			}
			if (ssSgMaestroCobertura.getIndicadorHospitalario()!=0) {
				crit.add(Restrictions.eq("indicadorHospitalario", ssSgMaestroCobertura.getIndicadorHospitalario()));
			}
			if (ssSgMaestroCobertura.getIndicadorAmbulatorio() != 0) {
				crit.add(Restrictions.eq("indicadorAmbulatorio", ssSgMaestroCobertura.getIndicadorAmbulatorio()));
			}

			if (ssSgMaestroCobertura.getDescripcion() != null) {
				crit.add(Restrictions.like("descripcion", ssSgMaestroCobertura.getDescripcion(), MatchMode.ANYWHERE).ignoreCase());
			}
			if (ssSgMaestroCobertura.getIdCobertura() != 0) {
				crit.add(Restrictions.eq("idCobertura", ssSgMaestroCobertura.getIdCobertura()));
			}
			if (ssSgMaestroCobertura.getCodigoCobertura() != null) {
				crit.add(Restrictions.like("codigoCobertura", ssSgMaestroCobertura.getCodigoCobertura(), MatchMode.ANYWHERE).ignoreCase());
			}
			if (ssSgMaestroCobertura.getNombre() !=null) {
				crit.add(Restrictions.like("nombre", ssSgMaestroCobertura.getNombre(), MatchMode.ANYWHERE).ignoreCase());
			}

			return Integer.parseInt( crit.uniqueResult().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}


	public int guardargSsSgMaestroCobertura(SsSgMaestroCobertura ssSgMaestroCobertura) {
		int ePisodio=0;
		if (ssSgMaestroCobertura.getIdCobertura()==0)
		{

			Criteria criteria = getCurrentSession().createCriteria(SsSgMaestroCobertura.class);
			criteria.setProjection(Projections.max("idCobertura"));
			if (criteria.uniqueResult()!=null) ePisodio = (int) criteria.uniqueResult();
			ssSgMaestroCobertura.setIdCobertura(ePisodio + 1);
		}
		saveOrUpdate(ssSgMaestroCobertura);
		return ePisodio;
	}

	public int eliminarSsSgMaestroCobertura(SsSgMaestroCobertura ssSgMaestroCobertura) {
		// TODO Auto-generated method stub
		try {
			delete(ssSgMaestroCobertura);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
