package ar.edu.undec.integrador.controller;

import ar.edu.undec.integrador.model.Cancha;
import ar.edu.undec.integrador.service.CanchaService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/canchas")
public class CanchaController {

    private final CanchaService canchaService;

    public CanchaController(CanchaService canchaService) {
        this.canchaService = canchaService;
    }

    @GetMapping
    public List<Cancha> listar() {
        return canchaService.listar();
    }

    @GetMapping("/{id}")
    public Cancha buscar(@PathVariable Long id) {
        return canchaService.buscarPorId(id);
    }

    @PostMapping
    public Cancha crear(@Valid @RequestBody Cancha cancha){
        return canchaService.crear(cancha);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        canchaService.eliminar(id);
    }
}