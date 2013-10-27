package hotelaria.func;

public class Gerente extends Funcionario implements ComunicacaoSup {
	
	//Especificando atributos adicionais
	protected double bonusMensal;
	
	//Construtor vazio
	public Gerente(){
	}
	
	//Constructor COM TODOS OS PAR�METROS
	public Gerente(double cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
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
	
	//M�todo mais especializado para c�lculo do Sal�rio Bruto de um Gerente
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
