package hotelaria.entidades;

public interface ComunicacaoSup {
	
	public void postarMensagem(String mensagem, String[] contatos);
	
	public void postarInformativoDoHotel(String informativoDoHotel, String[] contatos);
	
}
