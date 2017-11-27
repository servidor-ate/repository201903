package pe.royalsystems.springerp.model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.GeUnidadMedidaDao;
import pe.royalsystems.springerp.model.domain.GeUnidadMedida;
import pe.royalsystems.springerp.model.domain.SySeguridadAutorizaciones;

@Repository
public class GeUnidadMedidaDaoImpl extends AbstractDaoImpl<GeUnidadMedida, String> implements GeUnidadMedidaDao{

	protected GeUnidadMedidaDaoImpl() {
		super(GeUnidadMedida.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<GeUnidadMedida> listarGeUnidadMedidaCombo(GeUnidadMedida objGeUnidadMedida) {
		// TODO Auto-generated method stub
		try {
			
			String queyString = "SELECT  distinct  wh_ItemMast.UnidadCodigo,GE_UnidadMedida.IdUnidadMedida,GE_UnidadMedida.Descripcion "
					+ " from wh_ItemMast inner join GE_UnidadMedida"
					+ "	ON wh_ItemMast.UnidadCodigo = GE_UnidadMedida.CodigoUnidadMedida";
					if (objGeUnidadMedida.getString1()!=null) {
						queyString = queyString + " where wh_ItemMast.Linea = '"+objGeUnidadMedida.getString1()+"'";
					}
					if (objGeUnidadMedida.getString2()!=null) {
						queyString = queyString + " and wh_ItemMast.Familia = '"+objGeUnidadMedida.getString2()+"'";
					}
					if (objGeUnidadMedida.getString3()!=null) {
						queyString = queyString + " and wh_ItemMast.SubFamilia  = '"+objGeUnidadMedida.getString3()+"'";
					}
					
				    
				    
			
			Query query = getCurrentSession().createSQLQuery(queyString);		
			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<GeUnidadMedida> listaRetorno = new ArrayList<GeUnidadMedida>();

			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				GeUnidadMedida autorizaciones = new GeUnidadMedida();

				if (obj[0] != null) {
					autorizaciones.setCodigoUnidadMedida(String.valueOf(obj[0]));
				}

				if (obj[1] != null) {
					autorizaciones.setIdUnidadMedida(Integer.parseInt(String.valueOf(obj[1]))); //codigo compania
				}
				if (obj[2] != null) {
					autorizaciones.setDescripcion(String.valueOf(String.valueOf(obj[2])));
				}
				
				listaRetorno.add(autorizaciones);
			}

			return listaRetorno;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
