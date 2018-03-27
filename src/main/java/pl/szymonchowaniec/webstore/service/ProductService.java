package pl.szymonchowaniec.webstore.service;

import pl.szymonchowaniec.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    Product getProductById(String productID);
    void addProduct(Product product);
    List <Product> getProductsByManufacturer(String manufacturer);
}
