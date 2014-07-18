package hotelaria.entidades;

public class Apartamento {

	protected String tipo;
	protected int numero;
	protected String status;
	protected Hotel hotel;
	Cliente cliente;

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Apartamento(){
		this.tipo = "sem tipo";
		this.numero = 0;
		this.status = "sem informacao";
	}

	public Apartamento(String tipoApt,int numeroApt, String statusApt){
		this.tipo = tipoApt;
		this.numero =numeroApt;
		this.status = statusApt;
	}

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

	public void cadastrarApt(String tipoApt,int numeroApt, String statusApt){
		
	System.out.println("Foi chamado um método de classe (ou static)  Classe ConexaoBancoDados" +
	"visando conectar o banco para entrada dos dados de cadastro do apartamento.");
	ConexaoBancoDados.setStatusConexaoBD(true);
	
	this.tipo = tipoApt;
	this.numero =numeroApt;
	this.status = statusApt;
	}
	
}