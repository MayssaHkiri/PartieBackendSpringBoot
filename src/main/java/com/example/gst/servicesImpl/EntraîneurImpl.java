package com.example.gst.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.entities.Contact;
import com.example.gst.entities.Entraîneur;
import com.example.gst.repositories.EntraîneurRepository;
import com.example.gst.services.EntraîneurService;

@Service
public class EntraîneurImpl implements EntraîneurService{
	

	@Autowired
	private EntraîneurRepository EntraîneurRepo ; 

	@Override
	public Entraîneur AjouterEntraîneur(Entraîneur En) {
		
		return EntraîneurRepo.save(En);
	}

	@Override
	public List<Entraîneur> ConsulterEntraîneurs() {
		
		return EntraîneurRepo.findAll();
	}

	@Override
	public Entraîneur ConsulterEntraîneurById(Long id) {
		Optional<Entraîneur> m =EntraîneurRepo.findById(id) ;
		 return m.isPresent() ? m.get() : null ; 
	}

	@Override
	public void SupprimeEntraîneurById(Long id) {
		EntraîneurRepo.deleteById(id);
		
	}

	@Override
	public Entraîneur ModifierEntraîneur(Entraîneur En) {
		
		return EntraîneurRepo.save(En);
	}

}
