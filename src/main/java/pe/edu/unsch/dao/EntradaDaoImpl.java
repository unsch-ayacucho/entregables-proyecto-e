package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Entrada;


@Repository("entradaDao")
public class EntradaDaoImpl implements EntradaDao{
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public Entrada find(Integer id) {
		return (Entrada) entityManager
				.find(Entrada.class, id);
	}
	
	@Override
	public List<Entrada> featured(int n) {
		return entityManager
				.createQuery("from Entrada where feature =: feature order by id desc", Entrada.class)
				.setParameter("feature", true)
				.setMaxResults(n)
				.getResultList();
	}
	@Override
	public List<Entrada> latest(int n) {
		return entityManager
				.createQuery("from Entrada order by id desc", Entrada.class)
				.setMaxResults(n)
				.getResultList();
	}

}
