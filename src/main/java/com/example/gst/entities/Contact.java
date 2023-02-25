package com.example.gst.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="CONTACT") 
public class Contact {

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id 
	@Column(name="Id_Contact")
	@GeneratedValue(strategy = GenerationType.AUTO )
    private Long id ; 
	private String nom;
	private String prenom;
	private String email;
	
	private String sujet ; 
	private String message ;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Contact(Long id, String nom, String prenom, String email, String sujet, String message) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.sujet = sujet;
		this.message = message;
	} 
	
}
