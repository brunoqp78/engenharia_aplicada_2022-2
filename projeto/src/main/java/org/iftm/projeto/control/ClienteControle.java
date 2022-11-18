package org.iftm.projeto.control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.iftm.projeto.model.Cliente;

public class ClienteControle {
	private EntityManager em;

	public ClienteControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}

	public void inserir(Cliente objeto) {		
		try {
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
		} catch (Exception e) {			
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void alterar(Cliente objeto) {
		try {
			em.getTransaction().begin();
			em.merge(objeto);
			em.getTransaction().commit();
		} catch (Exception e) {			
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void excluir(Cliente objeto) {
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
	
	public Cliente buscarPorId(Integer id) {
		return em.find(Cliente.class, id);
	}
	
	public List<Cliente> buscarTodos() {
		String nomeTabela = Cliente.class.getName();
		return em.createQuery("FROM " + nomeTabela).getResultList();
	}

}
