package com.example.ecommerce.repo;

import com.example.ecommerce.model.UserUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserUploardRepo extends JpaRepository<UserUpload,Long> {
}
