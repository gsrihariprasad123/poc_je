package com.nisum.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.nisum.cfg", "com.nisum.cfg", "com.nisum.controller", "com.nisum.dao",
		"com.nisum.model","com.nisum.service" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
