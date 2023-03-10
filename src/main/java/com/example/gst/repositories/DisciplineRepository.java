package com.example.gst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gst.entities.Discipline;



public interface DisciplineRepository extends JpaRepository <Discipline , Long >  {

}
