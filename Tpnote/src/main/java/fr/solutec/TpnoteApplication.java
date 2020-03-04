package fr.solutec;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.dao.EventRepositary;
import fr.solutec.dao.NoteRepositary;
import fr.solutec.dao.PersonRepositary;
import fr.solutec.entities.Event;
import fr.solutec.entities.Notes;
import fr.solutec.entities.Person;


@SpringBootApplication
public class TpnoteApplication implements CommandLineRunner{
	@Autowired
	private PersonRepositary personRepo;
	@Autowired
	private NoteRepositary noteRepo;
	@Autowired
	private EventRepositary eventRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TpnoteApplication.class, args);	
		System.out.println("so good so far");
	}
	
	@Override
	public void run(String... args) throws Exception {
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		
		Person p1=new Person("Marine Lafeve", "Marine", "Lafeve");
		personRepo.save(p1);
		noteRepo.save(new Notes("salut les gens !",p1));
		Person p2=new Person("Bob Morane", "Bob", "Morane");
		personRepo.save(p2);
		noteRepo.save(new Notes("aaaoo !",p2));
		noteRepo.save(new Notes("aaaooezatzge!",p2));
		eventRepo.save(new Event("chabadaaaa",d.parse("14/07/2021")));
	}
}
