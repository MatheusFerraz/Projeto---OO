package hotelaria.entidades;

public class Funcionario extends ServidorPrivado {
	
	protected int cpf;
	protected int rg;
	protected double salarioBruto;
	protected String nome;
	protected String cargo;
	protected String email;
	protected String telefone;
	protected String endereco;
	protected Hotel hotel;
	
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
	
	public Funcionario(int cpfFuncionario, int rgFuncionario, double salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario){
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salarioBruto = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
		this.endereco = enderecoFuncionario;
	}

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

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
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
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void cadastrarFuncionario(int cpfFuncionario, int rgFuncionario, double salarioFuncionario, String nomeFuncionario, String cargoFuncionario, String emailFuncionario, String telefoneFuncionario){
		
		System.out.println("Foi chamado um método de classe (ou static)  Classe ConexaoBancoDados" +
		"visando conectar o banco para entrada dos dados de cadastro do funcionário.");
		ConexaoBancoDados.setStatusConexaoBD(true);
		
		this.cpf = cpfFuncionario;
		this.rg = rgFuncionario;
		this.salarioBruto = salarioFuncionario;
		this.nome = nomeFuncionario;
		this.cargo = cargoFuncionario;
		this.email = emailFuncionario;
		this.telefone = telefoneFuncionario;
	}
	
	public double calcularSalarioBruto(){
		return this.salarioBruto;
	}
	
}
