package com.example.Products.Controller;

import com.example.Products.Model.Product;
import com.example.Products.Model.ProductComment;
import com.example.Products.Repository.ProductRepository;
import com.example.Products.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
    private static ProductRepository productRepository;
    private static ProductService productService;

    public ProductController(ProductRepository productRepository, ProductService productService) {
        this.productRepository=productRepository;
        this.productService=productService;
    }

    @GetMapping("/product-id/{id}")
    public String getProductCommentId(@PathVariable("id") Long Id){
        return productRepository.getProductById(Id).getProductName();
    }

    @GetMapping("/products/{id}")
    public List<ProductComment> getProducts(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }
}
