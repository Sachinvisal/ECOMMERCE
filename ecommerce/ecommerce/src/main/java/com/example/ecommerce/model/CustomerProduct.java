package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    //private int uid;
    private double cost;
    private String image;
    private String title;

    @ManyToOne
    @JoinColumn(name = "CARTID")
    private Cart cart;

}
