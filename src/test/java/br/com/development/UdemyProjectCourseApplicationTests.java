package br.com.development;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UdemyProjectCourseApplicationTests {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPaginas;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCarregaContextoDeTeste() {
		assertEquals(100, qtdPorPaginas);
	}

}
