package com.example.ecommerce.controller;

import com.example.ecommerce.dto.CartDTO;
import com.example.ecommerce.dto.OrderDTO;
import com.example.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/Cart")
public class CartController {
    @Autowired
    private CartService cartService;

    //Order Show
    @GetMapping("/getCart")
    public List<CartDTO> getCart(){
        return cartService.getCartAll();
    }

    //Save part
    @PostMapping("/addCart")
    public CartDTO addCart(@RequestBody CartDTO cartDTO){
        return  cartService.addCart(cartDTO);
    }

    //Order Delete
    @DeleteMapping("/deleteCart/{id}")
    public void deleteCart(@PathVariable Long id){
        cartService.deleteCart(id);
    }

    //Order Update
    @PutMapping("/cartUpdate/{id}")
    public CartDTO  cartUpdate(@RequestBody CartDTO cartDTO,@PathVariable Long id){
        try{
            return cartService.updatecart(cartDTO,id);
        }catch (Exception e){
            return null;
        }
    }

}
