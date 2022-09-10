package org.iftm.projeto.view;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		Veterinario vet1 = new Veterinario(null,nome, esp, salario);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(vet1);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}