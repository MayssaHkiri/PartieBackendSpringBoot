package com.example.gst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gst.entities.Utilisateur;
import com.example.gst.services.UtilisateurService;

@RequestMapping ("/adherents")
@CrossOrigin("*")
@RestController
public class UtilisateurController {
    
	
	@Autowired 
	private UtilisateurService userService ; 
	@PostMapping()
	public Utilisateur AjouterUtilisateur (@RequestBody Utilisateur user ) {
		return userService.AjouterUtilisateur(user);
	}
	@GetMapping()
	public  List<Utilisateur> ListerUtilisateurs (){
		return userService.ConsulterUtilisateurs(); 
	}
	@GetMapping ("/{id}")
	public Utilisateur ConsulterUtilisateur ( @PathVariable Long id) {
		return userService.ConsulterUtilById(id);
	}
	@PutMapping ("/{id}")
	public Utilisateur ModifierUtilisateur (@RequestBody Utilisateur user )
	{
		return userService.ModifierUtilisateur(user);
	}
	@DeleteMapping ("/{id}")
	public void SupprimerUtilisateur (@PathVariable Long id )
	{
		userService.SupprimeUtilById(id); 
	}
	
}
