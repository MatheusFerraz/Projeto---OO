package hotelaria.func;


public class Principal {

	public static void main(String[] args) {
		
		
		//Op��o que estar� dispon�vel mais a frente
		/*Scanner input = new Scanner(System.in);

		int escolha;
		
		System.out.println("Bem-vindo ao gerenciador de Hotel");
		System.out.println("Escolha um op��o abaixo");
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
		}*/
		
		
		//Testando a Depend�ncia entre Apartamento e ConexaoBancoDados
		
		/*Instanciando um objeto da classe Apartamento
		Apartamento apart = new Apartamento();
		
		//Chamando m�todo para cadastrar Apartamento
		apart.cadastrarApt("Su�de Presidencial", 258, 0);*/

		
		/*Testando a primeira situa��o de polimorfismo
		
		//Declarando um Funcionario
		Funcionario funcionario;
		
		//Instanciando um objeto da Classe Assitente
		Assistente assistente = new Assistente(111111, 5269846, 850, "Alberto", "Assistente", "alberto@gmail.com", "(61) 1234-5678", "Qd 201 Conj 17 Cs 02", "Auxiliar Geral");
		
		//Realizando um upcasting
		funcionario = assistente;
		
		//Vari�vel para armazenar o valor do sal�rio bruto
		double salarioBrutoF = funcionario.calcularSalarioBruto();
		
		//Informando os valores
		System.out.println("\nO salario bruto desse funcionario � igual a: ");
		System.out.print(salarioBrutoF);*/
		
		
		/*Testando a segunda situa��o de polimorfismo
		
		//Declarando um Funcionario
		Funcionario funcionario;
		
		//Instanciando um objeto da Classe Camareira
		Camareira camareira = new Camareira(111111, 5269846, 400, "Sandra", "Camareira", "sandra@gmail.com", "(61) 1234-5678", "Qd 201 Conj 17 Cs 02", 200, 10, 12);
		
		//Realizando um upcasting
		funcionario = camareira;
		
		//Vari�vel para armazenar o valor do sal�rio bruto
		double salarioBrutoF = funcionario.calcularSalarioBruto();
		
		//Informando os valores
		System.out.println("\nO salario bruto desse funcionario � igual a: ");
		System.out.print(salarioBrutoF);*/
		
		
		/*Testando a terceira situa��o de polimorfismo
		
		//Declarando um Funcionario
		Funcionario funcionario;
		
		//Instanciando um objeto da Classe Gerente
	    Gerente gerente = new Gerente(111111, 5269846, 4500, "George", "Gerente", "george@gmail.com", "(61) 1234-5678", "Qd 201 Conj 17 Cs 02", 500);
		
		//Realizando um upcasting
		funcionario = gerente;
		
		//Vari�vel para armazenar o valor do sal�rio bruto
		double salarioBrutoF = funcionario.calcularSalarioBruto();
		
		//Informando os valores
		System.out.println("\nO salario bruto desse funcionario � igual a: ");
		System.out.print(salarioBrutoF);*/
		
		
	}
}
	
