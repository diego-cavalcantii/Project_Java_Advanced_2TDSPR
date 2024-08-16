package com._tdspr.diegocavalcanti.gateways;

import com._tdspr.diegocavalcanti.domains.Aluno;
import com._tdspr.diegocavalcanti.gateways.requests.AlunoPostRequest;
import com._tdspr.diegocavalcanti.gateways.responses.AlunoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {


    @GetMapping("/fiap")
    public ResponseEntity<String> getAlunos(){
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/fiap/{alunoId}")
    public Aluno getAluno(@PathVariable String alunoId){
        return new Aluno();
    }
    @PostMapping("/fiap")
    public ResponseEntity<AlunoResponse> postAluno(@RequestBody AlunoPostRequest aluno){
        Aluno alunoAtualizado = new Aluno(aluno.primeiroNome(), aluno.sobrenome(),aluno.documento(),aluno.registro());
        alunoAtualizado.setId("1");
        AlunoResponse alunoResponse = AlunoResponse.builder()
                .primeiroNome(alunoAtualizado.getPrimeiroNome())
                .sobrenome(alunoAtualizado.getSobrenome())
                .registro(alunoAtualizado.getRegistro())
                .documento(alunoAtualizado.getDocumento())
                .build();
        return ResponseEntity.ok(alunoResponse);
    }

    @PatchMapping("/fiap/{alunoId}/nome")
    public ResponseEntity<AlunoResponse> atualizaNome(@PathVariable String alunoId,@RequestBody  AlunoPatchNome nome){
        AlunoResponse alunoNomeAtualizado = AlunoResponse.builder()
                .primeiroNome(nome.getPrimeiroNome())
                .sobrenome(nome.getSobrenome())
                .documento("123456789")
                .registro("123456")
                .build();
        return ResponseEntity.ok(alunoNomeAtualizado);
    }


}
