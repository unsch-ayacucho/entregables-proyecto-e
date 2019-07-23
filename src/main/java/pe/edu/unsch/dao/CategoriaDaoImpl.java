package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Categoria;



@Repository("categoriaDao")
public class CategoriaDaoImpl implements CategoriaDao{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Categoria> findAll() {
		return entityManager
				.createQuery("from Category where parentid=0", Categoria.class)
				.getResultList();
	}

	@Override
	public Categoria find(Integer id) {
		return (Categoria) entityManager
				.find(Categoria.class, id);
	}

}
