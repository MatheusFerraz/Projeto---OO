package hotelaria.func;

public class Mensagem {
	
	//Especificando atributos para a Classe
	
	//Construtor para a Classe
	public Mensagem(){
		
	}
	
	//Método postarMen
	public void postarMen(String conteudoDaMensagem, String remetente, String[] destinatarios){
		int i;
		for(i=0;i<destinatarios.length;i++){
			System.out.println(destinatarios[i] + "," + "tem uma nova mensagem do " + remetente + ":" + conteudoDaMensagem);
		}
	}
	
	//Método postarInfo
	public void postarInfo(String conteudoDoInformativo, String remetente, String[] destinatarios){
		int j;
		for(j=0; j<destinatarios.length;j++){
			System.out.println(destinatarios[j] + "," + "tem um novo informativo do " + remetente + ":" + conteudoDoInformativo);
		}
	}
}//Fim da Classe Mensagem
