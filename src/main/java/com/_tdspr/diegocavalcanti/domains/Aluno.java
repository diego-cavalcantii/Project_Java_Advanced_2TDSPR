package com._tdspr.diegocavalcanti.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "aluno_graduacao")
public class Aluno extends Pessoa{

    @Id
    @GeneratedValue
    private Integer registro;
    @Column(name = "nickname")
    private String apelido;
//    @JsonIgnore // ignore this field in the response
    private String id;



    public Aluno(String primeiroNome, String sobrenome, String documento, Integer registro) {
        super(primeiroNome, sobrenome, documento);
        this.registro = registro;
    }

}
