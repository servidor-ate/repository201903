package pe.royalsystems.springerp.model.dao;

import org.hibernate.criterion.Criterion;
import pe.royalsystems.springerp.model.domain.Entidad;

import java.io.Serializable;
import java.util.List;


public interface AbstractDao<E extends Entidad, I extends Serializable> {

    public E findById(I id);
    public void saveOrUpdate(E e);
    public void save(E e);
    public void update(E e);
    public void delete(E e);
    public List<E> findByCriteria(Criterion criterion);
    public void flush(E e);
    public void merge(E e);
    public int obtenerMaximoEnteroColumna(String columnName);

    public List<E> listarEntidades(E e);
    public List<E> listarEntidadesPaginado(E e);
    public int contarEntidadesPaginado(E e);

    public <VW extends Entidad> List<VW> listarGenerico(VW vw);
    public <VW extends Entidad> List<VW> listarPaginadoGenerico(VW vw);
    public <VW extends Entidad> int contarPaginadoGenerico(VW vw);

// pruegbas
}
