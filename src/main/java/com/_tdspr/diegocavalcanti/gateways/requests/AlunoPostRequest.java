package com._tdspr.diegocavalcanti.gateways.requests;

import lombok.NonNull;

public record AlunoPostRequest(@NonNull String primeiroNome, String sobrenome, String documento, String registro) {
}
