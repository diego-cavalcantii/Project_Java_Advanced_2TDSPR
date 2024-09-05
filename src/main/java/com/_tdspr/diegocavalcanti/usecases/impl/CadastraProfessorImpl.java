package com._tdspr.diegocavalcanti.usecases.impl;

import com._tdspr.diegocavalcanti.domains.Professor;
import com._tdspr.diegocavalcanti.usecases.CadastraProfessor;

public class CadastraProfessorImpl implements CadastraProfessor {
    @Override
    public Professor executa(Professor professorParaSerCadastrado) {
        Professor cadastrado = new Professor();
//        cadastrado.setPrimeiroNome(professorParaSerCadastrado.getPrimeiroNome());
//        cadastrado.setSobrenome(professorParaSerCadastrado.getSobrenome());
//        cadastrado.setDocumento(professorParaSerCadastrado.getDocumento());
        cadastrado.setDisciplina(professorParaSerCadastrado.getDisciplina());
        return cadastrado;
    }
}
