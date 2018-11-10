package pe.joedayz.demospringwebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class NumerosController {

    @GetMapping(path="numeros", produces = "text/event-stream")
    public Flux<Integer> all(){
        return Flux.range(1, 30)
                .delayElements(Duration.ofSeconds(1))
                .map(n->n);
    }
}
