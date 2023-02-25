package com.example.gst.services;

import java.util.List;

import com.example.gst.entities.Evénement;

public interface EvénementService {


	public Evénement AjouterEvénement( Evénement E ); 
	public List<Evénement> ListeDesEvénements () ; 
	public Evénement ConsulterEvénementById (Long id); 
	public void SupprimerEvénement (Long id); 
}
