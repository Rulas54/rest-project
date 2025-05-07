package edu.udelp.movil.restproject.model;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
    private String nombre; //Aqui esta el cambio que hice

	@NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|outlook\\.com)$",
		    message = "El correo debe ser @gmail.com o @outlook.com") //Acepta letra y simbolos que deja el correo y tiene que terminar en @gmail.com
	@Column(length = 100)
	private String email;

	@NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
	@Pattern(
			regexp = "^([0-9]{10})$", // Permite de 1 a 20 números de teléfono de 10 dígitos separados por comas
			message = "El número de teléfono debe tener exactamente 10 dígitos y pueden ser hasta 20, separados por comas"
	)
	@Column(length = 300) // Ajusta el tamaño del campo si es necesario

	private String numeroTelefono;

	@ElementCollection
	private List<String> numeroAdicional;

	@ElementCollection
	private List<String> correoAdicional;
	
	private String direccion;
	

}
