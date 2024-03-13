package reactivelearning.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import reactivelearning.demo.dtos.AutorizacaoDTO;

public interface AutorizacaoRepository extends JpaRepository<AutorizacaoDTO, Long>{
    
}
