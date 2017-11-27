package pe.royalsystems.springerp.model.domain;

import javax.persistence.*;

/**
 * Created by mamania on 24/05/2017.
 */
@Entity
@Table(name = "SS_HC_Anamnesis_AFAM_Enfermedad" )
@IdClass(SsHcAnamnesisAfamEnfermedadPK.class)
public class SsHcAnamnesisAfamEnfermedad extends Entidad implements java.io.Serializable {
    private String unidadReplicacion;
    private Long idEpisodioAtencion;
    private Integer idPaciente;
    private Integer episodioClinico;
    private Integer secuenciaFamilia;
    private Integer secuencia;
    //private Integer idDiagnostico;
    private SsGeDiagnostico diagnostico = new SsGeDiagnostico();
    private String observaciones;
    private String accion;
    private String version;
  //  private SsHcAnamnesisAfam afam;
    private SsHcAnamnesisAfam ssHcAnamnesisAfam;


    @Id
    @Column(name = "UnidadReplicacion")
    public String getUnidadReplicacion() {
        return unidadReplicacion;
    }

    public void setUnidadReplicacion(String unidadReplicacion) {
        this.unidadReplicacion = unidadReplicacion;
    }

    @Id
    @Column(name = "IdEpisodioAtencion")
    public Long getIdEpisodioAtencion() {
        return idEpisodioAtencion;
    }

    public void setIdEpisodioAtencion(Long idEpisodioAtencion) {
        this.idEpisodioAtencion = idEpisodioAtencion;
    }

    @Id
    @Column(name = "IdPaciente")
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Id
    @Column(name = "EpisodioClinico")
    public Integer getEpisodioClinico() {
        return episodioClinico;
    }

    public void setEpisodioClinico(Integer episodioClinico) {
        this.episodioClinico = episodioClinico;
    }

    @Id
    @Column(name = "SecuenciaFamilia")
    public Integer getSecuenciaFamilia() {
        return secuenciaFamilia;
    }

    public void setSecuenciaFamilia(Integer secuenciaFamilia) {
        this.secuenciaFamilia = secuenciaFamilia;
    }

    @Id    
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Secuencia")    
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    /*
    @Basic
    @Column(name = "IdDiagnostico")
    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }*/
    
    
    @ManyToOne
    @JoinColumn(name="IdDiagnostico")
    public SsGeDiagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(SsGeDiagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
	

    @Basic
    @Column(name = "Observaciones")
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }



    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "UnidadReplicacion", referencedColumnName = "UnidadReplicacion", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "IdEpisodioAtencion", referencedColumnName = "IdEpisodioAtencion", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "IdPaciente", referencedColumnName = "IdPaciente", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "EpisodioClinico", referencedColumnName = "EpisodioClinico", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "SecuenciaFamilia", referencedColumnName = "SecuenciaFamilia", nullable = false, insertable = false, updatable = false)})

    public SsHcAnamnesisAfam getSsHcAnamnesisAfam() {
        return ssHcAnamnesisAfam;
    }

    public void setSsHcAnamnesisAfam(SsHcAnamnesisAfam ssHcAnamnesisAfam) {
        this.ssHcAnamnesisAfam = ssHcAnamnesisAfam;
    }
    /*
    public SsHcAnamnesisAfam getAfam() {
        return afam;
    }

    public void setAfam(SsHcAnamnesisAfam afam) {
        this.afam = afam;
    }*/
}
