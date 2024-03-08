package com.genereation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoints")
public class HelloWorldController {
	
	@GetMapping("hello-world")
	public String helloWorld() {
		return "Brayan diz : Hello World";
	}
	
	@GetMapping("bsms")
	public String bsms() {
		return "-----Lista de BSM’s da Generation Brasil-----"
				+ "<br>🔹Mentalidade de Crescimento"
				+ "<br>🔹Orientação ao Futuro"
				+ "<br>🔹Responsabilidade Pessoal"
				+ "<br>🔹Persistência"
				+ "<br>🔹Trabalho em Equipe"
				+ "<br>🔹Comunicação"
				+ "<br>🔹Proatividade"
				+ "<br>🔹Orientação ao Detalhe";
	}
	
	@GetMapping("objetivos")
	public String objetivosAprendizagem() {
		return "-----Lista contendo os seus objetivos de aprendizagem-----\n"
				+ "<br>🔹Aprender mais sobre Spring Boot"
				+ "<br>🔹Praticar o desenvolvimento de APIs RESTful"
				+ "<br>🔹Entender conceitos avançados de Java"
				+ "<br>🔹Explorar testes unitários em Spring";
	}
}