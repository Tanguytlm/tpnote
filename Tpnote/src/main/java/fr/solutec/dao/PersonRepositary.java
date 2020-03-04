package fr.solutec.dao;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Person;

public interface PersonRepositary extends CrudRepository<Person,Long> {

}
