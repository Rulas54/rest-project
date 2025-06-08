package edu.udelp.movil.restproject.repository;

import edu.udelp.movil.restproject.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// The @Repository annotation is typically not strictly necessary for interfaces
// extending JpaRepository, as Spring will auto-detect them.
// However, it adds clarity and can be useful for component scanning in complex setups.
@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

}