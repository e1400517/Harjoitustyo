package harjoitus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PartnerController {
	 @Autowired
	 private StudentRepository repository;
	@RequestMapping("/test")
    public String test(@RequestParam(value="name", defaultValue="World") String name) {
        return "{\"id\":\"hello\"}";
    }	
	@RequestMapping("/students")
    public Iterable<Student> students(@RequestParam(value="name", defaultValue="World") String name) {
       return repository.findAll();
    }	
      

}
