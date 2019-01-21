package com.stackcoders.flyway.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackcoders.flyway.model.User;

/**
 * Created by Balaji Sundarajan on 20/01/2019.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
