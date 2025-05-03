package com.alberto.e_commerce.application.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alberto.e_commerce.application.entities.Category;

public interface CategoryRepository extends CrudRepository< Category, Byte> {
}
