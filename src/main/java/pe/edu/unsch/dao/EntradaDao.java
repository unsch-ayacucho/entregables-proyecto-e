package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.Entrada;


public interface EntradaDao {
	
	public List<Entrada> featured(int n);

	public Entrada find(Integer  id);

	public List<Entrada> latest(int n);

}
