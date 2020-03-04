package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.PersonRepositary;
import fr.solutec.entities.Person;

@ RestController @CrossOrigin("*")
public class PersonRest {
	
	@Autowired
	private PersonRepositary personRepo;
	
	
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public Person getConnexion(@RequestBody Person p) {
		
		Optional<Person> person = personRepo.findByLoginAndMdp(p.getLogin(), p.getMdp());
		
		Person pe = new Person();
		
		if(person.isPresent()) {
			
			pe = person.get();
			pe.setMdp("");
		}
		
		return pe;
	}
	
	@RequestMapping(value = "/createperson", method = RequestMethod.POST)
	public Person savePerson (@RequestBody Person p) {
		return personRepo.save(p);
	}
			
	
	
	
	
	
}
