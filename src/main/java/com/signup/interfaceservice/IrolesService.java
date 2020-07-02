package com.signup.interfaceservice;

import java.util.List;

import java.util.Optional;

import com.signup.model.Role;

public interface IrolesService {
	
	public List<Role>Listar();
	public Optional<Role>ListarId(int id);
	public int save(Role r);
	public void delete(int id);
	
	 	
	

}
