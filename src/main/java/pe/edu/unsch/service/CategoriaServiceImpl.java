package pe.edu.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.CategoriaDao;
import pe.edu.unsch.entities.Categoria;


@Service("categoriaService")
@Transactional
public class CategoriaServiceImpl implements CategoriaSevice {
	@Autowired
	private CategoriaDao categoriaDao;

	

	@Override

	public Categoria find(Integer id) {
		return categoriaDao.find(id);
	}

}
