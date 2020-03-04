package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.EventRepositary;
import fr.solutec.dao.NoteRepositary;
import fr.solutec.entities.Event;
import fr.solutec.entities.Notes;

@ RestController @CrossOrigin("*") 
public class EventRest {
	@Autowired
	private EventRepositary eventRepo;
	
	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public List<Event> getAll(){
		return (List<Event>) eventRepo.findAll();
	}
	
	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public Event saveNote (@RequestBody Event p) {
		return eventRepo.save(p);
	}
	
}
