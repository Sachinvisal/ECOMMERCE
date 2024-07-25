package com.example.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerProductDTO {
    private int cid;
    private int uid;
    private double cost;
    private String image;
    private String title;
}
