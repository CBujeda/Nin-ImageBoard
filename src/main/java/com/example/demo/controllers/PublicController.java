package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.entity.Tag;
import com.example.demo.models.service.IPostService;

@Controller
@RequestMapping("/public")
public class PublicController {

	/**
	 * Pre:
	 * Post: Metodo el cual cierra la sesion de un usuario
	 */
	@GetMapping("/index")
	public String index() {
		return "public/logout";
	}
	
	
	
	@GetMapping("/posts")
	public String posts( Model model) {
		/*
		Tag t = new Tag();
		model.addAttribute("tags",t);
		*/
		return "public/posts";
	}
	
	@GetMapping("/prelog")
	public String account_access() {
		return "public/account";
	}
}
