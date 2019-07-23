package pe.edu.unsch.service;

import pe.edu.unsch.entities.Account;

public interface AccountService {
	
	public void create(Account account);
	public Account login(String email, String password);
	public Account find(String email);

}
