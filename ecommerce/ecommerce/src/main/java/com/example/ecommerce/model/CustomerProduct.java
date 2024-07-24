package com.example.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
//    private int uid;
    private double cost;
    private String image;
    private String title;
}
