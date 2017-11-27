package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SgPerfilUsuario;
import pe.royalsystems.springerp.model.domain.SgPerfilUsuarioId;

public interface SgPerfilUsuarioDao extends AbstractDao<SgPerfilUsuario, SgPerfilUsuarioId>{
	
	public int guardarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario);
	
	public int eliminarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario);
	
	public SgPerfilUsuario buscarSgPerfilUsuarioID(SgPerfilUsuario objSgPerfilUsuario);
	
	public List<SgPerfilUsuario> listar(SgPerfilUsuario objSgPerfilUsuario);
	
	public int eliminarSgPerfilUsuarioDeAgente(SgPerfilUsuario objSgPerfilUsuario);

}
