package hotelaria.func;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int escolha;
		
		System.out.println("Bem-vindo ao gerenciador de Hotel");
		System.out.println("Escolha um opção abaixo");
		System.out.println("1-Cadastrar Novo Hotel.\n2-Cadastrar Funcionario.\n3-Cadastrar Apartamento.\n4-Cadastrar Cliente.\n");
		
		escolha = input.nextInt();
		
		switch(escolha){
		case 1:
			Hotel myHotel = new Hotel();
			myHotel.cadastrarHotel();
			System.out.println(myHotel.getNome());
			break;
		case 2:
			break;
		case 3:
			break;	
		case 4:
			break;
		default:
			break;
		}
	}
}
	
