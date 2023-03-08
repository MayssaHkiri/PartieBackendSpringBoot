package com.example.gst.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.gst.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur , Long > {
	
	@Query(value = "SELECT * FROM utilisateur u INNER JOIN role r ON u.ID_ROLE = r.ID_ROLE WHERE r.role = :roleNom",nativeQuery = true)
    public List<Utilisateur> ListByRole(@Param(value = "roleNom") String role);

}
