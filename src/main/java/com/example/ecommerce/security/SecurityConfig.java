package com.example.ecommerce.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable() // Disable CSRF (only if necessary)
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/**").permitAll() // Allow GET requests to all endpoints
//                .anyRequest().authenticated() // All other requests require authentication
//                .and()
//                .httpBasic(); // Enable Basic Authentication
//
//        return http.build();
//    }
}


//    @Bean
//    public SecurityFilterChain defaultFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .csrf(csrf-> csrf.disable())
//                .authorizeHttpRequests(auth-> auth.requestMatchers("/cf-crm-cc/login/**").permitAll()
//                        .anyRequest().authenticated())
//                .httpBasic(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults())
//                .build();
//    }
