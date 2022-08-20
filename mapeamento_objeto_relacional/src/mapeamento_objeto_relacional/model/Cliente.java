package mapeamento_objeto_relacional.model;

import java.util.List;

public class Cliente {
	private long id;
	private String nome;
	private String endereco;
	private List<Pedido> pedidos; // 1 para n, aqui salvamos os n pedidos de um cliente

	public Cliente() {
		super();
	}

	public Cliente(long id, String nome, String endereco) {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
