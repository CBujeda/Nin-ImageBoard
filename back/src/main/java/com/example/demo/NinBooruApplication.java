package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NinBooruApplication {

	public static void main(String[] args) {
		ConfigBooru.booru();
		SpringApplication.run(NinBooruApplication.class, args);
	}

}
