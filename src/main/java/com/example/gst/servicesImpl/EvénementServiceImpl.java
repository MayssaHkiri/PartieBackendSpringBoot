package com.example.gst.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.entities.Evénement;
import com.example.gst.entities.Utilisateur;
import com.example.gst.repositories.EvénementRepository;
import com.example.gst.services.EvénementService;

@Service
public class EvénementServiceImpl implements EvénementService{

	@Autowired 
	private EvénementRepository EvénementRepo;
	
	@Override
	public Evénement AjouterEvénement(Evénement E) {
		
		return EvénementRepo.save(E) ;
	}

	@Override
	public List<Evénement> ListeDesEvénements() {
		
		return EvénementRepo.findAll();
	}

	@Override
	public Evénement ConsulterEvénementById(Long id) {

		 Optional<Evénement> m = EvénementRepo.findById(id) ;
		 return m.isPresent() ? m.get() : null ; 
	}

	@Override
	public void SupprimerEvénement(Long id) {
		EvénementRepo.deleteById(id);		
	}

}
