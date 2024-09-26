package com.example.demo.domains.alunos;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AlunoId {

    private String registro;
    private int idade;
}
