package hotelaria.func;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Teste JUnit
public class ApartamentoTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetTipo() {
		Apartamento apart = new Apartamento("Suíte Presidencial", 258, "Ocupado");
		assertEquals(apart.getTipo(), "Suíte Presidencial");
	}


	@Test
	public void testGetNumero() {
		Apartamento apart = new Apartamento("Suíte Presidencial", 258, "Ocupado");
		assertEquals(apart.getNumero(), 258);
	}


	@Test
	public void testGetStatus() {
		Apartamento apart = new Apartamento("Suíte Presidencial", 258, "Ocupado");
		assertEquals(apart.getStatus(), "Ocupado");
	}


}
