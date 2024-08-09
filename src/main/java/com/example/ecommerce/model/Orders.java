package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String city;
    //@Column(name = "state",nullable = false) --> backend validation part in spring boot(java) required..
    private String state;
    private Integer zipCode;
    private String name;

    // Order cart relationship (M:1)
    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "id",nullable = false)
    private Cart cart;

    // User & order relationship (M:1)
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id",nullable = false)
    private User user;

}
