package pe.royalsystems.springerp.model.dao.impl;

import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.EmpleadomastDao;
import pe.royalsystems.springerp.model.domain.Empleadomast;

@Repository
public class EmpleadomastDaoImpl extends AbstractDaoImpl<Empleadomast, String> implements EmpleadomastDao{

	protected EmpleadomastDaoImpl() {
		super(Empleadomast.class);
		// TODO Auto-generated constructor stub
	}

		
}
