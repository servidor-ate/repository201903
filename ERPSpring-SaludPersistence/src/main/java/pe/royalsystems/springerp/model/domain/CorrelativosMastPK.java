package pe.royalsystems.springerp.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by mamania on 06/12/2016.
 */
@Embeddable
public class CorrelativosMastPK implements Serializable {
    private String companiaCodigo;
    private String tipoComprobante;
    private String serie;
    private String unidadReplicacion;
    
    @Transient
    private String idCompuesto;

    @Column(name = "CompaniaCodigo")
    @Id
    public String getCompaniaCodigo() {
        return companiaCodigo;
    }

    public void setCompaniaCodigo(String companiaCodigo) {
        this.companiaCodigo = companiaCodigo;
    }

    @Column(name = "TipoComprobante")
    @Id
    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    
    
    
    @Column(name = "Serie")
    @Id
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
    @Column(name = "UnidadReplicacion")
    @Id    
    public String getUnidadReplicacion() {
		return unidadReplicacion;
	}

	public void setUnidadReplicacion(String unidadReplicacion) {
		this.unidadReplicacion = unidadReplicacion;
	}

	@Transient
    public String getIdCompuesto() {
    	idCompuesto = companiaCodigo+"_"+tipoComprobante+"_"+serie+"_"+unidadReplicacion;
		return idCompuesto;
	}

  
}
