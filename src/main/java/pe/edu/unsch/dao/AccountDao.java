package pe.edu.unsch.dao;

import pe.edu.unsch.entities.Account;

public interface AccountDao {
	
	public void create(Account account);
	public Account login(String email, String password);
	public Account find(String email);
	
}
