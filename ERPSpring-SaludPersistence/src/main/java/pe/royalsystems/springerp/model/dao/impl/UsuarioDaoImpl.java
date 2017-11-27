package pe.royalsystems.springerp.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.UsuarioDao;
import pe.royalsystems.springerp.model.domain.Usuario;

@Repository
public class UsuarioDaoImpl extends AbstractDaoImpl<Usuario, String> implements UsuarioDao{

	protected UsuarioDaoImpl() {
		super(Usuario.class);		
	}

	@Override
	public List<Usuario> findAll() {		
		return null;
	}

	@Override
	public Usuario find(String primaryKey) {
		Object obj = findById(primaryKey);		
		return (obj!=null ? (Usuario)obj:null);
	}

	@Override
	public List<Usuario> listarPaginacionUsuario(Usuario objUsuario,boolean paginable) {		
		try {
			System.out.println("entro al dao Usuario");
			Criteria criteria = getCurrentSession().createCriteria(Usuario.class);
			
			if (objUsuario.getUsuario()!=null) {
				criteria.add(Restrictions.like("usuario", objUsuario.getUsuario(), MatchMode.ANYWHERE).ignoreCase());
			}
			
			if (objUsuario.getNombre()!=null) {
				criteria.add(Restrictions.like("nombre", objUsuario.getNombre(), MatchMode.ANYWHERE).ignoreCase());
			}
			if(paginable){
				criteria.setFirstResult(objUsuario.getInicio());
				criteria.setMaxResults(objUsuario.getNumeroFilas());			
			}			
			return criteria.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int contadorTotalesUsuario(Usuario objUsuario) {
		// TODO Auto-generated method stub
		try {
			Criteria criteria = getCurrentSession().createCriteria(Usuario.class);

			if (objUsuario.getUsuario()!=null) {
				criteria.add(Restrictions.like("usuario", objUsuario.getUsuario(), MatchMode.ANYWHERE).ignoreCase());
			}
			
			if (objUsuario.getNombre()!=null) {
				criteria.add(Restrictions.like("nombre", objUsuario.getNombre(), MatchMode.ANYWHERE).ignoreCase());
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
