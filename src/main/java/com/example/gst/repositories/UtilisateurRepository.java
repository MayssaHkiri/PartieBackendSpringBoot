package com.example.gst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gst.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository <Utilisateur , Long > {

}
