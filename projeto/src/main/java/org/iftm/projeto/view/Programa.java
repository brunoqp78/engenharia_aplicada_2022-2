package org.iftm.projeto.view;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.iftm.projeto.control.ClienteControle;
import org.iftm.projeto.control.VeterinarioControle;
import org.iftm.projeto.model.Cliente;
import org.iftm.projeto.model.Endereco;
import org.iftm.projeto.model.Veterinario;

public class Programa {
	public static void main(String[] args) {
		//instanciar objetos]
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do veterinário: ");
		String nome = s.nextLine();
		System.out.println("Digite o especialidader do veterinário: ");
		String esp = s.nextLine();
		System.out.println("Digite o salario do veterinário: ");
		Double salario = s.nextDouble();
		//Endereco novo = new Endereco(null, "Senador", 201);
		Veterinario veterinario = new Veterinario(null,nome, esp, salario);
		
		VeterinarioControle control = new VeterinarioControle();
		control.inserir(veterinario);
		
		Veterinario busca = control.buscarPorId(1);
		
		busca.setSalario(32000.50);
		
		control.alterar(busca);
		
		System.out.println(busca.getNome());
		
		Cliente cli = new Cliente(null, "Bruno Queiroz");
		ClienteControle control2 = new ClienteControle();
		control2.inserir(cli);
	}
}