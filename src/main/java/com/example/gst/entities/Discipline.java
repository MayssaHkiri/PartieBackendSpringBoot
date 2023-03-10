package com.example.gst.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
@Table(name="Discipline") 
public class Discipline {
	
	@Id 
	@Column(name="Id_Discipline")
	@GeneratedValue(strategy = GenerationType.AUTO )
    private Long id ; 
	private String discipline;
	
	@OneToMany (mappedBy="discipline")
	 private List<Entraîneur> entraineurs ;
	
	@JsonIgnore
	@OneToMany (mappedBy="discipline")
	private List<Utilisateur> utilisateurs ;
	
	public Discipline(Long id, String discipline, List<Entraîneur> entraineurs, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.discipline = discipline;
		this.entraineurs = entraineurs;
		this.utilisateurs = utilisateurs;
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
		
	public List<Entraîneur> getEntraineurs() {
		return entraineurs;
	}
	public void setEntraineurs(List<Entraîneur> entraineurs) {
		this.entraineurs = entraineurs;
	}
	public Discipline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
