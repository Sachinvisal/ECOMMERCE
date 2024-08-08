package com.example.ecommerce.service;

import com.example.ecommerce.dto.CartDTO;
import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.model.Cart;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.CartRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepo cartRepo;
    private final ModelMapper modelMapper;

    //Cart show
    public List<CartDTO> getCartAll(){
        List<Cart> cartList = cartRepo.findAll();
        return modelMapper.map(cartList, new TypeToken<List<CartDTO>>(){}.getType());
    }
    //Cart Add part
    @Transactional
    public CartDTO addCart(CartDTO cartDTO){
        cartRepo.save(modelMapper.map(cartDTO, Cart.class));
        return cartDTO;
    }
    //Delete part in cart
    public void deleteCart(long id){
        cartRepo.deleteById(id);
    }
    //Product Update
    @Transactional
    public CartDTO updatecart(CartDTO cartDTO ,long id){
        Cart existingcart = cartRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Order not found with id: " + id));
        existingcart.setQuantity(cartDTO.getQuantity());
        existingcart.setSize(cartDTO.getSize());
        existingcart.setCustom(cartDTO.getCustom());
        //existingcart.setProducts(cartDTO.getProduct_id());
        return cartDTO;
    }


}
