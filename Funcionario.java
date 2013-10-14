package hotelaria.func;

public class Funcionario {
	
	//Especificando Atributos da Classe Funcionario
	protected int cpf;
	protected int rg;
	protected float salarioBruto;
	protected String nome;
	protected String cargo;
	protected String email;
	protected String telefone;
	protected String endereco;
	protected Hotel hotel;
	
	//Constructor SEM PARÂMETROS
	public Funcionario() {
		this.cpf = 0;
		this.rg = 0;
		this.salarioBruto = 0;
		this.nome = "sem nome";
		this.cargo = "sem cargo";
		this.email = "sem email";
		this.telefone = "sem telefone";
		this.endereco = "sem endereco";
	}
	
	//Constructor COM SETE PARÂMETROS
	public Funcionario(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario){
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salarioBruto = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
		this.endereco = enderecoFuncionario;
	}

	//Métodos de Acesso e Modificação
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	//Método que cadastra um funcionario
	public void cadastrarFuncionario(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario){
		//Esse método não será detalhado no momento
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salarioBruto = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
	}
	
	//Método que exclui um funcionario
	public int excluirFuncionario(){
		//Esse método não será detalhado nesse momento
		int veracidade = 0;
		return veracidade;
	}
	
	//Método para calcular Salario Bruto
	public double calcularSalarioBruto(){
		return this.salarioBruto;
	}
}
