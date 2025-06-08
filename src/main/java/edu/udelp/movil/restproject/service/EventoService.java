package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoService {
    Evento save(Evento evento);

    List<Evento> findAll();

    Evento findById(Long id); // Note: Return type is Evento, not Optional<Evento>

    void remove(Long id);
}