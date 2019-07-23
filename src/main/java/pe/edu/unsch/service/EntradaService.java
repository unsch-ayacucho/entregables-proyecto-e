package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.Entrada;



public interface EntradaService {
	
	

	public Entrada find(Integer id);
	public List<Entrada> featured(int n);
	public List<Entrada> latest(int n);
	


}
