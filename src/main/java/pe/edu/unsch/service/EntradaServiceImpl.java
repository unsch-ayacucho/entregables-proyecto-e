package pe.edu.unsch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsch.dao.EntradaDao;

import pe.edu.unsch.entities.Entrada;


@Service("entradaService")
@Transactional
public class EntradaServiceImpl implements EntradaService {
	
	
	@Autowired
	private EntradaDao entradaDao;
	
	
	@Override
	public List<Entrada> featured(int n) {
	return entradaDao.featured(n);
	}
	
	

	@Override
	public Entrada find(Integer id) {
		return entradaDao.find(id);
	}



	@Override
	public List<Entrada> latest(int n) {
		return entradaDao.latest(n);
	}

}
