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

@RequestMapping ("/utilisateurs")
@CrossOrigin("*")
@RestController
public class UtilisateurController {
    
	
	@Autowired 
	private UtilisateurService userService ; 
	@PostMapping("/ajouter")
	public Utilisateur AjouterUtilisateur (@RequestBody Utilisateur user ) {
		return userService.AjouterUtilisateur(user);
	}
	@GetMapping("/Consulter")
	public  List<Utilisateur> ListerUtilisateurs (){
		return userService.ConsulterUtilisateurs(); 
	}
	@GetMapping ("Rechercher/{id}")
	public Utilisateur ConsulterUtilisateur ( @PathVariable Long id) {
		return userService.ConsulterUtilById(id);
	}
	@PutMapping ("Modifier/{id}")
	public Utilisateur ModifierUtilisateur (@RequestBody Utilisateur user )
	{
		return userService.ModifierUtilisateur(user);
	}
	@DeleteMapping ("Supprimer/{id}")
	public void SupprimerUtilisateur (@PathVariable Long id )
	{
		userService.SupprimeUtilById(id); 
	}
	  @GetMapping("/ListeDesUtilisateurs/{role}")
	     List<Utilisateur> ListeParRole( @PathVariable String role){
	        return userService.ListeParRole(role);
	   }
	  @GetMapping("/RechercherUtilisateur/{role}/{critere}")
	     List<Utilisateur> ChercherUtilisateur( @PathVariable String role ,@PathVariable String critere ){
	        return userService.RechercherUtilisateur(role ,critere );
	   }
	
}
