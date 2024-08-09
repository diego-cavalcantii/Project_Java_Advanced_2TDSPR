package com._tdspr.diegocavalcanti.usecases.impl;

import com._tdspr.diegocavalcanti.domains.Aluno;
import com._tdspr.diegocavalcanti.usecases.CadastraAluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastraAlunoImplTest {

    CadastraAluno cadastrarAluno = new CadastraAlunoImpl();

    @Test
    @DisplayName("Testa se as infos do objeto AlunoSerCadastrado foram devidamente copiadas para um novo objeto")
    void testeExecutaDeCadastrarAluno() {
        //Dado uma condição - Arrange
        Aluno alunoASerCadastrado = new Aluno();
        alunoASerCadastrado.setPrimeiroNome("Diego");
        alunoASerCadastrado.setSobrenome("Cavalcanti");
        alunoASerCadastrado.setDocumento("123456789");
        alunoASerCadastrado.setRegistro("123456");

        //Quando algo acontecer - Act
        Aluno cadastrado = cadastrarAluno.executa(alunoASerCadastrado);
        //Entao verifique uma determinada info - Assert
        Assertions.assertEquals(alunoASerCadastrado.getPrimeiroNome(), cadastrado.getPrimeiroNome());
        Assertions.assertEquals(alunoASerCadastrado.getSobrenome(), cadastrado.getSobrenome());
        Assertions.assertEquals(alunoASerCadastrado.getDocumento(), cadastrado.getDocumento());
        Assertions.assertEquals(alunoASerCadastrado.getRegistro(), cadastrado.getRegistro());


    }

}