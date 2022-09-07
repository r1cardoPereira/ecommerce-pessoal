package com.br.ricardocorps.lojavirtual.models;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTestes {

	/**
	 * 
	 */
	@Test
	void testProdutos() {
		
		
		Produto produto  = new Produto();
		produto.setCodigo("001");
		produto.setDescricao("pc");
		produto.setValor("1.500");

		assertEquals(001, produto.getCodigo());
		assertEquals("pc", produto.getDescricao());
		assertEquals( 1.500 , produto.getValor());


		
	}

	

}