package hotelaria.func;

public class Gerente extends Funcionario implements ComunicacaoSup {
	
	//Especificando atributos adicionais
	protected int bonusMensal;
	
	//Construtor vazio
	public Gerente(){
	}
	
	//Constructor COM TODOS OS PARÂMETROS
	public Gerente(int cpfFuncionario, int rgFuncionario, float salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, int bonusMensalFuncionario){
		
		//Usando super(...)
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		//Lidando com os atributos adicionais
		this.bonusMensal = bonusMensalFuncionario;
	}

	public int getBonusMensal() {
		return bonusMensal;
	}

	public void setBonusMensal(int bonusMensal) {
		this.bonusMensal = bonusMensal;
	}
	
	//Método mais especializado para cálculo do Salário Bruto de um Gerente
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
}//Fim da Classe Gerente
