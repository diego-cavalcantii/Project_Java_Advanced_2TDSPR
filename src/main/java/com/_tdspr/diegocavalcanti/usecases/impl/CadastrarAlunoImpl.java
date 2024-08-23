package com._tdspr.diegocavalcanti.usecases.impl;

import com._tdspr.diegocavalcanti.domains.Aluno;
import com._tdspr.diegocavalcanti.gateways.AlunoRepository;
import com._tdspr.diegocavalcanti.usecases.CadastrarAluno;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastrarAlunoImpl implements CadastrarAluno {
    private final AlunoRepository alunoRepository;

    @Override
    public Aluno executa(Aluno alunoParaSerCadastrado) {

        return alunoRepository.save(alunoParaSerCadastrado);
//        cadastrado.setPrimeiroNome(alunoParaSerCadastrado.getPrimeiroNome());
//        cadastrado.setSobrenome(alunoParaSerCadastrado.getSobrenome());
//        cadastrado.setDocumento(alunoParaSerCadastrado.getDocumento());
//        cadastrado.setRegistro(alunoParaSerCadastrado.getRegistro());
    }
}
