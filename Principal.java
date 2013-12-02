package hotelaria.func;

public class Principal {

	public static void main(String[] args) {
		
		/**Testando a Dependência entre Apartamento e ConexaoBancoDados*/
		
		/*Instanciando um objeto da classe Apartamento
		Apartamento apart = new Apartamento();
		
		//Chamando método para cadastrar Apartamento
		apart.cadastrarApt("Suíde Presidencial", 258, 0);*/
		
		/**Testando a Dependência entre Cliente e ConexaoBancoDados*/
		
		/*Instanciando um objeto da classe Cliente
		Cliente cliente = new Cliente();
		
		//Chamando o método para cadastrar Cliente
		cliente.cadastarCliente("Jorge Nogueira Santos", 111111, 222222, "(62) 3966 - 2030", "jorgenogueira@gmail.com", "12:30", "22:00");*/
		
		/**Testando a Dependência entre Funcionario e ConexaoBancoDados*/
		
		/*Instanciando um objeto da classe Funcionario
		Funcionario func = new Funcionario();
		
		//Chamando o método para cadastrar Funcionario
		func.cadastrarFuncionario(111111, 222222, 600, "André Soares", "Assistente Geral", "andre.soares@gmail.com", "(61) 8965 - 2514");*/
		
		/**Testando a herança para a classe Camareira*/
		
		/*Instanciando um objeto da classe Camareira
		Camareira camareira = new Camareira(222222,111111,600,"Hilda Arantes Silva","Camareira","hilda.silva@gmail.com","(61) 8514 - 1312","Rua Rainha das Flores Nº 1456",100,5,5);
		
		//Declarando variáveis para receber os valores de retorno
		String nomeCamareira = camareira.getNome();
		String telCamareira = camareira.getTelefone();
		
		//Apresentando resultados
		System.out.println("O nome da funcionária é: " + nomeCamareira);
		System.out.println("O telefone da funcionária é: " + telCamareira);*/
		
		/**Testando a herança para a classe Assistente*/
		
		/*Instanciando um objeto da classe Assistente
		Assistente assistente = new Assistente(222222,111111,800,"Licurgo Almeida Reis","Assistente","licurgo.reis@gmail.com","(61) 8529 - 0000","Rua Rei da Sucata Nº 1444","Geral");
		
		//Declarando variáveis para receber os valores de retorno
		String emailAssistente = assistente.getEmail();
		String enderecoAssistente = assistente.getEndereco();
		
		//Apresentando resultados
		System.out.println("O email do assistente é: " + emailAssistente);
		System.out.println("O endereco do assistente é: " + enderecoAssistente);*/
		
		/**Testando a herança para a classe Gerente*/
		
		/*Instanciando um objeto da classe Gerente
		Gerente gerente = new Gerente(222222,111111,4500,"Arnaldo Ximenes Ferraz","Gerente","arnaldo.ferraz@gmail.com","(61) 8307 - 2900","Rua Duque de Caxias Nº 569",1500);
		
		//Declarando variáveis para receber os valores de retorno
		String nomeGerente = gerente.getNome();
		String telGerente = gerente.getTelefone();
		
		//Apresentando resultados
		System.out.println("O nome do gerente é: " + nomeGerente);
		System.out.println("O telefone do gerente é: " + telGerente);*/
		
		/**Testando a primeira situação de polimorfismo*/
		
		/*Declarando um Funcionario
		Funcionario funcionario;
		
		//Instanciando um objeto da Classe Assitente
		Assistente assistente = new Assistente(111111, 5269846, 850, "Alberto", "Assistente", "alberto@gmail.com", "(61) 1234-5678", "Qd 201 Conj 17 Cs 02", "Auxiliar Geral");
		
		//Realizando um upcasting
		funcionario = assistente;
		
		//Variável para armazenar o valor do salário bruto
		double salarioBrutoF = funcionario.calcularSalarioBruto();
		
		//Informando os valores
		System.out.println("\nO salario bruto desse funcionario é igual a: ");
		System.out.print(salarioBrutoF);*/
		
		
		/**Testando a segunda situação de polimorfismo*/
		
		/*Declarando um Funcionario
		Funcionario funcionario;
		
		//Instanciando um objeto da Classe Camareira
		Camareira camareira = new Camareira(111111, 5269846, 400, "Sandra", "Camareira", "sandra@gmail.com", "(61) 1234-5678", "Qd 201 Conj 17 Cs 02", 200, 10, 12);
		
		//Realizando um upcasting
		funcionario = camareira;
		
		//Variável para armazenar o valor do salário bruto
		double salarioBrutoF = funcionario.calcularSalarioBruto();
		
		//Informando os valores
		System.out.println("\nO salario bruto desse funcionario é igual a: ");
		System.out.print(salarioBrutoF);*/
		
		
		/**Testando a terceira situação de polimorfismo*/
		
		/*Declarando um Funcionario
		Funcionario funcionario;
		
		//Instanciando um objeto da Classe Gerente
	    Gerente gerente = new Gerente(111111, 5269846, 4500, "George", "Gerente", "george@gmail.com", "(61) 1234-5678", "Qd 201 Conj 17 Cs 02", 500);
		
		//Realizando um upcasting
		funcionario = gerente;
		
		//Variável para armazenar o valor do salário bruto
		double salarioBrutoF = funcionario.calcularSalarioBruto();
		
		//Informando os valores
		System.out.println("\nO salario bruto desse funcionario é igual a: ");
		System.out.print(salarioBrutoF);*/
		
		/**Testando a implementação da interface na classe Gerente*/
		
		/*Instanciando um objeto da Classe Gerente
		Gerente gerent = new Gerente(11111111, 3095252, 4500, "Jorge", "Gerente", "jorge@gmail.com", "(61) 3333-1919", "QD 201 CONJ 17 CS 02", 500);
		
		//Chamada do método para postarMensagem
		String[] funcionarios = {"Amélia", "James", "Cormane", "Gustavo", "Carlos", "Janice", "Pedro"};
		gerent.postarMensagem("Preciso que você compareça a sala de reunião.", funcionarios);
		
		//Chamada do método para postarInformativoDoHotel
		String[] funcionarios2 = {"Amélia", "James", "Cormane", "Gustavo", "Carlos", "Janice", "Pedro", "Carmelo", "Ovanda", "Aurenice", "Gisele"};
		gerent.postarInformativoDoHotel("Durante esse mês de Novembro, haverá diversas palestras sobre hospitalidade para melhoria dos nossos serviços. Não perca a oportunidade! Sejam os melhores.",funcionarios2);*/	
	}
}
	
