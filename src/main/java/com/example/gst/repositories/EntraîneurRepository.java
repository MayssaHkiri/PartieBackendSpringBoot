package com.example.gst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.gst.entities.Entraîneur;

public interface EntraîneurRepository extends  JpaRepository <Entraîneur , Long > {

}
