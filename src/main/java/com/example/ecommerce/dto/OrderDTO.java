package com.example.ecommerce.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDTO {

    private String name;
    private String address;
    private String city;
    private String state;
    private Integer zip_code;
    private Integer contact;
    private Integer order_id;
    private Integer customer_id;
}
