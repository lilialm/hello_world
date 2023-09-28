package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/gen-bsm")
	public String genBSM() {
		return "Orientação ao futuro, Responsabilidade pessoal, Mentalidade de crescimento, Persistência, Trabalho em Equipe, Atenção aos detalhes, Proatividade e Comunicação.";
	}
	
	@GetMapping("/objetivos")
	public String objetivosDeAprendizagem() {
		return "Melhorar minha comunicação e trabalho em equipe";
	}

}
