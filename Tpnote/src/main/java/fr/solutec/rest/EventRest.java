package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.solutec.dao.EventRepositary;
import fr.solutec.entities.Event;


@ RestController @CrossOrigin("*") 
public class EventRest {
	@Autowired
	private EventRepositary eventRepo;
	
	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public List<Event> getAll(){
		return (List<Event>) eventRepo.findAll();
	}
	
	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public Event saveEvent (@RequestBody Event p) {
		return eventRepo.save(p);
	}
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.DELETE)
	public boolean deleteEvent(@PathVariable Long id){
		eventRepo.deleteById(id);
		return true;
	}
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.GET)
	public Optional<Event> getEvent(@PathVariable Long id){
		return eventRepo.findById(id);}
	
}
