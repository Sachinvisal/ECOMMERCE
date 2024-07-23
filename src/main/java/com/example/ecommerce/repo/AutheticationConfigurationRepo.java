package com.example.ecommerce.repo;

import com.example.ecommerce.model.AuthenticationConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface AutheticationConfigurationRepo  extends JpaRepository<AuthenticationConfiguration ,Integer> {
}
