package pe.royalsystems.springerp.model.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SgPerfilUsuarioDao;
import pe.royalsystems.springerp.model.domain.SgPerfilUsuario;
import pe.royalsystems.springerp.model.domain.SgPerfilUsuarioId;

@Repository
public class SgPerfilUsuarioDaoImpl extends AbstractDaoImpl<SgPerfilUsuario, SgPerfilUsuarioId> implements SgPerfilUsuarioDao{

	protected SgPerfilUsuarioDaoImpl() {
		super(SgPerfilUsuario.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int guardarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			save(objSgPerfilUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int eliminarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			delete(objSgPerfilUsuario);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public SgPerfilUsuario buscarSgPerfilUsuarioID(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			SgPerfilUsuario sgPerfilUsuarioRetorno;
			
			Criteria criteria = getCurrentSession().createCriteria(SgPerfilUsuario.class);
			criteria.add(Restrictions.eq("id.idPerfil", objSgPerfilUsuario.getId().getIdPerfil()));
			criteria.add(Restrictions.eq("id.idUsuario", objSgPerfilUsuario.getId().getIdUsuario()));
		
			sgPerfilUsuarioRetorno = (SgPerfilUsuario) criteria.uniqueResult();
			
			return sgPerfilUsuarioRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int eliminarSgPerfilUsuarioDeAgente(SgPerfilUsuario objSgPerfilUsuario) {
		// TODO Auto-generated method stub
		try {
			Query query = (Query) getCurrentSession().createQuery("delete from SgPerfilUsuario d "
					+ "where d.id.idPerfil = "+objSgPerfilUsuario.getId().getIdPerfil()+" or "
				    + "d.id.idUsuario = "+objSgPerfilUsuario.getId().getIdUsuario());
		    query.executeUpdate();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<SgPerfilUsuario> listar(SgPerfilUsuario objSgPerfilUsuario) {
		Criteria criteria = getCurrentSession().createCriteria(SgPerfilUsuario.class);
		if(UtilesCommons.noEsVacio(objSgPerfilUsuario.getId().getIdUsuario())){
			criteria.add(Restrictions.eq("id.idUsuario", objSgPerfilUsuario.getId().getIdUsuario()));	
		}
		if(UtilesCommons.noEsVacio(objSgPerfilUsuario.getId().getIdPerfil())){
			criteria.add(Restrictions.eq("id.idPerfil", objSgPerfilUsuario.getId().getIdPerfil()));	
		}					
		return criteria.list();
	}

}
