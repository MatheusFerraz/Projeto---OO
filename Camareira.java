package hotelaria.func;

public class Camareira extends Funcionario {
	
	//Especificando atributos adicionais
	protected double gratificacao;
	protected int horaExtra;
	
	//Constructor COM TODOS OS PARÂMETROS
	public Camareira(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, double gratificacaoFuncionario,
			int horaExtraFuncionario){
	
		//Usando o super(...)
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		//Lidando com os atributos adicionais
		this.gratificacao = gratificacaoFuncionario;
		this.horaExtra = horaExtraFuncionario;
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
}
