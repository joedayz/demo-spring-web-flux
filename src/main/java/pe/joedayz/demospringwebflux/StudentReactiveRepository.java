package pe.joedayz.demospringwebflux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;



public interface StudentReactiveRepository extends ReactiveCrudRepository<Student, String> {
}
