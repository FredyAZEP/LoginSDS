package com.signup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.interfaces.IResultados;
import com.signup.interfaceservice.IresultadoService;
import com.signup.model.Resultados;

@Service
public class ResultadosService implements IresultadoService {

	@Autowired
	private IResultados data;
	
	@Override
	public List<Resultados> listar3() {
		
		return ( List<Resultados>)data.findAll();
	}

	@Override
	public Optional<Resultados> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
