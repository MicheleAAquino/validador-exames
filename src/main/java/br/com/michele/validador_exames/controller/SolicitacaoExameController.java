package br.com.michele.validador_exames.controller;

import br.com.michele.validador_exames.model.SolicitacaoExame;
import br.com.michele.validador_exames.service.SolicitacaoExameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RestController
public class SolicitacaoExameController {
    private final SolicitacaoExameService solicitacaoExameService;

    public SolicitacaoExameController(SolicitacaoExameService solicitacaoExameService) {
        this.solicitacaoExameService = solicitacaoExameService;
    }
    @PostMapping("/exames")
    public SolicitacaoExame cadastrar(@RequestBody SolicitacaoExame solicitacaoExame) {
        return solicitacaoExameService.salvar(solicitacaoExame);
    }

}
