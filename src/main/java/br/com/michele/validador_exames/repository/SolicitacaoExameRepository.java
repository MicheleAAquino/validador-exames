package br.com.michele.validador_exames.repository;

import br.com.michele.validador_exames.model.SolicitacaoExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoExameRepository extends JpaRepository<SolicitacaoExame, Long>{
}
