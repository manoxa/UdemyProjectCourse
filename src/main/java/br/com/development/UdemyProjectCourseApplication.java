package br.com.development;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.development.utils.SenhaUtils;

@SpringBootApplication
public class UdemyProjectCourseApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPagina;
	
	public static void main(String[] args) {
		SpringApplication.run(UdemyProjectCourseApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("### Quantidade de elementos por pagina: " + this.qtdPagina + " ###\n");
			
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded: " + senhaEncoded + "\n");
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded novamente: " + senhaEncoded + "\n");
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded) + "\n");
		};
	}
	
}
