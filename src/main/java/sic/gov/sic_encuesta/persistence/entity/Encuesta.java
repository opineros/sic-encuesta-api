package sic.gov.sic_encuesta.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "encuesta")
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('encuesta_id_encuesta_seq')")
    @Column(name = "id_encuesta", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 160)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 160)
    private String apellido;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_marca_pc", nullable = false)
    private sic.gov.sic_encuesta.persistence.entity.MarcaPc idMarcaPc;

    @Column(name = "fecha_registro", nullable = false)
    private Instant fechaRegistro;

    @Column(name = "correo_electronico", nullable = false, length = 160)
    private String correoElectronico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public sic.gov.sic_encuesta.persistence.entity.MarcaPc getIdMarcaPc() {
        return idMarcaPc;
    }

    public void setIdMarcaPc(sic.gov.sic_encuesta.persistence.entity.MarcaPc idMarcaPc) {
        this.idMarcaPc = idMarcaPc;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}