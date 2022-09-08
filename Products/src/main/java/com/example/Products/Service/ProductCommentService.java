package com.example.Products.Service;

import com.example.Products.Repository.ProductCommentRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCommentService {

    private static ProductCommentRepository productCommentRepository;

    public ProductCommentService(ProductCommentRepository productCommentRepository) {
        this.productCommentRepository=productCommentRepository;
    }
    public String getProductComment(Long productCommentId){
        return productCommentRepository.getProductCommentByProductId(productCommentId).getComment();
    }
}

