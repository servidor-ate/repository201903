package pe.royalsystems.springerp.service;

import pe.royalsystems.springerp.model.domain.SgAgenteOpcion;

public interface SgAgenteOpcionService {

	public int guardarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion);

	public int eliminarSgAgenteOpcion(SgAgenteOpcion objSgAgenteOpcion);

	public SgAgenteOpcion buscarSgAgenteOpcionID(SgAgenteOpcion objSgAgenteOpcion);

}
