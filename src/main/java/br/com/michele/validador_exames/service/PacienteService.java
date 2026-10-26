package br.com.michele.validador_exames.service;

import br.com.michele.validador_exames.model.Paciente;
import br.com.michele.validador_exames.repository.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente salvar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
