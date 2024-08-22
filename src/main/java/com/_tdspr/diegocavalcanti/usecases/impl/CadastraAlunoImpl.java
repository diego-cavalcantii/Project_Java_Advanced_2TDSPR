package com._tdspr.diegocavalcanti.usecases.impl;

import com._tdspr.diegocavalcanti.domains.Aluno;
import com._tdspr.diegocavalcanti.gateways.AlunoRepository;
import com._tdspr.diegocavalcanti.usecases.CadastraAluno;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastraAlunoImpl implements CadastraAluno {
    private final AlunoRepository alunoRepository;

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
