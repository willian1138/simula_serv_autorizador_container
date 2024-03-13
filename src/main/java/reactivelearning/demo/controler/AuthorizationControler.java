package reactivelearning.demo.controler;

import org.springframework.web.bind.annotation.RestController;

import reactivelearning.demo.services.AutorizacaoService;
import reactivelearning.demo.domain.Autorizacao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RestController
public class AuthorizationControler {
    
    private final AutorizacaoService autorizacaoService;
    
    public AuthorizationControler(AutorizacaoService autorizacaoService){
        this.autorizacaoService = autorizacaoService;
    }

    @RequestMapping("api/auth")
    @GetMapping
    public ResponseEntity<Autorizacao> requestAuth() {
        Optional<Autorizacao> getAuth = autorizacaoService.generateAuthorization();
        return ResponseEntity.of(getAuth);
    }


}
