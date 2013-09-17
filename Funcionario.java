package hotelaria.func;

public class Funcionario {
	
	//Especificando Atributos da Classe Funcionario
	private int cpf;
	private int rg;
	private float salario;
	private String nome;
	private String cargo;
	private String email;
	private String telefone;
	
	//Constructor SEM PARÂMETROS
	public Funcionario() {
		this.cpf = 0;
		this.rg = 0;
		this.salario = 0;
		this.nome = "sem nome";
		this.cargo = "sem cargo";
		this.email = "sem email";
		this.telefone = "sem telefone";
	}

	//Construtor COM 2 PARÂMETROS
	public Funcionario(int cpfFuncionario, int rgFuncionario){
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salario = 0;
		this.nome = "sem nome";
		this.cargo = "sem cargo";
		this.email = "sem email";
		this.telefone = "sem telefone";
	}
	
	//Constructor COM SETE PARÂMETROS
	public Funcionario(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario){
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salario = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
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
	
	//Método que cadastra um funcionario
	public void cadastrarFuncionario(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario){
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salario = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
	}
	
	//Método que exclui um funcionario
	public int excluirFuncionario(){
		int veracidade = 0;
		return veracidade;
	}
}
