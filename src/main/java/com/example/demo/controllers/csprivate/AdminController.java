package com.example.demo.controllers.csprivate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.service.IUsuarioService;

@Controller
@RequestMapping("/private")
public class AdminController {
	
	private HttpSession session(Authentication auth, HttpSession session) {
		String username = auth.getName();
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		
		}
		return session;
	}
	
	
	@Autowired
	private IUsuarioService usuarioService;

	
	@GetMapping("/profile/admin")
	public String admin(Authentication auth, HttpSession session,Model model) {
		session = session(auth,session);
		
		String username = auth.getName();
		Usuario usuario = null;
		if(session.getAttribute("usuario") != null) {
			usuario = usuarioService.findByUsername(username);
			int ul = usuario.getRol();
			if(ul == 5) {
				model.addAttribute("userlevel","lu5");
				return "private/admin/adminPanel";
			}
		}

		return "errors/error-denegated";
	}
		
}
