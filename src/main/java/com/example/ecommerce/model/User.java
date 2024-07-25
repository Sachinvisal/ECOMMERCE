package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String role;
    private String password;
    private int contact;

    // UserUploard & User relationship (1:M)
    @OneToMany(mappedBy = "user")
    private List<UserUpload> userUploardList;

    // User & category relationship (1:M)
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    private List<Category> categoryList;

    // User & product relationship (1:M)
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    private List<Product> productList;

    // User & Order relationship (1:M)
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    private List<Orders> ordersList;
}
