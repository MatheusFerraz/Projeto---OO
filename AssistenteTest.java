package hotelaria.func;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssistenteTest {

	public AssistenteTest() {
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
	public void testGetEspecialidade() {
		Assistente assistente = new Assistente(222222,111111,800,"Licurgo Almeida Reis","Assistente","licurgo.reis@gmail.com","(61) 8529 - 0000","Rua Rei da Sucata Nº 1444","Auxiliar Geral");
		assertEquals(assistente.getEspecialidade(),"Auxiliar Geral");
	} 

}
