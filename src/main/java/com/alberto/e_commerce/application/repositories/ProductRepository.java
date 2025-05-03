package com.alberto.e_commerce.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.e_commerce.application.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
