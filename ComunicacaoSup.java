package hotelaria.func;

public interface ComunicacaoSup {
	
	//Assinatura do primeiro m�todo da interface
	public void postarMensagem(String mensagem, String[] contatos);
	
	//Assinatura do segundo m�todo da interface
	public void postarInformativoDoHotel(String informativoDoHotel, String[] contatos);
	
}//Fim da Interface ComunicacaoSup
