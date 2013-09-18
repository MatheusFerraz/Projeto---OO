package hotelaria.func;

public class Cliente {

	//Especificando atributos
	private String nome;
	private int rg;
	private int cpf;
	private String telefone;
	private String email;
	private int entrada;
	private int saida;
	Apartamento apartamento;
	
	//Constructor SEM PARÂMETROS
	public Cliente() 
	{
		this.nome = "Sem nome";
		this.rg = 0;
		this.cpf = 0;
		this.telefone = "sem telefone";
		this.email = "sem email";
		this.entrada = 0;
		this.saida = 0;
	}
	
	//Constructor COM TODOS OS PARÂMETROS
	public Cliente(String nomeHotel, int RG, int CPF, String numTelefone, String emailCliente, int horaEntrada, int horaSaida)
	{
		this.nome = nomeHotel;
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
	public void cadastarCliente(String nomeHotel, int RG, int CPF, String numTelefone, String emailCliente, int horaEntrada, int horaSaida)
	{
		this.nome = nomeHotel;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone = numTelefone;
		this.email = emailCliente;
		this.entrada = horaEntrada;
		this.saida = horaSaida;
	}
	//Método excluirCliente
	public void excluirCliente(String nomeHotel, int RG, int CPF, String numTelefone, String emailCliente, int horaEntrada, int horaSaida)
	{
		this.nome = nomeHotel;
		this.rg = RG;
		this.cpf = CPF;
		this.telefone = numTelefone;
		this.email = emailCliente;
		this.entrada = horaEntrada;
		this.saida = horaSaida;
	}
}
