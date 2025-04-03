package edu.udelp.movil.restproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String email;
	private String password;

	@Transient
	private String code;

	@Transient
	private String mensaje;

}
