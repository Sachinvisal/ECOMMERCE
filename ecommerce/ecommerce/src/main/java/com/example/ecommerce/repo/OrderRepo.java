package com.example.ecommerce.repo;

import com.example.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository <Order,Integer> {
}
