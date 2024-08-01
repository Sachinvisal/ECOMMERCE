package com.example.ecommerce.service;

import com.example.ecommerce.dto.OrderDTO;
import com.example.ecommerce.model.Orders;
import com.example.ecommerce.repo.OrderRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.hibernate.query.Order;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    //Update order function

    public OrderDTO updateOrder(OrderDTO orderDTO, long id) {
        Orders existingOrder = orderRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Order not found with id: " + id));

        existingOrder.setCity(orderDTO.getCity());
        existingOrder.setName(orderDTO.getName());
        existingOrder.setState(orderDTO.getState());
        existingOrder.setAddress(orderDTO.getAddress());
        existingOrder.setZipCode(orderDTO.getZip_code());
        orderRepo.save(existingOrder);
        return orderDTO;
    }

    //Delete order function
    public  void deleteOrder(long id){
        orderRepo.deleteById(id);
    }

}
