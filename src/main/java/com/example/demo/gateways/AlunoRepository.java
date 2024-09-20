package com.example.demo.gateways;

import com.example.demo.domains.Aluno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

    Page<Aluno> findAlunoByApelido (String apelido, Pageable pageable);

    Page<Aluno> findAlunosByMateriaPreferida(String materiaPreferida, Pageable pageable);

    List<Aluno> findAlunosByMateriaPreferidaAndApelido(String materia, String apelido);

    List<Aluno> findAlunosByDataDaMatricula(LocalDate dataDaMatricula);

    List<Aluno> findAlunoByPessoaPrimeiroNomeContains(String nome);

    List<Aluno> findAlunoByPessoaSobrenomeEquals(String nome);


}
