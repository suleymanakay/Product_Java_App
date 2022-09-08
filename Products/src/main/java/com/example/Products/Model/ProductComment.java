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
public class ProductComment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "Yorum_id")
    private Long commentId;
    @Column(name = "Kullanici_Yorumu", length = 500)
    private String comment;

    @Column(name = "Yorum_Tarihi")
    private Date commentDate;

    @ManyToOne(targetEntity = Product.class,
            fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL
    )
    private Product product=new Product();

    @ManyToOne(
            targetEntity =Users.class ,
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Users user=new Users();
}
