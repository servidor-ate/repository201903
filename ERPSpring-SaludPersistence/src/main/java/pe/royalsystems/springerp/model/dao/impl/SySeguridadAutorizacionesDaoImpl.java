package pe.royalsystems.springerp.model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import pe.royalsystems.springerp.model.dao.SySeguridadAutorizacionesDao;
import pe.royalsystems.springerp.model.domain.SySeguridadAutorizaciones;
import pe.royalsystems.springerp.model.domain.SySeguridadAutorizacionesId;
import pe.royalsystems.springerp.model.domain.VwAtencionpacienteGeneral;

@Repository
public class SySeguridadAutorizacionesDaoImpl extends AbstractDaoImpl<SySeguridadAutorizaciones, String>
		implements SySeguridadAutorizacionesDao {

	protected SySeguridadAutorizacionesDaoImpl() {
		super(SySeguridadAutorizaciones.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SySeguridadAutorizaciones> listarComboSySeguridadAutorizacionesCompania(
			SySeguridadAutorizaciones objSySeguridadAutorizaciones) {
		// TODO Auto-generated method stub
		try {
			Query query = getCurrentSession()
					.createSQLQuery(" SELECT  distinct   "
							+ "dbo.SY_SeguridadAutorizaciones.AplicacionCodigo, "
							+ "dbo.SeguridadAutorizacionCompania.Companyowner,"
							+ " dbo.SY_SeguridadAutorizaciones.Grupo,"
							+ "dbo.companyowner.companyowner, "
							+ "dbo.companyowner.description   ,0  "
							+ "  FROM dbo.SY_SeguridadAutorizaciones INNER JOIN dbo.SeguridadAutorizacionCompania "
							+ " ON dbo.SY_SeguridadAutorizaciones.Usuario = dbo.SeguridadAutorizacionCompania.Usuario  INNER JOIN "
							+ " dbo.companyowner ON dbo.SeguridadAutorizacionCompania.Companyowner = dbo.companyowner.companyowner "
							+ " where   ltrim(SY_SeguridadAutorizaciones.Usuario)  = '"
							+ objSySeguridadAutorizaciones.getString1() + "' and Grupo = '"
							+ objSySeguridadAutorizaciones.getString2() + "'");

			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SySeguridadAutorizaciones> listaRetorno = new ArrayList<SySeguridadAutorizaciones>();

			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				SySeguridadAutorizaciones autorizaciones = new SySeguridadAutorizaciones();

				if (obj[0] != null) {
					autorizaciones.setString1(String.valueOf(obj[0]));  //aplicacion codigo
				}

				if (obj[1] != null) {
					autorizaciones.setString2(String.valueOf(obj[1])); //codigo compania
				}
				if (obj[2] != null) {
					autorizaciones.setString3(String.valueOf(obj[2])); //grupo
				}
				if (obj[3] != null) {
					autorizaciones.setString4(String.valueOf(obj[3])); //
				}
				if (obj[4] != null) {
					autorizaciones.setString5(String.valueOf(obj[4])); //
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

	@Override
	public List<SySeguridadAutorizaciones> listarComboSySeguridadAutorizacionesSucursal(
			SySeguridadAutorizaciones objSySeguridadAutorizaciones) {
		// TODO Auto-generated method stub
		try {
			Query query = getCurrentSession().createSQLQuery(
					"Select  dbo.SY_SeguridadAutorizaciones.AplicacionCodigo,SeguridadAutorizacionCompania.Companyowner,"
							+ " dbo.SY_SeguridadAutorizaciones.Grupo,dbo.AC_Sucursal.Sucursal,AC_Sucursal.DescripcionLocal  ,0 "
							+ " FROM  dbo.SY_SeguridadAutorizaciones INNER JOIN "
							+ " dbo.AC_Sucursal ON dbo.SY_SeguridadAutorizaciones.Concepto = dbo.AC_Sucursal.Sucursal INNER JOIN "
							+ " dbo.SeguridadAutorizacionCompania ON dbo.SY_SeguridadAutorizaciones.Usuario = dbo.SeguridadAutorizacionCompania.Usuario AND"
							+ " dbo.AC_Sucursal.Compania = dbo.SeguridadAutorizacionCompania.Companyowner"
							+ " where ltrim(SY_SeguridadAutorizaciones.Usuario)  = '"
							+ objSySeguridadAutorizaciones.getString1() + "'" + "and AC_Sucursal.Compania = '"
							+ objSySeguridadAutorizaciones.getString2() + "'" + "and  Grupo = '"
							+ objSySeguridadAutorizaciones.getString3() + "'");

			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SySeguridadAutorizaciones> listaRetorno = new ArrayList<SySeguridadAutorizaciones>();

			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				SySeguridadAutorizaciones autorizaciones = new SySeguridadAutorizaciones();

				if (obj[0] != null) {
					autorizaciones.setString1(String.valueOf(obj[0]));
				}

				if (obj[1] != null) {
					autorizaciones.setString2(String.valueOf(obj[1]));
				}
				if (obj[2] != null) {
					autorizaciones.setString3(String.valueOf(obj[2]));
				}
				if (obj[3] != null) {
					autorizaciones.setString4(String.valueOf(obj[3]).trim());
				}
				if (obj[4] != null) {
					autorizaciones.setString5(String.valueOf(obj[4]));
				}
				if (obj[5] != null) {
					autorizaciones.setString6(String.valueOf(obj[5]));
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

	@Override
	public List<SySeguridadAutorizaciones> listarComboSySeguridadAutorizacionesEstablecimiento(
			SySeguridadAutorizaciones objSySeguridadAutorizaciones) {
		// TODO Auto-generated method stub
		try {
			Query query = getCurrentSession()
					.createSQLQuery("SELECT    dbo.SY_SeguridadAutorizaciones.AplicacionCodigo, "
							+ " dbo.SY_SeguridadAutorizaciones.Grupo,"
							+ "dbo.AC_Sucursal.Sucursal, "
							+ " dbo.CM_CO_Establecimiento.IdEstablecimiento,"
							+ "dbo.CM_CO_Establecimiento.Codigo,"
							+ " dbo.CM_CO_Establecimiento.Nombre,"
							+ "dbo.CM_CO_Establecimiento.Descripcion, "
							+ " dbo.CM_CO_Establecimiento.Estado,"
							+ "dbo.SY_SeguridadAutorizaciones.Usuario , "
							+ " CM_CO_Establecimiento.IdEstablecimiento as d "
							+ "FROM dbo.AC_Sucursal INNER JOIN "
							+ " dbo.CM_CO_Establecimiento ON dbo.AC_Sucursal.Sucursal = dbo.CM_CO_Establecimiento.Sucursal INNER JOIN "
							+ " dbo.SY_SeguridadAutorizaciones ON dbo.AC_Sucursal.Sucursal = dbo.SY_SeguridadAutorizaciones.Concepto "
							+ " where ltrim(SY_SeguridadAutorizaciones.Usuario) = '"
							+ objSySeguridadAutorizaciones.getString1() + "'" + " and CM_CO_Establecimiento.Compania ='"
							+ objSySeguridadAutorizaciones.getString2() + "'" + " and CM_CO_Establecimiento.Sucursal ='"
							+ objSySeguridadAutorizaciones.getString3() + "'");

			List<Object> result = query.list();
			Iterator itr = result.iterator();
			List<SySeguridadAutorizaciones> listaRetorno = new ArrayList<SySeguridadAutorizaciones>();

			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				SySeguridadAutorizaciones autorizaciones = new SySeguridadAutorizaciones();

				if (obj[0] != null) {
					autorizaciones.setString1(String.valueOf(obj[0]));
				}

				if (obj[1] != null) {
					autorizaciones.setString2(String.valueOf(obj[1]));
				}
				if (obj[2] != null) {
					autorizaciones.setString3(String.valueOf(obj[2]));
				}
				if (obj[3] != null) {
					autorizaciones.setInt_1(Integer.parseInt(String.valueOf(obj[3])));
				}
				if (obj[4] != null) {
					autorizaciones.setString4(String.valueOf(obj[4]));
				}
				if (obj[5] != null) {
					autorizaciones.setString5(String.valueOf(obj[5]));
				}
				if (obj[6] != null) {
					autorizaciones.setString6(String.valueOf(obj[6]));
				}
				if (obj[7] != null) {
					autorizaciones.setInt_2(Integer.parseInt(String.valueOf(obj[7])));
				}
				if (obj[8] != null) {
					autorizaciones.setString7(String.valueOf(obj[8]));
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
