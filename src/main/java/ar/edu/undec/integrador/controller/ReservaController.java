package ar.edu.undec.integrador.controller;

import ar.edu.undec.integrador.model.Reserva;
import ar.edu.undec.integrador.service.ReservaService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public List<Reserva> listar() {
        return reservaService.listar();
    }

    @GetMapping("/{id}")
    public Reserva buscar(@PathVariable Long id) {
        return reservaService.buscarPorId(id);
    }

    @PostMapping
    public Reserva crear(@Valid @RequestBody Reserva reserva) {
        return reservaService.crear(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        reservaService.eliminar(id);
    }
}