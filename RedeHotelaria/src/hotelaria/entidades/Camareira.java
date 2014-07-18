package hotelaria.entidades;

public class Camareira extends Funcionario {
	
	protected int gratificacao;
	protected int horaExtra;
	protected int valorHoraExtra;
	
	public Camareira(int cpfFuncionario, int rgFuncionario, double salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, int gratificacaoFuncionario,
			int horaExtraFuncionario, int valorHoraExtraFuncionario){
	
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		this.gratificacao = gratificacaoFuncionario;
		this.horaExtra = horaExtraFuncionario;
		this.valorHoraExtra = valorHoraExtraFuncionario;
	}

	public int getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(int gratificacao) {
		this.gratificacao = gratificacao;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	
	public int getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(int valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}

	public double calcularSalarioBruto(){
		double gratificacao = this.gratificacao;
		double horaExtra = this.horaExtra;
		double valorHoraExtra = this.valorHoraExtra;
		double salarioBruto = 400 + horaExtra*valorHoraExtra + gratificacao;
		this.setSalarioBruto(salarioBruto);
		return salarioBruto;
	}
	
}
