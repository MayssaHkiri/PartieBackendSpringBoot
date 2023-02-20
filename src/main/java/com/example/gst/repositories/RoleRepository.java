package com.example.gst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gst.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository <Role , Long > {

}
