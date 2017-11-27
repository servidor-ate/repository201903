package pe.royalsystems.springerp.model.dao;
 
import java.util.List;


import pe.royalsystems.springerp.model.domain.Usuario;

 
public interface UsuarioDao extends AbstractDao<Usuario, String>{
 
	public List<Usuario> findAll();
 
	public Usuario find(String primaryKey);
	
	public List<Usuario> listarPaginacionUsuario(Usuario objUsuario,boolean paginable);
	
	public int contadorTotalesUsuario(Usuario objUsuario);
	 
}
