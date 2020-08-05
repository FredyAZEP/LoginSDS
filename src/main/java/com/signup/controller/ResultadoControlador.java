package com.signup.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.signup.interfaceservice.IresultadoService;
import com.signup.model.Resultados;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping
public class ResultadoControlador {
	
	@Autowired
	private IresultadoService service;
	 private static Logger log = LoggerFactory.getLogger(ResultadoControlador.class);
	
	 @RequestMapping(value= {"/home/74Frac1"}, method=RequestMethod.GET)
	 public String listar3(Model model) {
		 String auxiliar = "";
	  List<Resultados>resultado=service.listar3();
	  int num_registros = resultado.size();
	  log.info(auxiliar);
	  if(resultado.isEmpty()) {
		  model.addAttribute("resultados" , resultado);
			 auxiliar =  "/home/74Frac1";
			
		}else {
			 auxiliar = "error";
			
		}
		return auxiliar;
		
	 }

}
