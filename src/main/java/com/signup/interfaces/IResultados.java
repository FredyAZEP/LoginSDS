package com.signup.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signup.model.Resultados;

@Repository
public interface IResultados extends CrudRepository<Resultados, Integer> {
	
	

}
