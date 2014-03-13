package hotelaria.func;

public class Apartamento {

	//Especifica��o dos atributos
	protected String tipo;
	protected int numero;
	protected String status;
	protected Hotel hotel;//Composi��o entre Hotel e Apartamento
	Cliente cliente;//Associa��o entre Apartamento e Cliente

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	//Constructor SEM PAR�METROS
	public Apartamento(){
		this.tipo = "sem tipo";
		this.numero = 0;
		this.status = "sem informacao";
	}

	//Constructor COM TODOS OS PAR�METROS
	public Apartamento(String tipoApt,int numeroApt, String statusApt){
		this.tipo = tipoApt;
		this.numero =numeroApt;
		this.status = statusApt;
	}

	//M�todos de Acesso e Modifica��o
	public String getTipo(){
	return tipo;
	}

	public void setTipo(String tipoApt){
	tipo = tipoApt;
	}

	public int getNumero(){
	return numero;
	}

	public void setNumero(int numeroApt){
	numero =numeroApt;
	}

	public String getStatus(){
	return status;
	}

	public void setStatus(String statusApt){
	status =statusApt;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//M�todo cadastrarApt
	public void cadastrarApt(String tipoApt,int numeroApt, String statusApt){
		
	//Depend�ncia entre Apartamento e ConexaoBancoDados
	System.out.println("Foi chamado um m�todo de classe (ou static)  Classe ConexaoBancoDados" +
	"visando conectar o banco para entrada dos dados de cadastro do apartamento.");
	ConexaoBancoDados.setStatusConexaoBD(true);//Chamada do m�todo diretamente pelo nome da Classe
	
	this.tipo = tipoApt;
	this.numero =numeroApt;
	this.status = statusApt;
	}
}//Fim da Classe Apartamento