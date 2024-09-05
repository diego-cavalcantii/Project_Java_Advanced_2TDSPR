package com._tdspr.diegocavalcanti.gateways;

import com._tdspr.diegocavalcanti.domains.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, String> {
}
