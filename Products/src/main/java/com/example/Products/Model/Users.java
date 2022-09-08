package com.example.Products.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Kullanici_İd")
    private Long id;
    @Column(name = "Kullanici_İsmi", length = 50,nullable = false)
    private String firstName;
    @Column(name = "Kullanici_soyismi", length = 50,nullable = false)
    private String lastName;
    @Column(name = "Kullanici_e_maili", length = 50,nullable = false)
    private String eMail;
    @Column(name = "Kullanici_telefonu", length = 15,nullable = false)
    private int phone;
    @OneToMany(
            targetEntity = ProductComment.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<ProductComment> productComments =new ArrayList<>();
}
