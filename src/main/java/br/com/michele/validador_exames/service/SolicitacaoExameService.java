package br.com.michele.validador_exames.service;


import br.com.michele.validador_exames.model.Paciente;
import br.com.michele.validador_exames.model.SolicitacaoExame;
import br.com.michele.validador_exames.repository.SolicitacaoExameRepository;
import org.springframework.stereotype.Service;
import br.com.michele.validador_exames.repository.PacienteRepository;


@Service
public class SolicitacaoExameService {
    private final SolicitacaoExameRepository solicitacaoExameRepository;
    private final PacienteRepository pacienteRepository;

    public SolicitacaoExameService(
            SolicitacaoExameRepository solicitacaoExameRepository, PacienteRepository pacienteRepository) {
        this.solicitacaoExameRepository = solicitacaoExameRepository;
        this.pacienteRepository = pacienteRepository;
    }
    public SolicitacaoExame salvar(SolicitacaoExame solicitacaoExame) {
        Paciente paciente = pacienteRepository.findById(solicitacaoExame.getPaciente().getId()).orElseThrow();

        if (solicitacaoExame.getNomeExame().equalsIgnoreCase("PSA")
                && paciente.getSexo().equalsIgnoreCase("Feminino")){
            throw new IllegalArgumentException("Exame PSA não permitido para pacientes do sexo feminino");
        }
        solicitacaoExame.setPaciente(paciente);
        return solicitacaoExameRepository.save(solicitacaoExame);

    }

    }

