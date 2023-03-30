package productService.controller;

import productService.model.Product;
import productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
        System.out.println("Hello");
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") String productId){
        System.out.println("hello");
        return productService.findProductById(productId);
    }

    @GetMapping("/")
    public List<Product> findAllProducts() {
    System.out.println("Get all products request");
    return productService.findAllProducts();
}
}