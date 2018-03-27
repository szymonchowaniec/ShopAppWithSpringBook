package pl.szymonchowaniec.webstore.domain.repository.impl;



import org.springframework.stereotype.Repository;
import pl.szymonchowaniec.webstore.domain.Order;
import pl.szymonchowaniec.webstore.domain.repository.OrderRepository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryOrderRepositoryImpl implements OrderRepository {

	private Map<Long, Order> listOfOrders;
	private long nextOrderId;
	
	public InMemoryOrderRepositoryImpl() {
		listOfOrders = new HashMap<Long, Order>();
		nextOrderId = 1000;
	}
	@Override
	public Long saveOrder(Order order) {
		order.setOrderId(getNextOrderId());
		listOfOrders.put(order.getOrderId(), order);
		return order.getOrderId();
	}

	private synchronized long getNextOrderId() {
		return nextOrderId++;
	}


}
