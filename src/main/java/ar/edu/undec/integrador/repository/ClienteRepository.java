package ar.edu.undec.integrador.repository;

import ar.edu.undec.integrador.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository
        extends JpaRepository<Cliente, Long> {

}