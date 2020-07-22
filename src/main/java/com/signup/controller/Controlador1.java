package com.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.signup.interfaceservice.IrolesService;
import com.signup.model.Role;

@Controller
@RequestMapping
public class Controlador1 {
	
	@Autowired
	private IrolesService service;
	
	@GetMapping("/Listar")
	public String Listar(Model model) {
		List<Role>roles= service.Listar();
		model.addAttribute("roles", roles);
		return "index";	 
	}
	
	

}
