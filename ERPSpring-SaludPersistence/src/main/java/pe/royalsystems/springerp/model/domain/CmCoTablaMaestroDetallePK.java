package pe.royalsystems.springerp.model.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by mamania on 04/09/2015.
 */
public class CmCoTablaMaestroDetallePK implements Serializable {
    private int idTablaMaestro;
    private int idCodigo;

    @Column(name = "IdTablaMaestro")
    @Id
    public int getIdTablaMaestro() {
        return idTablaMaestro;
    }

    public void setIdTablaMaestro(int idTablaMaestro) {
        this.idTablaMaestro = idTablaMaestro;
    }

    @Column(name = "IdCodigo")
    @Id
    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmCoTablaMaestroDetallePK that = (CmCoTablaMaestroDetallePK) o;

        if (idTablaMaestro != that.idTablaMaestro) return false;
        if (idCodigo != that.idCodigo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTablaMaestro;
        result = 31 * result + idCodigo;
        return result;
    }
}
