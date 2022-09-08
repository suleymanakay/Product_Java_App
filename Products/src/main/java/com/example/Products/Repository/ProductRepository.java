package com.example.Products.Repository;

import com.example.Products.Model.Product;
import com.example.Products.Model.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product getProductById(Long id);
    List<Product> getAllById(Long id);
}
