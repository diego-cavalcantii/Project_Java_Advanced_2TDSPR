package com._tdspr.diegocavalcanti.gateways.requests;

import lombok.NonNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public record AlunoPostRequest(
        String nomeCompleto,
        String documento,
        String registro) {
}
