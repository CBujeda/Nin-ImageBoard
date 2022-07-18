package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.service.IPostService;

@Controller
public class InicioController {

	@Autowired
	IPostService postService;
	
	@GetMapping("/")
	public String inicio(Model model) {
		long count_post = postService.getCountPosts();
		model.addAttribute("count_post","" + count_post);
		return "public/main";
	}
	

	
}
