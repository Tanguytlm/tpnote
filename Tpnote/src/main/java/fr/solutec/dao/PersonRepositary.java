package fr.solutec.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Person;

public interface PersonRepositary extends CrudRepository<Person,Long> {
	public List<Person> findByLogin(String login);
	public List<Person> findByMdp(String mdp);
}
