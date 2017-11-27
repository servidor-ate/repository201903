package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.CmCoTablaMaestro;

import java.util.List;

public interface CmCoTablaMaestroDao extends AbstractDao<CmCoTablaMaestro, String> {
    int GuardarCmCoTablaMaestro(CmCoTablaMaestro cmCoTablaMaestro);
    CmCoTablaMaestro BuscarCmCoTablaMaestro(CmCoTablaMaestro cmCoTablaMaestro);
    List<CmCoTablaMaestro> ListarCmCoTablaMaestro(CmCoTablaMaestro cmCoTablaMaestro);
}
