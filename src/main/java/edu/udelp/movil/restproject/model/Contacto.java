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
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|outlook\\.com)$",
		    message = "El correo debe ser @gmail.com o @outlook.com") //Acepta letra y simbolos que deja el correo y tiene que terminar en @gmail.com
	@Column(length = 100)
	private String email;

	@NotNull(message = "Campo Obligatorio")
    @NotEmpty(message = "Campo Obligatorio")
	@Column(length = 10)
	@Pattern(
	        regexp = "^[0-9]{10}$", //Unicamente numeros y {10} que nomás puede tener 10 digitos no mas
	        message = "El número de teléfono debe tener exactamente 10 dígitos"
	    )
	private String numeroTelefono;

	private String foto;  //Se pone String porque se va a poner la ruta de la foto
	
	private String direccion;
	
	

}
