package com.example.ecommerce.service;

import com.example.ecommerce.dto.CustomerProductDTO;
import com.example.ecommerce.repo.CustomerProductRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerProduct {
    @Autowired
    private CustomerProductRepo customerProductRepo;

    @Autowired
    private ModelMapper modelMapper;

    //customer product part (Show the customer product part  function)




}
