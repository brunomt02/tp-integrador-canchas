package ar.edu.undec.integrador.repository;

import ar.edu.undec.integrador.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository
        extends JpaRepository<Reserva, Long> {

}