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

import com.example.gst.entities.Contact;
import com.example.gst.services.ContactService;

@RequestMapping ("/Contact")
@CrossOrigin("*")
@RestController
public class ContactController {
	@Autowired 
	private ContactService ContactService ; 
	
	@PostMapping("/ajouter")
	public Contact AjouterContact (@RequestBody Contact contact ) {
		return ContactService.AjouterContact(contact);
	}
	@GetMapping("/Liste")
	public  List<Contact> ListeContacts (){
		return ContactService.ListeContacts();
	}
	@GetMapping ("Rechercher/{id}")
	public Contact ConsulterContact ( @PathVariable Long id) {
		return ContactService.ConsulterContactById(id);
	}
	
	@DeleteMapping ("Supprimer/{id}")
	public void SupprimerContact (@PathVariable Long id )
	{
		ContactService.SupprimerContact(id) ;
	}
	

}
