package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String catName;
    private String catDes;

    // category & product relationship (1:M)
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    private List<Product> productList;

    // User & category relationship (M:1)
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
