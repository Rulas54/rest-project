package edu.udelp.movil.restproject.model;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name="contacto")
@Data
public class Contacto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
	
	@NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")//No deja que esta columna reciba datos nulos
    @Column(length = 30)
    private String nombre;
	
	@NotNull(message = "Campo Obligatorio") //No deja que esta columna reciba datos nulos
	@Column(name = "fechaNacimiento")
	private LocalDate fechaNacimiento;
	
	@NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
	private String email;

	@NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
	@Column(length = 10)
	private String numeroTelefono;

	private String foto;  //Se pone String porque se va a poner la ruta de la foto
	
	private String direccion;
	
	

}
