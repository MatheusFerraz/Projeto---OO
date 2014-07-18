package hotelaria.testes;

import static org.junit.Assert.*;
import hotelaria.entidades.Funcionario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FuncionarioTeste {

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando...");
	}

	@Test
	public void testGetCpf() {
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getCpf(), 11111111);
	}


	@Test
	public void testGetRg() {
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getRg(), 2024320);
	}

	@Test
	public void testGetNome() {
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getNome(), "James");
	}
	
	@Test
	public void testGetCargo() {
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getCargo(), "Gerente");
	}

	@Test
	public void testGetEmail() {
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getEmail(), "james@gmail.com");
	}

	@Test
	public void testGetTelefone() {
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getTelefone(), "(62) 3967-2618");
	}
	
	@Test
	public void testGetEndereco(){
		Funcionario func = new Funcionario(11111111, 2024320, 4500, "James", "Gerente", "james@gmail.com", "(62) 3967-2618", "Qd 201 Conj 17 Cs 02");
		assertEquals(func.getEndereco(), "Qd 201 Conj 17 Cs 02");
	}

}
