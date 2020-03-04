package fr.solutec.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Notes;

public interface NoteRepositary extends CrudRepository<Notes,Long> {
	public List<Notes> findByPersonId(Long id);
}
