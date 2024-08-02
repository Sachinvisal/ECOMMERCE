package com.example.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartDTO {
    @JsonProperty("order_id")
    private int order_id;
    private int quantity;
    private int size;
    private String custom;
    private int product_id;

}
