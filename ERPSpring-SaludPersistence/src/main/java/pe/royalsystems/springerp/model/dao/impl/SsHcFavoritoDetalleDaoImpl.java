package pe.royalsystems.springerp.model.dao.impl;

import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SsHcFavoritoDetalleDao;
import pe.royalsystems.springerp.model.domain.SsHcFavoritoDetalle;

@Repository
public class SsHcFavoritoDetalleDaoImpl  extends AbstractDaoImpl<SsHcFavoritoDetalle, String> implements SsHcFavoritoDetalleDao{

	protected SsHcFavoritoDetalleDaoImpl() {
		super(SsHcFavoritoDetalle.class);
		// TODO Auto-generated constructor stub
	}

}
