package pl.szymonchowaniec.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.szymonchowaniec.webstore.domain.Product;
import pl.szymonchowaniec.webstore.domain.repository.ProductRepository;
import pl.szymonchowaniec.webstore.service.ProductService;

import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
@Qualifier("First")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }
    public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public List<Product> getProductsByManufacturer(String manufacturer) {
     return productRepository.getProductsByManufacturer(manufacturer);
    }
}
