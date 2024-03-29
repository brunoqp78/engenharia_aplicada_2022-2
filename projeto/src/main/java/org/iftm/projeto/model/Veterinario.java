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
//c�digo abaixo permite referenciar uma tabela com nome diferente
//@Table(name = "nome_BD")
public class Veterinario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "numero", nullable = false, unique = true, columnDefinition = "integer")
	private Integer id;
	//@Column(name = "nome_completo", nullable = false, length = 50)
	private String nome;
	private String especialidade;
	private Double salario;
	/*
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_endereco", referencedColumnName = "id")
	private Endereco endereco;
	*/
	
	public Veterinario(Integer id, String nome, String especialidade, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
		this.salario = salario;
	}

	public Veterinario() {}

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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
