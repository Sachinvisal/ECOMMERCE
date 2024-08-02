package com.example.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private Integer userID;
    private String username;
    private String password;
    private  String email;
    private String role;
    private Integer contact;

}
