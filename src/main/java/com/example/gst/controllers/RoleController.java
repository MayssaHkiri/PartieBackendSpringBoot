package com.example.gst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gst.entities.Role;
import com.example.gst.services.RoleService;
@RequestMapping ("roles")
@RestController
@CrossOrigin("*")

public class RoleController {
	@Autowired
	private RoleService RoleService ;
	@PostMapping("/ajouterRole")
	public Role addRole (Role r )
	{
	   return RoleService.AjouterRole(r); 
	}
	
}
