package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

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
		
		long count_posts = postService.getCountPosts();
		String count_posts_str = count_posts+"";
		List<String> l_count = new ArrayList<String>();
		for(int i = 0; i < count_posts_str.length();i++) {
			String num = "/img/counter/" + count_posts_str.substring(i,i+1)+".gif";
			l_count.add(num);
		}
		model.addAttribute("img_counter",l_count);
		model.addAttribute("count_post",count_posts);
		return "public/main";
	}
	

	
}
