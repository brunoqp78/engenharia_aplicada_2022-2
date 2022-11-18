package org.iftm.projeto.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//código abaixo permite referenciar uma tabela com nome diferente
//@Table(name = "nome_BD")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "numero", nullable = false, unique = true, columnDefinition = "integer")
	private Integer id;
	//@Column(name = "nome_completo", nullable = false, length = 50)
	private String nome;
	/*
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_endereco", referencedColumnName = "id")
	private Endereco endereco;
	*/
	
	public Cliente(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Cliente() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
