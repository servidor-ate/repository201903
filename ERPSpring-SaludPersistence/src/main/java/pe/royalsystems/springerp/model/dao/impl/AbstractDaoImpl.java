package pe.royalsystems.springerp.model.dao.impl;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import pe.royalsystems.springerp.commons.UtilesCommons;
import pe.royalsystems.springerp.model.dao.AbstractDao;
import pe.royalsystems.springerp.model.domain.Entidad;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


public abstract class AbstractDaoImpl<E extends Entidad, I extends Serializable> implements AbstractDao<E,I> {

    private Class<E> entityClass;

    public static final String ORDER_ASC  = "ASC";
    public static final String ORDER_DESC = "DESC";

    protected AbstractDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    public E findById(I id) {
        return (E) getCurrentSession().get(entityClass, id);
    }

    @Override
    public void saveOrUpdate(E e) {
        getCurrentSession().saveOrUpdate(e);
        //iniciarAuditoriaTrace(e,"SoU","");
    }

    @Override
    public void update(E e) {
        getCurrentSession().update(e);
        //iniciarAuditoriaTrace(e,"U","");
    }

    @Override
    public void save(E e) {
        getCurrentSession().save(e);
        //iniciarAuditoriaTrace(e,"S","");
    }

    @Override
    public void delete(E e) {
        getCurrentSession().delete(e);
        //iniciarAuditoriaTrace(e,"D","");
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> findByCriteria(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();
    }

    @Override
    public void flush(E e){
        getCurrentSession().flush();
        getCurrentSession().clear();
    }
    @Override
    public void merge(E e) {
        getCurrentSession().merge(e);

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> listarEntidades(E e){
        Criteria criteria = createCriteria(e.getClass());
        criteria = filtrarListadoEntidad(criteria, e);
        return (List<E>) criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> listarEntidadesPaginado(E e) {
        Criteria criteria = createCriteria(e.getClass());
        criteria = filtrarPaginado(criteria, e);
        setPaginable(e, criteria);
        return (List<E>) criteria.list();
    }

    @Override
    public int contarEntidadesPaginado(E e) {
        Criteria criteria = createCriteria(e.getClass());
        criteria = filtrarPaginado(criteria, e);
        criteria.setProjection(Projections.rowCount());
        Object result = criteria.uniqueResult();
        if(result == null){
            return 0;
        }else{
            return Integer.parseInt(result.toString());
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <VW extends Entidad> List<VW> listarGenerico(VW vw) {
        Criteria criteria = createCriteria(vw.getClass());
        criteria = filtrarListadoEntidad(criteria, vw);
        criteria = ordenarListadoEntidad(criteria, vw);
        return (List<VW>) criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <VW extends Entidad> List<VW> listarPaginadoGenerico(VW vw) {
        Criteria criteria = createCriteria(vw.getClass());
        criteria = filtrarListadoEntidad(criteria, vw);
        setPaginable(vw, criteria);
        criteria = ordenarListadoEntidad(criteria, vw);
        return (List<VW>) criteria.list();
    }

    @Override
    public <VW extends Entidad> int contarPaginadoGenerico(VW vw) {
        Criteria criteria = createCriteria(vw.getClass());
        criteria = filtrarListadoEntidad(criteria, vw);
        criteria.setProjection(Projections.rowCount());
        Object result = criteria.uniqueResult();
        if(result == null){
            return 0;
        }else{
            return Integer.parseInt(result.toString());
        }
    }

    public Criteria filtrarPaginado(Criteria cq, E entidad){
        return cq;
    }

    private <V extends Entidad> Criteria filtrarListadoEntidad(Criteria cq, V entidad){
        if(UtilesCommons.esNulo(entidad) || UtilesCommons.esVacio(entidad.getNombreConsulta())){
            return cq;
        }else{
            filtrarEntidad(cq, entidad);
            return cq;
        }
    }

    private <V extends Entidad> Criteria ordenarListadoEntidad(Criteria cq, V entidad){
        if(UtilesCommons.esNulo(entidad) || UtilesCommons.esVacio(entidad.getNombreConsulta())){
            return cq;
        }else{
            ordenarEntidad(cq, entidad);
            return cq;
        }
    }

    public <V extends Entidad> void filtrarEntidad(Criteria cq, V entidad){

    }

    public <V extends Entidad> void ordenarEntidad(Criteria cq, V entidad){

    }

    public Criteria createCriteria(Class<?> entityClazz){
        if(entityClazz == null){
            return getCurrentSession().createCriteria(entityClass);
        }else{
            return getCurrentSession().createCriteria(entityClazz);
        }
    }

    public Criteria createAliasCriteria(Class<?> entityClazz, String alias){
        if(entityClazz == null){
            return getCurrentSession().createCriteria(entityClass, alias);
        }else{
            return getCurrentSession().createCriteria(entityClazz, alias);
        }
    }

    public Criteria createCriteria(){
        return createCriteria(null);
    }

    public Criteria createAliasCriteria(String alias){
        return createAliasCriteria(null, alias);
    }


    public void setPaginable(Entidad entidad, Criteria criteria){
        if(entidad.isPaginable()){
            criteria.setFirstResult(entidad.getInicio());
            criteria.setMaxResults(entidad.getNumeroFilas());
            criteria.setFetchSize(entidad.getNumeroFilas());
        }
    }

    public void setOrdenableAsc(Entidad entidad, Criteria criteria){
        if(entidad.isOrdernable()){
            criteria.addOrder(Order.asc(entidad.getAtributoOrdenacion()));
        }
    }

    public void setOrdenableDesc(Entidad entidad, Criteria criteria){
        if(entidad.isOrdernable()){
            criteria.addOrder(Order.desc(entidad.getAtributoOrdenacion()));
        }
    }

    public void setOrdenable(Criteria criteria, String order, String ... columns){
        if(columns != null && columns.length > 0){
            List<String> list = Arrays.asList(columns);
            for(String column : list){
                if(order.equalsIgnoreCase(ORDER_ASC)){
                    criteria.addOrder(Order.asc(column));
                }else{
                    criteria.addOrder(Order.desc(column));
                }
            }
        }
    }

    public void setOrdenable(Criteria criteria, String order, List<String> list){
        if(UtilesCommons.noEsVacio(list)){
            for(String column : list){
                if(order.equalsIgnoreCase(ORDER_ASC)){
                    criteria.addOrder(Order.asc(column));
                }else{
                    criteria.addOrder(Order.desc(column));
                }
            }
        }
    }

    public int obtenerMaximoEnteroColumna(String columnName){
        Criteria criteria = createCriteria();
        criteria.setProjection(Projections.max(columnName));
        Object result = criteria.uniqueResult();
        if(result == null){
            return 0;
        }else{
            return Integer.parseInt(result.toString());
        }
    }


    /*********TRATAMIENTO AUDITOR*****/
    /**Construye dinamicamente un nuevo objetode Una clase determinada a partir del objeto Original*/
    public static Object getNuevoObjetoGenerico(Object objetoOrigen, Class<?> claseNuevoObjeto){
        try{
            Object objNuevo=null;
            if(objetoOrigen!=null && claseNuevoObjeto!=null){
                String type = claseNuevoObjeto.getName();
                objNuevo =  Class.forName(type).newInstance();
                ////obtener los valores del objetoOrigen y set a objNuevo
                Field[] fields = objetoOrigen.getClass().getDeclaredFields();
                for(Field field : fields) {
                    try {
                        if((field.getModifiers() & java.lang.reflect.Modifier.FINAL) == java.lang.reflect.Modifier.FINAL){
                            //ES FINAL
                        }else{
                            String fieldName = field.getName();
                            field.setAccessible(true);
                            Object fieldValue = field.get(objetoOrigen);
                            //Object fieldValue = field.get(objAntiguo);
                            Field fieldNuevo = claseNuevoObjeto.getDeclaredField(fieldName);
                            if(fieldNuevo!=null){
                                fieldNuevo.setAccessible(true);
                                fieldNuevo.set(objNuevo,fieldValue);
                            }
                        }
                    } catch (IllegalArgumentException  e) {
                        e.printStackTrace();
                    }
                }
            }
            return objNuevo;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public void  iniciarAuditoriaTrace(Object objTrace, String typeTrace,String primKeyData){
        try{
            if(objTrace!=null){
                //POR IMPLEMENTAR
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
