package edu.udelp.movil.restproject.controller;

import edu.udelp.movil.restproject.model.Evento;
import edu.udelp.movil.restproject.service.EventoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    EventoService service;

    @GetMapping("/")
    public List<Evento> getAll() {
        return service.findAll();
    }

    @PostMapping("/add")
    public Evento add(@Valid @RequestBody Evento evento) {
        return service.save(evento);
    }

    @PostMapping("/edit/{id}")
    public Evento edit(@Valid @RequestBody Evento evento, @PathVariable Long id) {
        Evento existente = service.findById(id);

        if (existente != null && existente.getId() != null && existente.getId().equals(id)) {
            evento.setId(id);
            return service.save(evento);
        } else {
            throw new RuntimeException("Evento con ID " + id + " no encontrado");
        }
    }

    @PostMapping("/get/{id}")
    public Evento get(@PathVariable Long id) {
        Evento evento = service.findById(id);
        if (evento.getId() == null || evento.getId() == 0) {
            throw new RuntimeException("Evento con ID " + id + " no encontrado");
        }
        return evento;
    }

    @PostMapping("/remove/{id}")
    public void remove(@PathVariable Long id) {
        service.remove(id);
    }
}