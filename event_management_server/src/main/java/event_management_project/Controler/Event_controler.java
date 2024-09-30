package event_management_project.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import event_management_project.Event_Entity.Event_entity;
import event_management_project.Service.Event_service;

@RestController
@CrossOrigin("http://localhost:4200/")

public class Event_controler {
	@Autowired
	Event_service es;

	@GetMapping("/events")
	public List<Event_entity> getallevents() {

		return es.getallevents();

	}

	@GetMapping("/events/{eid}")
	public Event_entity geteventbyid(@PathVariable int eid) {
		return es.geteventbyid(eid);

	}
	
	@PostMapping("/events")
	public Event_entity addevents(@RequestBody Event_entity eventdata) {
		
		return es.addevents(eventdata);
		
	}
	
	@PutMapping("/events")
	public Event_entity updatevents(@RequestBody Event_entity eventdata) {
		
		return es.updatevents(eventdata);
		
	}
	
	@DeleteMapping("/events/{id}")
	public void deleteevent(@PathVariable int id) {
		
		 es.deleteevent(id);
		
		
	

	}
}
	
	


