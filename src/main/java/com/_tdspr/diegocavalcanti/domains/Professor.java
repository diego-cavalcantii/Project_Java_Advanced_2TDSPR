package com._tdspr.diegocavalcanti.domains;

import lombok.Data;

@Data
public class Professor extends Pessoa{
    private String disciplina;

    public Professor() {
    }

    public Professor(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(String primeiroNome, String sobrenome, String documento, String disciplina) {
        super(primeiroNome, sobrenome, documento);
        this.disciplina = disciplina;
    }


}
