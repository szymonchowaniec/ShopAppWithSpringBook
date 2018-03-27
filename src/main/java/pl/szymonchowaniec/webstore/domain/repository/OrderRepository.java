package pl.szymonchowaniec.webstore.domain.repository;


import pl.szymonchowaniec.webstore.domain.Order;

public interface OrderRepository {
	Long saveOrder(Order order);
}
