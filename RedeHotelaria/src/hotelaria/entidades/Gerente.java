package hotelaria.entidades;

public class Gerente extends Funcionario implements ComunicacaoSup {
	
	protected int bonusMensal;
	
	public Gerente(){
	}
	
	public Gerente(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, int bonusMensalFuncionario){
		
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		this.bonusMensal = bonusMensalFuncionario;
	}

	public int getBonusMensal() {
		return bonusMensal;
	}

	public void setBonusMensal(int bonusMensal) {
		this.bonusMensal = bonusMensal;
	}
	
	public double calcularSalarioBruto(){
		double BM = this.bonusMensal;
		double salarioBruto = 4500 + BM;
		this.setSalarioBruto(salarioBruto);
		return salarioBruto;
	}

	@Override
	public void postarMensagem(String mensagem, String[] contatos) {
		Mensagem msg = new Mensagem();
		msg.postarMen(mensagem,this.nome,contatos);
	}

	@Override
	public void postarInformativoDoHotel(String informativoDoHotel,
			String[] contatos) {
		Mensagem msg2 = new Mensagem();
		msg2.postarInfo(informativoDoHotel, this.nome, contatos);
		
	}
	
}
