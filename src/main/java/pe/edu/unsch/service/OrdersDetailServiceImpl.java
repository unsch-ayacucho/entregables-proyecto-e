package pe.edu.unsch.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.OrdersDetailDao;
import pe.edu.unsch.entities.Ordersdetail;

@Service("ordersDetailService")
@Transactional
public class OrdersDetailServiceImpl implements OrdersDetailService {
	
	@Autowired
	private OrdersDetailDao ordersDetailDao;

	@Override
	public void create(Ordersdetail ordersdetail) {
		ordersDetailDao.create(ordersdetail);

	}

}
