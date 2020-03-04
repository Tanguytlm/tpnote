package fr.solutec.dao;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Event;


public interface EventRepositary extends CrudRepository<Event,Long> {

}
