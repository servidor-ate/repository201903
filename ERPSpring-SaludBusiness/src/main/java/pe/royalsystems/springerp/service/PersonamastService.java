package pe.royalsystems.springerp.service;

import java.util.List;

import pe.royalsystems.springerp.model.domain.Personamast;

public interface PersonamastService {

	public List<Personamast> listarPersonamast(Personamast personamast, boolean paginable);
	
	public Personamast obtenerPorId(Integer primaryKey);
	
	public int contadorDeTotales(Personamast personamast);

	public int eliminarPersonamast(Personamast personamast);

	public int guardarPersonamast(Personamast personamast);
	
	public int actualizar(Personamast personamast);
	
	public int guardarUsuarioPersona(Personamast objDao);
	public int guardarUsuarioPaciente(Personamast objDao);
	
	public int enviarCorreoRegistroPersonaUsuario(Personamast objSave) ;

}
