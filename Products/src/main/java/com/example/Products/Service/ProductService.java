package com.example.Products.Service;

import com.example.Products.Model.Product;
import com.example.Products.Model.ProductComment;
import com.example.Products.Repository.ProductRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductService {
    private static ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }

    public List<ProductComment> getProduct(Long id){
       Product product= (Product) productRepository.getAllById(id);
        return product.getProductComments();
    }
}
