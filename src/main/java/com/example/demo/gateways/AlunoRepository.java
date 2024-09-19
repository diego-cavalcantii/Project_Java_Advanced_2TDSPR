package com.example.demo.gateways;

import com.example.demo.domains.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

    Optional<Aluno> findAlunoByApelido (String apelido);

    List<Aluno> findAlunosByMateriaPreferida(String materiaPreferida);

    List<Aluno> findAlunosByMateriaPreferidaAndApelido(String materia, String apelido);

    List<Aluno> findAlunosByDataDaMatricula(LocalDate dataDaMatricula);

}
