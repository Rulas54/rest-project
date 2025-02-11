package edu.udelp.movil.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.udelp.movil.restproject.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long>{

}
