package productService.service;

import productService.model.Product;
import productService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(String userId) {
        return productRepository.findProductById(userId);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}