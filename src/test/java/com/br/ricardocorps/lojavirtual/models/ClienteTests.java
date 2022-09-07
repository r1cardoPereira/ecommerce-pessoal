package com.br.ricardocorps.lojavirtual.models;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClienteTests {

	/**
	 * 
	 */
	@Test
	void testClientes() {
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("RIcardo");
		cliente.setEmail("ricardo@teste.com");
		cliente.setTelefone("11951926421");

		assertEquals("RICARDO", cliente.getNome());
		assertEquals("ricardo@teste.com", cliente.getEmail());
		assertEquals( "11951926421" , cliente.getTelefone());


		
	}

	

}