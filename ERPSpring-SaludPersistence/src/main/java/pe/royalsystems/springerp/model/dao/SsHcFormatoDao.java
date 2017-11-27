package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.commons.model.PaginaModel;
import pe.royalsystems.springerp.model.domain.SsHcFormato;

import java.util.List;

public interface SsHcFormatoDao extends AbstractDao<SsHcFormato, String> {
	
	public List<SsHcFormato> listarSsHcFormato(SsHcFormato objssHcFormato);

	public SsHcFormato buscarSsHcFormatoID(SsHcFormato objssHcFormato);
	
	public int contadorTotalesRegistrosSsHcFormato(SsHcFormato objssHcFormato);
	
	public int guardarSsHcFormato(SsHcFormato objssHcFormato);
	
	public int eliminarSsHcFormato(SsHcFormato objssHcFormato);
	public PaginaModel<SsHcFormato> listarPaginado(SsHcFormato filtro);
}
