package edu.udelp.movil.restproject.service; // Common practice to put implementations in an 'impl' subpackage

import edu.udelp.movil.restproject.model.Evento;
import edu.udelp.movil.restproject.repository.EventoRepository;
import edu.udelp.movil.restproject.service.EventoService; // Import the interface
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Import for transactional control

import java.util.List;
import java.util.Optional;

@Service
public class EventoServiceImpl implements EventoService { // Implements the EventoService interface
    @Autowired
    private EventoRepository repository; // Using 'repository' name as per your TareaServiceImpl

    @Override
    public Evento save(Evento evento) {
        return repository.save(evento);
    }

    @Override
    public List<Evento> findAll() {
        return repository.findAll();
    }

    @Override
    public Evento findById(Long id) {
        return repository.findById(id).orElse(new Evento());
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
