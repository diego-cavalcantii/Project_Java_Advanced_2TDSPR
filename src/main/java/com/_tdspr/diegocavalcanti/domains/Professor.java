package com._tdspr.diegocavalcanti.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String disciplina;
    private String materia;

    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;

    @OneToMany
    private List<Aluno> aluno;


}
