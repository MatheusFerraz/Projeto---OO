package hotelaria.entidades;

public class Assistente extends Funcionario {
	
	protected String especialidade;
	
	public Assistente(int cpfFuncionario, int rgFuncionario, double salarioFuncionario, String nomeFuncionario, String cargoFuncionario,
			String emailFuncionario, String telefoneFuncionario, String enderecoFuncionario, String especialidadeFuncionario){
		
		super(cpfFuncionario, rgFuncionario, salarioFuncionario, nomeFuncionario, cargoFuncionario, emailFuncionario, telefoneFuncionario,
				enderecoFuncionario);
		
		this.especialidade = especialidadeFuncionario;
	}
	
	public String getEspecialidade(){
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}
	
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
