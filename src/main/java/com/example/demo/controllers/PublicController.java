package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String posts() {
		return "public/posts";
	}
	
	@GetMapping("/prelog")
	public String account_access() {
		return "public/account";
	}
}
