package com._tdspr.diegocavalcanti.gateways.requests;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class AlunoPatchNome {
    @NotEmpty
    private String primeiroNome;
    private String sobrenome;
}
