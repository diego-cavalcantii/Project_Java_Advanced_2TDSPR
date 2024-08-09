package com._tdspr.diegocavalcanti.usecases.impl;

import com._tdspr.diegocavalcanti.domains.Professor;
import com._tdspr.diegocavalcanti.usecases.CadastraProfessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastraProfessorImplTest {
    CadastraProfessor cadastrarProfessor = new CadastraProfessorImpl();

    @Test
    void testeExecutaDeCadastrarProfessor(){
        Professor professorASerCadastrado = new Professor();
        professorASerCadastrado.setPrimeiroNome("João");

        Professor professorCadastrado = cadastrarProfessor.executa((professorASerCadastrado));

        Assertions.assertEquals(professorASerCadastrado.getPrimeiroNome(), professorCadastrado.getPrimeiroNome());
    }

}