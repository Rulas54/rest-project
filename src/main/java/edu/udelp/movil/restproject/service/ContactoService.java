package edu.udelp.movil.restproject.service;
import java.util.List;

import edu.udelp.movil.restproject.model.Contacto;

public interface ContactoService {
	Contacto save(Contacto contacto); //add
	List<Contacto> findAll();
	Contacto findById(Long id);
	void remove(Long id);
	
}
