package com.example.ecommerce.service;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.model.Category;
import com.example.ecommerce.repo.CategoryRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final ModelMapper modelMapper;
    private final CategoryRepo categoryRepo;


    // (get all Category show in this function)
    public List<CategoryDTO> getCategoryAll(){
        List<Category> userList = categoryRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<CategoryDTO>>(){}.getType());
    }

    //(Add Category method )
    @Transactional
    public CategoryDTO addCategory(CategoryDTO categoryDTO){
        categoryRepo.save(modelMapper.map(categoryDTO,Category.class));
        return categoryDTO;
    }

    //Delete Category
    public void deleteCategory(long userID){
        categoryRepo.deleteById(userID);
    }


    //Update User
    @Transactional
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long id){
        Category existingCategory = categoryRepo.findById(id).orElseThrow(()-> new EntityNotFoundException("User Not Found WIth Id" + id));
        existingCategory.setCatDes(categoryDTO.getCat_des());
        existingCategory.setCatName(categoryDTO.getCat_name());
        return categoryDTO;

    }

}
