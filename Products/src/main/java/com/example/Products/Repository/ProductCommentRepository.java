package com.example.Products.Repository;

import com.example.Products.Model.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentRepository extends JpaRepository<ProductComment,Long> {
    ProductComment getProductCommentByProductId(Long productId);
}
