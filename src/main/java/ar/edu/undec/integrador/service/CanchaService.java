package ar.edu.undec.integrador.service;

import ar.edu.undec.integrador.model.Cancha;
import ar.edu.undec.integrador.repository.CanchaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanchaService {

    private final CanchaRepository canchaRepository;

    public CanchaService(CanchaRepository canchaRepository) {
        this.canchaRepository = canchaRepository;
    }

    public List<Cancha> listar() {
        return canchaRepository.findAll();
    }

    public Cancha buscarPorId(Long id) {
        return canchaRepository.findById(id).orElse(null);
    }

    public Cancha crear(Cancha cancha) {
        return canchaRepository.save(cancha);
    }

    public void eliminar(Long id) {
        canchaRepository.deleteById(id);
    }
}