package br.com.michele.validador_exames.repository;

import br.com.michele.validador_exames.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
