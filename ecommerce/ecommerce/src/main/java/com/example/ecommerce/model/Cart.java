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
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CARTID;
    //private int orderID;
    private int quantity;
    private  String custom;
    private int size;

    @OneToMany(mappedBy = "cart")
    private List<CustomerProduct>  customerProducts;

    @ManyToMany
    @JoinTable(name = "Product_cart",
    joinColumns = @JoinColumn(name = "CARTID"),inverseJoinColumns = @JoinColumn(name = "productID")
    )
    private List<Product> products;








}
