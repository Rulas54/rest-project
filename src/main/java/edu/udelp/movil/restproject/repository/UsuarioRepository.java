package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	boolean existsByEmailAndPassword(String email, String password);
	Optional<Usuario> findByEmail(String email);

	//Correo unico
	boolean existsByEmail(String email);


}
