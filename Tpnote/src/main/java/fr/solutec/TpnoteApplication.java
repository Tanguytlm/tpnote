package fr.solutec;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.dao.EventRepositary;
import fr.solutec.dao.NoteRepositary;
import fr.solutec.dao.ParticipationRepository;
import fr.solutec.dao.PersonRepositary;
import fr.solutec.entities.Event;
import fr.solutec.entities.Notes;
import fr.solutec.entities.Participation;
import fr.solutec.entities.Person;


@SpringBootApplication
public class TpnoteApplication implements CommandLineRunner{
	@Autowired
	private PersonRepositary personRepo;
	@Autowired
	private NoteRepositary noteRepo;
	@Autowired
	private EventRepositary eventRepo;
	@Autowired
	private ParticipationRepository participationRepo ;
	
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
		
		Event e1= new Event("chabadaaaa",d.parse("14/07/2021"));
		eventRepo.save(e1);
		Event e2= new Event("fête du code",d.parse("14/08/2023"));
		eventRepo.save(e2);
		
		Participation pa1 = new Participation(p1,e1);
		participationRepo.save(pa1);
		Participation pa2 = new Participation(p2,e1);
		participationRepo.save(pa2);
		Participation pa3 = new Participation(p2,e2);
		participationRepo.save(pa3);
		
	}
}
