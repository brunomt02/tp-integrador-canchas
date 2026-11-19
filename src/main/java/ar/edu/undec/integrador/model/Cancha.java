package ar.edu.undec.integrador.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "canchas")
public class Cancha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nombre;

    @NotBlank
    @Column(nullable = false, length = 60)
    private String deporte;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal precioHora;

    public Cancha() {
    }

    public Cancha(String nombre, String deporte, BigDecimal precioHora) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.precioHora = precioHora;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public BigDecimal getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(BigDecimal precioHora) {
        this.precioHora = precioHora;
    }
}