package com.example.gst.services;

import java.util.List;

import com.example.gst.entities.Entraîneur;

public interface EntraîneurService {
	
	public  Entraîneur AjouterEntraîneur(Entraîneur e ); 
	public List<Entraîneur> ConsulterEntraîneurs () ; 
	public Entraîneur ConsulterEntraîneurById (Long id); 
	public void SupprimeEntraîneurById (Long id); 
	public Entraîneur ModifierEntraîneur (Entraîneur En ); 

}
