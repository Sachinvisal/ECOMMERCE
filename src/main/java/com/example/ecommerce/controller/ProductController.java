package com.example.ecommerce.controller;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/Product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //All Product Show
    @GetMapping("/getAllProduct")
    public List<ProductDTO> getProduct()
    {
        return productService.getProductAll();
    }
    //Save Product
    @PostMapping("/addProduct")
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }
    //Delete Product
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable long id){
        productService.deleteProduct(id);
    }

    //update product
    @PutMapping("/updateProduct/{id}")
    public  ProductDTO productUpdate(@RequestBody ProductDTO productDTO,@PathVariable Long id){
         try {
             return productService.updateProdct(productDTO,id);
         }catch (Exception e){
             return  null;
         }
    }





}
