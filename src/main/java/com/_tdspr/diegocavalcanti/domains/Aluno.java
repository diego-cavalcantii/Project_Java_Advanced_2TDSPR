package com._tdspr.diegocavalcanti.domains;

import lombok.Data;

@Data
public class Aluno extends Pessoa{
    private String registro;

    public Aluno() {
    }

    public Aluno(String registro) {
        this.registro = registro;
    }

    public Aluno(String primeiroNome, String sobrenome, String documento, String registro) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }

}
