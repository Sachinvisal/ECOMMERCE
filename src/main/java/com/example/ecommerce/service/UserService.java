package com.example.ecommerce.service;

import com.example.ecommerce.dto.UserDTO;
import com.example.ecommerce.model.User;
import com.example.ecommerce.repo.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ModelMapper modelMapper;
    private final UserRepo userRepo;


    // (get all user show in this function)
    public List<UserDTO>getUserAll(){
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }

    //(Add user method )
    @Transactional
    public UserDTO addUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    //Delete User
    public void deleteUser(long userID){
        userRepo.deleteById(userID);
    }

    //Update User
    @Transactional
    public UserDTO updateUser(UserDTO userDTO, Long id){
        User existingUser = userRepo.findById(id).orElseThrow(()-> new EntityNotFoundException("User Not Found WIth Id" + id));
        existingUser.setName(userDTO.getUsername());
        existingUser.setContact(userDTO.getContact());
        existingUser.setPassword(userDTO.getPassword());
        existingUser.setRole(userDTO.getRole());
        existingUser.setEmail(userDTO.getEmail());
        return userDTO;

    }

}


