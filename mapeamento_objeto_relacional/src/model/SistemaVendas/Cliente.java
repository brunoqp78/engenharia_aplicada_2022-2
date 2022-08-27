package model.SistemaVendas;

import java.util.Collection;

public class Cliente {
	private long id;
	private String nome;
	private Endereco endereco;
	private Collection<Pedido> pedidos; // 1 para n, aqui salvamos os n pedidos de um cliente

	public Cliente() {
		super();
	}

	public Cliente(long id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Collection<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	

}
