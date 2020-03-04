package fr.solutec.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Event;
import fr.solutec.entities.Participation;
import fr.solutec.entities.Person;

public interface ParticipationRepository extends CrudRepository<Participation, Long>{
	public List<Participation> findByPersonId(Long id);
	public List<Participation> findByEventId(Long id);
}
