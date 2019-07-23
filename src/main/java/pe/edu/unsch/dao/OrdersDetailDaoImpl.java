package pe.edu.unsch.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Ordersdetail;

@Repository("ordersDetailDao")
public class OrdersDetailDaoImpl implements OrdersDetailDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void create(Ordersdetail ordersdetail) {
		entityManager.persist(ordersdetail);

	}

}
