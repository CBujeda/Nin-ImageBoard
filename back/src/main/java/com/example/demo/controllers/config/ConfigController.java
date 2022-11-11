package com.example.demo.controllers.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.entity.Config;
import com.example.demo.models.impl.ConfigServiceImpl;

@Controller
public class ConfigController {
	
	@Autowired
	 private ConfigServiceImpl config; 

	public boolean configExistsZero() {
		if(config.getCountConfig() == 0) {return false;
		}else {return true;}
	}
	
	 public boolean configExists() {
			if(config.getCountConfig() == 0) {
				generateConfig();
				return false;
			}else {
				return true;
			}
	 }
	 
	 public void generateConfig() {
		 String[][] data = {
				 {"name","ImageBoard"},
				 {"api","false"},
				 {"api-license","true"},
				 {"db-file-url","."}
				 };

		 for(int i = 0; i < data.length;i++) {
			 System.out.println(data.length);
			 Config conf = new Config(null, data[i][0],data[i][1]);
			 config.saveNewConfig(conf);
		 }
		  
	 }
	 
	 
	 public void getWebName() {
		 
	 }
	 /*
		@GetMapping("/web/imagebooard/config")
		public String config(Model model) {
			if(configExistsZero() == false) {
				if() {
					return "config/iniConfig";
				}
			}
			return "redirect:/";
		}
	  */
}
