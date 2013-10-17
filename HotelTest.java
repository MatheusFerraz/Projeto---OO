package hotelaria.func;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HotelTest {

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
		Hotel hotel = new Hotel("Monreale", 25678941, 100, "(62) 9647-2584");
		assertEquals(hotel.getNome(), "Monreale");
	}

	@Test
	public void testGetCnpj() {
		Hotel hotel = new Hotel("Monreale", 25678941, 100, "(62) 9647-2584");
		assertEquals(hotel.getCnpj(), 25678941);
	}

	@Test
	public void testGetQndApt() {
		Hotel hotel = new Hotel("Monreale", 25678941, 100, "(62) 9647-2584");
		assertEquals(hotel.getQndApt(), 100);
	}
	
	@Test
	public void testGetTelefone() {
		Hotel hotel = new Hotel("Monreale", 25678941, 100, "(62) 9647-2584");
		assertEquals(hotel.getTelefone(), "(62) 9647-2584");
	}
}
