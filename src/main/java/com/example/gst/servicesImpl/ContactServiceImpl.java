package com.example.gst.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.entities.Contact;
import com.example.gst.entities.Utilisateur;
import com.example.gst.repositories.ContactRepository;

import com.example.gst.services.ContactService;

@Service 
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository ContactRepo ; 

	@Override
	public Contact AjouterContact(Contact contact) {
		return ContactRepo.save(contact);
		
	}

	@Override
	public List<Contact> ListeContacts() {
		
		return ContactRepo.findAll();
	}

	@Override
	public Contact ConsulterContactById(Long id) {
		
		 Optional<Contact> m = ContactRepo.findById(id) ;
		 return m.isPresent() ? m.get() : null ; 
	}

	@Override
	public void SupprimerContact(Long id) {
		ContactRepo.deleteById(id);
		
	}

}
