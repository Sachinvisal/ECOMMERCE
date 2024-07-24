package com.example.ecommerce.dto;

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
    private int zip_code;
    private int contact;
    private int order_id;
    private int customer_id;
}
