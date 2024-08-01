package com.example.ecommerce.controller;

import com.example.ecommerce.dto.CustomerProductDTO;
import com.example.ecommerce.service.CustomerProduct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/customerProduct")
public class CustomerProductController {


    @Autowired
    private CustomerProduct customerProduct;


    //Show customer product

    @GetMapping("/getCustomerProduct")
    public List<CustomerProductDTO> getCustomerProduct(){
        return customerProduct.getCustomerProduct(cu)
    }

}
