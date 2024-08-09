package com._tdspr.diegocavalcanti.domains;

import lombok.Data;

@Data
public class Pessoa {
    private String primeiroNome;
    private String sobrenome;
    private String documento;

    public Pessoa() {
    }

    public Pessoa(String primeiroNome, String sobrenome, String documento) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.documento = documento;
    }

}
