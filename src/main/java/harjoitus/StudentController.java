package harjoitus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
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
	@RequestMapping(value = "/api/student" , method = RequestMethod.POST)
    public @ResponseBody Student addStudent(@RequestBody Student jsonWifi) {
    	repository.save(jsonWifi);
        return jsonWifi;
	}   
        
        @RequestMapping(value = "/api/student", method = RequestMethod.GET)
        public Student get(@RequestParam(value="id", defaultValue="1") int id){
        	return repository.findOne(id);
    }

        @RequestMapping(value = "/api/project" , method = RequestMethod.DELETE)
        public Student delete(@RequestBody Student jsonWifi) {
        	return repository.save(jsonWifi);
    //do business logic
        	
     }
        
        @RequestMapping(value = "/api/project" , method = RequestMethod.PUT)
        public @ResponseBody Student updateWifi(@RequestBody Student jsonWifi) {
    return repository.save(jsonWifi);    

        }
}