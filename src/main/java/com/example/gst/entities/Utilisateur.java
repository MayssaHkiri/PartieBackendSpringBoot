package com.example.gst.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
@Table(name="UTILISATEUR") 
public class Utilisateur {
	@Id 
	@Column(name="ID_USER")
	@GeneratedValue(strategy = GenerationType.AUTO )
    private Long id ; 
	private String nom;
	private String prenom;
	private String email;
	private Long  telephone ; 
	private String mdp ; 
	
	
	@ManyToOne
	@JoinColumn(name="ID_ROLE", referencedColumnName="ID_Role")
	private Role role ;
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
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Utilisateur(Long id, String nom, String prenom, String email, Long telephone, String mdp, Role role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.mdp = mdp;
		this.role = role;
	}
	
	
}
