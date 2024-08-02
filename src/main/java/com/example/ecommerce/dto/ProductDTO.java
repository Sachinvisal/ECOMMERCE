package com.example.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    private Integer product_ID;
    private double price;
    private String color;
    private String brand;
    private String image1;
    private String image2;
    private String image3;
    private String product_dec;
    private String product_name;
    private String cat_ID;

}
