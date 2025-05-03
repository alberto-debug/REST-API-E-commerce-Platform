package com.alberto.e_commerce.application.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alberto.e_commerce.application.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
