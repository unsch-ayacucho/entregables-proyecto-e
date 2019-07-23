package pe.edu.unsch.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Orders;

@Repository("ordersDao")
public class OrdersDaoImpl implements OrdersDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Orders create(Orders orders) {
		entityManager.persist(orders);
		
		return orders;
	}

}
