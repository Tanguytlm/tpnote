package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.dao.ParticipationRepository;
import fr.solutec.entities.Event;
import fr.solutec.entities.Notes;
import fr.solutec.entities.Participation;
import fr.solutec.entities.Person;

@RestController
@CrossOrigin("*")
public class ParticipationRest {
	@Autowired
	private ParticipationRepository participationRepo;

	@RequestMapping(value = "/participation/event/{id}", method = RequestMethod.GET)
	public List<Participation> getAllPersonEvent(@PathVariable Long id) {
		return setMdpPerson(participationRepo.findByEventId(id));
	}

	@RequestMapping(value = "/participation/person/{id}", method = RequestMethod.GET)
	public List<Participation> getAllEventPerson(@PathVariable Long id) {

		return setMdpPerson(participationRepo.findByPersonId(id));
	}

	@RequestMapping(value = "/participation", method = RequestMethod.GET)
	public List<Participation> getAll() {
		return (List<Participation>) participationRepo.findAll();
	}

	private List<Participation> setMdpPerson(List<Participation> p) {
		for (Participation participation : p) {
			participation.getPerson().setMdp("");
		}
		return p;
	}
}
