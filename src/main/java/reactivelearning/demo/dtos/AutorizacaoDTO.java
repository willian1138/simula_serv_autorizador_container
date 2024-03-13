package reactivelearning.demo.dtos;

import java.time.LocalTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class AutorizacaoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autorizacao;
    @Column(columnDefinition = "TIME")
    private LocalTime issuedAt;

    public AutorizacaoDTO() {
        this.issuedAt = LocalTime.now();
        //this.autorizacao = autorizacao; é possivel setar a string correspondente a autorizacao
    }
    
}
