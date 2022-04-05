package com.example.demo;

import com.example.demo.Content.Content;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class AbyssalCartelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbyssalCartelApplication.class, args);
	}

	@GetMapping
	public List<Content> Abyss(){
		return null;
	}
}
