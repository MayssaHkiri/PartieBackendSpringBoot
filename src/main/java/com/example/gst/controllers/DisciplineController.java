package com.example.gst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gst.entities.Discipline;

import com.example.gst.services.DisciplineService;



@RequestMapping ("/disciplines")
@CrossOrigin("*")
@RestController
public class DisciplineController {
	@Autowired 
	private DisciplineService DisService ; 
	
	@GetMapping("/Consulter")
	public  List<Discipline> ListerUtilisateurs (){
		return DisService.ListeDesDisciplines();
	}
	@GetMapping ("Rechercher/{id}")
	public Discipline ConsulterUtilisateur ( @PathVariable Long id) {
		return DisService.DisciplineByID(id);
	}

}
