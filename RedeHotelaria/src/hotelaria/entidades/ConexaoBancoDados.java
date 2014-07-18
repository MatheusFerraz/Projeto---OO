package hotelaria.entidades;

public class ConexaoBancoDados {
	
	private static boolean statusConexaoBD;
	
	public ConexaoBancoDados(){
		
	}
	
	public static boolean isStatusConexaoBD() {
		return statusConexaoBD;
	}

	public static void setStatusConexaoBD(boolean statusConexaoBD) {
		ConexaoBancoDados.statusConexaoBD = statusConexaoBD;
	}
}
