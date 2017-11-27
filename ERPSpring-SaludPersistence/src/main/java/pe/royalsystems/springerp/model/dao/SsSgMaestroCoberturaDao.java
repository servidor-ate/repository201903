package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.SsSgMaestroCobertura;

public interface SsSgMaestroCoberturaDao extends AbstractDao<SsSgMaestroCobertura, String>{

	List<SsSgMaestroCobertura> listarSsSgMaestroCobertura(SsSgMaestroCobertura ssSgMaestroCobertura);
	
	SsSgMaestroCobertura buscarSsSgMaestroCoberturaID(SsSgMaestroCobertura ssSgMaestroCobertura);
	
	int contadorDeTotales(SsSgMaestroCobertura ssSgMaestroCobertura);
	
	int guardargSsSgMaestroCobertura(SsSgMaestroCobertura ssSgMaestroCobertura);
	
	int eliminarSsSgMaestroCobertura(SsSgMaestroCobertura ssSgMaestroCobertura) ;
	
	// TODO Auto-generated method stub
}
