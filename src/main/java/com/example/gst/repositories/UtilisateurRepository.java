package com.example.gst.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.gst.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur , Long > {
	
	@Query(value = "SELECT * FROM Utilisateur WHERE role=adhérent",nativeQuery = true)
    public List<Utilisateur> ListedesAdhérents();

}
