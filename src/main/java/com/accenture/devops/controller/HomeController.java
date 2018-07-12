package com.accenture.devops.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String homePage(Model model) {
		return "home";
	}
	
	@GetMapping("/{name}")
	public String getName(Model model, @PathParam("name") String name) {
		model.addAttribute("name", name);
		return"name";
	}
	

}
