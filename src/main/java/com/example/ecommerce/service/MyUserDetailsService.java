package com.example.ecommerce.service;

import com.example.ecommerce.repo.MyUserRepo;
import com.example.ecommerce.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final MyUserRepo myUserRepo;
    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<com.example.ecommerce.model.User> user = myUserRepo.findByName(username);

        if (user.isPresent()) {
            var userObj = user.get();
            return User.builder()
                    .username(userObj.getName())
                    .password(userObj.getPassword())
                    .roles(getRoles(userObj))
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    // Method to retrieve roles from the User entity
    private String[] getRoles(com.example.ecommerce.model.User userObj) {
        // Assuming your User entity has a role field (or related table), return it as a String array
        // Adjust according to your actual model structure
        if (userObj.getRole()== null){
            return new String[]{"USER"};
        }
    return
    }
}
