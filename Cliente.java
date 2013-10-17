package hotelaria.func;

public class Cliente {

	//Especificando atributos
	protected String nome;
	protected int rg;
	protected int cpf;
	protected String telefone;
	protected String email;
	protected int entrada;
	protected int saida;
	Apartamento apartamento;
	
	//Constructor SEM PARÂMETROS
	public Cliente() {
		this.nome = "Sem nome";
		this.rg = 0;
		this.cpf = 0;
		this.telefone = "sem telefone";
		this.email = "sem email";
		this.entrada = 0;
		this.saida = 0;
	}
	
	//Construtor COM QUATRO PARÂMETROS
	public Cliente(String nomeCliente, int RG, int CPF, String numTelefone, String emailCliente){
		this.nome = nomeCliente;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone =numTelefone;
		this.email = emailCliente;
		this.entrada = 0;
		this.saida = 0;
	}
	
	//Constructor COM TODOS OS PARÂMETROS
	public Cliente(String nomeCliente, int RG, int CPF, String numTelefone, String emailCliente, int horaEntrada, int horaSaida){
		this.nome = nomeCliente;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone = numTelefone;
		this.email = emailCliente;
		this.entrada = horaEntrada;
		this.saida = horaSaida;
	}
	
	//Métodos de Acesso e Modificação
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public int getSaida() {
		return saida;
	}

	public void setSaida(int saida) {
		this.saida = saida;
	}
	
	
	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	//Método cadastrarCliente
	public void cadastarCliente(String nomeHotel, int RG, int CPF, String numTelefone, String emailCliente, int horaEntrada, int horaSaida){
		
		//Dependência entre Cliente e ConexaoBancoDados
		System.out.println("Foi chamado um método de classe (ou static)  Classe ConexaoBancoDados" +
		"visando conectar o banco para entrada dos dados de cadastro do cliente.");
		ConexaoBancoDados.setStatusConexaoBD(true);//Chamada do método diretamente pelo nome da Classe
		
		this.nome = nomeHotel;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone = numTelefone;
		this.email = emailCliente;
		this.entrada = horaEntrada;
		this.saida = horaSaida;
	}
	
}
