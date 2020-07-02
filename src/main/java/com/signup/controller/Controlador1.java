package com.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/74Frac1")
	public String Listar2(Model model) {
		List<Role>roles= service.Listar();
		model.addAttribute("roles", roles);
		return "74Frac1";	 
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("roles",new Role());
		return "formulario";
	}
	
	@PostMapping("/save")
	public String  save(@Validated Role r, Model model) {
		service.save(r);
		return "redirect:/Listar";	
		}

}
