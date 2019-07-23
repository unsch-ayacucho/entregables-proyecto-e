package pe.edu.unsch.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Account;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Account account) {
		entityManager.persist(account);
		
	}

	@Override
	public Account login(String email, String password) {
		try {
			return (Account) entityManager
					.createQuery("from Account "
							+ "where email = :email and "
							+ "password = :password")
					.setParameter("email", email)
					.setParameter("password", password)
					.getSingleResult();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
		
	}

	@Override
	public Account find(String email) {
		return (Account) entityManager
				.createQuery("from Account "
						+ "where email = :email")
				.setParameter("email", email)
				.getSingleResult();
	}

}
