package edu.udelp.movil.restproject.service;
import java.util.List;

import edu.udelp.movil.restproject.model.Usuario;

public interface UsuarioService {
	
	Usuario save(Usuario usuario);
	
	 List<Usuario> findAll();
	 
	 Usuario findById(long id);
	 
	 void remove (Long id);
	 
	 boolean existByEmailAndPassword (String email, String password);

	 Usuario findByEmail(String email);

	 Usuario recuperarPassword(Usuario usuario);

}
