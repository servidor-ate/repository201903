package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 08/05/2017.
 */
public class SgAgenteOpcionPK implements Serializable {
    private int idAgente;
    private int idOpcion;

    @Column(name = "IdAgente")
    @Id
    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    @Column(name = "IdOpcion")
    @Id
    public int getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(int idOpcion) {
        this.idOpcion = idOpcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgAgenteOpcionPK that = (SgAgenteOpcionPK) o;

        if (idAgente != that.idAgente) return false;
        if (idOpcion != that.idOpcion) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAgente;
        result = 31 * result + idOpcion;
        return result;
    }
}
