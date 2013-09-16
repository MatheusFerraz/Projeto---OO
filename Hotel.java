package hotelaria.func;

public class Hotel{

	private String nome;
	private int cnpj;
	private int qndApt;
	private String telefone;

	//Constructor SEM PARÂMETROS
	public Hotel(){
	this.nome ="Sem nome";
	this.cnpj =0;
	this.qndApt=0;
	this.telefone = "sem telefone";
	}

	//Constructor COM TODOS OS PARÂMETROS
	public Hotel(String nomeHotel,int cnpjHotel, int qndAptHotel, String telefoneHotel){
	this.nome = nomeHotel;
	this.cnpj =cnpjHotel;
	this.qndApt=qndAptHotel;
	this.telefone = telefoneHotel;
	}
	
	public static void main(String[] args){
	}

	//Métodos de Acesso e Modificação
	public String getNome(){
	return nome;
	}

	public void setNome(String nomeHotel){
	nome = nomeHotel;
	}

	
	public int getCnpj(){
	return cnpj;
	}

	public void setCnpj(int cnpjHotel){
	cnpj =cnpjHotel;
	}

	public int getQndApt(){
	return qndApt;
	}

	public void setQndApt(int qndAptHotel){
	qndApt =qndAptHotel;
	}

	
	public String getTelefone(){
	return telefone;
	}

	public void setTelefone(String telefoneHotel){
	telefone = telefoneHotel;
	}

	//Método cadastrarHotel
	public void cadastrarHotel(String nomeHotel,int cnpjHotel, int qndAptHotel, String telefoneHotel){
	this.nome = nomeHotel;
	this.cnpj =cnpjHotel;
	this.qndApt=qndAptHotel;
	this.telefone = telefoneHotel;
	}

	//Método excluirHotel
	public int excluirHotel(String nomeHotel){
	int veracidade=0;
	return veracidade;
	}
}
