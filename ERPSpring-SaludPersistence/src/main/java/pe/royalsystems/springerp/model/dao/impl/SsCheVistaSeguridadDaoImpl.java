package pe.royalsystems.springerp.model.dao.impl;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.SsCheVistaSeguridadDao;
import pe.royalsystems.springerp.model.domain.SsCheVistaSeguridad;
import pe.royalsystems.springerp.model.util.Constant;

import java.util.List;

@Repository
public class SsCheVistaSeguridadDaoImpl extends AbstractDaoImpl<SsCheVistaSeguridad, String> implements SsCheVistaSeguridadDao {

    protected SsCheVistaSeguridadDaoImpl() {
        super(SsCheVistaSeguridad.class);
    }

    @Override
    public List<SsCheVistaSeguridad> listandoTreeMenuOpciones(SsCheVistaSeguridad objSsCheVistaSeguridad) {
		// TODO Auto-generated method stub
		try {

			String query1 = "";
			//query1 = "from SsCheVistaSeguridad d where d.tipoOpcion = 'V' and d.sistema = '"
			//		+ objSsCheVistaSeguridad.getSistema() + "'" ;
			query1 = "from SsCheVistaSeguridad d where d.tipoOpcion = 'V' ";

			
			if (objSsCheVistaSeguridad.getModulo()!=null) {
				query1 = query1 + " and d.modulo = '"+objSsCheVistaSeguridad.getModulo() + "'";
			}
					
			

			if (objSsCheVistaSeguridad.getCodigoAgente() != null) {
				query1 = query1 + "and d.codigoAgente = '" + objSsCheVistaSeguridad.getCodigoAgente() + "'";
			}
			if (objSsCheVistaSeguridad.getNivelOpcion() != null) {
				query1 = query1 + "and d.nivelOpcion = " + objSsCheVistaSeguridad.getNivelOpcion() + "";
			}
			if (objSsCheVistaSeguridad.getIdOpcionPadre() != null) {
				query1 = query1 + "and d.tipoOpcion = 'V' and d.idOpcionPadre = " + objSsCheVistaSeguridad.getIdOpcionPadre();
				//query1 = query1 + "and idopcion not in (3090,3130,3164,3206,3247,3288) ";
			}

			Query query = getCurrentSession().createQuery(query1);

			List<SsCheVistaSeguridad> listaRetorno = (List<SsCheVistaSeguridad>) query.list();

			for (SsCheVistaSeguridad puntero : listaRetorno) {
				

				if (puntero.getCodigoFormato() != null) {
					Query query3 = getCurrentSession().createSQLQuery("SELECT  top 1 dbo.SS_HC_Tabla.NombreTabla  as Nombre "
							+ "FROM dbo.SS_HC_TablaCampo INNER JOIN" + " dbo.SS_HC_Tabla INNER JOIN"
							+ " dbo.SS_HC_FormatoRecursoCampo "
							+ "ON dbo.SS_HC_Tabla.IdFavoritoTabla = dbo.SS_HC_FormatoRecursoCampo.IdFavoritoTabla INNER JOIN"
							+ " dbo.SS_HC_Formato INNER JOIN"
							+ " dbo.SS_HC_FormatoCampo ON dbo.SS_HC_Formato.IdFormato = dbo.SS_HC_FormatoCampo.IdFormato ON "
							+ "dbo.SS_HC_FormatoRecursoCampo.SecuenciaCampo = dbo.SS_HC_FormatoCampo.SecuenciaCampo ON "
							+ "dbo.SS_HC_TablaCampo.IdCampo = dbo.SS_HC_FormatoCampo.IdCampo "
							+ "where	SS_HC_Tabla.TipoTabla = 1 and CodigoFormato = '"
							+ puntero.getCodigoFormato().trim() + "'");

					List<String> result = query3.list();
					if (result != null && result.size() > 0) {
						
						puntero.setCodigoTabla(result.get(0));
					}

				}

			}

			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<SsCheVistaSeguridad> listandoTreeMenuOpcionesHistoriaClinica(
			SsCheVistaSeguridad objSsCheVistaSeguridad) {		
		
			//OBS**PFHCE						
			Criteria crit = getCurrentSession().createCriteria(SsCheVistaSeguridad.class);
					
			crit.add(Restrictions.eq("sistema", objSsCheVistaSeguridad.getSistema()));
			crit.add(Restrictions.eq("modulo", objSsCheVistaSeguridad.getModulo()));
			
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getTipoOpcion())) {
				crit.add(Restrictions.eq("tipoOpcion", objSsCheVistaSeguridad.getTipoOpcion()));
			}
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getIndicadorFormato())) {
				crit.add(Restrictions.eq("indicadorFormato", objSsCheVistaSeguridad.getIndicadorFormato()));
			}
			
			if (objSsCheVistaSeguridad.getIdOpcionPadre() != null) {
				crit.add(Restrictions.eq("idOpcionPadre", objSsCheVistaSeguridad.getIdOpcionPadre()));
			}
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getIdAgente())) {
				crit.add(Restrictions.eq("idAgente", objSsCheVistaSeguridad.getIdAgente()));
			}
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getCodigoAgente())) {
				crit.add(Restrictions.eq("codigoAgente", objSsCheVistaSeguridad.getCodigoAgente()));
			}
			if (objSsCheVistaSeguridad.getIdTipoAtencion() != null) {
				crit.add(Restrictions.eq("idTipoAtencion", objSsCheVistaSeguridad.getIdTipoAtencion()));
			}
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getTipoTrabajador())) {
				crit.add(Restrictions.eq("tipoTrabajador", objSsCheVistaSeguridad.getTipoTrabajador()));
			}
			if ( objSsCheVistaSeguridad.getNivelOpcion() != null) {
				crit.add(Restrictions.eq("nivelOpcion", objSsCheVistaSeguridad.getNivelOpcion()));
			}
			
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getCodigoOpcion())) {
				crit.add(Restrictions.eq("codigoOpcion", objSsCheVistaSeguridad.getCodigoOpcion()));
			}
			
			if (UtilesCommons.noEsVacio( objSsCheVistaSeguridad.getNombreOpcion())) {
				crit.add(Restrictions.like("nombreOpcion", objSsCheVistaSeguridad.getNombreOpcion(),MatchMode.ANYWHERE).ignoreCase());			
			}
			
			if("RESTRIC1".equals(objSsCheVistaSeguridad.getString1())){
				crit.setMaxResults(1);	
			}
			if("OPCION_VISIBLE".equals(objSsCheVistaSeguridad.getString2())){
				crit.add(Restrictions.ne("tipoOpcion", Constant.NO_db));
			}
						
			//List<SsCheVistaSeguridad> SsCheVistaSeguridadLista = crit.list();
			return crit.list();
		
	}

	@Override
	public List<SsCheVistaSeguridad> listandoNodosHijosHistoriaClinica(SsCheVistaSeguridad objSsCheVistaSeguridad) {
		// TODO Auto-generated method stub

		try {

			String query1 = "";

			query1 = "from SsCheVistaSeguridad d where d.sistema = '" + objSsCheVistaSeguridad.getSistema() + "'"
					+ "and d.modulo = '" + objSsCheVistaSeguridad.getModulo() + "'";

			if (objSsCheVistaSeguridad.getCodigoAgente() != null) {
				query1 = query1 + "and d.codigoAgente = '" + objSsCheVistaSeguridad.getCodigoAgente() + "'";
			}
			if (objSsCheVistaSeguridad.getNivelOpcion() != null) {
				query1 = query1 + "and d.nivelOpcion = " + objSsCheVistaSeguridad.getNivelOpcion() + "";
			}
			if (objSsCheVistaSeguridad.getIdOpcionPadre() != null) {
				query1 = query1 + "and d.idOpcionPadre = " + objSsCheVistaSeguridad.getIdOpcionPadre();
				query1 = query1 + "and idopcion not in (3090,3130,3168,3206,3247,3288) ";
			}

			Query query = getCurrentSession().createQuery(query1);

			List<SsCheVistaSeguridad> listaRetorno = (List<SsCheVistaSeguridad>) query.list();

			for (SsCheVistaSeguridad puntero : listaRetorno) {
				

				if (puntero.getCodigoFormato() != null) {
					Query query3 = getCurrentSession().createSQLQuery("SELECT  top 1 dbo.SS_HC_Tabla.NombreTabla  as Nombre "
							+ "FROM dbo.SS_HC_TablaCampo INNER JOIN" + " dbo.SS_HC_Tabla INNER JOIN"
							+ " dbo.SS_HC_FormatoRecursoCampo "
							+ "ON dbo.SS_HC_Tabla.IdFavoritoTabla = dbo.SS_HC_FormatoRecursoCampo.IdFavoritoTabla INNER JOIN"
							+ " dbo.SS_HC_Formato INNER JOIN"
							+ " dbo.SS_HC_FormatoCampo ON dbo.SS_HC_Formato.IdFormato = dbo.SS_HC_FormatoCampo.IdFormato ON "
							+ "dbo.SS_HC_FormatoRecursoCampo.SecuenciaCampo = dbo.SS_HC_FormatoCampo.SecuenciaCampo ON "
							+ "dbo.SS_HC_TablaCampo.IdCampo = dbo.SS_HC_FormatoCampo.IdCampo "
							+ "where	SS_HC_Tabla.TipoTabla = 1 and CodigoFormato = '"
							+ puntero.getCodigoFormato().trim() + "'");

					List<String> result = query3.list();
					if (result != null && result.size() > 0) {
						
						puntero.setCodigoTabla(result.get(0));
					}

				}

			}

			return listaRetorno;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

	}
}
