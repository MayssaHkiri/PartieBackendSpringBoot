package com.example.gst.services;

import java.util.List;

import com.example.gst.entities.Contact;

public interface ContactService {

	public Contact AjouterContact( Contact  contact  ); 
	public List<Contact> ListeContacts () ; 
	public Contact ConsulterContactById (Long id); 
	public void SupprimerContact (Long id); 

}
