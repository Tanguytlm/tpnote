package fr.solutec.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Event {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateeEvent;
	@CreationTimestamp
	private Date date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateeEvent() {
		return dateeEvent;
	}
	public void setDateeEvent(Date dateeEvent) {
		this.dateeEvent = dateeEvent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", nom=" + nom + ", dateeEvent=" + dateeEvent + ", date=" + date + "]";
	}
	public Event(String nom, Date dateeEvent) {
		super();
		this.nom = nom;
		this.dateeEvent = dateeEvent;
	}
	public Event() {
		super();
	}
	
	
}
