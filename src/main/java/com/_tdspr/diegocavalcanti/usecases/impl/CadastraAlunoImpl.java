package com._tdspr.diegocavalcanti.usecases.impl;

import com._tdspr.diegocavalcanti.domains.Aluno;
import com._tdspr.diegocavalcanti.usecases.CadastraAluno;

public class CadastraAlunoImpl implements CadastraAluno {
    @Override
    public Aluno executa(Aluno alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();
        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.getPrimeiroNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.getSobrenome());
        cadastrado.setDocumento(alunoParaSerCadastrado.getDocumento());
        cadastrado.setRegistro(alunoParaSerCadastrado.getRegistro());

        return cadastrado;
    }
}
