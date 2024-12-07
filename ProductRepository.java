package com.example.WarehouseApp1.repository;

import com.example.WarehouseApp1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom queries can be added here if needed
}


