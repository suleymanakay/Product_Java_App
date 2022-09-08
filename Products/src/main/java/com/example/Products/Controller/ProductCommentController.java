package com.example.Products.Controller;

import com.example.Products.Repository.ProductCommentRepository;
import com.example.Products.Service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ProductComment")
public class ProductCommentController {
    private static ProductCommentRepository productCommentRepository;
    private static ProductCommentService productCommentService;

    public ProductCommentController(ProductCommentRepository productCommentRepository,
                                    ProductCommentService productCommentService) {
        this.productCommentRepository=productCommentRepository;
        this.productCommentService=productCommentService;
    }
    //1.Ürün yorum numarasına göre yorumları getirir.
    @GetMapping("/productComment/{productCommentId}")
    public String getProductComment(@PathVariable("productCommentId") Long productCommentId){
        return productCommentService.getProductComment(productCommentId);
    }

}
