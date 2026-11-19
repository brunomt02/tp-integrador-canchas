package ar.edu.undec.integrador.repository;

import ar.edu.undec.integrador.model.Cancha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CanchaRepository
        extends JpaRepository<Cancha, Long> {

}