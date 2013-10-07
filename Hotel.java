package hotelaria.func;

import java.util.Scanner;

public class Hotel{

	Scanner input = new Scanner(System.in);
	
	private String nome;
	private int cnpj;
	private int qndApt;
	private String telefone;
	private Apartamento[] apartamentos = {};
	private Funcionario[] funcionarios = {};

	//Constructor SEM PAR�METROS
	public Hotel(){
	this.nome ="Sem nome";
	this.cnpj =0;
	this.qndApt=0;
	this.telefone = "sem telefone";
	}

	//Constructor COM TODOS OS PAR�METROS
	public Hotel(String nomeHotel,int cnpjHotel, int qndAptHotel, String telefoneHotel){
	this.nome = nomeHotel;
	this.cnpj =cnpjHotel;
	this.qndApt=qndAptHotel;
	this.telefone = telefoneHotel;
	}
	

	//M�todos de Acesso e Modifica��o
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
	
	public Apartamento[] getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(Apartamento[] apartamentos) {
		this.apartamentos = apartamentos;
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	//M�todo cadastrarHotel
	public void cadastrarHotel(){
	System.out.println("Para Cadastar um novo hotel � preciso dos seguinte dados:");
	
	System.out.print("Nome do Hotel: ");
	String nomeHotel = input.nextLine();
	
	System.out.print("CNPJ do Hotel: ");
	int cnpjHotel = input.nextInt();
			
	System.out.print("Quantos Apartamento o Hotel tem: ");
	int qndAptHotel = input.nextInt();
	
	System.out.print("Telefone: ");
	String telefoneHotel = input.nextLine();
	
	this.nome = nomeHotel;
	this.cnpj =cnpjHotel;
	this.qndApt=qndAptHotel;
	this.telefone = telefoneHotel;
	}

	//M�todo excluirHotel
	public int excluirHotel(String nomeHotel){
		//Esse m�todo n�o ser� detalhado no momento
	int veracidade=0;
	return veracidade;
	}
}