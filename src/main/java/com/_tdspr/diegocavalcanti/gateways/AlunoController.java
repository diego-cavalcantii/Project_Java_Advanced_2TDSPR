package com._tdspr.diegocavalcanti.gateways;

import com._tdspr.diegocavalcanti.domains.Aluno;
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
    public ResponseEntity<String> getAluno(@PathVariable String alunoId){
        return ResponseEntity.ok("Hello World o id é " + alunoId);
    }
    @PostMapping("/fiap")
    public ResponseEntity<Aluno> postAluno(@RequestBody Aluno aluno){
        Aluno alunoAtualizado = new Aluno();
        alunoAtualizado.setPrimeiroNome("Diego");
        alunoAtualizado.setRegistro(aluno.getRegistro());
        alunoAtualizado.setPrimeiroNome(aluno.getPrimeiroNome());
        alunoAtualizado.setSobrenome(aluno.getSobrenome());
        alunoAtualizado.setDocumento(aluno.getDocumento());


        return ResponseEntity.ok(alunoAtualizado);
    }


}
