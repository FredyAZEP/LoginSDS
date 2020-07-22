package com.signup.interfaceservice;

import java.util.List;
import java.util.Optional;

import com.signup.model.Resultados;

public interface IresultadoService {
	
	public List<Resultados>listar3();
	public Optional<Resultados>listarId(int id);
}
