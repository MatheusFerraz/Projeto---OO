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
	
	//Constructor SEM PAR�METROS
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
	
	//Constructor COM SETE PAR�METROS
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

	//M�todos de Acesso e Modifica��o
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

	//M�todo que cadastra um funcionario
	public void cadastrarFuncionario(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario){
		//Esse m�todo n�o ser� detalhado no momento
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salarioBruto = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
	}
	
	//M�todo que exclui um funcionario
	public int excluirFuncionario(){
		//Esse m�todo n�o ser� detalhado nesse momento
		int veracidade = 0;
		return veracidade;
	}
	
	//M�todo para calcular Salario Bruto
	public double calcularSalarioBruto(){
		return this.salarioBruto;
	}
}
