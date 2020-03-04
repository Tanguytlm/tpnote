package fr.solutec.dao;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Person;

public interface PersonRepositary extends CrudRepository<Person,Long> {
	
	public Optional<Person> findByLoginAndMdp(String login,String mdp);
	
	
	
}
