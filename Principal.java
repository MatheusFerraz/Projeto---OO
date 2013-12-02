package hotelaria.func;

public class Principal {

	public static void main(String[] args) {
		
		/**Testando a Depend�ncia entre Apartamento e ConexaoBancoDados*/
		
		/*Instanciando um objeto da classe Apartamento
		Apartamento apart = new Apartamento();
		
		//Chamando m�todo para cadastrar Apartamento
		apart.cadastrarApt("Su�de Presidencial", 258, 0);*/
		
		/**Testando a Depend�ncia entre Cliente e ConexaoBancoDados*/
		
		/*Instanciando um objeto da classe Cliente
		Cliente cliente = new Cliente();
		
		//Chamando o m�todo para cadastrar Cliente
		cliente.cadastarCliente("Jorge Nogueira Santos", 111111, 222222, "(62) 3966 - 2030", "jorgenogueira@gmail.com", "12:30", "22:00");*/
		
		/**Testando a Depend�ncia entre Funcionario e ConexaoBancoDados*/
		
		/*Instanciando um objeto da classe Funcionario
		Funcionario func = new Funcionario();
		
		//Chamando o m�todo para cadastrar Funcionario
		func.cadastrarFuncionario(111111, 222222, 600, "Andr� Soares", "Assistente Geral", "andre.soares@gmail.com", "(61) 8965 - 2514");*/
		
		/**Testando a heran�a para a classe Camareira*/
		
		/*Instanciando um objeto da classe Camareira
		Camareira camareira = new Camareira(222222,111111,600,"Hilda Arantes Silva","Camareira","hilda.silva@gmail.com","(61) 8514 - 1312","Rua Rainha das Flores N� 1456",100,5,5);
		
		//Declarando vari�veis para receber os valores de retorno
		String nomeCamareira = camareira.getNome();
		String telCamareira = camareira.getTelefone();
		
		//Apresentando resultados
		System.out.println("O nome da funcion�ria �: " + nomeCamareira);
		System.out.println("O telefone da funcion�ria �: " + telCamareira);*/
		
		/**Testando a heran�a para a classe Assistente*/
		
		/*Instanciando um objeto da classe Assistente
		Assistente assistente = new Assistente(222222,111111,800,"Licurgo Almeida Reis","Assistente","licurgo.reis@gmail.com","(61) 8529 - 0000","Rua Rei da Sucata N� 1444","Geral");
		
		//Declarando vari�veis para receber os valores de retorno
		String emailAssistente = assistente.getEmail();
		String enderecoAssistente = assistente.getEndereco();
		
		//Apresentando resultados
		System.out.println("O email do assistente �: " + emailAssistente);
		System.out.println("O endereco do assistente �: " + enderecoAssistente);*/
		
		/**Testando a heran�a para a classe Gerente*/
		
		/*Instanciando um objeto da classe Gerente
		Gerente gerente = new Gerente(222222,111111,4500,"Arnaldo Ximenes Ferraz","Gerente","arnaldo.ferraz@gmail.com","(61) 8307 - 2900","Rua Duque de Caxias N� 569",1500);
		
		//Declarando vari�veis para receber os valores de retorno
		String nomeGerente = gerente.getNome();
		String telGerente = gerente.getTelefone();
		
		//Apresentando resultados
		System.out.println("O nome do gerente �: " + nomeGerente);
		System.out.println("O telefone do gerente �: " + telGerente);*/
		
		/**Testando a primeira situa��o de polimorfismo*/
		
		/*Declarando um Funcionario
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
		
		
		/**Testando a segunda situa��o de polimorfismo*/
		
		/*Declarando um Funcionario
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
		
		
		/**Testando a terceira situa��o de polimorfismo*/
		
		/*Declarando um Funcionario
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
		
		/**Testando a implementa��o da interface na classe Gerente*/
		
		/*Instanciando um objeto da Classe Gerente
		Gerente gerent = new Gerente(11111111, 3095252, 4500, "Jorge", "Gerente", "jorge@gmail.com", "(61) 3333-1919", "QD 201 CONJ 17 CS 02", 500);
		
		//Chamada do m�todo para postarMensagem
		String[] funcionarios = {"Am�lia", "James", "Cormane", "Gustavo", "Carlos", "Janice", "Pedro"};
		gerent.postarMensagem("Preciso que voc� compare�a a sala de reuni�o.", funcionarios);
		
		//Chamada do m�todo para postarInformativoDoHotel
		String[] funcionarios2 = {"Am�lia", "James", "Cormane", "Gustavo", "Carlos", "Janice", "Pedro", "Carmelo", "Ovanda", "Aurenice", "Gisele"};
		gerent.postarInformativoDoHotel("Durante esse m�s de Novembro, haver� diversas palestras sobre hospitalidade para melhoria dos nossos servi�os. N�o perca a oportunidade! Sejam os melhores.",funcionarios2);*/	
	}
}
	
