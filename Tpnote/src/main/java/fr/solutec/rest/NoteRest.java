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

import fr.solutec.dao.NoteRepositary;
import fr.solutec.entities.Notes;

@ RestController @CrossOrigin("*") 
public class NoteRest {
	@Autowired
	private NoteRepositary noteRepo;
	
	@RequestMapping(value = "/note", method = RequestMethod.POST)
	public Notes saveNote (@RequestBody Notes p) {
		return noteRepo.save(p);
	}
	
	@RequestMapping(value = "/note", method = RequestMethod.GET)
	public List<Notes> getAll(){
		return (List<Notes>) noteRepo.findAll();
	}
	
	@RequestMapping(value = "/note/{id}", method = RequestMethod.DELETE)
	public boolean deleteNote(@PathVariable Long id){
		noteRepo.deleteById(id);
		return true;
	}
	
	@RequestMapping(value = "/note/{id}", method = RequestMethod.GET)
	public Optional<Notes> getNote(@PathVariable Long id){
		return noteRepo.findById(id);}
	
	@RequestMapping(value = "/notes/{id}", method = RequestMethod.GET)
	public List<Notes> getAllNote(@PathVariable Long id){
		return noteRepo.findByPersonId(id);}
	
	@RequestMapping(value = "/notes", method = RequestMethod.GET)
	public List<Notes> getAllforAll(){
		return noteRepo.findByPersonId(null);

}
}