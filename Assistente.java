package hotelaria.func;

public class Assistente extends Funcionario {
	
	//Especificando atributos adicionais
	protected String especialidade;
	
	//Constructor COM TODOS OS PARÂMETROS
	public Assistente(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, String especialidadeFuncionario){
		
		//Usando super(...)
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		//Lidando com os atributos adicionais
		this.especialidade = especialidadeFuncionario;
	}
	
	public String getEspecialidade(){
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}
	
	//Método mais especializado para o cálculo do Salário Bruto de um assistente
	public double calcularSalarioBruto(){
		if(this.especialidade == "Auxiliar Geral"){
			this.setSalarioBruto(850);
			return 850;
		}
		else{
			this.setSalarioBruto(600);
			return 600;
		}
	}
}
