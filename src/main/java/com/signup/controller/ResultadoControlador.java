package com.signup.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.signup.interfaceservice.IresultadoService;
import com.signup.model.Resultados;


@Controller
@RequestMapping
public class ResultadoControlador {
	
	@Autowired
	private IresultadoService service;
	
	
	
		
		
	
	 
	 @RequestMapping(value= {"/home/74Frac1"}, method=RequestMethod.GET)
	 public String listar3(Model model) {
	  List<Resultados>resultado=service.listar3();
		 model.addAttribute("resultados" , resultado);
	  return "/home/74Frac1";
	 }

}
