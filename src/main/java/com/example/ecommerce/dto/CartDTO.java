package com.example.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartDTO {
    @JsonProperty("order_id")
    private Integer order_id;
    private Integer quantity;
    private Integer size;
    private String custom;
    private List<Integer> product_id;

}
