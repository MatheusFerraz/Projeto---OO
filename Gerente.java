package hotelaria.func;

public class Gerente extends Funcionario {
	
	//Especificando atributos adicionais
	protected double bonusMensal;
	
	//Constructor COM TODOS OS PARÂMETROS
	public Gerente(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, double bonusMensalFuncionario){
		
		//Usando super(...)
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		//Lidando com os atributos adicionais
		this.bonusMensal = bonusMensalFuncionario;
	}

	public double getBonusMensal() {
		return bonusMensal;
	}

	public void setBonusMensal(double bonusMensal) {
		this.bonusMensal = bonusMensal;
	}
	
	//Método mais especializado para cálculo do Salário Bruto de um Gerente
	public double calcularSalarioBruto(){
		double BM = this.bonusMensal;
		double salarioBruto = 4500 + BM;
		this.setSalarioBruto(salarioBruto);
		return salarioBruto;
	}
}
