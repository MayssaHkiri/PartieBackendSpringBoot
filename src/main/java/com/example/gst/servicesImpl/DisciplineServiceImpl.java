package com.example.gst.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.entities.Discipline;

import com.example.gst.repositories.DisciplineRepository;
import com.example.gst.services.DisciplineService;
@Service 
public class DisciplineServiceImpl implements DisciplineService{

	@Autowired
	private DisciplineRepository DisRepo ; 
	@Override
	public Discipline DisciplineByID(long id) {
		

		 Optional<Discipline> m = DisRepo.findById(id) ;
		 return m.isPresent() ? m.get() : null ; 
	}

	@Override
	public List<Discipline> ListeDesDisciplines() {
		
		return DisRepo.findAll();
	}

}
