package pl.szymonchowaniec.webstore.domain.repository;

import pl.szymonchowaniec.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(String productId);
    List<Product> getProductsByCategory(String category);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    void addProduct(Product product);
    List <Product> getProductsByManufacturer(String manufacturer);
}