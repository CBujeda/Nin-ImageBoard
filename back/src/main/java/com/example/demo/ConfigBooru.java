package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

public class ConfigBooru {
	
	private static final String booruVersion = "0.0.1";

	
	public static void booru() {
		logo();		
		config();
		Intern.log(">-----------------<");
		Intern.log("Imageboard iniciado");
	}
	
	public static void config() {
		System.out.println("Configurando Springboot");
		System.setProperty( "spring.devtools.restart.enabled" , "true" );
	}
	
	public static void logo() {
		System.out.println(
				  "╭━╮╱╭╮╱╱╱╭━━╮\r\n"
				+ "┃┃╰╮┃┃╱╱╱┃╭╮┃\r\n"
				+ "┃╭╮╰╯┣┳━╮┃╰╯╰┳━━┳━━┳━┳╮╭╮\r\n"
				+ "┃┃╰╮┃┣┫╭╮┫╭━╮┃╭╮┃╭╮┃╭┫┃┃┃\r\n"
				+ "┃┃╱┃┃┃┃┃┃┃╰━╯┃╰╯┃╰╯┃┃┃╰╯┃\r\n"
				+ "╰╯╱╰━┻┻╯╰┻━━━┻━━┻━━┻╯╰━━╯");
		System.out.println(" :: NinBooru ::                (v"+booruVersion+")");
	}
	

}
