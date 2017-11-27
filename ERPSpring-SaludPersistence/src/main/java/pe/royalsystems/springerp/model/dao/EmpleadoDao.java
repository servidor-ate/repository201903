package pe.royalsystems.springerp.model.dao;

import java.util.List;

import pe.royalsystems.springerp.model.domain.Empleadomast;
import pe.royalsystems.springerp.model.domain.vista.VwEmpleado;

public interface EmpleadoDao extends AbstractDao<Empleadomast, Integer> {

	public VwEmpleado obtenerPorId(Integer idEmpleado);
	public List<VwEmpleado> listarVwEmpleados(VwEmpleado filtro);
}
