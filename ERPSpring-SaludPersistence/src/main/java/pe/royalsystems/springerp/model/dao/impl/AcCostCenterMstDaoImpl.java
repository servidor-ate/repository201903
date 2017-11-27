package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.AcCostCenterMstDao;
import pe.royalsystems.springerp.model.domain.AcCostCenterMst;

@Repository
public class AcCostCenterMstDaoImpl extends AbstractDaoImpl<AcCostCenterMst, String>implements AcCostCenterMstDao {

	protected AcCostCenterMstDaoImpl() {
		super(AcCostCenterMst.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<AcCostCenterMst> listaComboAcCostCenterMst(AcCostCenterMst objAcCostCenterMst) {
		// TODO Auto-generated method stub
		try {

			Criteria criteria = getCurrentSession().createCriteria(AcCostCenterMst.class);

			if (objAcCostCenterMst.getStatus() != null) {
				criteria.add(Restrictions.eq("status", objAcCostCenterMst.getStatus()));
			}

			return criteria.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public AcCostCenterMst obtenerAcCostCenterMstID(AcCostCenterMst objAcCostCenterMst) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(AcCostCenterMst.class);
			criteria.add(Restrictions.eq("costCenter", objAcCostCenterMst.getCostCenter()));

			return (AcCostCenterMst) criteria.uniqueResult();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<AcCostCenterMst> listaPaginacionAcCostCenterMst(AcCostCenterMst objAcCostCenterMst) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(AcCostCenterMst.class);

			if (objAcCostCenterMst.getCostCenter() != null) {
				criteria.add(Restrictions.like("costCenter", objAcCostCenterMst.getCostCenter(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			if (objAcCostCenterMst.getLocalName() != null) {
				criteria.add(Restrictions.like("localName", objAcCostCenterMst.getLocalName(), MatchMode.ANYWHERE)
						.ignoreCase());
			}

			criteria.setFirstResult(objAcCostCenterMst.getInicio());
			criteria.setMaxResults(objAcCostCenterMst.getNumeroFilas());

			return criteria.list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesAcCostCenterMst(AcCostCenterMst objAcCostCenterMst) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(AcCostCenterMst.class);

			if (objAcCostCenterMst.getCostCenter() != null) {
				criteria.add(Restrictions.like("costCenter", objAcCostCenterMst.getCostCenter(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			if (objAcCostCenterMst.getLocalName() != null) {
				criteria.add(Restrictions.like("localName", objAcCostCenterMst.getLocalName(), MatchMode.ANYWHERE)
						.ignoreCase());
			}
			
			criteria.setProjection(Projections.rowCount());
			
			return Integer.parseInt(criteria.uniqueResult().toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

}
