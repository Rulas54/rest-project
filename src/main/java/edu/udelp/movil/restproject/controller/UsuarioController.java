package edu.udelp.movil.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.udelp.movil.restproject.model.Usuario;
import edu.udelp.movil.restproject.service.UsuarioService;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("/")
	public List<Usuario> getAll(){
		return usuarioService.findAll();
	}
	
	
	
	@PostMapping("/add")
	public Usuario add(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PostMapping("/recuperar-password/{id}")
	public Usuario recuperarPassword(@RequestBody Usuario usuario,
									 @PathVariable Long id) {
		usuario.setId(id);
		return usuarioService.save(usuario);
	}
	
	@PostMapping("/get/{id}")
	public Usuario get(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
}
