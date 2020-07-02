package com.signup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.interfaces.IRoles;
import com.signup.interfaceservice.IrolesService;
import com.signup.model.Role;


@Service
public class RolesService implements IrolesService{
	
	@Autowired
	private IRoles data;
	
	@Override
	public List<Role> Listar() {
		
		return (List<Role>)data.findAll();
	}

	@Override
	public Optional<Role> ListarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Role r) {
		int res=0;
		Role role=data.save(r);
		if (role.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
