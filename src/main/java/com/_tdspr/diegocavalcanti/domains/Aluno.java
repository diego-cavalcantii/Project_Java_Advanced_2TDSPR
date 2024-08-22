package com._tdspr.diegocavalcanti.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno extends Pessoa{

    @Id
    @GeneratedValue
    private String registro;
//    @JsonIgnore // ignore this field in the response
    private String id;


    public Aluno(String primeiroNome, String sobrenome, String documento, String registro) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }

}
