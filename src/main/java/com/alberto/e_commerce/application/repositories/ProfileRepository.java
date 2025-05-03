package com.alberto.e_commerce.application.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alberto.e_commerce.application.entities.Profile;

public interface ProfileRepository extends CrudRepository<Long, Profile> {
}
