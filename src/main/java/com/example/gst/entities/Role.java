package com.example.gst.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
public class Role {
@Id 
@Column(name="ID_ROLE")
@GeneratedValue(strategy = GenerationType.AUTO )
private Long id ; 
private String role ; 
@JsonIgnore
@OneToMany (mappedBy="role",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
private List<Utilisateur> utilisateurs ;



public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public List<Utilisateur> getUtilisateurs() {
	return utilisateurs;
}
public void setUtilisateurs(List<Utilisateur> utilisateurs) {
	this.utilisateurs = utilisateurs;
}
public Role(Long id, String role, List<Utilisateur> utilisateurs) {
	super();
	this.id = id;
	this.role = role;
	this.utilisateurs = utilisateurs;
}

}
