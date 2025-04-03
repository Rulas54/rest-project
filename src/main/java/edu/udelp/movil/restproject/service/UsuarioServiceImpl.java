package edu.udelp.movil.restproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.udelp.movil.restproject.model.Usuario;
import edu.udelp.movil.restproject.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario save(Usuario usuario) {
		Usuario usuarioTemp = usuarioRepository.findByEmail(usuario.getEmail())
												.orElse(null);

		if (null != usuarioTemp && null != usuario.getId()
				&& !usuarioTemp.getId().equals(usuario.getId())) {
			usuario.setCode("500");
			usuario.setMensaje("El usuario ya existe");
		} if(usuarioTemp != null && null == usuario.getId()){
			usuario.setCode("500");
			usuario.setMensaje("El usuario ya existe");
		} else {
			usuario = usuarioRepository.save(usuario);
			usuario.setCode("200");
			usuario.setMensaje("OK");
		}

		return usuario;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).get();
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public boolean existByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return usuarioRepository.existsByEmailAndPassword(email, password);
	}

	@Override
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmail(email).orElse(new Usuario());
	}

}
