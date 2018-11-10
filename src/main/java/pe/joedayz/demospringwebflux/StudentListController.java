package pe.joedayz.demospringwebflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class StudentListController {


    @Autowired
    private StudentReactiveRepository repository;

    @GetMapping("/list-students")
    public String listStudents(Model model){
        Flux<Student> flux = repository.findAll();
        model.addAttribute("students", flux);
        return "students"; // students.html
    }
}
