package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.ConsultorioDao;
import pe.royalsystems.springerp.model.domain.SsGeConsultorio;

@Repository
public class ConsultorioDaoImpl extends AbstractDaoImpl<SsGeConsultorio, Integer> implements ConsultorioDao {

	public ConsultorioDaoImpl() {
		super(SsGeConsultorio.class);
	}

}
