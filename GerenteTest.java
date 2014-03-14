package hotelaria.func;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Teste JUnit
public class GerenteTest {

	public GerenteTest() {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetBonusMensal() {
		Gerente gerente = new Gerente(222222,111111,4500,"Arnaldo Ximenes Ferraz","Gerente","arnaldo.ferraz@gmail.com","(61) 8307 - 2900","Rua Duque de Caxias Nº 569",1500);
		assertEquals(gerente.getBonusMensal(),1500);
	}

}
