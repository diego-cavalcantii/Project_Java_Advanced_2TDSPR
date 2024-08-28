package com._tdspr.diegocavalcanti.gateways;

import com._tdspr.diegocavalcanti.domains.Aluno;
import com._tdspr.diegocavalcanti.gateways.requests.AlunoPatchNome;
import com._tdspr.diegocavalcanti.gateways.requests.AlunoPostRequest;
import com._tdspr.diegocavalcanti.gateways.responses.AlunoResponse;
import com._tdspr.diegocavalcanti.usecases.CadastrarAluno;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
@Validated
public class AlunoController {

    private final CadastrarAluno cadastrarAluno;




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
         String[] nomeSplitado = aluno.nomeCompleto().split(" ");


        Aluno alunoASerCadastrado = new Aluno(nomeSplitado[0],nomeSplitado[1] ,aluno.documento(),null);
        Aluno alunoCadastro = cadastrarAluno.executa(alunoASerCadastrado);

        AlunoResponse alunoResponse = AlunoResponse.builder()
                .primeiroNome(alunoCadastro.getPrimeiroNome())
                .sobrenome(alunoCadastro.getSobrenome())
                .registro(String.valueOf(alunoCadastro.getRegistro()))
                .documento(alunoCadastro.getDocumento())
                .build();
        return ResponseEntity.ok(alunoResponse);
    }

    @PatchMapping("/fiap/{alunoId}/nome")
    public ResponseEntity<AlunoResponse> atualizaNome(@PathVariable @NotBlank String alunoId, @RequestBody AlunoPatchNome nome){
        AlunoResponse alunoNomeAtualizado = AlunoResponse.builder()
                .primeiroNome(nome.getPrimeiroNome())
                .sobrenome(nome.getSobrenome())
                .documento("123456789")
                .registro("123456")
                .build();
        return ResponseEntity.ok(alunoNomeAtualizado);
    }


}
