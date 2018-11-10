package pe.joedayz.demospringwebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class NumerosController {

    @GetMapping(path="numeros", produces = "text/event-stream")
    public Flux<Integer> all(){
        Flux<Integer> flux = Flux.range(1, 30)
                .delayElements(Duration.ofSeconds(1))
                .filter(n -> n%2==0)
                .map(n->n);

        flux.subscribe(System.out::println); //primer subscriber

        flux.subscribe(Subscriber::multiplicar); //segundo subscriber PEREZOSO

        return flux; //tercer subscriber
    }


}
