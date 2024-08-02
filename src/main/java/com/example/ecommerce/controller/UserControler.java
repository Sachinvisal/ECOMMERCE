package com.example.ecommerce.controller;

import com.example.ecommerce.dto.UserDTO;
import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/User")
public class UserControler {

    @Autowired
    private UserService userService;

    //User show
    @GetMapping("/getUser")
    public List<UserDTO>getUser(){
        return userService.getUserAll();
    }

    //User add method
    @PostMapping("/addUser")
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    //Delete User
    @DeleteMapping("/deleteUser/{userID}")
    public void DeleteUser(@PathVariable Long userID){
      userService.deleteUser(userID);

    }


}
