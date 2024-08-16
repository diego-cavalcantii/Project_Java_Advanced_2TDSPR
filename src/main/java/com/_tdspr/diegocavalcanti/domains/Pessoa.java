package com._tdspr.diegocavalcanti.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String primeiroNome;
    private String sobrenome;
    private String documento;

}
