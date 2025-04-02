package edu.udelp.movil.restproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data

public class Usuario {
	@Id
	private Long id;
	private String nombre;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String email;
	private String password;
	
}
