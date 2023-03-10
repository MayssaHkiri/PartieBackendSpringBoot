package com.example.gst.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
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
	@Column(unique = true)
	private String email;
	private String telephone;
	private String adresse;
	private String mdp ; 
	
	
	@ManyToOne
	@JoinColumn(name="ID_ROLE", referencedColumnName="ID_ROLE")
	@ForeignKey(name = "FK_USER_ROLE", foreignKeyDefinition = "FOREIGN KEY (ID_ROLE) REFERENCES role(ID_Role)")
	private Role role ;
	
	@ManyToOne
	@JoinColumn(name="Id_Discipline", referencedColumnName="Id_Discipline")
	private Discipline discipline;
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
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Discipline getDiscipline() {
		return discipline;
	}
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	public Utilisateur(Long id, String nom, String prenom, String email, String telephone, String adresse, String mdp,
			Role role, Discipline discipline) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.mdp = mdp;
		this.role = role;
		this.discipline = discipline;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
