package com.example.gst.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.entities.Utilisateur;
import com.example.gst.repositories.UtilisateurRepository;
import com.example.gst.services.UtilisateurService;

@Service 

public class UtilisateurServiceImpl implements UtilisateurService {
	
	@Autowired
	private UtilisateurRepository utilRepo ; 

	@Override
	public Utilisateur AjouterUtilisateur(Utilisateur U) {
		
		return  utilRepo.save(U);
	}

	@Override
	public List<Utilisateur> ConsulterUtilisateurs() {
		
		return utilRepo.findAll();
	}

	@Override
	public Utilisateur ConsulterUtilById(Long id) {
		
		 Optional<Utilisateur> m = utilRepo.findById(id) ;
		 return m.isPresent() ? m.get() : null ; 
	}

	@Override
	public void SupprimeUtilById(Long id) {
		utilRepo.deleteById(id);
		
	}

	@Override
	public Utilisateur ModifierUtilisateur(Utilisateur U) {
		return utilRepo.save(U);
	}

	@Override
	public List<Utilisateur> ListeParRole(String RoleNom) {
		
		return utilRepo.ListByRole(RoleNom);
	}

	@Override
	public List<Utilisateur> RechercherUtilisateur(String RoleNom ,String recherche  ) {
		
		return utilRepo.RechercherUtilisateur(RoleNom ,recherche);
	}

	

}
