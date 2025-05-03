package com.alberto.e_commerce.application.repositories;

import com.alberto.e_commerce.application.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Long, Address> {
}
