package reactivelearning.demo.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import reactivelearning.demo.repositories.AutorizacaoRepository;
import reactivelearning.demo.domain.Autorizacao;
import reactivelearning.demo.dtos.AutorizacaoDTO;


@Service
public class AutorizacaoService {
    
    private final AutorizacaoRepository autorizacaoRepository;
    Random random = new Random();
 
    public AutorizacaoService(AutorizacaoRepository autorizacaoRepository) {
        this.autorizacaoRepository = autorizacaoRepository;
        
    }

    public Optional<Autorizacao> generateAuthorization() {

        int id = random.nextInt(Math.abs((int) System.currentTimeMillis()));
        if( id % 2 == 0) {
            return Optional.of(new Autorizacao("autorizado"));
                } else {
            return Optional.of(new Autorizacao("nao autorizado"));
        }
    }

    public AutorizacaoDTO save(AutorizacaoDTO autorizacaoDTO) {
        return autorizacaoRepository.save(autorizacaoDTO);
    }

    public Optional<AutorizacaoDTO> findById(Long id) {
        return autorizacaoRepository.findById(id);

    }
}


// Path: demo/src/main/java/reactivelearning/demo/services/AutorizacaoService.java