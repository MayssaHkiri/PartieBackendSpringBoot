package com.example.gst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gst.entities.Contact;

public interface ContactRepository extends JpaRepository <Contact , Long > {

}
