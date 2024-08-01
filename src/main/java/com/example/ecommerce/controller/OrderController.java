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

    //Order Delete
    @DeleteMapping("/deleteOrder/{id}")
    public void deleteOrder(@PathVariable Long id){
        orderService.deleteOrder(id);
    }

    //Order Update
    @PutMapping("/OrderUpdate/{id}")
    public OrderDTO  orderUpdate(@RequestBody OrderDTO orderDTO,@PathVariable Long id){
        try{
            return orderService.updateOrder(orderDTO,id);
        }catch (Exception e){
            return null;
        }
    }

}
