package hotelaria.entidades;

public class Mensagem {
	
	public Mensagem(){
		
	}
	
	public void postarMen(String conteudoDaMensagem, String remetente, String[] destinatarios){
		int i;
		for(i=0;i<destinatarios.length;i++){
			System.out.println(destinatarios[i] + "," + "tem uma nova mensagem do " + remetente + ":" + conteudoDaMensagem);
		}
	}
	
	public void postarInfo(String conteudoDoInformativo, String remetente, String[] destinatarios){
		int j;
		for(j=0; j<destinatarios.length;j++){
			System.out.println(destinatarios[j] + "," + "tem um novo informativo do " + remetente + ":" + conteudoDoInformativo);
		}
	}
	
}
