package hotelaria.func;

public class ConexaoBancoDados {
	
	//Especificando atributos para a Classe
	private static boolean statusConexaoBD;
	
	//Construtor SEM PARÂMETROS
	public ConexaoBancoDados(){
		
	}
	
	//Métodos de Acesso e Modificação
	public static boolean isStatusConexaoBD() {
		return statusConexaoBD;
	}

	public static void setStatusConexaoBD(boolean statusConexaoBD) {
		ConexaoBancoDados.statusConexaoBD = statusConexaoBD;
	}
}//Fim da Classe ConexaoBancoDados
