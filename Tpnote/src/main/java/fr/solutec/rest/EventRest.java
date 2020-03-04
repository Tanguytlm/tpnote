package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.EventRepositary;
import fr.solutec.dao.NoteRepositary;

@ RestController @CrossOrigin("*") 
public class EventRest {
	@Autowired
	private EventRepositary eventRepo;
	
}
