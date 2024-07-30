package com.example.ecommerce.service;

import com.example.ecommerce.dto.OrderDTO;
import com.example.ecommerce.model.Orders;
import com.example.ecommerce.repo.OrderRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderService {


    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;

    //Order part (Show the ordered item function)
    public List<OrderDTO> getItemOrderAll(){
        List<Orders> ordersList = orderRepo.findAll();
      return modelMapper.map(ordersList, new TypeToken<List<OrderDTO>>(){}.getType());
    }
   //Order Save function
    public OrderDTO addOrder(OrderDTO orderDTO){
        orderRepo.save(modelMapper.map(orderDTO,Orders.class));
        return orderDTO;
    }

}
