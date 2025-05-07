package edu.udelp.movil.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.udelp.movil.restproject.model.Contacto;
import edu.udelp.movil.restproject.model.Tarea;
import edu.udelp.movil.restproject.service.ContactoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
	@Autowired
	ContactoService	service;
	
	@PostMapping("/")
	public List<Contacto> getAll(){
		return service.findAll();
		}
	
	@PostMapping("/add")
	public Contacto add(@Valid @RequestBody Contacto contacto) {
		return service.save(contacto);
	}

    @PostMapping("/edit/{id}")
    public Contacto edit(@Valid @RequestBody Contacto contacto, @PathVariable Long id){
        Contacto existente = service.findById(id);
        if (existente != null) {
            contacto.setId(id); // asegurarse que el ID es correcto
            return service.save(contacto); // actualiza
        } else {
            throw new RuntimeException("Contacto con ID " + id + " no encontrado");
        }
    }


    @PostMapping("/get/{id}")
    public Contacto get(@PathVariable Long id){
        return service.findById(id);
    }
    

    @PostMapping("/remove/{id}")
    public void remove(@PathVariable Long id){
        service.remove(id);
    }
}
