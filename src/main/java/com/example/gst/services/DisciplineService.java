package com.example.gst.services;

import java.util.List;

import com.example.gst.entities.Discipline;

public interface DisciplineService {
	
	public Discipline DisciplineByID(long id);
	public List<Discipline> ListeDesDisciplines ();

}
