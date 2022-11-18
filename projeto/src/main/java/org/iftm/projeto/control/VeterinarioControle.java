package org.iftm.projeto.control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.iftm.projeto.model.Veterinario;

public class VeterinarioControle {
	private EntityManager em;

	public VeterinarioControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}

	public void inserir(Veterinario objeto) {		
		try {
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
		} catch (Exception e) {			
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void alterar(Veterinario objeto) {
		try {
			em.getTransaction().begin();
			em.merge(objeto);
			em.getTransaction().commit();
		} catch (Exception e) {			
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void excluir(Veterinario objeto) {
		try {
			em.getTransaction().begin();
			em.remove(objeto);
			em.getTransaction().commit();
		} catch (Exception e) {			
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	public void excluirPorId(Integer id) {
		excluir(buscarPorId(id));
	}
	
	public Veterinario buscarPorId(Integer id) {
		return em.find(Veterinario.class, id);
	}
	
	public List<Veterinario> buscarTodos() {
		String nomeTabela = Veterinario.class.getName();
		return em.createQuery("FROM " + nomeTabela).getResultList();
	}

}
