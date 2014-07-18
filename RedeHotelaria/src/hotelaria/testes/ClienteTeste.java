package hotelaria.testes;

import static org.junit.Assert.*;
import hotelaria.entidades.Cliente;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteTeste {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetNome() {
		Cliente client = new Cliente("Jorge", 3095252, 11111111, "(61) 3964-9628", "jorge@gmail.com");
		assertEquals(client.getNome(), "Jorge");
	}


	@Test
	public void testGetRg() {
		Cliente client = new Cliente("Jorge", 3095252, 11111111, "(61) 3964-9628", "jorge@gmail.com");
		assertEquals(client.getRg(), 3095252);
	}

	@Test
	public void testGetCpf() {
		Cliente client = new Cliente("Jorge", 3095252, 11111111, "(61) 3964-9628", "jorge@gmail.com");
		assertEquals(client.getCpf(), 11111111);
	}


	@Test
	public void testGetTelefone() {
		Cliente client = new Cliente("Jorge", 3095252, 11111111, "(61) 3964-9628", "jorge@gmail.com");
		assertEquals(client.getTelefone(), "(61) 3964-9628");
	}


	@Test
	public void testGetEmail() {
		Cliente client = new Cliente("Jorge", 3095252, 11111111, "(61) 3964-9628", "jorge@gmail.com");
		assertEquals(client.getEmail(), "jorge@gmail.com");
	}

}
