package br.com.michele.validador_exames.model;

import jakarta.persistence.*;

@Entity
public class SolicitacaoExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nomeExame;

    @ManyToOne
    private Paciente paciente;

    public SolicitacaoExame() {

    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }
}
