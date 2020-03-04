package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.PersonRepositary;
import fr.solutec.entities.Person;

@ RestController @CrossOrigin("*")
public class PersonRest {
	
	@Autowired
	private PersonRepositary personrepo;
	
	@RequestMapping(value = "/personl/{login}", method = RequestMethod.GET)
	public List<Person> getLogin(@PathVariable String login){
		return personrepo.findByLogin(login);
	}
	
	@RequestMapping(value = "/personm/{mdp}", method = RequestMethod.GET)
	public List<Person> getMdp(@PathVariable String mdp){
		return personrepo.findByMdp(mdp);
	}
	
}
