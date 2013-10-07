package hotelaria.func;

public class Apartamento{

	//Especifica��o dos atributos
	protected String tipo;
	protected int numero;
	protected int status;
	protected Hotel hotel;
	Cliente cliente;

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
		this.status = 0;
	}

	//Constructor COM TODOS OS PAR�METROS
	public Apartamento(String tipoApt,int numeroApt, int statusApt){
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

	public int getStatus(){
	return status;
	}

	public void setStatus(int statusApt){
	status =statusApt;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//M�todo cadastrarApt
	public int cadastrarApt(String tipoApt,int numeroApt, int statusApt){
	tipo = tipoApt;
	numero =numeroApt;
	status = statusApt;
	int veracidade = 0;
	return veracidade;
	}

	//M�todo excluirApt
	public int excluirApt(String nomeHotel){
	int veracidade=0;
	return veracidade;
	}
}