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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;
    private String productName;
    private List<String> image;
    private String productDes;
    private  double price;
    private  String colour;
    private String brand;

    @ManyToMany(mappedBy = "products")
    private List<Cart>carts;




}
