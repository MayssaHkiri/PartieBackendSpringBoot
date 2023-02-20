package com.example.gst.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.entities.Role;
import com.example.gst.repositories.RoleRepository;
import com.example.gst.services.RoleService;

@Service 
public class RoleServiceImpl implements RoleService {
	
	@Autowired
    private RoleRepository RoleRepo ;
	
	@Override
	public Role AjouterRole(Role R) {
		return RoleRepo.save(R);
	}

}
