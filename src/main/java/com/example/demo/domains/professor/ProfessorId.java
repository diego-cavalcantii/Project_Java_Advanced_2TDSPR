package com.example.demo.domains.professor;

import com.example.demo.domains.Pessoa;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Embeddable
public class ProfessorId {

    private String materia;
    private String id;

    @OneToOne
    private Pessoa pessoa;
}
