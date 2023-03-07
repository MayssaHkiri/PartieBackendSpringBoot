package com.example.gst.services;

import java.util.List;

import com.example.gst.entities.Utilisateur;


public interface UtilisateurService {
  
	public  Utilisateur AjouterUtilisateur( Utilisateur  U  ); 
	public List<Utilisateur> ConsulterUtilisateurs () ; 
	public Utilisateur ConsulterUtilById (Long id); 
	public void SupprimeUtilById (Long id); 
	public Utilisateur ModifierUtilisateur ( Utilisateur U  ); 
	public List<Utilisateur>ListedesAdhérents ();
}
