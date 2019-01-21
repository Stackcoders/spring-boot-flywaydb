package com.stackcoders.flyway.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackcoders.flyway.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
