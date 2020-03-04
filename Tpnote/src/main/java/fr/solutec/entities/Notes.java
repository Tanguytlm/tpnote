package fr.solutec.entities;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Notes {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String contenu;
	@CreationTimestamp
	private Date date;
	@ManyToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Notes() {
		super();
	}
	public Notes(String contenu, Person person) {
		super();
		this.contenu = contenu;
		this.person = person;

	}
	@Override
	public String toString() {
		return "Notes [id=" + id + ", contenu=" + contenu + ", date=" + date + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
