package com.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.signup.dao.IEstatusDAO;
import com.signup.entity.Estatus;

@Controller
@RequestMapping
public class EstatusController {

	@Autowired
	private IEstatusDAO estatusDAO;
	
	@GetMapping("/estatus/{id_estatus}")
	public String bucarporId(@PathVariable("id_estatus") Integer id_estatus, Model model) {
		Estatus e = estatusDAO.getOne(id_estatus); 
		model.addAttribute("estatu", e);
		return "timelineEstaus";
	}
}
