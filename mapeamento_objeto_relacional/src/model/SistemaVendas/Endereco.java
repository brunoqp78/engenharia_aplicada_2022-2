package model.SistemaVendas;

public class Endereco {
	private int id;
	private String rua;
	private int numero;
	
	public Endereco(int id, String rua, int numero) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
