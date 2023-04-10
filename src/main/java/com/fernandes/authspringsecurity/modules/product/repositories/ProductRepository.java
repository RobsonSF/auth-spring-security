package com.fernandes.authspringsecurity.modules.product.repositories;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
