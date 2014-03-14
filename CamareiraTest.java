package hotelaria.func;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Teste JUnit
public class CamareiraTest {

	public CamareiraTest() {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetGratificacao() {
		Camareira camareira = new Camareira(222222,111111,600,"Hilda Arantes Silva","Camareira","hilda.silva@gmail.com","(61) 8514 - 1312","Rua Rainha das Flores Nº 1456",100,5,5);
		assertEquals(camareira.getGratificacao(),100);
	}
	
	@Test
	public void testGetHoraExtra() {
		Camareira camareira = new Camareira(222222,111111,600,"Hilda Arantes Silva","Camareira","hilda.silva@gmail.com","(61) 8514 - 1312","Rua Rainha das Flores Nº 1456",100,5,5);
		assertEquals(camareira.getHoraExtra(),5);
	}
	
	@Test
	public void testGetValorHoraExtra() {
		Camareira camareira = new Camareira(222222,111111,600,"Hilda Arantes Silva","Camareira","hilda.silva@gmail.com","(61) 8514 - 1312","Rua Rainha das Flores Nº 1456",100,5,5);
		assertEquals(camareira.getValorHoraExtra(),5);
	}
}
