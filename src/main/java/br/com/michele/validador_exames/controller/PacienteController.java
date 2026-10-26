package br.com.michele.validador_exames.controller;

import br.com.michele.validador_exames.model.Paciente;
import br.com.michele.validador_exames.repository.PacienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {

    private final PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @PostMapping("/pacientes")
    public Paciente cadastrar(@RequestBody Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
