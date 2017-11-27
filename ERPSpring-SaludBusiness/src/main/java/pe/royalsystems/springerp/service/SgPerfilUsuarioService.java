package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SgPerfilUsuario;

import java.util.List;

public interface SgPerfilUsuarioService {

	public int guardarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario);
	
	public int eliminarSgPerfilUsuario(SgPerfilUsuario objSgPerfilUsuario);
	
	public SgPerfilUsuario buscarSgPerfilUsuarioID(SgPerfilUsuario objSgPerfilUsuario);

	public int eliminarSgPerfilUsuarioDeAgente(SgPerfilUsuario objSgPerfilUsuario);
	
	public List<SgPerfilUsuario> listar(SgPerfilUsuario objSgPerfilUsuario);
	
}
