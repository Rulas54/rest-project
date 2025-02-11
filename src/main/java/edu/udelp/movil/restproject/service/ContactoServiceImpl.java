package edu.udelp.movil.restproject.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.udelp.movil.restproject.model.Contacto;
import edu.udelp.movil.restproject.repository.ContactoRepository;


@Service

public class ContactoServiceImpl implements ContactoService {
	
	@Autowired
    private ContactoRepository repository;
	
	
	@Override
	public Contacto save(Contacto contacto) {		// TODO Auto-generated method stub
		return repository.save(contacto);
	}

	@Override
	public List<Contacto> findAll() {
		return repository.findAll();
	}

	@Override
	public Contacto findById(Long id) {
		return repository.findById(id).orElse(new Contacto());
	}

	@Override
	public void remove(Long id) {
		repository.deleteById(id);
		
	}
	
	
	
	
}
