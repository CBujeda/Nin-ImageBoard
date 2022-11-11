package com.example.demo;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Intern {
	public static void log(String acction) {log(acction,"INFO");}
	public static void log(String acction, String type) {
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();
	   String info = "[ "+dtf.format(now) + " ]" + " - " + "("+type+")"+" -> " + acction +"\n";
		writter("log.txt",info);

	}
	
	public static void writter(String filePath,String data) {
		try{
            FileWriter fw = new FileWriter(filePath, true);    
            fw.write(data);
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
	}
}
