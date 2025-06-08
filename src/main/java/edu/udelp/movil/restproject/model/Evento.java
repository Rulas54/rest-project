package edu.udelp.movil.restproject.model;

import com.fasterxml.jackson.annotation.JsonFormat; // ¡Importa esta anotación!
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "evento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El título del evento es obligatorio")
    @NotEmpty(message = "El título del evento no puede estar vacío")
    @Size(max = 100, message = "El título no puede exceder los 100 caracteres")
    @Column(length = 100, nullable = false)
    private String titulo;

    @Size(max = 500, message = "La descripción no puede exceder los 500 caracteres")
    @Column(length = 500)
    private String descripcion;

    @NotNull(message = "La fecha de inicio es obligatoria")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inicio", nullable = false)
    // <--- CAMBIO AQUÍ EN EL PATRÓN PARA EL AÑO ---
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "America/Mexico_City")
    private Date fechaInicio;

    @NotNull(message = "La fecha de fin es obligatoria")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_fin", nullable = false)
    // <--- CAMBIO AQUÍ EN EL PATRÓN PARA EL AÑO ---
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "America/Mexico_City")
    private Date fechaFin;

    @Size(max = 255, message = "La ubicación no puede exceder los 255 caracteres")
    @Column(length = 255)
    private String ubicacion;

    @ManyToMany
    @JoinTable(
            name = "evento_participante",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "contacto_id")
    )
    private List<Contacto> participantes = new ArrayList<>();
}