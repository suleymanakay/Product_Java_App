package com.example.Products.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Ürün_İd")
    private Long id;
    @Column(name = "Ürün_İsmi",nullable = false)
    private String productName;
    @Column(name = "Ürün_Fiyati",nullable = false)
    private Double productPrice;
    @Column(name = "Ürün_Son_Kullanma_Tarihi")
    private Date expirationDate;
    @OneToMany(targetEntity = ProductComment.class,mappedBy = "product")
    private List<ProductComment> productComments =new ArrayList<>();
}
