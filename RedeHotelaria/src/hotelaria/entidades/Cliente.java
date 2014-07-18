package hotelaria.entidades;

public class Cliente {

	private String nome;
	private int rg;
	private int cpf;
	private String telefone;
	private String email;
	private String entrada;
	private String saida;
	Apartamento apartamento;
	
	public Cliente() {
		this.nome = "Sem nome";
		this.rg = 0;
		this.cpf = 0;
		this.telefone = "sem telefone";
		this.email = "sem email";
		this.entrada = "sem entrada";
		this.saida = "sem saida";
	}
	
	public Cliente(String nomeCliente, int RG, int CPF, String numTelefone, String emailCliente){
		this.nome = nomeCliente;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone =numTelefone;
		this.email = emailCliente;
		this.entrada = "sem entrada";
		this.saida = "sem saida";
	}
	
	public Cliente(String nomeCliente, int RG, int CPF, String numTelefone, String emailCliente, String horaEntrada, String horaSaida){
		this.nome = nomeCliente;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone = numTelefone;
		this.email = emailCliente;
		this.entrada = horaEntrada;
		this.saida = horaSaida;
	}
	
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

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	
	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public void cadastarCliente(String nomeCliente, int RG, int CPF, String numTelefone, String emailCliente, String horaEntrada, String horaSaida){
		
		System.out.println("Foi chamado um método de classe (ou static)  Classe ConexaoBancoDados" +  
		"visando conectar o banco para entrada dos dados de cadastro do cliente.");
		ConexaoBancoDados.setStatusConexaoBD(true);
		
		this.nome = nomeCliente;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone = numTelefone;
		this.email = emailCliente;
		this.entrada = horaEntrada;
		this.saida = horaSaida;
	}
	
}
