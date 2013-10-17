package hotelaria.func;

import java.sql.Time;
import java.util.Date;

public class ConexaoBancoDados {
	
	//Especificando atributos para a Classe
	private static String tipoConexaoBD;
	private static Date dataConexaoBD;
	private static Time tempoConexaoBD;
	private static boolean statusConexaoBD;
	
	//Construtor SEM PARÂMETROS
	public ConexaoBancoDados(){
		
	}
	
	//Métodos de Acesso e Modificação

	public static String getTipoConexaoBD() {
		return tipoConexaoBD;
	}

	public static void setTipoConexaoBD(String tipoConexaoBD) {
		ConexaoBancoDados.tipoConexaoBD = tipoConexaoBD;
	}

	public static Date getDataConexaoBD() {
		return dataConexaoBD;
	}

	public static void setDataConexaoBD(Date dataConexaoBD) {
		ConexaoBancoDados.dataConexaoBD = dataConexaoBD;
	}

	public static Time getTempoConexaoBD() {
		return tempoConexaoBD;
	}

	public static void setTempoConexaoBD(Time tempoConexaoBD) {
		ConexaoBancoDados.tempoConexaoBD = tempoConexaoBD;
	}

	public static boolean isStatusConexaoBD() {
		return statusConexaoBD;
	}

	public static void setStatusConexaoBD(boolean statusConexaoBD) {
		ConexaoBancoDados.statusConexaoBD = statusConexaoBD;
	}
}
