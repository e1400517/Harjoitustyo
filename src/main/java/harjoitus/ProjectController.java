package harjoitus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectController {
	
	@Autowired
	private ProjectRepository repository;
	
	@RequestMapping(value = "/api/project" , method = RequestMethod.POST)
    public @ResponseBody Project addProject(@RequestBody Project jsonWifi) {
    	repository.save(jsonWifi);
        return jsonWifi;
	}   
        
        @RequestMapping(value = "/api/project", method = RequestMethod.GET)
        public Project get(@RequestParam(value="id", defaultValue="1") int id){
        	return repository.findOne(id);
    }

        @RequestMapping(value = "/api/project" , method = RequestMethod.DELETE)
        public Project delete(@RequestBody Project jsonWifi) {
        	return repository.save(jsonWifi);
    //do business logic
        	
     }
        
        @RequestMapping(value = "/api/project" , method = RequestMethod.PUT)
        public @ResponseBody Project updateWifi(@RequestBody Project jsonWifi) {
    return repository.save(jsonWifi);
    
        }
}
