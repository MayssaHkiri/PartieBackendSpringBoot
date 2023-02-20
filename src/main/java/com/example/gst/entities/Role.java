package com.example.gst.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
public class Role {
@Id 
@Column(name="ID_ROLE")
@GeneratedValue(strategy = GenerationType.AUTO )
private Long id ; 
private String role ; 

@JsonIgnore
@ManyToOne
@JoinColumn(name="ID_USER", referencedColumnName="ID_USER")
private Utilisateur user ;

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
public Utilisateur getUser() {
	return user;
}
public void setUser(Utilisateur user) {
	this.user = user;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public Role(String role, Utilisateur user) {
	super();
	this.role = role;
	this.user = user;
}

}
