package hotelaria.func;

public class ConexaoBancoDados {
	
	//Especificando atributos para a Classe
	private static boolean statusConexaoBD;
	
	//Construtor SEM PAR�METROS
	public ConexaoBancoDados(){
		
	}
	
	//M�todos de Acesso e Modifica��o
	public static boolean isStatusConexaoBD() {
		return statusConexaoBD;
	}

	public static void setStatusConexaoBD(boolean statusConexaoBD) {
		ConexaoBancoDados.statusConexaoBD = statusConexaoBD;
	}
}//Fim da Classe ConexaoBancoDados
