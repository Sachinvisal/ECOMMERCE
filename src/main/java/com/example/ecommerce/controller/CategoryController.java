package com.example.ecommerce.controller;


import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    //Order Show
    @GetMapping("/getCategory")
    public List<CategoryDTO> getCategory(){
        return categoryService.getCategoryAll();
    }

    //Save part
    @PostMapping("/addCategory")
    public CategoryDTO addCategory(@RequestBody CategoryDTO categoryDTO){
        return  categoryService.addCategory(categoryDTO);
    }

    //Order Delete
    @DeleteMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

    //Order Update
    @PutMapping("/categoryUpdate/{id}")
    public CategoryDTO categoryUpdate(@RequestBody CategoryDTO categoryDTO, @PathVariable Long id){
        try{
            return categoryService.updateCategory(categoryDTO,id);
        }catch (Exception e){
            return null;
        }
    }

}
