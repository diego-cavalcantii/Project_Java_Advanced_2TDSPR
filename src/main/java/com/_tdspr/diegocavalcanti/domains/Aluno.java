package com._tdspr.diegocavalcanti.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno extends Pessoa{
    private String registro;
//    @JsonIgnore // ignore this field in the response
    private String id;


    public Aluno(String primeiroNome, String sobrenome, String documento, String registro) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }

}
