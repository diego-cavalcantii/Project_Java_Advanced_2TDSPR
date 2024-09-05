package com._tdspr.diegocavalcanti.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "aluno_graduacao")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String registro;

    @Column(name = "nickname")
    private String apelido;
//    @JsonIgnore // ignore this field in the response

    private String materiaPreferida;

    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;

}
