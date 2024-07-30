package com.example.ecommerce.controller;

import com.example.ecommerce.dto.OrderDTO;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    //Order Show
    @GetMapping("/getItemOrder")
    public List<OrderDTO> getItemOrder(){
        return orderService.getItemOrderAll();
    }

    //Save part
    @PostMapping("/addOrder")
    public OrderDTO addOrder(@RequestBody OrderDTO orderDTO){
        return  orderService.addOrder(orderDTO);
    }



}
