package pl.szymonchowaniec.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.szymonchowaniec.webstore.domain.Product;
import pl.szymonchowaniec.webstore.domain.repository.ProductRepository;
import pl.szymonchowaniec.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductRepository productRepository;
    public void processOrder(String productId, int count) {
        Product productById = productRepository.getProductById(productId);
        if(productById.getUnitsInStock() < count){
            throw new IllegalArgumentException("Zbyt mało towaru. Obecna liczba sztuk w magazynie: "+ productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}