package com.example.demo.domains.professor;

import com.example.demo.domains.alunos.Aluno;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Professor {

    @Id
    private ProfessorId professorId;

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String id;

//    private String materia;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    private Pessoa pessoa;

    @OneToMany(mappedBy = "professor")
    private List<Aluno> alunos;
}
