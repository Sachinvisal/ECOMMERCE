package com.example.ecommerce.service;


import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.ProductRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    //Product part (Show the product  function)
    public List<ProductDTO> getProductAll(){
        List<Product> productList = productRepo.findAll();
        return modelMapper.map(productList,new TypeToken<List<ProductDTO>>(){}.getType());
    }
    //Product Add the Store Part
    @Transactional
    public ProductDTO addProduct(ProductDTO productDTO){
        productRepo.save(modelMapper.map(productDTO,Product.class));
        return productDTO;
    }
    //Delete Product
    public void deleteProduct(long id){
        productRepo.deleteById(id);
    }

    //Product Update
    @Transactional
    public ProductDTO updateProdct(ProductDTO productDTO ,long id){
     Product existingProduct = productRepo.findById(id).orElseThrow(()->new EntityNotFoundException("Order not found with id: " + id));
     existingProduct.setBrand(productDTO.getBrand());
     existingProduct.setProductDes(productDTO.getProduct_dec());
     existingProduct.setProductName(productDTO.getProduct_name());
     existingProduct.setColour(productDTO.getColor());
     existingProduct.setImage(productDTO.getImage());
     return productDTO;
    }



}
